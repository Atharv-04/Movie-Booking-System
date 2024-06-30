package com.assement;

public class Seat {

   private int row;
   private int number;
   private boolean isBooked;

 public Seat(int row, int number) {
 this.setRow(row);
 this.setNumber(number);
 this.isBooked = false;
 }
 public boolean isBooked()
 {
    return isBooked;
  }
  public void setBooked(boolean booked)
  {
        isBooked = booked;
  }

  public int getRow()
	{
		return row;
	}

  public void setRow(int row) 
  {
		this.row = row;
  }

  public int getNumber() 
  {
		return number;
  }

  public void setNumber(int number) 
  {
		this.number = number;
  }
}

