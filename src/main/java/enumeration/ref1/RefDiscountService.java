package enumeration.ref1;


public class RefDiscountService {
    public int discount(ClassGrade classGrade, int price) {
       return price * classGrade.getDiscountParsent() / 100;
    }
}