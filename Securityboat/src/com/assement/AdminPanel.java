package com.assement;

import java.util.ArrayList;
import java.util.List;
	
public class AdminPanel {



    private List<Admin> admins = new ArrayList<>();
    private BookingSystem bookingSystem;

    public AdminPanel(BookingSystem bookingSystem) {
        this.bookingSystem = bookingSystem;
    }
    
    public void addAdmin(String username, String password) {
        admins.add(new Admin(username, password));
    }

    public boolean login(String username, String password) {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void manageScreens() {
        // Logic to manage screens
    }

    public void manageBookings() {
        // Logic to manage bookings
    }

    public void manageFoodMenu() {
        // Logic to manage food menu
   }
	

}
