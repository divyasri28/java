import java.util.Scanner;
public class workday{

	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s;
		String st="";
		
		System.out.println("enter string");
		s=in.next();
		if(s.equalsIgnoreCase("monday"))
		
			st="true";
		else if(s.equalsIgnoreCase("tuesday"))
			st="true";
		
		else if(s.equalsIgnoreCase("wednesday"))
			st="true";
		
		else if(s.equalsIgnoreCase("thursday"))
			st="true";
		
		else if(s.equalsIgnoreCase("friday"))
			st="true";
		
		else if(s.equalsIgnoreCase("saturday"))
			st="true";
		
		else
			st="false";
		
		System.out.println(st);
		
	
	}
	
		
	}
