package OneTimeInstance;

public class Main {
    @SuppressWarnings("unused")

    public static void main(String[] args) {
        B b = new B(); // first B object created
        B b1 = new B(); // second B object created
        C c = new C(); // first C object created
        C c1 = new C(); // second C object created

    }
}
