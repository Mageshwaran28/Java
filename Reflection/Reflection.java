package Reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class Parent extends Exception {

    Parent() {
        System.out.println("This is empty parameter");
    }

    Parent(String name) {
        System.out.println("This is one parameter");
    }

    public String name;

    private String str;

     static void fun(String str, int index) {
        System.out.println("Hello world");
    }

}


class Reflection {
    public static void main(String[] args) throws Exception {

        Parent parent = new Parent();
        Class<?> c1 = parent.getClass();

        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getSuperclass().getSimpleName());

        // Class<?> c1 = Parent.class;
        
        // Class<?> c1 = Class.forName("Parent");

        String s = c1.getSimpleName();
        System.out.println(s);
        System.out.println(c1.getPackage().getName());

        Method[] method = c1.getDeclaredMethods();

        for (Method method2 : method) {

            System.out.println(method2.getModifiers());

            System.out.println(method2.getName());
            System.out.println(Modifier.toString(method2.getModifiers()));
            System.out.println(method2.getReturnType());

            Parameter[] parameters = method2.getParameters();

            System.out.println(parameters.length);

            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }



        }

        Field name = c1.getField("name");
        name.set(parent, "s");
        System.out.println(name.get(parent));

        Field f1 = c1.getDeclaredField("str");

        System.out.println(f1.getName());

        f1.setAccessible(true);
        f1.set(parent, "Hello World");

        System.out.println(f1.get(parent));
        System.out.println(Modifier.toString(f1.getModifiers()));

        Constructor<?>[] constructors = c1.getDeclaredConstructors();

        for (Constructor<?> c : constructors) {

            // System.out.println(c.getName());
            // System.out.println(c.getParameterCount());

            Class<?>[] pr = c.getParameterTypes();

            for (Class<?> param : pr) {

                System.out.println(param.getTypeName());

            }

        }

    }
}
