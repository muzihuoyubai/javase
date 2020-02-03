class Person {

  String name; // 注意使用 ; 结尾
  int age;

  void sleep() {
    System.out.println("sleep...");
  }

  public static void main(String[] args) {
    Person onePerson = new Person();
    onePerson.age = 20;
    onePerson.name = "Tom";
    onePerson.sleep();  // sleep...
  }
}
