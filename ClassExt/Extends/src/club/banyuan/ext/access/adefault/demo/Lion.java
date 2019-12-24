package club.banyuan.ext.access.adefault.demo;

import club.banyuan.ext.access.adefault.animal.Animal;

public class Lion extends Animal {

  // 默认访问权限的，不同包下子类不可以访问
 /* public int getLionHeight() {
    return getHeightInCM(); // 报错
  }*/
}
