package ex1;

public class StringGradeEx1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService ds = new DiscountService();
        int basic = ds.discount(StringGrade.BASIC, price);
        int gold = ds.discount(StringGrade.GOLD, price);
        int diamond = ds.discount(StringGrade.DIAMOND, price);

        /*
         * 문자열 상수를 이용한 값 호출 방법에 대해 공부
         */
        System.out.println("Basic: " + basic);
        System.out.println("Gold: " + gold);
        System.out.println("Diamond: " + diamond);
    }
}
