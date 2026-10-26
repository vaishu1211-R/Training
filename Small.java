import java.util.*;
public class Small{
public static void main(String[]args)
{
  int a[]={7,8,15,17,91,15};
 int smallest=a[0];
 for(int i=0;i>a.length;i++) {
   if(a[i]<smallest) {
    smallest=a[i];
}
}
System.out.println("Smallest number="+smallest);
}
}