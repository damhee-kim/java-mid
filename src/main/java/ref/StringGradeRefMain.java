package ref;

import ex2.Grade;

public class StringGradeRefMain {

    public static void main(String[] args) {
        int price = 10000;

        RefDiscountService ds = new RefDiscountService();
        int basic = ds.discount(ClassGrade.BASIC, price);
        int gold = ds.discount(ClassGrade.GOLD, price);
        int diamond = ds.discount(ClassGrade.DIAMOND, price);

        /*
         * 문자열 상수를 이용한 값 호출 방법에 대해 공부
         */
        System.out.println("Basic: " + basic);
        System.out.println("Gold: " + gold);
        System.out.println("Diamond: " + diamond);
    }
}
