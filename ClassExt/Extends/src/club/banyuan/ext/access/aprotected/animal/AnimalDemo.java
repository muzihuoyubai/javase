package club.banyuan.ext.access.aprotected.animal;

public class AnimalDemo {

  public static void main(String[] args) {
    Elephant elephant = new Elephant();
    // 父类的protected属性和方法在同一个包下的，其他类可以通过子类对象使用
    elephant.setHeightInCM(300);
    elephant.weightInKG = 3000;
  }
}
