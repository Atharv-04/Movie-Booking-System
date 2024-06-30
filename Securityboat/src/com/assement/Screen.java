package com.assement;

import java.util.ArrayList;
import java.util.List; 

public class Screen {
	
 private int screenId;
 private List<Movie> movies;
 private Seat[][] seats;

 public Screen(int screenId, int rows, int cols) 
 {
   this.setScreenId(screenId);
   this.movies = new ArrayList<>();
   this.seats = new Seat[rows][cols];
   for (int i = 0; i < rows; i++) 
   {
     for (int j = 0; j < cols; j++)
     {
    	seats[i][j] = new Seat(i, j);
      }
     
   }
 }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Seat[][] getSeats() {
        return seats;
    }

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
}

