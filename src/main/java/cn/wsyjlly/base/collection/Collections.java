package cn.wsyjlly.base.collection;

/**
 * @author wsyjlly
 * @create 2019.08.07 - 13:25
 **/
public class Collections {
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Collection
//        List
//        ArrayList
        CatConfig cat = new CatConfig();
        cat.print(new Cat());
        cat.sayName();
    }
}
