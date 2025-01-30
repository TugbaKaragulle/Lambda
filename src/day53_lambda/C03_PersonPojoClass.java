package day53_lambda;

public class C03_PersonPojoClass {

    private String name;
    private Integer age;


    public C03_PersonPojoClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
