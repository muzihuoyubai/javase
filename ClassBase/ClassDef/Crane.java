/*
// 所有的属性和方法都需要定义在类的大括号中
//int outside;  // 编译报错
void outsideFun() { // 编译报错

}
*/
class Crane {

  public void liftElephant(Elephant elephant) {
    System.out.printf("抬起了大象，重量:%dKG，身高：%dCM\n", elephant.weightInKG, elephant.heightInCM);
  }
}
