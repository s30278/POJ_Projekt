package org.example.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tea_Size implements Sizes{
    S(5.0),
    M(6.0),
    L(7.0);

    private final double price;
}
