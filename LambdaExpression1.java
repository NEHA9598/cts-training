package LambaCalculus;

public class LambdaExpression1 {

	public static void main(String args[])
	{

	Hello1 add=(a,b) -> a+b;
	System.out.println(add.calculate(3,5));
	Hello1 sub=(a,b) -> a-b;
	System.out.println(sub.calculate(5,3));
	Hello1 mul=(a,b) -> a*b;
	System.out.println(mul.calculate(3,5));
	Hello1 mod=(a,b) -> a/b;
	System.out.println(add.calculate(3,5));
	
}
@FunctionalInterface
interface Hello1{
	double calculate(double a,double b);
}}
