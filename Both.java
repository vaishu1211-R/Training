import java.util.*;
public class Both{
public static void main(String[]args)
{
  int a[]={7,8,15,17,91,15};
  int first=0,second=0;
  for(int i=0;i<a.length;i++){
   if(a[i]>first) {
    second=first;
    first=a[i];
}
   else if(a[i]>second && a[i]<first) {
    second=a[i];
   }
 }
System.out.println("First number="+first);
System.out.println("Second number="+second);
}
}