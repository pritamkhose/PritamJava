package JavaTpoint.Internationatiozation;

/*
public static NumberFormat getCurrencyInstance(Locale locale)  
</pre></div>  
<a id="currencyex"></a>  
<h3 class="h3ex">Example of Internationalizing Currency</h3>  
<p>In this example, we are internationalizing the currency. The format method of the NumberFormat class formats the double value into the locale specific currency.  
</p>  
  
<div class="codeblock"><textarea name="code" class="java">  */
import java.text.NumberFormat;  
import java.util.*;  
public class InternalizationCurrency {  
  
static void printCurrency(Locale locale){  
 double dbl=10500.3245;  
 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
 String currency=formatter.format(dbl);  
 System.out.println(currency+" for the locale "+locale);  
}  
  
public static void main(String[] args) {  
    printCurrency(Locale.UK);  
    printCurrency(Locale.US);  
    printCurrency(Locale.FRANCE);  
}  
}  
