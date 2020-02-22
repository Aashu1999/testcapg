package online.movie.beans;

import java.util.Date;

public class Movie {
	int movieId;
	String movieName;
	String movieDirector;
	
	public Movie(int movieId, String movieName, String movieDirector, int movieLength, String[] languages,
			Date movieReleaseDate, String[] theaters) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
		this.theaters = theaters;
	}
	int movieLength;
	String[] languages;
	Date movieReleaseDate;
	String[] theaters;
	public String[] getTheaters() {
		return theaters;
	}
	public void setTheaters(String[] theaters) {
		this.theaters = theaters;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	public Date getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(Date movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	
}
