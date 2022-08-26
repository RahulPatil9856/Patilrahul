package practice;

public class Calculator {
	int multiplication (int a,int b)        //class and method name is not same.here example is class name is calculator and method name is addtion,multiplication,division,and subtraction.
{                                         //in method we can't get return so we write return in method.
	int c = a*b;                         //in method we perform some operation,action,functionality or to provide implementation.for example in this program addtion(a+b),subtraction(a-b) etc.
	return c;
}
	 int addition (int a,int b)
	 {
			int c = a+b;
			return c;
		}
	 double division (int a,int b)
	 {
			int c = a/b;
			return c;
		}
	 int subtraction (int a,int b)
	 {
			return a-b;
		
			//return c;
		}
public static void main (String args[])
{
	Calculator c1=new Calculator();
	int result = c1.multiplication(30,20);
	int result1 = c1.addition(30,20);
	double result2 = c1.division(10,20);
	int result3 = c1.subtraction(30,20);
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	System.out.print(result3);
}
}

