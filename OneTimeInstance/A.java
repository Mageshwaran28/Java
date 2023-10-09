package OneTimeInstance;

public class A {    
    A(int times){
        if(times!=0){
            try {
                throw new IllegalStateException("Object already exists");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
