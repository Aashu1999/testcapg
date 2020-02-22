package online.movie.DAO;

import java.util.HashMap;
import java.util.Map;

import online.movie.beans.Theatre;

public class TheatresDAO {
	
	 public static Map<String,Theatre> theatresDAO =new HashMap<String, Theatre>();
	 
	 
	 public void saveTheatreInDB(Theatre theatre) {
		 
		 theatresDAO.put(theatre.getTheaterName(), theatre);
	 }
	 
	 public Theatre getTheatreFromDB(String theatreName) {

		 return theatresDAO.get(theatreName);
		 
	 }
		
	
	 
	
}
