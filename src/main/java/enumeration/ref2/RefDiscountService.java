package enumeration.ref2;

public class RefDiscountService {
    public int discount(Grade classGrade, int price) {
        return price * classGrade.getDiscountPercent() / 100;
    }
}
