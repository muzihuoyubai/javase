package club.banyuan.machine;

import club.banyuan.animal.Elephant;

public class Main {
  static Elephant createElephant(int heightInCM) {
    return new Elephant(heightInCM);
  }

  static Fridge createFridge(int heightInCM) {
    return new Fridge(heightInCM);
  }

  static void putInElephant(Elephant elephant, Fridge fridge) {
    System.out.printf("把%d厘米高的大象装进%d厘米高的冰箱\n", elephant.getHeightInCM(), fridge.getHeightInCM());
    if(elephant.getHeightInCM() < fridge.getHeightInCM()) {
      fridge.setStorage(elephant);
      System.out.printf("冰箱里面的大象高度是%d厘米\n", fridge.getStorage().getHeightInCM());
    } else {
      System.out.printf("冰箱装不下!\n");
    }

  }

  public static void main(String[] args) {
    Elephant elephant = createElephant(300);
    Fridge fridge = createFridge(500);
    putInElephant(elephant, fridge); 
  }
}


