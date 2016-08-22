import java.util.Scanner;
public class factorial{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int f=input.nextInt();
		int fac=1;
		for(int i=1;i<=f;i++)
		{
			fac=fac*i;
			
		}
		System.out.println(fac);
	}

}
