package club.banyuan.machine;

import club.banyuan.animal.Animal;

public class Fridge {

  private int heightInCM;
  private Animal animal;

  public Fridge(){
    this(200);
  }

  public Fridge(int heightInCM){
    this.heightInCM = heightInCM;
    System.out.printf("创建一个冰箱，高度%d厘米\n", heightInCM);
  }

  public void setAnimal(Animal animal) {
    this.animal = animal;
    animal.locked();
  }

  public Animal getAnimal(){
  	return animal;
  }

  public void setHeightInCM(int heightInCM){
  	this.heightInCM = heightInCM;
  }

  public int getHeightInCM(){
  	return heightInCM;
  }

}


