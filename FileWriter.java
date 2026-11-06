11249A378
AIM:
    To write a Java program to create a file and write alphabets (A to Z) into the file using FileWriter.
ALGORITHM:
1.Start the program.
2.Import the java.io.* package.
3.Create a class named FileWriter.
4.Use the try block to handle exceptions.
5.Create a FileWriter object to open sample2.txt.
6.Use a for loop from 65 to 90.
7.Write characters from A to Z into the file.
8.Close the file using fw.close().
9.If an exception occurs, display the exception message.
10.Stop the program.
    
import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
OUTPUT:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
RESULT:
    Thus, the Java program to write alphabets from A to Z into a file using FileWriter was executed successfully.
