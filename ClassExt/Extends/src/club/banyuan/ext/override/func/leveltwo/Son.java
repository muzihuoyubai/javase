package club.banyuan.ext.override.func.leveltwo;

public class Son extends Father {

  public void accessFatherProp() {
    System.out.println(fatherProp); // fatherProp
    System.out.println(super.fatherProp); // fatherProp

    // 子类找到父类的存储区，父类又到父类的存储区找到这个属性
    // grandFatherProp 和  super.grandFatherProp 都指向Father的父类存储区
    System.out.println(grandFatherProp); // grandFatherProp
    System.out.println(super.grandFatherProp);  // grandFatherProp

    // Father覆盖了父类的属性，这样子类就无法再访问到Father父类的存储区了（除非在Father中的方法中指定使用super访问，然后再把值返回）
    // grandFatherPropOverride 和 super.grandFatherPropOverride 都指向Father的存储区
    System.out.println(grandFatherPropOverride); // grandFatherPropOverrideInFather
    System.out.println(super.grandFatherPropOverride); // grandFatherPropOverrideInFather
  }
}
