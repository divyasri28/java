
import java.util.Scanner;
public class vowel {

	public static void main(String[] args)throws java.io.IOException {
		Scanner in=new Scanner(System.in);
		char ch;
		ch=(char)System.in.read();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("given no is vowel");
		else
			System.out.println("given no is consonant");
			
	}

}
