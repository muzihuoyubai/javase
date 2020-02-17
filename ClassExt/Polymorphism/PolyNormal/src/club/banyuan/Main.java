package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Crane crane = new Crane();
    crane.liftElephant(new Elephant(300));
    crane.liftLion(new Lion(200));
  }
}
