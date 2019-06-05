import java.util.*;
import java.util.*;
public class Stringrev
{
public static void main(String[] args)
{
String name,reverse="";
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
name=sc.nextLine();
int length=name.length();
for(int i=length-1;i>=0;i--)
reverse=reverse+name.charAt(i);
System.out.println(reverse);
}
}
