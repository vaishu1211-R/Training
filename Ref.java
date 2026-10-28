public class Ref{
public static void main(String[]args)
{
String s1="World";
String s2="World";
String s3=new String("World");
System.out.println(s1==s2);
System.out.println(s1.equals(s3));
}
}