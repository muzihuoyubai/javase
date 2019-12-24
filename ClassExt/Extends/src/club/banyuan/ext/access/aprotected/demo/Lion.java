package club.banyuan.ext.access.aprotected.demo;

import club.banyuan.ext.access.aprotected.animal.Animal;

public class Lion extends Animal {

  // protected 方法在子类内部是可以访问的，就算在不同包下面也可以
  public int getLionHeight() {
    return getHeightInCM();
  }
}
