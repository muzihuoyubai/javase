package machine;

import animal.Elephant;

class CraneDemo {

  public static void main(String[] args) {
    Crane crane = new Crane();
    Elephant elephant1 = new Elephant();
    Elephant elephant2 = new Elephant(2000, 200);

    crane.liftElephant(elephant2);

    Elephant a = new Elephant(3000, 300);
    Elephant b = new Elephant(2000, 200);
    a.getThisHeight();
    b.getThisHeight();

    System.out.println("a.compareThis(a):" + a.compareThis(a));
    System.out.println("a.compareThis(b):" + a.compareThis(b));
    System.out.println("b.compareThis(a):" + b.compareThis(a));
    System.out.println("b.compareThis(b):" + b.compareThis(b));

  }
}
