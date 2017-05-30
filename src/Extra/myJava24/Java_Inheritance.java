package myJava24;

public class Java_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Animal a =new Animal();
		Mammal m =new Mammal();
		Dog d =new Dog();
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);*/
	}
	
	public class Animal{
	}
	public class Mammal extends Animal{
	}
	public class Reptile extends Animal{
	}
	public class Dog extends Mammal{
	}

}
