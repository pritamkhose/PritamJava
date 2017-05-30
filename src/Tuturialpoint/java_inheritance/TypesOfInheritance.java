package java_inheritance;

public class TypesOfInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      TypesOfInheritance SLI = new TypesOfInheritance();
	      TypesOfInheritance MLI = new TypesOfInheritance();
	      TypesOfInheritance HLI = new TypesOfInheritance();
	      
	    
	      System.out.println(SLI instanceof TypesOfInheritance);
	      System.out.println(MLI instanceof TypesOfInheritance);
	      System.out.println(HLI instanceof TypesOfInheritance);
	}


	
	// Single level inheritance  A0 <- B0
		class A0{
		}
		
		class B0 extends A0{
		}	
	
	// Multilevel inheritance	A1 <- B1 <- C1
		class A1{
		}
	
		class B1 extends A1{
		}
	
		class C1 extends B1{
		}
	
	// Hierarchical inheritance  A2 <- B2 or A2 <- C2
		class A2{
		}

		class B2 extends A2{
		}

		class C2 extends A2{
		}
}
