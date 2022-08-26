package practice;

public class student1 {                        //getter setter method
	int rollNo;
	private String name;
	static String clgName="SNPIT&RC";  // static use in this program for instatnce variable.
	void  setname (String n)
	{
		name = n;                       //why we write void in set method.and why we write return in get method?. 
	}
	void setrollNo(int r)
	{
		rollNo = r;
	}
	 String getname()
	{
		return this.name;
	}
	int getrollNo()
	{
		return rollNo;
	}
	public static void main(String args[])
	{
		student1 s1=new student1();
		student1 s2=new  student1();
		s1.setname("Rushikesh Patil");
		s1.setrollNo(51);
		s2.setname("Rahul Patil");
		s2.setrollNo(50);
		s1.setname("Rushikesh");
		System.out.println(s1.getname());
		System.out.println(s1.getrollNo());
		System.out.println(student1.clgName);
		System.out.println(s2.getname());
		System.out.println(s2.getrollNo());
		System.out.print(student1.clgName);
	}
}
