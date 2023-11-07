package Annotations;

@FunctionalInterface
public interface FunctionalInterfaceAnnotation {

    String getFullName(String firstName , String lastName);

    default void greeting(String msg) {
        System.out.println("Welcome " + msg);
    }
}
