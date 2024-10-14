package lang.immutable.chnage;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutalbeObj obj1 = new ImmutalbeObj(10);
        obj1.add(20);

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
    }
}
