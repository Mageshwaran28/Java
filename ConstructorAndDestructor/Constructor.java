package ConstructorAndDestructor;

class ParentClass{

    ParentClass(){
        System.out.println("Default parent constructor ");
    }

    ParentClass(int value){
        System.out.println(value);
    }

    ParentClass(int value , int parent){
        System.out.println(value);
    }

}

class SampleClass extends ParentClass{

    int value;

    SampleClass() {
        super(10);
        value = 10;
    }

    SampleClass(int value) {
        super(value);
        this.value = value;
    }

    SampleClass(SampleClass sampleClass) {
        super(sampleClass.value);
        this.value = sampleClass.value;
    }

    void getValue() {
        System.out.println(this.value);
    }

    public void finalize() {
        System.out.println("SamplClass will be destroyed");
    }

}

public class Constructor {

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        // sampleClass.getValue();
        SampleClass sampleClass2 = new SampleClass(30);
        // sampleClass2.getValue();
        sampleClass = new SampleClass(sampleClass2);
        // sampleClass.getValue();
    }
}
