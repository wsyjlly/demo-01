package cn.wsyjlly.reflect;

import java.lang.reflect.Array;

/**
 * @author wsyjlly
 * @create 2019.06.12 - 1:03
 **/
public class ReflectArray {
    public static void showReflectArray() {
        int[] ids = (int[]) Array.newInstance(int.class, 5);
        int[][] matrix = (int[][])Array.newInstance(int.class, 5, 3);
        try {
            Object my = Array.newInstance(int.class, 2);

            int n1 = Array.getInt(my, 0);
            int n2 = Array.getInt(my, 1);
            System.out.println("n1 = " + n1 + ", n2=" + n2);

            Array.set(my, 0, 11);
            Array.set(my, 1, 12);

            n1 = Array.getInt(my, 0);
            n2 = Array.getInt(my, 1);
            System.out.println("n1 = " + n1 + ", n2=" + n2);

            System.out.println(getArrayDimension(matrix));
        } catch (NegativeArraySizeException | IllegalArgumentException
                | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getArrayDimension(Object array) {
        int dimension = 0;
        Class c = array.getClass();
        if (!c.isArray()) {
            throw new IllegalArgumentException("Object is not  an  array");
        }
        while (c.isArray()) {
            dimension++;
            c = c.getComponentType();
        }
        return dimension;
    }

    public static void main(String[] args) {
        ReflectArray.showReflectArray();
    }
}
