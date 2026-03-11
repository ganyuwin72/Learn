package a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三", 28);
        Animal d = new Dog(3, "黑");
        Animal c = new Cat(2, "灰");

        p.keepPet(d, "骨头");
        p.keepPet(c, "鱼");

        if (d instanceof Dog dog) {
            dog.lookHome();
        }

        if (c instanceof Cat cat) {
            cat.catchMouse();
        }
    }
}
