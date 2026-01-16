package a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();
        Student s1 = new Student("zhangsan", 23, "男");
        Student s2 = new Student("lisi", 24, "女");
        Student s3 = new Student("wangwu", 60, "男");
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);
        int avgAge = StudentUtil.getStudentAgeAvg(stuList);
        System.out.println("学生的平均年龄是：" + avgAge);
        int maxAge = StudentUtil.getStudentAgeMax(stuList);
        System.out.println("学生的最大年龄是：" + maxAge);
    }
}
