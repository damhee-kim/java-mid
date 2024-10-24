package enumeration.ref3;

public class RefDiscountService {
    public int discount(Grade grade, int price) {
        /*
         * Grade ENUM 내부에서 discount 메서드를 통해 평균을 구하고 있기 때문에
         * 아래와 같이 코드가 간결해짐을 알 수 있다.
         */
        return grade.discount(price);
    }
}
