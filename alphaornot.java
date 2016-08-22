import java.util.Scanner;
public class alphaornot{

	public static void main(String[] args)throws java.io.IOException {
		Scanner in=new Scanner(System.in);
		char c;
		c=(char)System.in.read();
		if(Character.isLetter(c))
			System.out.println(c+"character is alpha");
		else
			System.out.println(c+"not alpha");
	}

}
