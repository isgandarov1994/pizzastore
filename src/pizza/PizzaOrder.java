package pizza;

import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args) {
        System.out.println("Welcome to The Pizza Palace");
        System.out.println("*******************************");

        int z = pizzaSize();
        int pizzaPR = 0;
        if(z==1){
            pizzaPR = 8;
        }
        else if (z==2){
            pizzaPR = 12;
        }
        else if (z==3){
            pizzaPR = 18;
        }
        pizzaType();
        int r = drinkType();
        int drinkType = 2;

        System.out.println("Total="+(pizzaPR+drinkType)+"$");
        System.out.println("Your order will be ready within 20 minutes");
        System.out.println("Thanks for choosing PalacePizza");
    }

    public static int pizzaSize() {

        System.out.println("Which pizza size would you like");
        System.out.println("Press 1>>>Small-8$\n"
                + "Press 2>>>Medium-12$\n"
                + "Press 3>>>Large-18$");

        Scanner obj1 = new Scanner(System.in);
        int size = obj1.nextInt();

        switch (size) {
            case 1:
                System.out.println("Your Pizza size is Small");
                break;
            case 2:
                System.out.println("Your Pizza size is Medium");
                break;
            case 3:
                System.out.println("Your Pizza size is Large");
                break;
            default:
                System.out.println("WRONG OPTION!!!");
                System.out.println("Thanks for choosing PalacePizza");
                break;
        }
        System.out.println("*******************************");

        return size;
    }

    public static void pizzaType() {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Which type of pizza would you like");
        System.out.println("Press 1>>>Chichken\n" +
                "Press 2>>>Beef\n" +
                "Press 3>>>Mix\n");
        int b = obj1.nextInt();

        switch (b) {
            case 1:
                System.out.println("Your Pizza type is Chicken");
                break;
            case 2:
                System.out.println("Your Pizza type is Beef");
                break;
            case 3:
                System.out.println("Your Pizza type is Mix");
                break;
            default:
                System.out.println("WRONG OPTION!!!");
                System.out.println("Thanks for choosing PalacePizza");
                break;
        }
        System.out.println("*******************************");

    }

    public static int drinkType() {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("What whould you like for Drink");
        System.out.println("Press 1>>>Pepsi 2$\n" +
                "Press 2>>>Cola 2$\n" +
                "Press 3>>>Sprite 2$\n");
        int c = obj2.nextInt();

        switch (c) {
            case 1:
                System.out.println("Your Drink is Pepsi");
                break;
            case 2:
                System.out.println("Your Drink is Cola");
                break;
            case 3:
                System.out.println("Your Drink is Sprite");
                break;
            default:
                System.out.println("WRONG OPTION!!!");
                System.out.println("Thanks for choosing PalacePizza");
                break;
        }
        System.out.println("*******************************");
        return c;


    }

}
