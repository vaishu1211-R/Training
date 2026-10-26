import java.util.*;
public class Large{
public static void main(String[]args)
{
  int a[]={7,8,15,17,91,15};
 int largest=a[0];
 for(int i=0;i<a.length;i++) {
   if(a[i]>largest) {
    largest=a[i];
}
}
System.out.println("Largest number="+largest);
}
}