package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    String value() default "Magesh";
}

@CustomAnnotation(value = "Zerp Labs")
class SuperClass {

}

public class InheritedAnnotation extends SuperClass {
    public static void main(String[] args) {
        System.out.println(new InheritedAnnotation().getClass().getAnnotation(CustomAnnotation.class));
    }
}
