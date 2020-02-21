package ctstraining;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputSream {

	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		String path="C:\\Users\\admin\\Desktop\\javaprogram\\Hello.txt";
	
		FileOutputStream out=new FileOutputStream(path,true);
		
	String message="The joining date was 28th january 2020";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
	
	}
}
