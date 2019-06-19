package cn.wsyjlly.test_abstract;

/**
 * @author wsyjlly
 * @create 2018.12.12 - 17:37
 **/
public abstract class T_abstract {
    String name;
    Integer age;
    String sex;

    public T_abstract(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public T_abstract() {
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    public abstract String getMessage();
}
