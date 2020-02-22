package online.movie.ticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import online.movie.DAO.MoviesDAO;
import online.movie.DAO.TheatresDAO;
import online.movie.Service.MovieService;
import online.movie.Service.TheatreService;
import online.movie.beans.Movie;
import online.movie.beans.Theatre;

public class MainController 
{
    public static void main(String[] args ) throws IOException
    {
    	
    	loadData();
    	
    	startProcess();
    	
    }
    
    public static void startProcess() throws IOException {
    	
    	TheatreService ts=new TheatreService();
    	MovieService ms = new MovieService();
    	BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in));
        String city;
        int option;
        String movie;
        String theater;
    	System.out.println("Enter your city name");
        Scanner sc=new Scanner(System.in);
        city=sc.nextLine();
        System.out.println("Please enter movie name or Theater name:\n1.Movie name\n2.Theater name");
        option=sc.nextInt();
        while(true) {
        	if(option==1) {
        		System.out.println("Please enter movie name");
        		movie=reader.readLine();
        		System.out.println("Your movie "+movie+" is available in the below theaters in your city:");
        		String[] theaters=ms.getAllTheaters(movie);
        		int i=1;
        		for(String tName:theaters) {
        			System.out.println(i+"."+tName);
        			i++;
        		}
        		System.out.println("Please select your theater:");
        		int choice =sc.nextInt() - 1;
        		while(true) {
        			if(choice<=theaters.length&&choice>=0) {
        				System.out.println("Screens and Shows available for "+movie+" in " +theaters[choice]);
        				Theatre theatre=ts.getTheatre(theaters[choice]);
        				for(String scr:theatre.getListOfScreens()) {
        					System.out.println(scr);
        				}
        				break;
        			}
        			else
        				System.out.println("Invalid input please select the Theater again");
        				break;
        		}
        		break;
        	}
        	else if(option==2) {
        		System.out.println("Please enter the theater name");
        		theater=reader.readLine();
        		System.out.println("List of movies available in "+theater);
        		String[] movies = ts.getMovies(theater);
        		int i=1;
        		for(String mov : movies) {
        			
        			System.out.println(i+"."+mov);
        			i++;
        		}
        		
        		System.out.println("Select your movie:");
        		int choice = sc.nextInt() - 1;
        		while(true) {
        			
        			if(choice<=movies.length && choice>=0) {
        				System.out.println("Screens and Shows available for "+movies[choice]+" in " +theater);
        				TheatreService theatreService= new TheatreService();
        				Theatre th = theatreService.getTheatre(theater);
        				for(String scr:th.getListOfScreens()) {
        					System.out.println(scr);
        				}
        				break;
        			}
        			else
        				System.out.println("Invalid input please select the Theater again");
        				break;
        		}   		
        		
        		break;
        }
        else 
        	System.out.println("invalid input please enter again");
        }
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 public static void loadData() {
    	
    	
    	MoviesDAO mDao = new MoviesDAO();
    	
    	Movie movie1 = new Movie(1,"Ala Vaikuntapuramlo","Trivikram",165, new String[] {"Hindi", "Telugu"}, new Date(15/4/2020),new String[] {"Imax","Sandhya"});
    	
    	Movie movie2 = new Movie(2,"KGF","Prashanth",165, new String[] {"Hindi", "Telugu","English"}, new Date(15/4/2020),new String[] {"Imax","Sandhya","Sree Ramana"});
    	
    	Movie movie3 = new Movie(3,"Baahubali","SSR",165, new String[] {"Hindi", "Telugu","Kannada","Tamil"}, new Date(15/4/2020),new String[] {"Imax","Sandhya","Cinepolis","AMB","PVR"});
    	
    	mDao.saveMovieInDB(movie1);
    	mDao.saveMovieInDB(movie2);
    	mDao.saveMovieInDB(movie3);
    
    	
    	
    	Theatre theatre1 = new Theatre(1, "Imax", "Hyderabad", new String[]{"Ala Vaikuntapuramlo","Bheeshma","Avengers","Baahubali"},
    									new String[] {"Morning","Matinee","First Show"}, "Manoj", "9640350711");
    	
    	Theatre theatre2 = new Theatre(2, "Sandhya", "Hyderabad", new String[]{"Ala Vaikuntapuramlo","Baahubali","KGF"},
				new String[] {"Morning","Matinee","First Show","Second Show"}, "Harish", "9640350711");

    	Theatre theatre3 = new Theatre(3, "PVR", "Hyderabad", new String[]{"Ala Vaikuntapuramlo","Bheeshma","Avengers","Baahubali"},
				new String[] {"Morning","Matinee","First Show"}, "Ashutosh", "9640385693");
    	
    	Theatre theatre4 = new Theatre(4, "Sree Ramana", "Hyderabad", new String[]{"KGF","Bheeshma","Avengers","Baahubali"},
				new String[] {"Morning","First Show"}, "Ashutosh", "9640385693");
    	
    	Theatre theatre5 = new Theatre(4, "Cinepolis", "Hyderabad", new String[]{"Ala Vaikuntapuramlo","Baahubali"},
				new String[] {"Matinee","First Show"}, "Ashutosh", "9640385693");
    	
    	Theatre theatre6 = new Theatre(4, "AMB", "Hyderabad", new String[]{"Ala Vaikuntapuramlo","Bheeshma","Baahubali"},
				new String[] {"Morning","Matinee"}, "Ashutosh", "9640385693");

    	TheatresDAO tDao = new TheatresDAO();
    	
    	tDao.saveTheatreInDB(theatre1);
    	tDao.saveTheatreInDB(theatre2);
    	tDao.saveTheatreInDB(theatre3);
    	tDao.saveTheatreInDB(theatre4);
    	tDao.saveTheatreInDB(theatre5);
    	tDao.saveTheatreInDB(theatre6);
    	

    	
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
