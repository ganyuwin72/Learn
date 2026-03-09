package a01polymorphismdemo1;

public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("教师信息为：" + this.getName() + "，" + this.getAge());
    }
}
