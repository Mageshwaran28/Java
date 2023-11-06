package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.METHOD) // where the annotation should be placed
@interface AuthoeDetails {

    String name() default "Mageshwaran";

    String email() default "magesh@gmail.com";
}

// @AuthoeDetails - through error
public class TargetAnnotation {

    @AuthoeDetails // this annotation should be allowed to methods only
    public static void main(String[] args) {
        System.out.println("Annotation");
    }
}
