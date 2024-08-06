package Module7_Annotations.L2exercise1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomizedAnnotations {
    String directory();
}
