package enumeration.ref3;

public class StringGradeRefMainFinal {

    public static void main(String[] args) {
        int price = 10000;

        /*
         * 선언한 3개가 아닌 그 이상의 값이 추가되어도
         * 선언된 값들을 모두 조회할 수 있도록
         * ENUM 의 values(); 함수를 사용하여 열거형의 모든 상수르 배열로 구하였다.
         */
        Grade[] grades = Grade.values();
        for(Grade grade : grades) {
            printDiscount(grade, price);
        }
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
