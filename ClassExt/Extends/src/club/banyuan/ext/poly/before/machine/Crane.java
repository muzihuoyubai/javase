package club.banyuan.ext.poly.before.machine;


import club.banyuan.ext.poly.before.animal.Elephant;

public class Crane {

  private Elephant elephant;

  public void liftElephant(Elephant elephant) {
    this.elephant = elephant;
  }

  public void putElephant(Fridge fridge) {
    fridge.setElephant(elephant);
    elephant = null;
  }
}
