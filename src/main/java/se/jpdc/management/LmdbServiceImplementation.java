package se.jpdc.management;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.jpdc.dataaccess.LmdbDataAccess;
import se.jpdc.domain.Movie;

@Stateless
public class LmdbServiceImplementation implements LmdbServiceLocal {
	
	@Inject
	LmdbDataAccess lda;

	@Override
	public List<Movie> getAllMovies() {
		return lda.getAllMovies();
	}

	@Override
	public void registerMovie(Movie movie) {
		lda.registerMovie(movie);
		
	}



	public Movie deleteMovie(int ID) {
		return lda.deleteMovie(ID);
		
	}

}
