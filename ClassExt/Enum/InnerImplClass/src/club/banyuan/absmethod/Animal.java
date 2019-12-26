package club.banyuan.absmethod;

public enum Animal {
  Elephant("大象") {
    @Override
    public void lifted() {
      // 注意这里不能是this了，因为定义了匿名类，this指代的是匿名类
      // super 指代了当前匿名类的父类存储区域，实际上就是Elephant的存储区域
      System.out.printf("%s被举起\n", super.type); // 相当于 Elephant.type
    }
  }, Lion("狮子") {
    @Override
    public void lifted() {
      System.out.printf("%s被举起\n", super.type);
    }
  };

  private final String type;

  Animal(String type) {
    this.type = type;
  }

  public abstract void lifted();
}
