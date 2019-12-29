package cn.wsyjlly.base.collection;

/**
 * @author wsyjlly
 * @create 2019.08.07 - 13:58
 **/
public interface Biology<T> {
    void sayName();
    default void print(T t){
        System.out.println(t.getClass());
    }
}
