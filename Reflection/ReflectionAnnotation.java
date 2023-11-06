package Reflection;

import Annotations.DeclareAnnotationBody;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionAnnotation {
    public static void main(String[] args) {
        DeclareAnnotationBody body = new DeclareAnnotationBody();
        Class<?> clazz = body.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }
        }
    }
}
