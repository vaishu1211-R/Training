import java.util.*;
public class Clust{
public static void main(String[]args)
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size:");
  int n=sc.nextInt();
  int[] mark=new int[n];
  int sum=0;
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++) {
   mark[i]=sc.nextInt();
   sum=sum+mark[i];
}
System.out.println("Sum="+sum);
}
}
