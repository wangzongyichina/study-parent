package com.wzy.study.gateway.lambda;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 17:50
 * @Desc:
 */

/**
 * lambda 表达式的类型推断
 */
public class TypeDemo {
    public static void main(String[] args) {
        // 变量类型定义
        IMath iMath = (x, y) -> x + y;
        System.out.println(iMath.add(12, 7));
        // 数组
        IMath[] iMaths = {
            (x, y) -> x + y
        };
        System.out.println("iMaths.length = " + iMaths.length);
        System.out.println(iMaths[0].add(1, 3));
        // 强转
        IMath objImath  = (x, y) -> x + y;
        System.out.println(objImath.add(9, 8));
        // 通过返回类型
        IMath math = createIMath();
        System.out.println(math.add(10, 9));
        // 存在二义性时，使用强转
        test((IMath2) (x,y)->x+y);
    }

    public static void test(IMath iMath){
        System.out.println("test111执行---iMath==");
    }
    public static void test(IMath2 iMath2){
        System.out.println("test222执行---iMath2==");
    }


    public static IMath createIMath() {
        return (x, y) -> x + y;
    }
}

@FunctionalInterface
interface IMath {
    Integer add(int x, int y);
}
@FunctionalInterface
interface IMath2 {
    Integer add(int x, int y);
}