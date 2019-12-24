package club.banyuan;

public class Crane {

  private Animal animal;

  public void liftAnimal(Animal animal) {
    this.animal = animal;
    System.out.printf("吊起了%s,有这么高:%scm\n", animal.getType(), animal.getHeightInCM());
  }
}
