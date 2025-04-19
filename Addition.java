import java.util.Scanner;
public class Addition{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number : ");
 int first=sc.nextInt();
System.out.print("Enter Second number : ");
int second=sc.nextInt();
int add,div,mul;
add=first+second;
int sub=first-second;
div=first/second;
mul=first*second;
System.out.println("Result : "+add+" is addition of two given numbers");
System.out.println("Result : "+sub+" is sub of two given numbers");
System.out.println("Result : "+div+" is div of two given numbers");
System.out.println("Result : "+mul+" is mul of two given numbers");

}
}