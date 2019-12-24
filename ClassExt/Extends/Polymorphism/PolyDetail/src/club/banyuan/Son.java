package club.banyuan;

public class Son extends Father {

  public String fatherPropOverride = "fatherPropOverrideInSon";

  public void sonMethod() {
    System.out.println("sonMethod");
  }
}
