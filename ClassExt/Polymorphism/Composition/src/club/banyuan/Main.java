package club.banyuan;

public class Main {

  public static void main(String[] args) {
    Elephant elephant = new Elephant(new Animal(300));
    System.out.println(elephant.getHeightInCM());
  }
}
