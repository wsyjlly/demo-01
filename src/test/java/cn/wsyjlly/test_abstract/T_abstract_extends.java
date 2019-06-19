package cn.wsyjlly.test_abstract;

/**
 * @author wsyjlly
 * @create 2018.12.12 - 17:53
 **/
public class T_abstract_extends extends T_abstract {
    public T_abstract_extends(String name, Integer age, String sex) {
        super(name, age, sex);
    }
    public  T_abstract_extends(){}
    @Override
    public String getMessage() {
         return "";
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    /**
     *
     */
    public double getMoney() {
           return 0.0;
    }
}
