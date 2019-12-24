package club.banyuan.ext.access.adefault.animal;

public class Lion extends Animal {

  // 默认访问权限的，同包下子类可以访问
  public int getLionHeight() {
    return getHeightInCM();
  }
}
