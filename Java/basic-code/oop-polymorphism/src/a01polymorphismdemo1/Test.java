package a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(40);

        Administrator a = new Administrator();
        a.setName("管理员");
        a.setAge(35);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
