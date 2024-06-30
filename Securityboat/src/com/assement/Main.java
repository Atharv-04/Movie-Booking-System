package com.assement;

import java.util.List;
import java.util.Scanner;

public class Main {

public static void main(String[] args)
{
		
	Scanner sc  = new Scanner(System.in);
	
    UserManager userManager = new UserManager();
    BookingSystem bookingSystem = new BookingSystem();

    Screen screen1 = new Screen(1, 5, 5);
    
    Movie movie1 = new Movie("Kalki", "sci-fi", List.of("12:00 PM", "3:00 PM", "7:00 PM"));
    screen1.addMovie(movie1);
    bookingSystem.addScreen(screen1);

    System.out.println("Enter you name:-");
    String nm = sc.nextLine();
    System.out.println("Enter mailid:-");
    String mail = sc.nextLine();
    System.out.println("Enter password:-");
    String pass = sc.nextLine();
    userManager.register(nm, mail,pass);
    
    System.out.println("Enter mailid-:");
    String gm = sc.nextLine();
    System.out.println("Enter password:-");
   	String pass1 = sc.nextLine();
    boolean loginSuccess = userManager.login(gm, pass1);

    if (loginSuccess) {
        System.out.println("Available movies:");
        for (Movie movie : screen1.getMovies()) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Showtimes: " + movie.getShowtimes());
        }

        SeatManager seatManager = new SeatManager(5, 5);
        System.out.println("Select a seat to book (row and column):");
        System.out.println(" Enter the row( total 5 rows ) : ");
		int r = sc.nextInt();
		System.out.println(" Enter the column( total 5 columns ) : ");
		int c = sc.nextInt();
        boolean seatBooked = seatManager.bookSeat(r-1, c-1);
        if (seatBooked) {
            System.out.println("Seat booked successfully!");
        } else {
            System.out.println("Seat already booked!");
            }
        }
    }
}


