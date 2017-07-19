package project;
import java.util.Scanner;
public class days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		if(day.equalsIgnoreCase("sunday"))
		System.out.println("false");
		else
			System.out.println("true");
	}
}