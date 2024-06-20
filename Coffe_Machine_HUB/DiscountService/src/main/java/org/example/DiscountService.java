package org.example;

public class DiscountService implements ReduceInterface{

    @Override
    public double discount(String code) throws CodeExeptions, CodeExpireException{
        DiscountCode discountCode = DiscountCode.checkDiscountCode(code);
        if(discountCode.getStatus().equals("EXPIRED")){
            throw new CodeExpireException("Code is expired");
        }
        System.out.println("Code has been added");
        return discountCode.getValueDiscount();
    }
}
