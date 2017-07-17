package project;
import java.util.Scanner;
public class commonarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       int[] a=new int[4];
       int b[]=new int[4];
       int count=0;
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       for(int j=0;j<b.length;j++)
       {
    	   b[j]=sc.nextInt();
       }
       for(int k=0;k<a.length;k++)
       {
    	   for(int l=0;l<b.length;l++)
    	   {
    		   if(a[k]==b[l])
    		   {
    			count++;   
    		   }
    	   }
       }
       System.out.println(count+count);
	}

}
