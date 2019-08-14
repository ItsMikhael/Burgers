package com.mstefanski;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int iOne = 0;

        System.out.println("Welcome to Bills Burgers!");

        while(true) {
            System.out.println("Type 1 for a Basic Hamburger, 2 for a Healthy Burger" +
                    " and 3 for a Deluxe Burger.");
            iOne = scanner.nextInt();

            if (iOne > 0 && iOne <= 3) {
                System.out.println("Type 1 for Beef, 2 for Chicken and 3 for Pork.");
                break;
            } else {
                System.out.println("You have entered an incorrect number!");
            }

        }

        Hamburger yourBurger = new Hamburger();

        int iTwo = scanner.nextInt();

        if(iOne == 1 && iTwo == 1) {
            yourBurger = new Hamburger();
        }
        if(iOne == 1 && iTwo == 2) {
            yourBurger = new Hamburger("Chicken");
        }
        if(iOne == 1 && iTwo == 3) {
            yourBurger = new Hamburger("Pork");
        }

        if(iOne == 2 && iTwo == 1) {
            yourBurger = new HealthyBurger();
        }
        if(iOne == 2 && iTwo == 2) {
            yourBurger = new HealthyBurger("Chicken");
        }
        if(iOne == 2 && iTwo == 3) {
            yourBurger = new HealthyBurger("Pork");
        }

        if(iOne == 3 && iTwo == 1) {
            yourBurger = new DeluxeBurger();
        }
        if(iOne == 3 && iTwo == 2) {
            yourBurger = new DeluxeBurger("Chicken");
        }
        if(iOne == 3 && iTwo == 3) {
            yourBurger = new DeluxeBurger("Pork");
        }

        if ((yourBurger instanceof Hamburger) && !(yourBurger instanceof HealthyBurger) && !(yourBurger instanceof DeluxeBurger)) {
            while(true) {
                System.out.println("You can choose up to 4 additions at an additional cost. Type 0 for no additions," +
                        " 1 to pick up additions.");
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println("You have chosen not to pick up any additions!");
                    System.out.println(yourBurger.getAllInfo());
                    break;
                }
                if (i == 1) {
                    while (true) {
                        System.out.println("Type 1 for Lettuce at 0.45; 2 for Tomato at 0.50; 3 for Garlic at 0.75; 4 for Bacon at 1.00." +
                                "Type 0 to proceed with current additions.");
                        int iThree = scanner.nextInt();
                        if (iThree == 0) {
                            break;
                        }
                        if (yourBurger.getAddsCount() < 4) {
                            switch (iThree) {
                                case 1:
                                    yourBurger.addLettuce();
                                    break;
                                case 2:
                                    yourBurger.addTomato();
                                    break;
                                case 3:
                                    yourBurger.addGarlic();
                                    break;
                                case 4:
                                    yourBurger.addBacon();
                                    break;
                            }
                            if (yourBurger.getAddsCount() == 4) {
                                break;
                            }
                        } else {
                            System.out.println("You already have 4 additions!");
                            break;
                        }
                    }
                    System.out.println(yourBurger.getAllInfo());
                    break;
                } else {
                    System.out.println("You have entered an incorrect number!");
                }
            }
        }

        if(yourBurger instanceof HealthyBurger) {
            while(true) {
                System.out.println("You can choose up to 6 additions at an additional cost. Type 0 for no additions," +
                        " 1 to pick up additions.");
                int i = scanner.nextInt();
                if (i == 0) {
                    System.out.println("You have chosen not to pick up any additions!");
                    System.out.println(yourBurger.getAllInfo());
                    break;
                }
                if (i == 1) {
                    while (true) {
                        System.out.println("Type 1 for Lettuce at 0.45; 2 for Tomato at 0.50; 3 for Garlic at 0.75; 4 for Bacon at 1.00; " +
                                "5 for Jalapeno at 1.15; 6 for Onion at 1.25. Type 0 to proceed with current additions.");
                        int iThree = scanner.nextInt();
                        if (iThree == 0) {
                            break;
                        }
                        if (yourBurger.getAddsCount() < 6) {
                            switch (iThree) {
                                case 1:
                                    yourBurger.addLettuce();
                                    break;
                                case 2:
                                    yourBurger.addTomato();
                                    break;
                                case 3:
                                    yourBurger.addGarlic();
                                    break;
                                case 4:
                                    yourBurger.addBacon();
                                    break;
                                case 5:
                                    ((HealthyBurger) yourBurger).addJalapeno();
                                    break;
                                case 6:
                                    ((HealthyBurger) yourBurger).addOnion();
                                    break;
                            }
                        } else {
                            System.out.println("You already have 6 additions!");
                            break;
                        }
                    }
                    System.out.println(yourBurger.getAllInfo());
                    break;
                } else {
                    System.out.println("You have entered an incorrect number!");
                }
            }
        }
        if(yourBurger instanceof DeluxeBurger) {
            System.out.println("You have chosen a Deluxe Burger. You get Chips and Cola for no additional charge, " +
                    "but you can not pick any other additions.");
            System.out.println(yourBurger.getAllInfo());
        }
    }
}