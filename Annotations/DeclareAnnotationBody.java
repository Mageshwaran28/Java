package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ClassPreamble {
    String author();

    String date();

    int currentRevision() default 1; // when declarartion we give the default value then not mandatory to define

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Test{
    String name();
}

public class DeclareAnnotationBody {

    @SuppressWarnings("check")
    @Test(name =  "magesh")
    @ClassPreamble(author = "Mageshwaran", date = "10/31/2023", reviewers = { "Balaji", "Kavi", "Ravi" })
    public void method() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
