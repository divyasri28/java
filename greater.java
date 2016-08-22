import java.util.Scanner;


public class greater {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x,y,z;
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y&&x>z)
			System.out.println("x is greater");
		
		else if(y>z)
			System.out.println("y is greater");
		else
			System.out.println("z is greater");
		
		
	}

}
