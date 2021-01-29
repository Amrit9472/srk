package session_02;

public class Student {
	private int rollNo;
	private String name;
	static int count = 0;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
	public void display() {
		System.out.println("student del are as follows :"+rollNo+" "+name);
		
	}
	public static int getCount() {
		return count;
//		return rollNo; static methods can only access static members of class
	}
	
	/*static block
	  static block are used to istilizattion of static member
	  static block invoke befor main method
	  static block run first the it increases the count int the code
	  we can have n no of static block
	  main method is also static
	 */
	 
	static 
	{
		System.out.println("static block invoked");
		count =63;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Amrit");
		s1.display();
		Student s2 = new Student(2, "Ankit");
		s2.display();

		int count = Student.getCount();
		System.out.println(count);
	}
	
	

}
