package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    //双色球
    public static void main(String[] args) {
        //1.随机生成中奖号码
        int[] arrPrize = createPrize();
        //2.输入买家抽的号码
        int[] arrGuess = getUserInput();
        //3.对比号码判断中奖金额
        int prize = getPrize(arrGuess, arrPrize);
        printPrize(prize);
    }

    private static int[] getUserInput() {
        Scanner sc = new Scanner(System.in);
        int[] arrGuess = new int[7];
        for (int i = 0; i < arrGuess.length - 1; ) {
            System.out.println("请输入选择的第" + (i + 1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arrGuess, redNumber);
                if(!flag) {
                    arrGuess[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红球号码超出范围");
            }
        }
        System.out.println("请输入选择的蓝球号码：");
        while(true) {
            int blueGuess = sc.nextInt();
            if (blueGuess >= 1 && blueGuess <= 16) {
                arrGuess[arrGuess.length - 1] = blueGuess;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arrGuess;
    }

    private static int[] createPrize () {
        int[] arrPrize = new int[7];
        Random r = new Random();
        for (int i = 0; i < arrPrize.length - 1; ) {
            int num = r.nextInt(33) + 1;
            boolean contains = contains(arrPrize, num);
            if (!contains) {
                arrPrize[i] = num;
                i++;
            }
        }
        int bluePrize = r.nextInt(16) + 1;
        arrPrize[arrPrize.length - 1] = bluePrize;
        System.out.println("=================================");
        System.out.println("双色球号码为：");
        for (int i = 0; i < arrPrize.length; i++) {
            System.out.print(arrPrize[i] + " ");
        }
        System.out.println("");
        System.out.println("=================================");
        return arrPrize;
    }

    private static int getPrize(int[] arrGuess, int[] arrPrize) {
        int redCount = 0;
        int blueCount = 0;
        int prize = 0;
        for (int i = 0; i < arrGuess.length - 1; i++) {
            int redNumber = arrGuess[i];
            for (int j = 0; j < arrPrize.length - 1; j++) {
                if (arrPrize[j] == redNumber) {
                    redCount++;
                    break;
                }
            }
        }
        if (arrGuess[arrGuess.length - 1] == arrPrize[arrPrize.length - 1]) {
            blueCount++;
        }
        switch (blueCount) {
            case 0:
                switch (redCount) {
                    case 4,5 -> prize = 4;
                    case 6 -> prize = 2;
                }
                break;
            case 1:
                switch (redCount) {
                    case 0,1,2 -> prize = 6;
                    case 4 -> prize = 4;
                    case 5 -> prize = 3;
                    case 6 -> prize = 1;
                }
                break;
        }
        return prize;
    }

    private static void printPrize(int prize) {
        switch (prize) {
            case 0 -> System.out.println("很遗憾，未中奖");
            case 1 -> System.out.println("一等奖：最高1000万");
            case 2 -> System.out.println("二等奖：最高500万");
            case 3 -> System.out.println("三等奖：3000元");
            case 4 -> System.out.println("四等奖：200元");
            case 5 -> System.out.println("五等奖：10元");
            case 6 -> System.out.println("六等奖：5元");
        }
    }

    public static boolean contains(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }
}
