package cn.wsyjlly.reflect;

import cn.wsyjlly.annotation.AnnotationMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @author wsyjlly
 * @create 2019.06.11 - 23:21
 **/
public class ReflectMethod {
    public static void showReflectMethod() {
        try {
            Class cla = Class.forName("cn.wsyjlly.annotation.TestAnnotation");
            //只能获取public的字段，包括父类的；
            Method method = cla.getMethod("annotationMethod",String.class);
            //只能获取自己声明的各种字段，包括public，protected，private。
            Method method2 = cla.getDeclaredMethod("annotationMethod",String.class);

            //getAnnotations得到的是包括继承的所有注释。
            System.out.println("--------获取方法中所有注解-------");
            Annotation[] annotations = method.getAnnotations();
            for (Annotation item:annotations)
                System.out.println(item);

            //getDeclaredAnnotations得到的是当前成员所有的注释，不包括继承的。
            System.out.println("--------获取方法中所有注解-------");
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            for (Annotation item:declaredAnnotations)
                System.out.println(item);

            System.out.println("-------根据注解类型获取方法中的注解--------");
            AnnotationMethod annotation = method.getDeclaredAnnotation(AnnotationMethod.class);
            System.out.println(annotation);

            System.out.println("-------修饰符--------");
            int modifiers = method.getModifiers();
            System.out.println(Modifier.toString(modifiers));

            System.out.println("--------方法名-------");
            String name = method.getName();
            System.out.println(name);

            System.out.println("--------方法上定义的泛型参数-------");
            TypeVariable<Method>[] typeParameters = method.getTypeParameters();
            for (TypeVariable item:typeParameters)
                System.out.println(item);

            System.out.println("---------------");
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType);

            System.out.println("---------------");
            AnnotatedType annotatedReceiverType = method.getAnnotatedReceiverType();
            System.out.println(annotatedReceiverType);


            System.out.println("---------------");
            Parameter[] parameters = method.getParameters();
            for (Parameter item:parameters)
                System.out.println(item);


            System.out.println("---------------");
            AnnotationMethod[] declaredAnnotationsByType = method.getDeclaredAnnotationsByType(AnnotationMethod.class);
            for (AnnotationMethod item:declaredAnnotationsByType)
                System.out.println(item);


            System.out.println("---------------");
            AnnotatedType[] annotatedParameterTypes = method.getAnnotatedParameterTypes();
            for (AnnotatedType item:annotatedParameterTypes)
                System.out.println(item);



            System.out.println("---------------");
            Method[] methods = cla.getDeclaredMethods();
            for (Method item : methods) {
                //获取方法参数注解
                System.out.println(item);
                Annotation[] itemAnnotations = item.getAnnotations();
                for (Annotation item4:itemAnnotations)
                    System.out.println(item4.annotationType().getSimpleName());
                
                Annotation[][] parameterAnnotations = item.getParameterAnnotations();
                for (Annotation[] item2 : parameterAnnotations) {
                    for (Annotation item3 : item2) {
                        //获取注解名
                        System.out.println(item3.annotationType().getSimpleName());
                    }
                }
            }
            System.out.println("---------------");
            Method annotationMethod = cla.getMethod("annotationMethod", int.class);
            Parameter[] annotationMethodParameters = annotationMethod.getParameters();
            for (Parameter item:annotationMethodParameters)
                System.out.println(item);
            System.out.println("---------------");

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectMethod.showReflectMethod();
    }
}
