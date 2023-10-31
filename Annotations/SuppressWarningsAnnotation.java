package Annotations;

class DeprecatedDemo{

    @Deprecated
    public void Display(){
        System.out.println("Deprecateddemo display()");
    }

}

public class SuppressWarningsAnnotation {

    @SuppressWarnings({ "checked" })
    public static void main(String args[]){

        DeprecatedDemo d1 = new DeprecatedDemo();
        d1.Display();

    }
}
