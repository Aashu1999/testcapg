package online.movie.Service;

import online.movie.DAO.TheatresDAO;
import online.movie.beans.Movie;
import online.movie.beans.Theatre;

public class TheatreService {

	TheatresDAO tDao = new TheatresDAO();
	
		public Movie searchMovie(String movieName, String theatreName) {
		//theatre.getMovies();
			String[] movies=tDao.getTheatreFromDB(theatreName).getMovies();
				for(String movie:movies) {
					if(movie.equals(movieName)) {
						
						
						return new MovieService().getMovie(movieName);
					}
			
			
				}
		return null;
	}
		
		public String[] getMovies(String theatreName) {
			
			return tDao.getTheatreFromDB(theatreName).getMovies();
			
		}
		
		
		public Theatre getTheatre(String theatreName) {
			
			return tDao.getTheatreFromDB(theatreName);
			
			
		}
		
}		
		
