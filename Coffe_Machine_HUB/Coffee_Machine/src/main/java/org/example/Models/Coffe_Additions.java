package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Coffe_Additions implements Additions{
    SUGAR(0.1),
    MILK(0.3),
    BROWN_SUGAR(0.2),
    ORGANIC_MILK(0.5);

   private final double price;

}
