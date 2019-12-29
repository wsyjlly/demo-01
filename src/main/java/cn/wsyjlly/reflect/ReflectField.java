package cn.wsyjlly.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author wsyjlly
 * @create 2019.06.11 - 23:22
 **/
public class ReflectField {
    public static void showReflectField() {
        try {
            Class cla = Class.forName("cn.wsyjlly.annotation.TestAnnotation");
            Field[] declaredFields = cla.getDeclaredFields();
            for (Field item:declaredFields) {
                System.out.println(item);
            }
            Field field = cla.getDeclaredField("ID");
            //Field field2 = cla.getField("ID");
            System.out.println("---------------");
            Annotation[] annotations = field.getAnnotations();
            for (Annotation item:annotations) {
                System.out.println(item);
            }
            System.out.println("---------------");
            
            System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("---------------");
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectField.showReflectField();
    }
}
