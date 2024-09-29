package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {

        // 객체에 맞는 다운캐스팅이 필요하다.
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();

        }
    }
}
