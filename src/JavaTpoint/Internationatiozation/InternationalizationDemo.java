package JavaTpoint.Internationatiozation;

import java.util.Locale;  
import java.util.ResourceBundle;  

public class InternationalizationDemo {  
 public static void main(String[] args) {  
  
  ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);  
  System.out.println("Message in "+Locale.US +":"+bundle.getString("greeting"));  
  
  //changing the default locale to indonasian   
  Locale.setDefault(new Locale("in", "ID"));  
  bundle = ResourceBundle.getBundle("MessageBundle");  
  System.out.println("Message in "+Locale.getDefault()+":"+bundle.getString("greeting"));  
  
 }  
}  

/*
The ResourceBundle class is used to internationalize the messages. In other words, we can say that it provides a mechanism to globalize the messages.

The hardcoded message is not considered good in terms of programming, because it differs from one country to another. So we use the ResourceBundle class to globalize the massages. The ResourceBundle class loads these informations from the properties file that contains the messages.

Conventionally, the name of the properties file should be filename_languagecode_country code for example MyMessage_en_US.properties.

Commonly used methods of ResourceBundle class

There are many methods in the ResourceBundle class. Let's see the commonly used methods of the ResourceBundle class.

public static ResourceBundle getBundle(String basename) returns the instance of the ResourceBundle class for the default locale.
public static ResourceBundle getBundle(String basename, Locale locale) returns the instance of the ResourceBundle class for the specified locale.
public String getString(String key) returns the value for the corresponding key from this resource bundle.
Example of ResourceBundle class

Let's see the simple example of ResourceBundle class. In this example, we are creating three files:

MessageBundle_en_US.properties file contains the localize message for US country.
MessageBundle_in_ID.properties file contains the localize message for Indonaisa country.
InternationalizationDemo.java file that loads these properties file in a bundle and prints the messages.
*/