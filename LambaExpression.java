package LambaCalculus;

public class LambaExpression {

	public static void main(String args[])
	{
//		Runnable r=() ->System.out.println("Hello Runnable");
//		Thread t=new Thread(r);
//		t.start();
		Hello h=() -> "Good Morning";
		System.out.println(h.greetings());
		Hello h1=() -> "Good Evening";
		System.out.println(h1.greetings());
		Hello h2=() -> "Good Night";
		System.out.println(h2.greetings());
	}
}
@FunctionalInterface
interface Hello{
	String greetings();
    //public void display();
}