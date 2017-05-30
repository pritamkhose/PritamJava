package RMI_Niku;
 import java.rmi.*;
 import java.rmi.server.*;

 
 public class AddServer extends UnicastRemoteObject implements AddInterface
  {
    public AddServer() throws RemoteException
      { 
         super();
      }     

    public int add(int a,int b) throws RemoteException
     {
         int c=a+b;
         return c;
     }

 }