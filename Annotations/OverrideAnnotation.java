package Annotations;

public class OverrideAnnotation {

    public void Display() {
        System.out.println("Parent Class Display() Method");
    }

    public static void main(String args[]) {

        OverrideAnnotation t1 = new ChildClass();
        t1.Display();

    }
}

class ChildClass extends OverrideAnnotation {

    @Override
    public void Display() {
        System.out.println("Child Class Display() Method");
    }

}
