
import java.util.Scanner;
public class Freequency
{
	public static void main(String[] args) {
		int[] arr={1,1,1,2,2,3,1,2,3,4,5,4,5,2,1,4};
		int n=arr.length;
		for(int i=0;i<n;i++){
		    if(arr[i]==-1){
		        continue;
		    }
		    int count=1;
		    for(int j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            count++;
		            arr[j]=-1;
		        }
		    }
		 System.out.println(arr[i]+" occurs "+ count+" times");   
		}

		}
	
}
