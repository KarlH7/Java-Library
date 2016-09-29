package _12_move_class_properties;

public class Movie {


	//Properties are variablers within a Class
		//
	//ArrayList<> actors = new ArrayList();
	
	String[] actors;
	
	
	String moveRating;
	String type;
	int yearItCameOut;
	String colorBw;
	String director;
	int movieLength;
	int boxOfficeGross;
	String title;
	String leadActor1;
	String leadActor2;
	String leadActor3;
	String rating;
	boolean liked;
	String genre;
	boolean inRedBox;
	boolean onNetflix;
	
	
	//Constructor
	
	public Movie(String genre, int movieLength, int boxOfficeGross, boolean inRedBox, boolean onNetflix){
		this.genre = genre;
		this.movieLength= movieLength;
		this.boxOfficeGross = boxOfficeGross;
		this.inRedBox = inRedBox;
		this.onNetflix = onNetflix;
		
		
		
		
		
		
	}
	

	
	
	//Methods
	public int getMovieLength(){
		System.out.println(movieLength);
		return movieLength;
	}
	
	public int getBoxOfficeGross(){
		//System.out.println(boxOfficeGross);
		return boxOfficeGross;
	}
	
	
	
//	public void getActors(){
//		System.out.println(actors[]);
//	}
//		System.out.println(actors[]);
		
		
		
		
	
	
	
	

	
}
