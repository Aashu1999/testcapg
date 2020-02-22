package online.movie.DAO;

import java.util.HashMap;
import java.util.Map;

import online.movie.beans.Screen;

public class ScreenDAO {
	
	
	Map<String,Screen> screenHp = new HashMap<String, Screen>();
	
	
	public void saveScreenInDB(Screen screen) {
		
		
			screenHp.put(screen.getScreenName(), screen);
		
	}
	
	public Screen getScreenFromDB(String screenName) {
		
		return screenHp.get(screenName);
		
	}

}
