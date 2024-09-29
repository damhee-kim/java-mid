package lang.object.poly;

public class ObjectPolyExample2<obj> {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();

        Object[] objs = {dog, car, obj};

        size(objs);
    }

    private static void size(Object[] objs) {
        System.out.println("전달된 객체의 수는: " + objs.length);
    }
}
