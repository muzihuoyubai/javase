package club.banyuan;


public class Crane {

  private Elephant elephant;
  private Lion lion;

  public void liftElephant(Elephant elephant) {
    this.elephant = elephant;
    System.out.printf("吊起了大象，有这么高:%scm\n", elephant.getHeightInCM());
  }

  public void liftLion(Lion lion) {
    this.lion = lion;
    System.out.printf("吊起了狮子，有这么高:%scm\n", lion.getHeightInCM());
  }

}
