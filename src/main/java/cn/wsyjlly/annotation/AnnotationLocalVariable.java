package cn.wsyjlly.annotation;

import cn.wsyjlly.enumeration.SEX;

import java.lang.annotation.*;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 18:55
 **/
@Annotation
@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationLocalVariable {
    String param1() default "";
    String param2() default "";
    int param3() default 0;
    SEX SEX() default SEX.MAN;
}
