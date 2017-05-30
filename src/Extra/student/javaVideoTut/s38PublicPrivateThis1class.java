package javaVideoTut;

public class s38PublicPrivateThis1class {

	private int hour = 1, min = 2, sec = 3;
	
	public void setTime(int h, int m, int s){
		h=4; m=5; s=6;
	}
	
	public String toMil(){
		return String.format("%02d:%02d:%02d",hour, min, sec);
	}
	
	public String toString(){
		//return String.format("%02d:%02d:%02d %s",((hour==0||hour==12)?12:hour), min, sec);
		return String.format("%02d:%02d:%02d",hour, min, sec);
	}
}
