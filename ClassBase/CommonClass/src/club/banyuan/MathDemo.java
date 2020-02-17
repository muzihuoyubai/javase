package club.banyuan;

public class MathDemo {

  public static void main(String[] args) {
    System.out.println("计算平方根: Math.sqrt(16) = " + Math.sqrt(16));//4.0
    System.out.println("计算立方根: Math.cbrt(8) = " + Math.cbrt(8));//2.0
    System.out.println("计算3的2次方: Math.pow(3,2) = " + Math.pow(3, 2));//9.0
    System.out.println("计算e的3次方: Math.exp(3) = " + Math.exp(3));//20.085536923187668

    // 这里重载了很多方法，可以接收int，long，double，float数据类型的参数
    System.out.println("求最大值: Math.max(7, 15) = " + Math.max(7, 15));//15
    System.out.println("求最小值: Math.min(2.3,4.5) = " + Math.min(2.3, 4.5));//2.3
    System.out.println("求绝对值：Math.abs(-10.1) = " + Math.abs(-10.1));//10.1

    System.out.println();
    System.out.println("===============向上取整================");
    System.out.println("Math.ceil(-10.1) = " + Math.ceil(-10.1));//-10.0
    System.out.println("Math.ceil(10.1) = " + Math.ceil(10.1));//11.0

    System.out.println();
    System.out.println("===============向下取整================");
    System.out.println("Math.floor(-10.1) = " + Math.floor(-10.1));//-11.0
    System.out.println("Math.floor(10.1) = " + Math.floor(10.1));//10.0

    System.out.println();
    // [0,1) 之间的随机数
    System.out.println("Math.random() = " + Math.random());

    // float时返回int值，double时返回long值
    System.out.println("===============四舍五入================");
    System.out.println("Math.round(10.1) = " + Math.round(10.1));//10
    System.out.println("Math.round(10.5) = " + Math.round(10.5));//11

    System.out.println("Math.round(-10.5) = " + Math.round(-10.5));//-10
    // 负数 判断如果小数位大于0.5才会进位 ，0.51大于0.5所以进位
    System.out.println("Math.round(-10.51) = " + Math.round(-10.51));//-11
  }
}
