package Annotations;

@FunctionalInterface
interface FunctionalInterfaceAnnotation {

    public String getFullName(String firstName , String lastName);

    default void greeting(String msg) {
        System.out.println("Welcome " + msg);
    }
}
