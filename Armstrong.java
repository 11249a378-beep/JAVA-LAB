11249A378
AIM:
    To write a Java program to check whether a given positive number is an Armstrong number or not.
ALGORITHM:
1.Start the program.
2.Read a positive number n from the user.
3.Store the number in a temporary variable nu.
4.Extract the last digit using nu % 10.
5.Calculate the cube of the digit and add it to num.
6.Remove the last digit using nu / 10 and repeat until nu becomes zero.
7.If num == n, print "Armstrong Number"; otherwise, print "Not an Armstrong Number".
8.Stop the program.
  
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}
OUTPUT:
Enter any Positive Number : 153
Armstrong Number
RESULT:
      Thus, the Java program to check whether a given positive number is an Armstrong number or not was executed successfully.
