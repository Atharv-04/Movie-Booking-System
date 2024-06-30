package com.assement;

import java.util.List;
public class Movie {
    private String title;
    private String genre;
    private List<String> showtimes;

    public Movie(String title, String genre, List<String> showtimes) {
        this.title = title;
        this.setGenre(genre);
        this.showtimes = showtimes;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getShowtimes() {
        return showtimes;
    }

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}

