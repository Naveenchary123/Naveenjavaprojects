import java.util.*;
class Arthi
{
public static void main(String[] arg)
{
int a,b,c;
System.out.println("Enter two values:");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = a + b;
System.out.println("Addition:"+c);
c = a - b;
System.out.println("Substraction:"+c);
c = a * b;
System.out.println("multiplictaion:"+c);
c = a / b;
System.out.println("Division:"+c);
c = a % b;
System.out.println("Modulus:"+c);
}}