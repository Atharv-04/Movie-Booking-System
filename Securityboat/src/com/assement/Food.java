package com.assement;

public class Food 
{	
    private String name;
    private double price;

    public Food() {
		// TODO Auto-generated constructor stub
	}
    
    public Food(String name, double price) {
        this.setName(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

