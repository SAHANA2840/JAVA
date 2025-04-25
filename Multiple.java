import java.util.*;
class Multiple
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number: ");
int num = sc.nextInt();
if (num%3 == 0)
{
if (num%5 == 0)
{
System.out.println("FizzBuzz");
}
else{
System.out.println("Fizz");}
}
if (num%5 == 0)
{
System.out.println("Buzz");
}
}
}