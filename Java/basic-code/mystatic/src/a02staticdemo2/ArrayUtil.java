package a02staticdemo2;

public class ArrayUtil {
    //工具类，私有化构造方法，防止被调用
    private ArrayUtil() {}

    // 返回整数数组的字符串形式
    public static String printArr(int arr[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i] + "]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        return sb.toString();
    }

    // 返回浮点型一维数组的平均分
    public static double getAverage(double arr[]) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
