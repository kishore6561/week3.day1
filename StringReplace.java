package week3.day1;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "I am working with Java8";
		String sentence2="#";
		
		System.out.println(sentence.replace("8", "11"));
		char[] str=sentence.toCharArray();
		for(int i=5;i<=14;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(sentence.concat(sentence2));

	}

}
