11249A378
AIM:
   To write a Java program to find the largest of three numbers using if-else-if statements.
ALGORITHM:
1.Start the program.
2.Read three integers x, y, and z from the user.
3.If x > y and x > z, print the first number is largest.
4.Else if y > x and y > z, print the second number is largest.
5.Else if z > x and z > y, print the third number is largest.
6.Otherwise, print that the numbers are not distinct or equal.
7.Stop the program.
    
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
OUTPUT:
Enter three integers:
10
20
15
Second number is largest
RESULT:
     Thus, the Java program to find the largest of three numbers using if-else-if statements was executed successfully.
