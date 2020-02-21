package ctstraining;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String path="C:\\Users\\admin\\Desktop\\javaprogram\\Hello.txt";
		String newPath="C:\\Users\\admin\\Desktop\\javaprogram\\copy.txt";
		File file=new File(path);
		//System.out.println("File Name: "+file.getName());
        //System.out.println("File length:" +file.length());
        //System.out.println("Parent Name:"+file.getParent());
       // System.out.println("Parent Name:"+file.());
	
	FileInputStream in = new FileInputStream(file);
	BufferedInputStream bin=new BufferedInputStream(in);
	FileOutputStream out=new FileOutputStream(newPath);
	 BufferedOutputStream bout=new BufferedOutputStream(out);
	int i;
	while((i=bin.read())!=-1) {
		//System.out.print((char)i);
		//System.out.print(i);
		bout.write(i);
		bout.close();
	}
	

	}

}
