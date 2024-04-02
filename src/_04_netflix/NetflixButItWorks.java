package _04_netflix;

public class NetflixButItWorks {
	
	public static void main(String[] args) {
	Movie historyMovie = new Movie("Gravy Sushi In The 1800s", 2);
	Movie planeMovie = new Movie("Top Gun XXIII: We're Still Doing This?", 4);
	Movie natureMovie = new Movie("Epic Leopard Videos In The Jungle (4k)", 3);
	Movie terribleMovie = new Movie("Cringe Turbo", 1);
	Movie actionMovie = new Movie("BULLETPROOF 2: REDEMPTION", 5);
	Movie documentary = new Movie("Elon Musk: How He Eats Cheese", 3);

    documentary.getTicketPrice();
    actionMovie.getTicketPrice();
    terribleMovie.getTicketPrice();
    natureMovie.getTicketPrice();
    planeMovie.getTicketPrice();
    historyMovie.getTicketPrice();
    NetflixQueue queue = new NetflixQueue();
    queue.addMovie(historyMovie);
    queue.addMovie(planeMovie);
    queue.addMovie(natureMovie);
    queue.addMovie(terribleMovie);
    queue.addMovie(actionMovie);
    queue.addMovie(documentary);
    
    System.out.println(historyMovie);
    System.out.println("Price: "+historyMovie.getTicketPrice());
    System.out.println(planeMovie);
    System.out.println("Price: "+planeMovie.getTicketPrice());
    System.out.println(natureMovie);
    System.out.println("Price: "+natureMovie.getTicketPrice());
    System.out.println(terribleMovie);
    System.out.println("Price: "+terribleMovie.getTicketPrice());
    System.out.println(actionMovie);
    System.out.println("Price: "+actionMovie.getTicketPrice());
    System.out.println(documentary);
    System.out.println("Price: "+documentary.getTicketPrice());
    
    System.out.println("TOP PICK FOR 2024: "+actionMovie+"");
    System.out.println("SECOND BEST PICK THIS YEAR: "+planeMovie+"");
   
    
	}
	
}
