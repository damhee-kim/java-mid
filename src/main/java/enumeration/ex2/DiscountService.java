package enumeration.ex2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if(grade.equals(Grade.BASIC)) {
            discountPercent = 10;
        } else if(grade.equals(Grade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(Grade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 X");
        }
        return price * discountPercent / 100;
    }

}
