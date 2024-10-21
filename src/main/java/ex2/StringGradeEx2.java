package ex2;

import ex1.DiscountService;

public class StringGradeEx2 {

    public static void main(String[] args) {
        int price = 10000;

        ex1.DiscountService ds = new DiscountService();
        int basic = ds.discount(Grade.BASIC, price);
        int gold = ds.discount(Grade.GOLD, price);
        int diamond = ds.discount(Grade.DIAMOND, price);

        /*
         * 문자열 상수를 이용한 값 호출 방법에 대해 공부
         */
        System.out.println("Basic: " + basic);
        System.out.println("Gold: " + gold);
        System.out.println("Diamond: " + diamond);
    }
}
