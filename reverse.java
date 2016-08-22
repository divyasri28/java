import java.util.Scanner;
public class reverse {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str,rev="";
		System.out.println("enter string");
		str=in.next();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
	   rev=rev+str.charAt(i);

		}
		
	   System.out.println(rev);

}
}
