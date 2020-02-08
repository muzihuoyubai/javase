package club.banyuan.animal;

public class Elephant {

  private int heightInCM;

  public void setHeightInCM(int height){
  	if(height <= 0){
  		System.out.println("传入的高度不合法!");
  		return;
  	}

  	heightInCM = height;
  }

  public int getHeightInCM(){
  	return heightInCM;
  }
}


