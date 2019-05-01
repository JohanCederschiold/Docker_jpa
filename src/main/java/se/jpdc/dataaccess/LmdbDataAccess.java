package se.jpdc.dataaccess;

import java.util.List;

import se.jpdc.domain.Movie;


public interface LmdbDataAccess {
	
	public List<Movie> getAllMovies();


	public void registerMovie(Movie movie);

	public Movie deleteMovie(int id);

}


