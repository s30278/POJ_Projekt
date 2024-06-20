package org.example.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tea_Additions implements Additions{
    SUGAR(0.1),
    HONEY(0.4),
    BROWN_SUGAR(0.3);

    private final double price;
}
