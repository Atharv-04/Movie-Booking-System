package com.assement;


import java.util.ArrayList;
import java.util.List;
public class FoodOrder {

private List<Food> items = new ArrayList<>();

    public void addItem(Food item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Food item : items) {
            total += item.getPrice();
        }
        return total;
    }
}


