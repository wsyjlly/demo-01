package cn.wsyjlly.reflect;

import cn.wsyjlly.annotation.TestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @author wsyjlly
 * @create 2019.06.11 - 21:49
 **/
public class ReflectClass {
    public static void showReflectClass() {
        try {
            Class cla = Class.forName("cn.wsyjlly.annotation.TestAnnotation");
            Class<TestAnnotation> clazz2 = TestAnnotation.class;
            Class<? extends TestAnnotation> clazz3 = new TestAnnotation().getClass();
            String name = cla.getName();
            String simpleName = cla.getSimpleName();
            Package clapackage = cla.getPackage();
            String typeName = cla.getTypeName();
            Class superclass = cla.getSuperclass();
            TypeVariable[] typeParameters = cla.getTypeParameters();
            int modifiers = cla.getModifiers();
            Method[] methods = cla.getMethods();
            Method[] declaredMethods = cla.getDeclaredMethods();
            System.out.println(name);
            System.out.println(simpleName);
            System.out.println(clapackage);
            System.out.println(typeName);
            System.out.println(superclass);
            System.out.println(java.lang.reflect.Modifier.toString(modifiers));
            System.out.println("---------------");
            for (TypeVariable item:typeParameters)
                System.out.println(item);
            System.out.println("---------------");
            Class declaringClass = cla.getDeclaringClass();
            System.out.println(declaringClass);
            System.out.println("---------------");
            AnnotatedType[] annotatedInterfaces = cla.getAnnotatedInterfaces();
            for (AnnotatedType item:annotatedInterfaces)
                System.out.println(item);
            System.out.println("---------------");
            Annotation[] annotations = cla.getAnnotations();
            for (Annotation item:annotations)
                System.out.println(item);
            System.out.println("---------------");
            Annotation[] declaredAnnotations = cla.getDeclaredAnnotations();
            for (Annotation item:declaredAnnotations)
                System.out.println(item);
            System.out.println("---------------");
            ClassLoader classLoader = cla.getClassLoader();
            System.out.println(classLoader);
            System.out.println("---------------");
            Object newInstance = cla.newInstance();
            System.out.println(newInstance);
            System.out.println("---------------");
            Constructor<TestAnnotation> constructor2  = cla.getConstructor(String.class);
            TestAnnotation instance2 = constructor2.newInstance("ysw");
            System.out.println(instance2);
            System.out.println("---------------");
            Method annotation = cla.getMethod("annotationMethod", String.class);
            annotation.invoke("ysw");
            System.out.println("---------------");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectClass.showReflectClass();
    }
}
