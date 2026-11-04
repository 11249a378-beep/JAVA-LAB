11249A378
AIM:
    To write a Java program to check whether a given number is even or odd using a switch statement.
ALGORITHM:
1.Start the program.
2.Read a number from the user.
3.Calculate the remainder using n % 2.
4.If the remainder is 0, print "This number is even".
5.If the remainder is 1, print "This number is odd".
6.Stop the program.
    
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
OUTPUT:
5
    The number is odd
RESULT:
   Thus, the Java program to check whether a given number is even or odd using a switch statement was executed successfully.
