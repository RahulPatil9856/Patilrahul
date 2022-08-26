package practice;

public class Student                //class name first letter should be capital.and variable first letter should be small.
{
	int stdentRollNo;
	String name;
	Student(int r,String n)                //class and constructor name should be same.
	{
		stdentRollNo=r;
		name=n;
	}
	
public static void main(String args [])
{
	Student s1=new Student(51,"Rushikesh");
	Student s2=new Student(52,"Sagar");
 System.out.println(s1.stdentRollNo);
 System.out.println(s1.name);
 System.out.println(s2.stdentRollNo);
 System.out.print(s2.name);
}
}                                 //can we get return in constructor.?
    