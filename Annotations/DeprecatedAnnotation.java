package Annotations;

public class DeprecatedAnnotation {
    @Deprecated
    public void deprecatedMethod() {
        System.out.println("This is a deprecated method.");
    }
}

 class DeprecatedExample {
    public static void main(String args[]){

        DeprecatedAnnotation example = new DeprecatedAnnotation();
        // Using a deprecated method
        example.deprecatedMethod();

    }
}
