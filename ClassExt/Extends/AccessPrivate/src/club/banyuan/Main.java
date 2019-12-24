package club.banyuan;

public class Main {

    public static void main(String[] args) {
        Son son = new Son();
        // 子类自定的方法
        System.out.println(son.sonMethod());

        // 子类继承自父类的public方法
        System.out.println(son.getFatherProp());

        // 无法获取到父类的私有方法或属性
/*      编译报错
        System.out.println(son.fatherProp);
        System.out.println(son.fatherMethod());
        */
    }
}
