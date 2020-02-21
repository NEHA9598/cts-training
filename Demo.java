package ctstraining;

//import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.FileWriter;

public class Demo  {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		Scanner src = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n"+"Press 1 to enter book details.\nPress 2 to display book details."
					+ "\nPress 3 to exit.");
			System.out.print("Enter your choice: ");
			choice = src.nextInt();
			switch(choice) {
			case 1:PutDetails();
				break;
			case 2:GetDetails();
				break;
			case 3: System.exit(0);
			}
		}while (choice != 3);
	}
	private static void GetDetails() throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\admin\\Desktop\\CollectionActivity//tx2.txt";
		File file=new File(path);
		FileInputStream in =new FileInputStream(file);
		int i;
		while((i=in.read())!=-1) {                        
			System.out.print((char)i);
		}
	}
	private static void PutDetails() throws IOException {
		// TODO Auto-generated method stub
		 Scanner np = new Scanner(System.in);
			String path="C:\\Users\\admin\\Desktop\\CollectionActivity//tx2.txt";
			FileOutputStream out=new FileOutputStream(path,true);
			System.out.println("enter book name");
			String name = np.nextLine();
			byte b[]=name.getBytes();
			out.write(b);
			System.out.println("enter book author name");
			String auth = np.nextLine();
			byte m[]=auth.getBytes();
			out.write(m);
			out.close();
	}}