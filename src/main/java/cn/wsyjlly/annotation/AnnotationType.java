package cn.wsyjlly.annotation;

import java.lang.annotation.*;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 18:55
 **/
@Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationType {
    String param1() default "";
    String param2() default "";
    int param3() default 0;
}
