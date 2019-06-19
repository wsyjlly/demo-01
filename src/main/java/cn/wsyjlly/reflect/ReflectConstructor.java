package cn.wsyjlly.reflect;

import cn.wsyjlly.annotation.TestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wsyjlly
 * @create 2019.06.12 - 1:03
 **/
public class ReflectConstructor {
    public static void showReflectConstructor() {
        Class<TestAnnotation> cla = TestAnnotation.class;
        try {
            Constructor<TestAnnotation> constructor = cla.getConstructor(String.class);
            System.out.println(constructor);
            System.out.println("---------------");
            Constructor<?>[] constructors = cla.getConstructors();
            for (Constructor item:constructors)
                System.out.println(item);
            System.out.println("---------------");
            TestAnnotation testAnnotation = cla.newInstance();
            TestAnnotation testAnnotation1 = constructor.newInstance("ysw");
            System.out.println("---------------");
            System.out.println("---------------");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ReflectConstructor.showReflectConstructor();
    }
}
