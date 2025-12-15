package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
//        Student stu3 = new Student(3, "wangwu", 25);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
//        arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4, "zhaoliu", 26);

        //唯一性判断
        //已存在 --- 不用添加
        //不存在 --- 就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //已存在 --- 不用添加
            System.out.println("当前学号重复，请修改学号之后再进行添加");
        } else {
            //不存在 --- 就可以把学生对象添加进数组
            //把stu4添加到数组中
            //1.数组已存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
            //2.数组没有存满 --- 直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //已经存满
                //创建一个新的数组，新数组的长度 = 老数组 + 1
                //然后把老数组的元素，拷贝到新数组当中
                Student[] newArr = createNewArr(arr);
                //[stu1, stu2, stu3]
                //[stu1, stu2, stu3, null]
                //把stu4添加进去
                newArr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                printArr(newArr);
            } else {
                //没有存满
                //[stu1, stu2, null]
                //getCount获取到的是2，表示数组当中已经有了2个元素
                //还有一层意思：如果下一次要添加数据，就是添加到2索引的位置
                arr[count] = stu4;
                //要求2：添加完毕之后，遍历所有学生信息
                printArr(arr);
            }
        }


    }

    //遍历打印数组中的学生信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }

    //创建长度比原来多1的新数组
    public static Student[] createNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把老数组中的元素添加到新数组中
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) count++;
        }
        return count;
    }


    //1.我要干嘛？
    //2.我干这件事情，需要什么才能完成？ 数组 id
    //3.调用处是否需要继续使用方法的结果？ 必须返回
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null && stu.getId() == id) return true;
        }
        return false;
    }
}
