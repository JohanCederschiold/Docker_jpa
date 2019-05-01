package se.jpdc.management;

import java.util.List;

import javax.ejb.Local;

import se.jpdc.domain.Movie;

@Local
public interface LmdbServiceLocal {

	public List<Movie> getAllMovies();
	public void registerMovie(Movie movie);
	public Movie deleteMovie(int id);

}
