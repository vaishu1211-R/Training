import java.util.Scanner;
public class Key{
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int n=sc.nextInt();
 int sum=0;
 for(;n>0;n=n/10){
   sum=sum+n%10;
 }
 System.out.println("Sum="+sum);
 if(sum%3==0)
   System.out.println("Divisible by 3");
 else
   System.out.println("Not divisible by 3");
 }
} 

