package lang.string.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("idency = " + (user1 == user2));
        System.out.println("equality = " + user1.equals(user2));;
    }
}

