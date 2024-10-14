package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
     ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
     ImmutableMyDate date2 = date1;

        System.out.println("date1 -> "+ date1);
        System.out.println("date2 -> "+ date2);


        System.out.println("2025 -> date1");

        /*
         * withYear 을 통해 본인의 값을 가지고 새로운 객체를 가지고 새로운 값을 반환하기 때문에 값이 변경되는 것을 확인할 수 있다.
         */
        date1 = date1.withYear(2025);
        System.out.println("date1 -> "+ date1);
        System.out.println("date2 -> "+ date2);

        // 참고: 불변 객체에서 값을 변경하는 경우 withYear() 와같이 "with" 로 시작하는 경우가 많다.
    }
}
