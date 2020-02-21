
/*You need to write a program which provides an option to either input the 
book details or display the book details. In addition, on selecting the input option, 
the book details, such as the book name, author name, and price, should be accepted and 
written into a text file. Further,
if the display option is selected, all the book details should be displayed.*/
package ctstraining;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class BookDetails{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		Scanner src = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n"+"1:enter book details.\n2:display book details."
					+ "\nexit");
			System.out.print("please Enter your choice: ");
			choice = src.nextInt();
			/*switch(choice) {
			case 1:GetDetails();
				break;
			case 2:PutDetails();
				break;
			case 3: System.exit(0);
			}
		} while (choice != 3);*/
			
	}
	public static void GetDetails(String name,String auther,int price) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\admin\\Desktop\\CollectionActivity//tx2.txt";
		File file=new File(path);
		FileInputStream in =new FileInputStream(file);
		int i;
		while((i=in.read())!=-1) {                        
			System.out.print((char)i);
		}
	private static void PutDetails() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		String path="C:\\Users\\admin\\Desktop\\CollectionActivity//tx2.txt";
		FileOutputStream out=new FileOutputStream(path,true);
		System.out.println("enter book name");
		String name=sc.nextLine();
		System.out.println("enter book author name");
		String auther=sc.nextLine();
		System.out.println("Enter the price");
		int price=sc1.nextInt();
		
	
		
	}
	
	
}}