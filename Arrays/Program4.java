
import java.util.Scanner;
import java.util.Arrays;
public class Program4
{
	public static void main(String[] args) {
		Scanner bt=new Scanner(System.in);
		System.out.print("Enter the Size of array: ");
		int size=bt.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter the Array elements: ");
		for(int i=0;i<size;i++){
		    arr[i]=bt.nextInt();
		}
		System.out.println("Before the sorting");
	  for(int i:arr){
	      System.out.print(i+" ");
	  }
	  System.out.println("");
	  System.out.println("Reverse of an array:");
	  for(int i=size-1;i>=0;i--){
	      System.out.print(arr[i]+" ");
	  }
	  Arrays.sort(arr);
	  
	  System.out.println("\nAfter Sorting the elements");
	  for(int i:arr){
	       System.out.print(i+" ");
	  }
	  System.out.println("\n Descending order of the array :");
	  
	   for(int i=size-1;i>=0;i--){
	      System.out.print(arr[i]+" ");
	  }
		}
	
}
