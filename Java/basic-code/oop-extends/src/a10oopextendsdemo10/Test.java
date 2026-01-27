package a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "zhangsan", 15000, 8000);
        System.out.println("经理信息：" + m.getId() + ", " + m.getName() + ", " 
            + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook("002", "lisi", 8000);
        System.out.println("厨师信息：" + c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
