package online.movie.DAO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import online.movie.beans.Movie;

public class MoviesDAO {
	
	 public static Map<String,Movie> movieHp = new HashMap<String, Movie>();
	 
	 public MoviesDAO() {
		 
		 
		
	}
	 
	 
	 
	 
	 public void saveMovieInDB(Movie movie) {
		 
		 movieHp.put(movie.getMovieName(), movie);
		 
		 
	 }
	 
	 
	 public Movie getMovieFromDB(String movieName) {
		 
		return movieHp.get(movieName);
		 
	 }
	 
	 
	 public Map<String,Movie> getMoviesDB() {
		 
		 return movieHp;
	 }
	 
		
		
}
