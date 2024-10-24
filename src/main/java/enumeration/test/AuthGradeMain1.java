package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {

        /**
         * 문제2 - 인증 등급 열거형 조회하기
         * 설명 :
         *  AuthGradeMain1 이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
         *  앞서 만든 AuthGrade를 활용하자
         *  예) grade=GUEST, level=1, 설명=손님
         */

        AuthGrade[] v = AuthGrade.values();
        for(AuthGrade a : v) {
            System.out.println("grade=" + a.name() + ",level=" + a.getLevel() + ",설명=" + a.getDescription());
        }
    }
}
