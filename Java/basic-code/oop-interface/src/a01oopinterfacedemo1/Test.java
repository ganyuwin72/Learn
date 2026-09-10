package a01oopinterfacedemo1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 3);
        dog.eat();
        dog.swim();

        Rabbit rabbit = new Rabbit("小白", 1);
        rabbit.eat();

        Frog frog = new Frog("小青", 2);
        frog.eat();
        frog.swim();
    }
}
