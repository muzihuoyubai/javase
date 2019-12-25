package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Crane crane = new Crane();
    // 匿名内部类，是Animal抽象类的一个子类
    crane.liftAnimal(new Animal(300) {
      @Override
      public String getType() {
        return "大象";
      }
    });

    // 匿名内部类，carryable接口的一个实现类，创建这样的类的实例
    Carryable carryable = new Carryable() {
      @Override
      public void lifted() {
        System.out.println("大象被举起");
      }

      @Override
      public void dropped() {
        System.out.println("大象被放下");
      }
    };

    carryable.lifted();
    carryable.move();
    carryable.dropped();

    // 匿名内部类中如果使用了外部的局部变量，需要保证该局部变量是final的
    // java8之前，需要显示指定变量是final的，java8之后，编译器可以自动在变量前增加final，被称作Effectively Final
    int height = 350;
    // height = 350; // 这里再次对变量赋值的话，说明这一定不是final类型的变量，编译器无法增加final修饰，会导致匿名内部类里面报错
    new Animal(300) {
      @Override
      public String getType() {
        return "大象";
      }

      @Override
      public void setHeightInCM(int heightInCM) {
        super.setHeightInCM(height);
      }
    };

  }
}
