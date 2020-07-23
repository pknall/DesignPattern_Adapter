package software.party.third;

public class Adaptee {

    public static void specificRequest() {
        System.out.println("Specific request performed by " + Adaptee.class.getCanonicalName());;
    }

    public static void testClass() {

    }
}
