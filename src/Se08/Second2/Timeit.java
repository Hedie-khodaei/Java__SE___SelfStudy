package src.Se08.Second2;
//@annotation

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface Timeit {
}
