package ExceptionLearn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound_Demo {

	public static void main(String[] args) throws FileNotFoundException {
		 File file=new File("E://file.txt");
	     FileReader fr = new FileReader(file); 

	}

}
