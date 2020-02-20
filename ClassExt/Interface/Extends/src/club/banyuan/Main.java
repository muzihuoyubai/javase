package club.banyuan;

public class Main {

  public static void main(String[] args) {
    FatherInterA a = new SonInterImpl();
    a.defaultMethod();
    a.sameName();
    FatherInterB b = (FatherInterB) a;
    b.defaultMethod();
    b.sameName();
    SonInter s = (SonInter) b;
    s.defaultMethod();
    s.sameName();
  }
}
