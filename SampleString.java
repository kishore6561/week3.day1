package week3.day1;

public class SampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
	}

}
/* OUTPUT:
 Diff text 
 ***
 if we need Same text as output 
 if statement to be modified as if(str3.equals(str4)) 
 */
