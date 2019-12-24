package club.banyuan.ext.access.adefault.animal;

public class AnimalDemo {

  public static void main(String[] args) {
    Elephant elephant = new Elephant();
    // 默认访问权限的，在同包下其他类可以访问
    elephant.setHeightInCM(300);
    elephant.weightInKG = 3000;

    Lion lion = new Lion();
    lion.setHeightInCM(200);
    lion.weightInKG = 180;

    lion.getLionHeight();

  }
}
