package Annotations;

import java.util.ArrayList;

public class SuppressWarningsAnnotation {

    @SuppressWarnings({ "checked" })
    public static void main(String args[]) {

        @SuppressWarnings("unused")
        int unusedVariable;

        @SuppressWarnings({"rawtypes", "unused"})
        ArrayList list = new ArrayList();
    }
}
