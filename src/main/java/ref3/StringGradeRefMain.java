package ref3;

public class StringGradeRefMain {

    public static void main(String[] args) {
        int price = 10000;
        printDiscount(Grade.BASIC, price);
        printDiscount(Grade.GOLD, price);
        printDiscount(Grade.DIAMOND, price);
    }

    public static void printDiscount (Grade grade, int price) {
        /*
         * 문자열 상수를 이용한 값 호출 방법에 대해 공부
         *
         * grade.name() : ENUM 의 상수 이름을 호출
         */
        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
    }
}
