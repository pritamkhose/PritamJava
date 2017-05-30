package inheritancedemo;

public class BMWS1 {
	
	public String color;
	float speed;
	BMWS1(){
		
	}
	

	
	void setBMS1(String c,float f){
		color=c;
		speed=f;
	}
	
	void displayDetails(){
		System.out.println("Color: "+color);
		System.out.println("Speed: "+speed);
	}

}
