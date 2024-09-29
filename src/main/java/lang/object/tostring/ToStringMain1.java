package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = obj.toString();

        // toString() 반환값 출력
        System.out.println(str);

        // Object 직접 출력
        System.out.println(obj);

    }
}
