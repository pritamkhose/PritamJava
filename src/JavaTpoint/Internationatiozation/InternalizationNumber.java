package JavaTpoint.Internationatiozation;


public static NumberFormat getNumberInstance(Locale locale)  
public static NumberFormat getInstance(Locale locale)//same as above  
/*
</textareaa></div>  
  
<hr/>  
<a id="numberex"></a>  
<h3 class="h3ex">Example of Internationalizing Number</h3>  
<p>In this example, we are internationalizing the number. The format method of the NumberFormat class formats the double value into the locale specific number.  
</p>  
  
<div class="codeblock"><textarea name="code" class="java">  */
  
import java.text.NumberFormat;  
import java.util.*;  
  
public class InternalizationNumber {  
  
static void printNumber(Locale locale){  
 double dbl=105000.3245;  
 NumberFormat formatter=NumberFormat.getNumberInstance(locale);  
 String number=formatter.format(dbl);  
 System.out.println(number+" for the locale "+locale);  
}  
  
public static void main(String[] args) {  
    printNumber(Locale.UK);  
    printNumber(Locale.US);  
    printNumber(Locale.FRANCE);  
    printNumber(Locale.JAPAN);  
  
}  
}  