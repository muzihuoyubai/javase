package club.banyuan.ext.poly.before.machine;

import club.banyuan.ext.poly.before.animal.Elephant;

public class Fridge {

  private Elephant elephant;

  public Elephant getElephant() {
    Elephant temp = elephant;
    elephant = null;
    return temp;
  }

  public void setElephant(Elephant elephant) {
    this.elephant = elephant;
  }
}
