package online.movie.beans;

import java.util.Date;

public class Screen {
	int screenId;
	int theatreId;
	String screenName;
	String[] showList;
	Date movieEndDate;
	int rows;
	int columns;
	
	public Screen(int screenId, int theatreId, String screenName, String[] showList, Date movieEndDate, int rows,
			int columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.movieEndDate = movieEndDate;
		this.rows = rows;
		this.columns = columns;
	}
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String[] getShowList() {
		return showList;
	}
	public void setShowList(String[] showList) {
		this.showList = showList;
	}
	public Date getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(Date movieEndDate) {
		this.movieEndDate = movieEndDate;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
}
