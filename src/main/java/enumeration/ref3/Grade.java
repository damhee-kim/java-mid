package enumeration.ref3;

public enum Grade {
    /*
     * 열거형을 정의 할 때는 ENUM을 사용한다.
     * 선언한 인수인 매개변수에 값에 맞게 생성자가 호출되는 것을 알 수 있다.
     */
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // private
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    /*
     * [추가]
     * 이 부분을 통해 Grade 는 스스로 할일율을 계산할 수 있게 된 것을 알 수 있다.
     */
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
