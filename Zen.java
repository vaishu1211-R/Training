import java.util.*;
public class Zen{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size:");
  int n=sc.nextInt();
  int[] mark=new int[n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
    mark[i]=sc.nextInt();
}
  System.out.println("reverse array");
  for(int i=mark.length-1;i>=0;i--) {
   System.out.println(mark[i]);
}
}
}