package lang.immutable.address;

public class primitiveMain {

    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공휴하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
