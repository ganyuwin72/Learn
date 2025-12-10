package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] goodsArr = new Goods[3];
        Goods g1 = new Goods();
        goodsArr[0] = new Goods("001", "铅笔", 1.5, 100);
        goodsArr[1] = new Goods("002", "橡皮", 1.0, 100);
        goodsArr[2] = new Goods("003", "果冻", 0.5, 200);
        for (int i = 0; i < goodsArr.length; i++) {
            System.out.println(goodsArr[i].toString());
        }
    }

}
