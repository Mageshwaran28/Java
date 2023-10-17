package OneTimeInstance;

import java.util.HashSet;
public class A {    
    private static HashSet<String > keys = new HashSet<String>();

    A(){
        if(keys.contains(this.getClass().getSimpleName())){
            throw new IllegalStateException("This class already exists");
        }
        keys.add(this.getClass().getSimpleName()); 
    }

}
