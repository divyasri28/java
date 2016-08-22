import java.util.Scanner;
public class palindrom{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r,s=0,M;
		int N=input.nextInt();
		M=N;
	   while(M>0)
	   {
	     r=M%10;
	     s=s*10+r;
	     M=M/10;
	    }
	    if(N==M)
	    	System.out.println("the given no is palindrom");
	    else
	    	System.out.println("the given no is not palindrom");
	}

}

	

