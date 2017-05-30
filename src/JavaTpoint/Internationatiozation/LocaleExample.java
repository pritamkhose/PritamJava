package JavaTpoint.Internationatiozation;

	import java.util.*;  
	public class LocaleExample {  
	public static void main(String[] args) {  
	Locale locale=Locale.getDefault();  
	//Locale locale=new Locale("fr","fr");//for the specific locale  
	
	Locale enLocale = new Locale("en", "US");  
    Locale frLocale = new Locale("fr", "FR");  
    Locale esLocale = new Locale("es", "ES");  
	  
	System.out.println(locale.getDisplayCountry());  
	System.out.println(locale.getDisplayLanguage());  
	System.out.println(locale.getDisplayName());  
	System.out.println(locale.getISO3Country());  
	System.out.println(locale.getISO3Language());  
	System.out.println(locale.getLanguage());  
	System.out.println(locale.getCountry());  
	
	System.out.println("English language name (default): " +   
              enLocale.getDisplayLanguage());  
	
	System.out.println("English language name in French: " +   
	              enLocale.getDisplayLanguage(frLocale));  
	System.out.println("English language name in spanish: " +   
	  enLocale.getDisplayLanguage(enLocale));   
	System.out.println("English language name in spanish: " +   
			  enLocale.getDisplayLanguage(esLocale)); 
	
	Locale[] locales = { new Locale("en", "US"),  
			 new Locale("es", "ES"), new Locale("it", "IT") };   
			  
			for (int i=0; i< locales.length; i++) {   
			 String displayLanguage = locales[i].getDisplayLanguage(locales[i]);   
			 System.out.println(locales[i].toString() + ": " + displayLanguage);   
			}   
	      
	}  
	}
	
	/*
	There is the list of culturally dependent data:

	Messages
	Dates
	Times
	Numbers
	Currencies
	Measurements
	Phone Numbers
	Postal Addresses
	Labels on GUI components etc.
	Importance of Locale class in Internationalization

	An object of Locale class represents a geographical or cultural region. This object can be used to get the locale specific information such as country name, language, variant etc.

	Fields of Locale class

	There are fields of Locale class:

	public static final Locale ENGLISH
	public static final Locale FRENCH
	public static final Locale GERMAN
	public static final Locale ITALIAN
	public static final Locale JAPANESE
	public static final Locale KOREAN
	public static final Locale CHINESE
	public static final Locale SIMPLIFIED_CHINESE
	public static final Locale TRADITIONAL_CHINESE
	public static final Locale FRANCE
	public static final Locale GERMANY
	public static final Locale ITALY
	public static final Locale JAPAN
	public static final Locale KOREA
	public static final Locale CHINA
	public static final Locale PRC
	public static final Locale TAIWAN
	public static final Locale UK
	public static final Locale US
	public static final Locale CANADA
	public static final Locale CANADA_FRENCH
	public static final Locale ROOT
	Constructors of Locale class

	There are three constructors of Locale class.They are as follows:

	Locale(String language)
	Locale(String language, String country)
	Locale(String language, String country, String variant)
	Commonly used methods of Locale class

	There are given commonly used methods of Locale class.

	public static Locale getDefault() it returns the instance of current Locale
	public static Locale[] getAvailableLocales() it returns an array of available locales.
	public String getDisplayCountry() it returns the country name of this locale object.
	public String getDisplayLanguage() it returns the language name of this locale object.
	public String getDisplayVariant() it returns the variant code for this locale object.
	public String getISO3Country() it returns the three letter abbreviation for the current locale's country.
	public String getISO3Language() it returns the three letter abbreviation for the current locale's language.

	*/