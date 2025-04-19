import java.util.*;
public class MaxandMinValue
{
	public static void main(String[] args) {
    // int[][] arr={{1,3,4},{4,5,8},{6,7,0}};
    System.out.print("Enter the size of the row: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter the size of column: ");
    int m=sc.nextInt();
    int[][] arr=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Here is the 2D array: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    int max=arr[0][0];
int min=arr[0][0];
    for(int[] row:arr){
        for(int val :row){
            if(val>max){
                max=val;
            }
 if(val<min){
                min=val;
            }
        }
        
    }
    System.out.println("Max: "+max+"Min: "+min);
	}
}
