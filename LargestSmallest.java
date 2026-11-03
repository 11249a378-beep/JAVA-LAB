AIM:
    To write and execute a Java program to find the sum, largest and smallest numbers in an array.
ALGORITHM:
1.Start.
2.Declare and initialize an array.
3.Initialize sum = 0, min = a[0] and max = a[0].
4.Check each element in the array.
5.If the element is greater than max, update max.
6.If the element is smaller than min, update min.
7.Add each element to sum.
8.Print the sum, largest and smallest numbers.
9.Stop.
    
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
OUTPUT:
     The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
RESULT:
     The given Java program was successfully executed, and the sum, largest and smallest numbers in the array were found successfully.
