11249A378
AIM:
   To write and execute a Java program to search an element in a sorted array using the Binary Search Algorithm.
ALGORITHM:
1.Start.
2.Read the number of elements.
3.Enter the array elements in sorted order.
4.Read the element to be searched.
5.Find the middle element of the array.
6.Compare the middle element with the search element.
7.If both are equal, print the position.
8.If the search element is greater, search the right side.
9.Otherwise, search the left side.
10.If the element is not found, print "Element not found".
11.Stop.

import java.util.Scanner;

class BinarySearch
{
    public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while(first <= last)
        {
            mid = (first + last) / 2;

            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}
OUTPUT:
      Enter number of elements: 5
Enter elements in sorted order:
10
20
30
40
50
Enter element to search: 30
Element found at position 3
Enter element to search: 60
Element not found
RESULT:
      The given Java program was successfully executed.
