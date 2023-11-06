package Annotations;


import java.lang.annotation.*;

@Repeatable(Roles.class) // Specify the container annotation type
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value(); // This method returns an array of Role annotations
}