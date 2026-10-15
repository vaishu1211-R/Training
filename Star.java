import java.util.Scanner;
public class Star{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows"); 
  int n=sc.nextInt();
  int k=1;
  int Space=n/2;
  for(int i=0;i<n;i++){
    for(int j=0;j<Space;j++){
       System.out.print(" ");
    }
    for(int j=0;j<k;j++){
       System.out.print("*"+" ");
    }
      k+=i<n/2?2:-2;
      Space+=i<n/2?-1:1;
      System.out.println();
    }
  }
}