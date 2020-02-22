package online.movie.Service;

import online.movie.DAO.ScreenDAO;
import online.movie.beans.Screen;
import online.movie.beans.Show;

public class ScreenService {

	ScreenDAO sDao = new ScreenDAO();
	
	public String[] showShows(String screenName) {
			
		return sDao.getScreenFromDB(screenName).getShowList();
	}
}
