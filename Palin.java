import java.util.Scanner;
public class Palin{
public static void main(String[]args)
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number");
   int n=sc.nextInt();
   int temp=n,rev=0;
   for(;n>0;n=n/10){
      rev=rev*10+n%10;
   }
   if (temp==rev)
     System.out.println("Palindrome");
   else
     System.out.println("Not Palindrome");
   }
}
