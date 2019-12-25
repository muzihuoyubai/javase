package machine;
import animal.Elephant;

class Crane {

  public void liftElephant(Elephant elephant) {
    System.out.printf("抬起了大象，重量:%dKG，身高：%dCM\n", elephant.weightInKG, elephant.heightInCM);
  }
}
