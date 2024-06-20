package org.example;

import org.example.Models.Additions;
import org.example.Models.Drink_Type;
import org.example.Models.Sizes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OrderService {
    public void orderService(Sizes sizes, List<Additions> additions, double price, Drink_Type drinkType) {
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("Orders.txt", true))) { //Zmienia format parametrow i zapisuje(Nadpisuje plik .txt)
            printWriter.printf("Drink: %s | Size: %s | Additions: %s | Price: %.2f\n",
                    drinkType, sizes, additions, price);
        } catch (IOException e) {
            System.out.println("Save error");
        }
    }
}
