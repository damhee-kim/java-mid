package lang.object.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 번수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> " + b);
        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
