package com.mstefanski;

public class HealthyBurger extends Hamburger {

    public HealthyBurger() {
        super("Brown Rye", "Beef", 14.95, "Healthy Burger");
    }

    public HealthyBurger(String meat) {
        super("Brown Rye", meat, 14.95, "Healthy Burger");
    }

    // Overriding the maximum additions count of 4 from Hamburger class
    @Override
    public void increaseAddsCount() {
        if(getAddsCount() < 6) {
            addAddCount();
        } else {
            System.out.println("You already have " + getAddsCount() + " additions!");
        }
    }

    public void addJalapeno() {
        if(getAddsCount() < 6) {
            if(this.checkIfContains("Jalapeno")) {
                System.out.println("You have already added Jalapeno!");
            } else {
                this.addAdds(1.15);
                this.addTotal(1.15);
                this.addAddz("Jalapeno");
                this.increaseAddsCount();
            }
        }
    }

    public void addOnion() {
        if(getAddsCount() < 6) {
            if(this.checkIfContains("Onion")) {
                System.out.println("You have already added Onion!");
            } else {
                this.addAdds(1.25);
                this.addTotal(1.25);
                this.addAddz("Onion");
                this.increaseAddsCount();
            }
        }
    }

}
