package com.example;

/**
 * @author: chuanqian
 * @create: 2022-06-24 8:36
 * 练习：90分及以上"优秀" 80分及以上"中等" 70分及以上"及格" 70分以下"不及格"，如果用户输入的为负数，我们直接给出错误提示，重新输入
 */
public class DemoIfElse {
    public static int testReturn() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return 55555;
            }
        }
        return 1000000;
    }

    public static void main(String[] args) {
        // 输入
//        Scanner scanner = new Scanner(System.in);
//        int achievement = scanner.nextInt();
//        // 首先使用if-else的方式
//        if(achievement<0 || achievement > 100){
//            System.out.println("输入成绩有误");
//        }else if(achievement<70 && achievement>0){
//            System.out.println("成绩不及格");
//        }else if(achievement>=70 && achievement<80){
//            System.out.println("成绩及格");
//        }else if(achievement>=80 && achievement<90){
//            System.out.println("成绩中等");
//        }else if(achievement>=90 && achievement<=100){
//            System.out.println("成绩优秀");
//        }
        // switch
//        if(achievement<0 || achievement > 100) {
//            System.out.println("输入成绩有误");
//        }else{
//            switch (achievement / 10){
//                case 10:
//                    System.out.println("成绩优秀");
//                    System.out.println("程序执行1");
//                    break;
//                case 9:
//                    System.out.println("成绩优秀但不是满分");
//                    System.out.println("程序执行2");
//                    break;
//                case 8:
//                    System.out.println("成绩中等");
//                    System.out.println("程序执行3");
//                    break;
//                case 7:
//                    System.out.println("成绩及格");
//                    break;
//                default:
//                    System.out.println("成绩不及格");
//                    break;
//            }
//        }
//        System.out.println("程序执行1111");
//        scanner.close();
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            if(i!=0 && i%3==0){
//                System.out.println("我是3的倍数");
//                continue;
//            }
//            count++;
//        }
//        System.out.println("count : "+ count);
        int result = testReturn();
        System.out.println(result);
        System.exit(0);
    }
}
