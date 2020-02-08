package club.banyuan.animal;

public class Elephant {

  private int heightInCM;

  public Elephant(){
    this(350);
  }

  public Elephant(int heightInCM){
    this.heightInCM = heightInCM;
    System.out.printf("创建一个大象，高度%d厘米\n", heightInCM);
  }

  public void setHeightInCM(int heightInCM){
  	if(heightInCM <= 0){
  		System.out.println("传入的高度不合法!");
  		return;
  	}

  	this.heightInCM = heightInCM;
  }

  public int getHeightInCM(){
  	return heightInCM;
  }
}


