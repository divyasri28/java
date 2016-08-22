import java.util.Scanner;
public class revdig{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,v=0;
		int b=input.nextInt();
	   while(b>0)
	   {
	     a=b%10;
	     v=v*10+a;
	     b=b/10;
	    }System.out.println(b);
	}

}
