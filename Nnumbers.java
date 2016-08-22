
import java.util.Scanner;


public class Nnumbers {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,sum=0;
		n=in.nextInt();
		for(int i=0;i<=n;i++)
			sum=sum+i;
	
	System.out.println(sum);
	}

}
