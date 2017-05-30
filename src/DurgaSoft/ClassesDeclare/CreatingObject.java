package DurgaSoft.ClassesDeclare;

public class CreatingObject {

	 public CreatingObject(String name){
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name ); 
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Following statement would create an object myPuppy
		CreatingObject myPuppy = new CreatingObject("tommy");

		CreatingObject myPuppy1 = new CreatingObject("tom");
		
		CreatingObject myPuppy2 = new CreatingObject("tom");
	}

}
