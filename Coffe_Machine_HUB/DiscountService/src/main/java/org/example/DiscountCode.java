package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiscountCode {
    DISCOUNT1("DISCOUNT1", "ACTIVE", 0.5),
    DISCOUNT2("DISCOUNT2", "ACTIVE", 0.3),
    DISCOUNT3("DISCOUNT3", "EXPIRED", 0.2);

    private final String code;
    private final String status;
    private final double valueDiscount;

    public static DiscountCode checkDiscountCode(String code) throws CodeExeptions{
        for(DiscountCode discountCode : DiscountCode.values()){
            if(discountCode.getCode().equals(code)){
                return discountCode;
            }
        }
        throw new CodeExeptions("Code do not exist");

    }
}

