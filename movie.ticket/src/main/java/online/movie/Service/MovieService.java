package online.movie.Service;

import online.movie.DAO.MoviesDAO;
import online.movie.beans.Movie;
import online.movie.beans.Theatre;

public class MovieService {
	
	MoviesDAO mdao = new MoviesDAO();

	
	public String[] getAllTheaters(String movieName) {
		
		
		Movie movie = mdao.getMovieFromDB(movieName);
		return movie.getTheaters();
	}
	
	
	public void saveMovie(Movie movie) {
		
		mdao.saveMovieInDB(movie);
		
	}
	
	public Movie getMovie(String movieName) {
		
		return mdao.getMovieFromDB(movieName);
	}
	
	
	
	
	

}
