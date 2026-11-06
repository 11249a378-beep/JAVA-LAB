11249A378
AIM:
    To write a Java program to print the Fibonacci series up to the given number of terms.
ALGORITHM:
1.Start the program.
2.Import the Scanner package.
3.Read the value of n from the user.
4.Call the fibonacci(n) method.
5.Initialize a = 0 and b = 1.
6.Print the first two numbers (0 and 1).
7.Use a for loop to calculate the next number by adding the previous two numbers.
8.Update the values of a and b.
9.Print the Fibonacci series.
10.Stop the program.
  
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
OUTPUT:
Enter the value of n: 7
0 1 1 2 3 5 8 13
RESULT:
      Thus, the Java program to print the Fibonacci series was executed successfully and the expected output was obtained.
