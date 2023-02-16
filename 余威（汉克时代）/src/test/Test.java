package test;

import java.util.Scanner;

/**
 * 创建作者 ：yw
 * 创建时间 2023/2/15 17:03
 * 项目名称 余威（汉克时代）
 */
//题目
//1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
//现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
//请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//2、超市增加了一种水果芒果，其定价为 20 元/斤。
//现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//3、超市做促销活动，草莓限时打 8 折。
//现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
//现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//要求
//使用 Java 程序编写，IDE 不限，
//请使用面向对象的思路进行程序编写。
//需在程序中，验证函数计算结果的正确性。
//
//提示
//顾客购买的水果斤数，可自行确定。无论数值为多少，均需验证程序计算结果的正确性。
//可以编写多个函数分别实现，也可以只编写一个函数实现，方式不限。
//面试时，请准备电脑及 IDE 环境进行现场演示。
//若能将代码提交到 github、gitee、gitlab 等代码托管仓库，提供代码仓库地址更佳。
public class Test {
    static  Scanner input=new Scanner(System.in);
    static Fruit apple=new Fruit("苹果",8);
    static Fruit strawberry=new Fruit("草莓",13);
    static Fruit mango=new Fruit("芒果",20);
    public static void main(String[] args) {
        double price1 = test1(1, 1);
        double price2 = test2(1, 1, 1);
        double price3 = test3(11, 1, 1);
        double price4 = test4(11, 1, 1);
        System.out.println("price1 = " + price1);
        System.out.println("price2 = " + price2);
        System.out.println("price3 = " + price3);
        System.out.println("price4 = " + price4);
    }
    public static   double test1(double a,double b){
            if(a<0 || b<0){
                throw  new RuntimeException("斤数不能为负数");
            }
        return a*apple.getPrice()+b*strawberry.getPrice();
    }
    public static   double test2(double a,double b,double c){
        if(a<0 || b<0 ||c<0){
            throw  new RuntimeException("斤数不能为负数");
        }
        return a*apple.getPrice()+b*strawberry.getPrice()+c*mango.getPrice();
    }
    public static   double test3(double a,double b,double c){
        if(a<0 || b<0 ||c<0){
            throw  new RuntimeException("斤数不能为负数");
        }
        return a*apple.getPrice()+b*0.8*strawberry.getPrice()+c*mango.getPrice();
    }
    public static   double test4(double a,double b,double c){
        if(a<0 || b<0 ||c<0){
            throw  new RuntimeException("斤数不能为负数");
        }
          double   prices=a*apple.getPrice()+b*0.8*strawberry.getPrice()+c*mango.getPrice();
        if(prices>=100){
            prices-=10;
        }
        return prices;
    }
}

