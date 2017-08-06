import java.util.Scanner; 
class Nearest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.print("Enter the number1");
a=sc.nextInt(); 
int b;
System.out.println("Enter the number2");
b=sc.nextInt(); 
int c=28;
if((a+c)==51)
{
System.out.println(a);
}
else if((a>51)||(b>51))
{
System.out.println("The output is 0");
}
else	
System.out.println(b);
}
}
