import java.util.Scanner;
public class Keys{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
  for(int i=n;i>0;i/=10){
  System.out.println(i%10);
  }
 }
}
