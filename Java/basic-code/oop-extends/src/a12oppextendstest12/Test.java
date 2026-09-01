package a12oppextendstest12;

public class Test {
    public static void main(String args[]) {
        Employee e = new Employee(10, "新来的");
        Teacher t = new Teacher(1, "张老师");
        Lecturer l = new Lecturer(2, "李讲师");
        Tutor tu = new Tutor(3, "白助教");
        AdminStaff a = new AdminStaff(4, "老李");
        Maintainer m = new Maintainer(5, "钱维护员");
        Buyer b = new Buyer(6, "闫采购员");

        e.work();
        t.work();
        l.work();
        tu.work();
        a.work();
        m.work();
        b.work();
    }
}