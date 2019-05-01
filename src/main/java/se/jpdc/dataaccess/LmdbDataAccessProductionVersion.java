package se.jpdc.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.jpdc.domain.Movie;
import se.jpdc.management.LmdbServiceLocal;

@Stateless
public class LmdbDataAccessProductionVersion implements LmdbDataAccess {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> getAllMovies() {
		Query query = em.createQuery("from Movie");
		System.out.println("Dataaccess called");
		List<Movie> movie = query.getResultList();
		return movie;
	}

	@Override
	public void registerMovie(Movie movie) {
		em.persist(movie);
	}	

	public Movie deleteMovie(int id) {
		Query query = em.createQuery("from Movie as ua where ua.id like ?1").setParameter(1, id);
		Movie movie = (Movie) query.getSingleResult();
		em.remove(movie);
		return movie;

	}

}
