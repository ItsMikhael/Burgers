package com.mstefanski;


// Deluxe burger comes with chips and cola but no other additions are allowed.

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Standard Bread", "Beef", 19.95, "Deluxe Burger");
        this.setAddsCount(4); // to prevent picking more additions.
        this.addAddz("Chips");
        this.addAddz("Cola");
    }

    public DeluxeBurger(String meat) {
        super("Standard Bread", meat, 19.95, "Deluxe Burger");
        this.setAddsCount(4);
        this.addAddz("Chips");
        this.addAddz("Cola");
    }

}
