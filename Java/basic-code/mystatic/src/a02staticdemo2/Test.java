package a02staticdemo2;

public class Test {
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double arr2[] = {1.1, 1.2, 1.3, 1.4, 1.5};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
