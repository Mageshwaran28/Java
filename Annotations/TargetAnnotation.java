package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface AuthoeDetails {

    String name() default "Mageshwaran";

    String email() default "magesh@gmail.com";
}

@AuthoeDetails
public class TargetAnnotation {
    public static void main(String[] args) {
        System.out.println("Annotation");
    }
}
