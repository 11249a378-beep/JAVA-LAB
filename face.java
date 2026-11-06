11249A378
AIM:
   To write a Java Applet program to draw a human face using Graphics class methods.
ALGORITHM:
1.Start the program.
2.Import the required packages java.awt, java.io and java.applet.
3.Create a class named face that extends the Applet class.
4.Override the paint(Graphics g) method.
5.Use drawOval() to draw the face, eyes and ears.
6.Use fillOval() to draw the pupils of the eyes.
7.Use fillArc() to draw the nose and mouth.
8.Display the face using the Graphics class.
9.Stop the program.
   
import java.awt.*;
import java.io.*;
import java.applet.*;

public class face extends Applet
{
   /*
<applet code="face.class" width="300" height="300">
</applet>
*/ public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
RESULT:
       Thus, the Java Applet program was successfully executed to draw a human face using Graphics class methods like drawOval(), fillOval() and fillArc().
