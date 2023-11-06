package Annotations;

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {
    String author();

    String date();

    int currentRevision() default 1; // when declarartion we give the default value then not mandatory to define

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();
}

@ClassPreamble(author = "Mageshwaran", date = "10/31/2023", reviewers = { "Balaji", "Kavi", "Ravi" })
public class DeclareAnnotationBody {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}
