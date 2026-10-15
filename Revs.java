import java.util.Scanner;
public class Revs{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  int rev=0;
  for(;n>0;n=n/10){
    rev=rev*10+n%10;
  }
  System.out.println("Reverse="+rev);
 }
}
