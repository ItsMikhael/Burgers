package com.mstefanski;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private double price;
    private String burgerName;
    private ArrayList<String> additions = new ArrayList<>();
    private double addsPrice = 0.00;
    private double totalPrice;
    private int addsCount = 0;

    public Hamburger() {
        this("Standard Bread", "Beef", 9.95, "Basic Hamburger");
        this.totalPrice = this.price;
    }

    public Hamburger(String meat) {
        this("Standard bread", meat, 9.95, "Basic Hamburger");
        this.totalPrice = this.price;
    }

    public Hamburger(String breadRollType, String meat) {
        this(breadRollType, meat, 9.95, "Basic Hamburger");
        this.totalPrice = this.price;
    }

    public Hamburger(String breadRollType, String meat, double price, String burgerName) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.burgerName = burgerName;
        this.totalPrice = this.price;
    }

    public int getAddsCount() {
        return addsCount;
    }

    public void addAdds(double price) {
        this.addsPrice = this.addsPrice + price;
    }

    public void addTotal(double price) {
        this.totalPrice = this.totalPrice + price;
    }

    public void addAddz(String adds) {
        this.additions.add(adds);
    }

    public void addAddCount() {
        this.addsCount++;
    }

    public void setAddsCount(int setAdds) {
        this.addsCount = setAdds;
    }

    public void increaseAddsCount() {
        if (this.addsCount < 4) {
            addAddCount();
        } else {
            System.out.println("You already have " + addsCount + " additions!");
        }
    }

    public void addLettuce() {
        if(addsCount < 4) {
            if(this.checkIfContains("Lettuce")) {
                System.out.println("You have already added Lettuce!");
            } else {
                this.addAdds(0.45);
                this.addTotal(0.45);
                this.additions.add("Lettuce");
                this.increaseAddsCount();
            }
        }
    }

    public void addTomato() {
        if(addsCount < 4) {
            if(this.checkIfContains("Tomato")) {
                System.out.println("You have already added Tomato!");
            } else {
                this.addAdds(0.50);
                this.addTotal(0.50);
                this.additions.add("Tomato");
                this.increaseAddsCount();
            }
        }
    }

    public void addGarlic() {
        if(addsCount < 4) {
            if(this.checkIfContains("Garlic")) {
                System.out.println("You have already added Garlic!");
            } else {
                this.addAdds(0.75);
                this.addTotal(0.75);
                this.additions.add("Garlic");
                this.increaseAddsCount();
            }
        }
    }

    public void addBacon() {
        if(addsCount < 4) {
            if(this.checkIfContains("Bacon")) {
                System.out.println("You have already added Bacon!");
            } else {
                this.addAdds(1.00);
                this.addTotal(1.00);
                this.additions.add("Bacon");
                this.increaseAddsCount();
            }
        }
    }

    public boolean checkIfContains(String addition) {
        if(this.additions.contains(addition)) {
            return true;
        } else{
            return false;
        }
    }

    public String getAllInfo() {
        DecimalFormat df = new DecimalFormat("##.##");
        if (addsCount == 0) {
            return "Your burger is a " + burgerName + " with a " + this.breadRollType + " and " + this.meat + " meat " + " with a base price of " + this.price +
                    " and you haven't picked any additions. You will pay: " + totalPrice;
        } else {
            return "Your burger is a " + burgerName + " with a " + this.breadRollType + " and " + this.meat + " meat" + " with a base price of " + this.price +
                    " and you have picked these additions:" + additions + ". Total cost of additions: " + addsPrice
                    + ". You will pay: " + df.format(totalPrice);
        }
    }
}
