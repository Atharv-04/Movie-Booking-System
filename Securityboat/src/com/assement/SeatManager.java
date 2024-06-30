package com.assement;

public class SeatManager {

private Seat[][] seats;

  public SeatManager(int rows, int cols) 
  {
    seats = new Seat[rows][cols];
    for (int i = 0; i < rows; i++) 
    {
       for (int j = 0; j < cols; j++)
       {
          seats[i][j] = new Seat(i, j);
       }
    }
 }

  public boolean bookSeat(int row, int col) 
  {
    if (!seats[row][col].isBooked()) 
    {
        seats[row][col].setBooked(true);
        return true;
    }
        return false;
  }

    public void releaseSeat(int row, int col)
    {
        seats[row][col].setBooked(false);
    }
}

