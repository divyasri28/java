import java.util.Scanner;
public class Armnot{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b,t,a=0;
		b=in.nextInt();
		int m,c=0;
		m=b;
		while(m>0)
		{
			c++;
			 m=m/10;
			
		}
		int n=b;
		while(n>0)
		{
			t=n%10;
			a=a+(int)Math.pow(t,c);
			n=n/10;
			
			
		}
		if(b==a)
			System.out.println("armstrong number");
		else
			System.out.println(" not  armstrong number");
		
	}

}
