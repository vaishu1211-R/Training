public class MM{
public static void main(String[]args)
{
    int max=Integer.MIN_VALUE;
    int arr[]={-7,8,9,5,90,-78};
    for(int i=0;i<arr.length;i++) {
       max=Math.max(max,arr[i]);
}
    System.out.println(max);
}
}