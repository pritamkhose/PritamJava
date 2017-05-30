package myJava24;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaExpression {
/*
private static final String REGEX ="\\bcat\\b";
private static final String INPUT ="cat cat cat cattie cat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String to be scanned to find the pattern.
		String line ="This order was places for QT3000! OK?";
		String pattern ="(.*)(\\d+)(.*)";
		// Create a Pattern object
		Pattern r =Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(line);
		if(m.find()){
		System.out.println("Found value: "+ m.group(0));
		System.out.println("Found value: "+ m.group(1));
		System.out.println("Found value: "+ m.group(2));
		}else{
		System.out.println("NO MATCH");
		}
		System.out.println("\n");
		*/
	/*	private static final String REGEX ="foo";
		private static final String INPUT ="fooooooooooooooooo";
		private static Pattern pattern;
		private static Matcher matcher;
		public static void main(String args[]){
		pattern =Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);
		System.out.println("Current REGEX is: "+REGEX);
		System.out.println("Current INPUT is: "+INPUT);
		System.out.println("lookingAt(): "+matcher.lookingAt());
		System.out.println("matches(): "+matcher.matches());
	}
	*/
	/*
	private static String REGEX ="dog";
	private static String INPUT ="The dog says meow. "+"All dogs say meow.";
	private static String REPLACE ="cat";
	public static void main(String[] args){
	Pattern p =Pattern.compile(REGEX);
	// get a matcher object
	Matcher m = p.matcher(INPUT);
	INPUT = m.replaceAll(REPLACE);
	System.out.println(INPUT);
	}*/
	
	private static String REGEX ="a*b";
	private static String INPUT ="aabfooaabfooabfoob";
	private static String REPLACE ="-";
	public static void main(String[] args){
	Pattern p =Pattern.compile(REGEX);
	// get a matcher object
	Matcher m = p.matcher(INPUT);
	StringBuffer sb =new StringBuffer();
	while(m.find()){
	m.appendReplacement(sb,REPLACE);
	}m
	.appendTail(sb);
	System.out.println(sb.toString());
	}
}
