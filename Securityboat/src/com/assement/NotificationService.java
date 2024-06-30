package com.assement;

public class NotificationService 
{
	
 public void sendBookingConfirmation(String email, String details) 
   {
	System.out.println("Booking confirmation sent to: " + email);
	}

  public void sendSeatAvailabilityAlert(String email, String details)
  {
	  System.out.println("Seat availability alert sent to: " + email);
   }
}
	