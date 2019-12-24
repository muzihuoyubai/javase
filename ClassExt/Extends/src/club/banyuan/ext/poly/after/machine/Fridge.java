package club.banyuan.ext.poly.after.machine;

import club.banyuan.ext.poly.after.animal.Animal;

public class Fridge {

  private Animal animal;

  public Animal getAnimal() {
    Animal temp = animal;
    System.out.printf("把%s从冰箱里面拿出来，身高：%dcm\n", animal.getType(), animal.getHeightInCM());
    System.out.println("type=" + animal.type);
    animal = null;
    return temp;
  }

  // 编译的时候是Animal类型，实际运行的时候，是Elephant或Lion
  // 因为编译的时候是Animal类型，所以不能调用Elephant或Lion扩展的方法，因为Animal类型没有
  public void setAnimal(Animal animal) {
    this.animal = animal;
    System.out.printf("把%s放到到冰箱里面，身高：%dcm\n", animal.getType(), animal.getHeightInCM());
    System.out.println("type=" + animal.type);
  }
}
