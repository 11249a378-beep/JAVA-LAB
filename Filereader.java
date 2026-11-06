11249A378
AIM:
    To write a Java program to read and display the contents of a file using FileReader.
ALGORITHM:
1.Start the program.
2.Import the java.io.* package.
3.Create a class named Filereader.
4.Use the try block to handle exceptions.
5.Create a FileReader object to open sample2.txt.
6.Declare an integer variable i.
7.Use a while loop to read characters from the file.
8.Convert each character into a character using (char)i.
9.Display the characters on the console.
10.Close the file using fr.close().
11.If an exception occurs, display the exception message.
12.Stop the program.
  
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
RESULT:
      Thus, the Java program to read and display the contents of a file using FileReader was executed successfully.
