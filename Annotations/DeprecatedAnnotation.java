package Annotations;

public class DeprecatedAnnotation {

    @Deprecated
    public void Display(){

        System.out.println("Deprecateddemo display()");
        
    }

    public static void main(String args[]){

        DeprecatedAnnotation d1 = new DeprecatedAnnotation();

        d1.Display();

    }
}
