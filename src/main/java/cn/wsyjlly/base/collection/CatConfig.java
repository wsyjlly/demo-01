package cn.wsyjlly.base.collection;

/**
 * @author wsyjlly
 * @create 2019.08.07 - 14:22
 **/
public class CatConfig implements Animal<Cat>{
    @Override
    public void sayAge() {
        System.out.println("age:2");
    }

    @Override
    public void sayName() {
        System.out.println("name:kitty");
    }
}
