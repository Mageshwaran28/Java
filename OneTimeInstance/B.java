package OneTimeInstance;

public class B extends A{
    private static int objectCreatedTime = 0;
    B(){
        super(objectCreatedTime);
        objectCreatedTime++;
    }
}
