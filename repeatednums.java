package project;
import java.util.Scanner;
public class repeatednums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
       for(int j=0;j<a.length;j++)
       {
    	   for(int k=j+1;k<a.length;k++)
    	   {
    		   if(a[j]==a[k])
    			   System.out.println(" "+a[j]);
    	   }
       }
	}

}
