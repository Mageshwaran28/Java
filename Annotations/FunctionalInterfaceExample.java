package Annotations;

public class FunctionalInterfaceExample  implements FunctionalInterfaceAnnotation {

    public String getFullName(String firstName , String lastName){
        return firstName  + lastName;
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        String name = example.getFullName("Mageh" , "waran");

        example.greeting(name);
    }
}


class ChildClass extends FunctionalInterfaceExample {

    // public String getFullName(String firstName , String lastName){
    //     return firstName  + lastName;
    // }
    public static void main(String[] args) {
        new ChildClass().greeting("Mageshwaran");
    }
    
}
