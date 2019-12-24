package club.banyuan.ext.override.func.levelone;

public class Father {

  public String fatherProp = "fatherProp";
  public String fatherPropOverride = "fatherPropOverride";

  public void fatherMethod() {
    System.out.println("fatherMethod");
  }

  public void fatherMethodOverride() {
    System.out.println("fatherMethodOverride");
  }
}
