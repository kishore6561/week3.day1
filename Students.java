package week3.day1;

public class Students {
	void getStudentInfo(int a)
	{
		System.out.println("id : "+a);
	}
	void getStudentInfo(int a,String name)
	{
		System.out.println("id : "+a);
		System.out.println("name : "+name);
	}
	
	void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Email "+email);
		System.out.println("phhonenumber : "+phoneNumber);
	}
	public static void main(String[] args)
	{
	Students s=new Students();
	s.getStudentInfo(454554);
	s.getStudentInfo(454545, "kishore");
	s.getStudentInfo("kishore2862000",9865548221l);
	}

}
