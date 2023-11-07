package Annotations;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        FunctionalInterfaceAnnotation example;
        example = (firstName, secondName) -> {
            return firstName+secondName;
        };

        System.out.println(example.getFullName("Magesh", "waran"));
        example.greeting("Mageshwaran");
    }
}
