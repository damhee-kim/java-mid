package lang.string.chaining;

public class MethodChainingMain1 {

    public static void main(String[] args) {

        // 메소드 체이닝은 구현하는 입장에서는 번거롭지만 사용하는 개발에게 편의성을 준다.
        ValueAdder ad = new ValueAdder();
        ad.add(1);
        ad.add(2);
        ad.add(3);

        int result = ad.getValue();
        System.out.println(result);
    }
}
