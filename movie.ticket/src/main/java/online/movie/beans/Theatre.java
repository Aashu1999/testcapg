package online.movie.beans;

public class Theatre {
	int theaterId;
	String theaterName;
	String[] listOfScreens;
	String managerName,managerContact;
	String theaterCity;
	String[] movies;
	
	public Theatre(int theaterId, String theaterName, String theaterCity, String[] movies, String[] listOfScreens,
			String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movies = movies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}


	
	public String[] getMovies() {
		return movies;
	}
	public void setMovies(String[] movies) {
		this.movies = movies;
	}

	public String[] getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(String[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
}
