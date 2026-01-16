package a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {} 

    public static int getStudentAgeAvg(ArrayList<Student> studentList) {
        int totalAge = 0;
        for (Student s : studentList) {
            totalAge += s.getAge();
        }
        return totalAge / studentList.size();
    }

    public static int getStudentAgeMax(ArrayList<Student> studentList) {
        int maxAge = Integer.MIN_VALUE;
        for (Student s : studentList) {
            int age = s.getAge();
            if (age > maxAge) {
                maxAge = age;
            }
        }
        return maxAge;
    }
}
