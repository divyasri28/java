
import java.util.Scanner;
public class Romint{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		int val=0;
		s=in.nextLine();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='I')
				val+=1;
			else if(s.charAt(i)=='V')
				val+=5;
			else if(s.charAt(i)=='X')
				val+=10;
			
			
		}
		if(s.contains("IV"))
			val-=2;
		if(s.contains("IX"))
			val-=2;
		System.out.println("the corresponding integer is"+val);
	}

}
