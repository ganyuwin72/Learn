package a02polymorphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void KeepPet(Animal pet, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + pet.getColor() + "颜色的" + pet.getAge() + "岁的宠物");
        pet.eat(something);
    }
}