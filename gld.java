11249A378
AIM:
   To write a Java Applet program to demonstrate GridLayout using ten buttons arranged in 5 rows and 2 columns.
ALGORITHM:
1.Start the program.
2.Import the required packages such as java.awt and java.applet.
3.Create a class named gld that extends the Applet class.
4.Override the init() method.
5.Set the layout using GridLayout(5,2).
6.Create ten buttons with labels A, B, C, D, E, F, G, H, I and J.
7.Add all ten buttons to the Applet using the add() method.
8.Override the getInsets() method.
9.Set the margins using Insets(20,20,20,20).
10.Display the buttons in 5 rows and 2 columns.
11.Stop the program.
  
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{ 
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
OUTPUT:
GridLayout (5 Rows × 2 Columns)
A                         F
B                         G
C                         H
D                         I
E                         J
RESULT:
       Thus, the Java Applet program was successfully executed to demonstrate GridLayout, which arranges ten buttons in 5 rows and 2 columns.
