package OneTimeInstance;

public class C extends A{
    private static int objectCreatedTime = 0;
    C(){
        super(objectCreatedTime);
        objectCreatedTime++;
    }
}
