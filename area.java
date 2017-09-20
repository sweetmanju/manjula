package karthik;
import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("radius:");
		int r=sc.nextInt();
		System.out.println("length");
		int l=sc.nextInt();
		System.out.println("breadth");
		int b=sc.nextInt();
		System.out.println("base");
		int base=sc.nextInt();
		System.out.println("height");
		int h=sc.nextInt();
		System.out.println("area of circle is: "+circle(r));
		System.out.println("area of rectangle is: "+rect(l,b));
		System.out.println("area of triangle is: "+triangle(base,h));
		}


	public static double rect(int l, int b) {
		// TODO Auto-generated method stub
		return l*b;
	}


	public static double circle(int r) {
		// TODO Auto-generated method stub
		return  (r*r*3.14);
	}
	public static double triangle(int base , int h){
		return (base*h)/2;
	}
}
