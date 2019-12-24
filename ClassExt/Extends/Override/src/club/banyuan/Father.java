package club.banyuan;

public class Father {

  private void fatherPrivate() {

  }

  public void fatherVoid() {
    System.out.println("fatherMethod");
  }

  public Father fatherReturnObjExtends() {
    return this;
  }

  public void fatherObjParam(Son father) {

  }

  public int fatherInt() {
    return 1;
  }

  void fatherAccessDefault() {

  }
}
