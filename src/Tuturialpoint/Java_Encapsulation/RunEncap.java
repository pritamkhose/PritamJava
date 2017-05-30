package Tuturialpoint.Java_Encapsulation;

public class RunEncap {

	public static void main(String[] args) {
		  EncapTest encap = new EncapTest();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");
	      System.out.println("Name : " + encap.getName()
	      + " Age : " + encap.getAge()
	      + " IdNum : " + encap.getIdNum());
	      
	      
	      encap.setName("Marry");
	      encap.setAge(30);
	      encap.setIdNum("987");
	      System.out.println("Name : " + encap.getName()
	      + " Age : " + encap.getAge()
	      + " IdNum : " + encap.getIdNum());
	      
	      EncapTest encap1 = new EncapTest();
	      encap1.setName("Roy");
	      encap1.setAge(45);
	      encap1.setIdNum("456");
	      System.out.println("Name : " + encap1.getName()
	      + " Age : " + encap1.getAge()
	      + " IdNum : " + encap1.getIdNum());
	      
	      System.out.println("Name : " + encap.getName()
	      + " Age : " + encap.getAge()
	      + " IdNum : " + encap.getIdNum());
	}

}
