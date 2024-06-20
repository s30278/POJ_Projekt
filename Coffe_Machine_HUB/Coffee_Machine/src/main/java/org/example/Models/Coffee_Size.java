package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Coffee_Size implements Sizes{
    S(6.0),
    M(8.0),
    L(10.0);

    private final double price;
}
