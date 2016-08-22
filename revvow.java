import java.util.Scanner;
public class revvow {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str,rev="";
		int l;
		System.out.println("enter string");
		str=in.next();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
	   rev=rev+str.charAt(i);

		}
		
	   System.out.println(rev);
	   
	   l=rev.length();
	   for(int j=0;j<=l-1;j++)
	   {
		
			 
if(!(rev.charAt(j)=='a'||rev.charAt(j)=='e'||rev.charAt(j)=='i'||rev.charAt(j)=='o'||rev.charAt(j)=='u'))
			System.out.print(rev.charAt(j));
		
			
	}

}


}