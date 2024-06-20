package org.example;

import org.example.Models.Drink_Type;

import java.util.Scanner;

public class Main {
    private static Drink_Interface drinkInterface;


    public static void main(String[] args) {
    switch(drinkType()) {
        case TEA:
            drinkInterface = new Tea_Service();
            break;

        case COFFEE:
            drinkInterface = new Coffe_Service();
            break;
        }
        double price = drinkInterface.order();
        System.out.println("Total price " + String.format("%.2f", price) );
    }

    public static Drink_Type drinkType(){
        System.out.println("Choose Coffee or Tea:");
        try{

            return Drink_Type.valueOf(new Scanner(System.in).nextLine().toUpperCase());
        }
        catch(IllegalArgumentException e){
            System.out.println("You have choosed wrong argument");
            throw e;

        }
    }
}

