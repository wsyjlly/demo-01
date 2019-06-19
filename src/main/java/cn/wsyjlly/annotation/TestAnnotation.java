package cn.wsyjlly.annotation;

import cn.wsyjlly.enumeration.SEX;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 19:13
 **/
@Annotation
@AnnotationType(param1 = "晏沈威", param3 = 666)
public class TestAnnotation {
    @Annotation
    @AnnotationFiled(SEX = SEX.MAN,param2 = "wsyjlly")
    private String ID;
    private String name;
    private Integer age;

    @AnnotationConstructor
    public TestAnnotation(){
        System.out.println("TestAnnotation...1");
    }

    @AnnotationConstructor
    public TestAnnotation(String name){
        this.name = name;
        System.out.println("TestAnnotation...2");
    }

    @Annotation
    @AnnotationMethod(param1 = "wsyjlly", param3 = 888)
    public void annotationMethod(){}

    @Annotation
    @AnnotationMethod(param1 = "wsyjlly", param3 = 888)
    public  <T> void annotationMethod(@Annotation @AnnotationParameter String id){
        @AnnotationLocalVariable
        String like;
        this.ID = id;
        System.out.println(ID);
    }
    @Annotation
    @AnnotationMethod(param1 = "wsyjlly", param2 = "英俊")
    public  <T> void annotationMethod(@Annotation @AnnotationParameter int age){
        @AnnotationLocalVariable
        String like;
        this.age = age;
        System.out.println(age);
    }
    @AnnotationMethod(param1 = "wsyjlly", param2 = "英俊")
    public void setName(@Annotation @AnnotationParameter int age){
        this.age = age;
    }
    @AnnotationMethod(param1 = "wsyjlly", param2 = "英俊")
    public int getName(){
        return this.age;
    }
}
