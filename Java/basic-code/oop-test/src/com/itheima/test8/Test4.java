package com.itheima.test8;

public class Test4 {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        //现要找到id为2的学生对应的索引
        int index = getIndex(arr, 4);
        //判断索引
        if (index >= 0) {
            //存在，则将他的年龄+1岁
            Student stu = arr[index];
            stu.setAge(stu.getAge() + 1);
            //遍历数组
            printArr(arr);
        } else {
            //不存在，则直接提示
            System.out.println("当前id不存在，修改失败");
        }
    }

    //找id在数组中的索引
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) return i;
            }
        }

        //当循环结束之后，还没有找到，表示不存在
        return -1;
    }

    //遍历打印数组中的学生信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }
}
