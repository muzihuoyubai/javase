package club.banyuan.machine;

import club.banyuan.animal.Elephant;

public class Fridge {

  private int heightInCM;
  private Elephant storage;

  public Fridge(){
    this(200);
  }

  public Fridge(int heightInCM){
    this.heightInCM = heightInCM;
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
  }

  public void setStorage(Elephant elephant) {
    storage = elephant;
  }

  public Elephant getStorage(){
  	return storage;
  }

  public void setHeightInCM(int heightInCM){
  	this.heightInCM = heightInCM;
  }

  public int getHeightInCM(){
  	return heightInCM;
  }

}


