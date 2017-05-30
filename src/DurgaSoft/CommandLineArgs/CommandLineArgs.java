package DurgaSoft.CommandLineArgs;

import java.io.*;

public class CommandLineArgs {

	public static void main(String[] args) {
		
		for(int ilen = 0; ilen < args.length; ilen++)
			System.out.print(args[ilen]);	
	}

}


// compile on cmd
// javac CommandLineArgs.java
// javac CommandLineArgs x y z
// output xyz