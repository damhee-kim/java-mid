package ex1;

import ex2.Grade;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if(grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }
        return price * discountPercent / 100;
    }

}