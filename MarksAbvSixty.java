11249A378
AIM: 
  To write and execute a Java program to display the names and marks of students who scored more than 60 marks.
AGORITHM:
1.Start.
2.Declare two arrays for student names and marks.
3.Read the names and marks of 6 students.
4.Check the marks of each student.
5.If the marks are greater than 60, display the student's name and marks.
6.Repeat until all 6 students are checked.
7.Stop.
    
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
OUTPUT:
     Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Ravi 55
Enter Name of Student and Marks of Subject 3: Priya 85
Enter Name of Student and Marks of Subject 4: Kumar 60
Enter Name of Student and Marks of Subject 5: Divya 90
Enter Name of Student and Marks of Subject 6: Ram 45

Students scoring more than 60:
Arun : 75
Priya : 85
Divya : 90
RESULT:
      The given Java program was successfully executed, and the names and marks of students who scored more than 60 were displayed successfully.
