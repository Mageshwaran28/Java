package ConstructorAndDestructor;

public class Destructor {
    
    @SuppressWarnings("unused")

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        SampleClass sampleClass2 = new SampleClass();
        sampleClass = null;
        sampleClass2 = null;
        System.gc();
        for (int i = 0; i < 100; i++) {
            System.out.print("Hellp ");
        }
        System.gc();
    }

    protected void finalize() {
        System.out.println("Object will be destroyed");
    }

}
