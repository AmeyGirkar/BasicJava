package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsDemo {

	public static void main (String[] args) throws FileNotFoundException {
		
			
			File file = new File("/home/agirkarcisco/Documents/Output");
			PrintWriter printwriter = new PrintWriter(file);
			printwriter.print("Today is Friday yayyyyyy");
			printwriter.close();
			}

	}


