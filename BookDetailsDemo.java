package ctstraining;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BookDetailsDemo {

	public static void main(String[] args) throws IOException{
		String path="C:\\Users\\admin\\Desktop\\CollectionActivity\\str.txt";
		FileWriter out=new FileWriter(path);
		String msg="file writed data";
		String bookName="Red ferrari";
		String authername="robin sharma";
		String price="200";
		out.write(bookName+ "\t" +authername+ "\t" +price+ "\n");
		out.close();

	}

}
