package ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    /*
     * 열거형 - 리팩토링
     */
    private final int discountParcent;

    private ClassGrade(int discountParsent) {
        this.discountParcent = discountParsent;
    }

    public int getDiscountParsent() {
        return discountParcent;
    }
}
