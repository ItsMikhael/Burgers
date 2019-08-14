package com.mstefanski;

import java.text.DecimalFormat;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private double price;
    private String burgerName;
    private String additions = " ";
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

    public double getPrice() {
        return price;
    }

    public int getAddsCount() {
        return addsCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getAdditions() {
        return additions;
    }

    public double getAddsPrice() {
        return addsPrice;
    }

    public void addAdds(double price) {
        this.addsPrice = this.addsPrice + price;
    }

    public void addTotal(double price) {
        this.totalPrice = this.totalPrice + price;
    }

    public void addAddz(String adds) {
        this.additions = this.additions + adds;
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
            this.addAdds(0.45);
            this.addTotal(0.45);
            this.addAddz("Lettuce ");
            this.increaseAddsCount();
        }
    }

    public void addTomato() {
        if(addsCount < 4) {
            this.addAdds(0.50);
            this.addTotal(0.50);
            this.addAddz("Tomato ");
            this.increaseAddsCount();
        }
    }

    public void addGarlic() {
        if(addsCount < 4) {
            this.addAdds(0.75);
            this.addTotal(0.75);
            this.addAddz("Garlic ");
            this.increaseAddsCount();
        }
    }

    public void addBacon() {
        if(addsCount < 4) {
            this.addAdds(1.00);
            this.addTotal(1.00);
            this.addAddz("Bacon ");
            this.increaseAddsCount();
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
