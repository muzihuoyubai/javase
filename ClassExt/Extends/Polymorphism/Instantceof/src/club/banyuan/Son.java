package club.banyuan;

public class Son extends Father {

  public String fatherPropOverride = "fatherPropOverrideInSon";

  public void fatherMethod() {
    System.out.println("fatherMethod");
  }

  public void sonMethod() {
    System.out.println("sonMethod");
  }
}
