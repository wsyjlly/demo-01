package cn.wsyjlly.base.genericity;

import java.util.Arrays;

/**
 * @author wsyjlly
 * @create 2019.08.10 - 11:53
 **/
public class GenericityMethod {
    public static <E> void printMessage(E[] array){
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }
    public static <E extends Comparable<E>> void printMessage2(E[] array){
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }


    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        printMessage(intArray);
        printMessage(doubleArray);
        printMessage(charArray);
        printMessage2(charArray);


        System.out.println(Byte.TYPE);
        System.out.println(Short.TYPE);
        System.out.println(Integer.TYPE);
        System.out.println(Long.TYPE);
        System.out.println(Float.TYPE);
        System.out.println(Double.TYPE);
        System.out.println(Character.TYPE);
        System.out.println(Boolean.TYPE);
        System.out.println(Void.TYPE);

    }
    static {
        System.out.println(99999);
    }
}
