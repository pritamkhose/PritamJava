package inheritancedemo;

public class BMWS2 extends BMWS1 {
	
	float speed;
	
	
	public BMWS2() {
		// TODO Auto-generated constructor stub
	}
	void setSpeedBMWS2(float f){
		speed=f;
	}
	
	void detailsBMWS2(){
		
	System.out.println("_________BMWS2___________");	
	System.out.println("Color: "+color);
	System.out.println("Speed: "+speed);
	}

}
