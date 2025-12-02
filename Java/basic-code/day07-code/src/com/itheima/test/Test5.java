package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    //评委打分
    public static void main(String[] args) {
        /*
        一共有6名评委打分，分数范围为[0-100]间的整数
        最后得分为：去掉最高分、去掉最低分后4个评委的平均分
         */
        //1.录入6位评委的打分
        int[] scores = getScores();
        //2.找到评分中的最高分和最低分
        int max = getMax(scores);
        int min = getMin(scores);
        //3.计算选手最终得分
        int sum = getSum(scores);
        //int finalScore = getFinalScore(sum, max, min);
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("该选手最终得分为：" + avg);
    }

    private static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        //输入分数的范围为0~100
        for (int i = 1; i <= scores.length; ) {
            System.out.println("请录入第" + i + "位评委的评分：");
            int score = sc.nextInt();
            //当输入的分数在合法范围时，才进行i自增1
            if (score >= 0 && score <= 100) {
                scores[i - 1] = score;
                i++;
            } else {
                System.out.println("成绩超出了合法范围，请重新输入！");
            }
        }
        return scores;
    }

    private static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max) max = scores[i];
        }
        return max;
    }

    private static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < min) min = scores[i];
        }
        return min;
    }

    private static int getSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    private static int getFinalScore(int sum, int max, int min){
        return (sum - max - min) / 4;
    }
}
