package club.banyuan;

public class Main {

    public static void main(String[] args) {
        Crane crane = new Crane();
        crane.liftAnimal(new Elephant(300));
        crane.liftAnimal(new Lion(200));
    }
}
