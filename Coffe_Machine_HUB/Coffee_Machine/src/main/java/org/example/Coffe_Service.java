package org.example;

import org.example.Models.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Coffe_Service implements Drink_Interface{
Scanner scanner = new Scanner(System.in);

    @Override
    public Sizes choose_size() {
        System.out.println("Choose size S, M or L:");
        try{

            return Coffee_Size.valueOf(scanner.nextLine().toUpperCase());
        }
        catch(IllegalArgumentException e){
            System.out.println("You have choosed invalid size. Size will be choosed automaticly: M");
            }
        return Coffee_Size.M;           //Automatycznie wybiera rozmiar w przypadku błędnego wprowadzenia
    }

    @Override
    public List<Additions> choose_additions() {
        System.out.println("Choose additions (e.g., Sugar, Milk)");
        Arrays.stream(Coffe_Additions.values())
                .forEach(addition-> System.out.println("- " + addition));
        try{
            String[] choose = scanner.nextLine().toUpperCase().split(", "); //Każdy wybór jest wpisany do tablicy(w oddzielne komórki)

            return Arrays.stream(choose)
                    .map(String::trim)      //usuniecie bialych znakow
                    .map(Coffe_Additions::valueOf)
                    .collect(Collectors.toList());
        }
        catch(IllegalArgumentException e){
            System.out.println("You have enter invalid addition.");
        throw e;
        }
    }

    @Override
    public double calculate_price(Sizes sizes, List<Additions> additions) {
        OrderService orderService = new OrderService();
        double price = sizes.getPrice();
        price += additions.stream()
                .mapToDouble(Additions::getPrice)
                .sum();
        orderService.orderService(sizes, additions, price, Drink_Type.COFFEE);
        return price;
    }


}

