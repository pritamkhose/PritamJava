package RMI_Niku;


  import java.rmi.*;

  class AddClient
   {
      public static void main(String args[])
        {
           try
            {
              AddInterface ai; 
              ai=(AddInterface)Naming.lookup("rmi://localhost/AddServer");
              int x=Integer.parseInt(args[0]);
              int y=Integer.parseInt(args[1]);
              int z=ai.add(x,y);
             
             System.out.println("Addition is "+z);
           }
         catch(Exception ex)
           {
              System.out.println("Error is "+ex);
           }
        }
   }
 
 