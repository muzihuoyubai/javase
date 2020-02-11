package club.banyuan.machine;

import club.banyuan.animal.Elephant;

public class Fridge {

  private int heightInCM;
  private Elephant storage;

  public void setStorage(Elephant elephant) {
    storage = elephant;
  }

  public Elephant getStorage(){
  	return storage;
  }

  public void setHeightInCM(int height){
  	heightInCM = height;
  }

  public int getHeightInCM(){
  	return heightInCM;
  }

}


