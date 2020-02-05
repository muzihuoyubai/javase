package club.banyuan.machine;

import club.banyuan.animal.Elephant;

public class Fridge {

  private int heightInCM;
  private Elephant storage;

  // get
  public int getHeightInCM() {
    return heightInCM;
  }

  // set
  public void setHeightInCM(int heightInCM) {
    this.heightInCM = heightInCM;
  }

  public Elephant getStorage() {
    return storage;
  }

  public void setStorage(Elephant storage) {
    this.storage = storage;
  }
}


