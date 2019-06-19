package cn.wsyjlly.annotation;

import java.lang.annotation.*;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 18:55
 **/
@Annotation
@AnnotationAnnotationType
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationMethod {
    String param1() default "";
    String param2() default "";
    int param3() default 0;
}
