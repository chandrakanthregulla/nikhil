/*WAP to create integer array with 5 elements and insert an extra element at the last*/
package demopack2;
import java.util.*;

public class Sampe15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] a1= {12,34,67,65,33};
		int[] a2= new int[a1.length+1];
		System.out.println("enter the elements you want to insert in last position");
		int ele=scan.nextInt();
		int index=0;
		for(int k:a1)
		{
			a2[index]=k;
			index++;
		}
		a2[index]=ele;
		a1=a2;
		for(int i=0;i<=a1.length-1;i++)
		System.out.print(a1[i]);
		

	}

}
