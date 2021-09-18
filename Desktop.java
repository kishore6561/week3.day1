package week3.day1;

public class Desktop extends Computer {
	void desktopSize()
	{
		System.out.println("desktopsize is 22inch");
	}
	public static void main(String[] args) {
		
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}
