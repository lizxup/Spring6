package org.example.spring6.bean;

public class Student {

    private String name;

    //学生属于哪一个班级
    private Clazz clazz;

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    //    使用级联属性赋值 需要get方法
    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }

}
