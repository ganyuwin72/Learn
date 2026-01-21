package a01oppextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.drink();
        c.catchMouse();

        System.out.println("----------------------------");

        Husky h = new Husky();
        h.eat();
        h.drink();
        h.keepHome();
        h.breakHome();

    }
}
