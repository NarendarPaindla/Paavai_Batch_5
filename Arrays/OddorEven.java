
import java.util.Scanner;
public class OddorEven
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
	int evenc=0,oddc=0;
	for(int i=0;i <size;i++){
	    if(arr[i]%2==0){
	        evenc=evenc+1;
	    }else{
	        oddc=oddc+1;
	    }
	}
	System.out.println("Even count is : "+evenc+" odd count is :"+oddc);
		}
	
}
