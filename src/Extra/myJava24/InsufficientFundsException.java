package myJava24;

//File Name InsufficientFundsException.java
//import java.io.*;
public class InsufficientFundsException extends Exception
{
private double amount;
public InsufficientFundsException(double amount)
{
this.amount = amount;
System.out.println("Sorry");
}
public double getAmount()
{
return amount;
}}