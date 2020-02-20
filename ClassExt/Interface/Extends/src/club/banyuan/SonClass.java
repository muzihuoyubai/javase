package club.banyuan;

public class SonClass extends FatherClass implements FatherInterA, FatherInterB {

  @Override
  public void sameName() {
    System.out.println("SonInterImpl");
  }
}
