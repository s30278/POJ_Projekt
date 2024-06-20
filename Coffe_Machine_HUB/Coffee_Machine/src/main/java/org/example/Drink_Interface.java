package org.example;

import org.example.Models.Additions;
import org.example.Models.Sizes;

import java.util.List;

public interface Drink_Interface {
    default double order() {            //Default żeby była tylko 1 implementacja w programie a nie w coffe service i tee service         Zwraca double jako cena koncowa
        return calculate_price(choose_size(),choose_additions());
    }

    Sizes choose_size();
    List<Additions> choose_additions();
    double calculate_price(Sizes sizes, List<Additions> additions);
}
