package RMI_Niku;

 import java.rmi.*;

 public class LoadAddServer
  {
       public static void main(String []args)
        {
           try
            { 
              AddServer as=new AddServer();
              Naming.rebind("AddServer",as);
              System.out.println("Add Server is on");
            }
          catch(RemoteException ex)
           {
              System.out.println("Error is "+ex);
           }
         catch(Exception ex)
          {
              System.out.println("Error is "+ex);
           }
       
        }
  }