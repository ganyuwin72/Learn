package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop: while (true) { 
            System.out.println("------------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    // System.exit(0); // 退出JVM虚拟机
                }
                default -> System.out.println("没有这个选项");
            }
    
        }
    }


    // 添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) { 
            System.out.println("请输入学生的id：");
            String idInput = sc.next();
            // 判断id是否存在
            boolean flag = contains(list, idInput);
            if (flag) {
                System.out.println("id已经存在，请重新录入");
            } else {
                id = idInput;
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的家庭住址：");
        String address = sc.next();
        Student stu = new Student(id, name, age, address);
        list.add(stu);
        System.out.println("学生信息添加成功！");
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生信息删除成功！");
        } else {
            System.out.println("id不存在，删除失败！");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的学生id不存在，请重新输入");
            return;
        }
    
        Student stu = list.get(index);
        System.out.println("请输入新的姓名：");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入新的年龄：");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入新的家庭住址：");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功！");
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }

        System.out.println("id\t\t姓名\t\t年龄\t家庭住址\t");
        for (Student stu : list) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t\t" + stu.getAge() + "\t" + stu.getAddress());  
        }
        return;
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        /*for (Student stu : list) {
            if (stu.getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list, id) >= 0;
    }

    // 查询id在集合中的索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
