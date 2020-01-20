/**
 * 数据运算演示
 *
 * @author www.banyuan.club
 */
public class OperationDemo {

  public static void main(String[] args) {

    /*
     * 算数运算符
     */
    int a = 20;
    int b = 5;
    System.out.println(a + b); // 25
    System.out.println(a - b); // 15
    System.out.println(a / b); // 4
    System.out.println(a * b); // 100
    System.out.println(a % b); // 0
    System.out.println(+a); // 20
    System.out.println(-a); // -20

    int selfOperation = 5;
    // 相当于
    // System.out.println(selfOperation);
    // selfOperation = selfOperation + 1;
    System.out.println(selfOperation++); // 5

    selfOperation = 5;
    System.out.println(selfOperation--); // 5

    selfOperation = 5;
    // 相当于
    // selfOperation = selfOperation - 1;
    // System.out.println(selfOperation);
    System.out.println(--selfOperation); // 4

    selfOperation = 5;
    System.out.println(++selfOperation); // 6

    /*
     * 移位运算符
     * Integer.toBinaryString 用来将int转换为二进制的字符串，方便查看结果
     * 高位的0都不输出
     */
    System.out.println(Integer.toBinaryString(0B1110_0010 & 0B1000_1100)); // 10000000
    System.out.println(Integer.toBinaryString(0B1110_0010 | 0B1000_1100)); // 11101110
    System.out.println(Integer.toBinaryString(0B1110_0010 ^ 0B1000_1100)); // 1101110
    // 注意默认是int数据类型，所以取非高位的0都变为1
    System.out.println(Integer.toBinaryString(~0B1110_0010)); // 11111111111111111111111100011101
    System.out.println(Integer.toBinaryString(0B1110_0010 << 4)); // 111000100000
    System.out.println(Integer.toBinaryString(0B1110_0010 >> 4)); // 1110
    System.out.println(Integer.toBinaryString(0B1110_0010 >>> 4)); // 1110

    // 0xFFFFFFFF 表示 -1 因此可以赋值给short
    long lo = 123456;
    double dou = lo;
    int uu = -5;
    System.out.println(-uu);

    long abc = 123412341234123412L;

    // double a = abc;
    // System.out.println(a);

    // 浮点数存在舍入误差
    System.out.println(2.0 - 1.1); // 0.8999999999999999

    // 因为float有效位数在6~7位
    int intOne = 123456789;
    float floatOne = intOne;
    // 1.23456792E8  赋值之后只能保证精度到7位有效
    System.out.println(floatOne);

/*
    // char 表示数字的范围和byte、short不一致，不允许和byte、 short相互赋值
    char charOne = 'a';
    byte byteOne = 12;
    charOne = byteOne;  // 编译不通过
    byteOne = charOne;  // 编译不通过

    short shortOne = 123;
    charOne = shortOne; // 编译不通过
    shortOne = charOne; // 编译不通过
*/
/*
    // 小于int类型存储空间的数字数据类型的算数运算，都将转换成int类型进行计算
    short shortTwo = 1;
    short shortThree = 1;
    shortTwo= (shortTwo + shortThree); // 编译报错，因为结果是int类型，不能再赋值给short
    // 运算赋值符号一起的时候，默认进行了强制类型转换
    // 相当于 shortTow = (short) (shortTwo + shortThree)
    shortTwo += shortThree; // 可以正常运算
*/
    double doubleOne = 9.9;
    // 小数转整数将把小数部分截断
    int intTwo = (int) doubleOne;
    // 输出9
    System.out.println(intTwo);

    // 关系运算符最后返回一个boolean类型
    System.out.println(1 == 2); // 输出 false
    System.out.println(3 != 4); // 输出 true
    System.out.println(5 >= 6); // 输出 false
    System.out.println(7 <= 8); // 输出 true

    // 逻辑运算符，参与的两个操作数是boolean类型，返回一个boolean类型
    System.out.println(1 | 2);

  }
}
