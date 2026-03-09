package a11oppextendsdemo11;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("001", "张三");
        Teacher t1 = new Teacher("002", "李四");
        Tutor t2 = new Tutor("003", "王五");
        AdminStaff a = new AdminStaff("004", "赵六");
        Maintainer m = new Maintainer("005", "钱七");
        Buyer b = new Buyer("006", "孙八");
        Lecturer le = new Lecturer("007", "周九");

        e.work();
        t1.work();
        t2.work();
        a.work();
        m.work();
        b.work();
        le.work();
        System.out.println(e.getId() + t1.getId() + t2.getId() + a.getId() + m.getId() + b.getId() + le.getId() + "都在work");

    }
}
