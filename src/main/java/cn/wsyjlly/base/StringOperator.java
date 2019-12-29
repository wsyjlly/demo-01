package cn.wsyjlly.base;

import java.util.Arrays;

/**
 * @author wsyjlly
 * @create 2019.08.18 - 15:11
 **/
public class StringOperator {
    public static void main(String[] args) {
        //方式一：声明并赋初值，声明和赋值不可以分开写
        String[] str1 = {"aaa","bbb","ccc"};
        //方式二：先声明，后赋值，声明和赋值可以分开写。
        String[] str2 = new String[]{"aaa","bbb","ccc"};
        //方式三：先声明，后赋默认值，声明和赋值可以分开写。
        String[] str3;
        str3 = new String[3];
        Character[] str4 = new Character[3];
        Integer[] str5 = new Integer[3];
        char[] str6 = new char[3];
        byte[] str7 = new byte[3];
        short[] str8 = new short[3];
        int[] str9 = new int[3];
        long[] str10 = new long[3];
        float[] str11 = new float[3];
        double[] str12 = new double[3];
        boolean[] str13 = new boolean[3];
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));
        System.out.println(Arrays.toString(str5));
        System.out.println("char"+Arrays.toString(str6));
        System.out.println("byte"+Arrays.toString(str7));
        System.out.println("short"+Arrays.toString(str8));
        System.out.println("int"+Arrays.toString(str9));
        System.out.println("long"+Arrays.toString(str10));
        System.out.println("float"+Arrays.toString(str11));
        System.out.println("double"+Arrays.toString(str12));
        System.out.println("boolean"+Arrays.toString(str13));
    }
}
