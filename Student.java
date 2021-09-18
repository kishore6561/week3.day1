package week3.day1;

public class Student extends Department {
	void studentName()
	{
		System.out.println("kishore");
	}
	void studentDept()
	{
		System.out.println("Cse");
	}
	void studentId()
	{
		System.out.println("11161104045");
	}
	public static void main(String[] args)
	{
		Student std=new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();

	}

}
