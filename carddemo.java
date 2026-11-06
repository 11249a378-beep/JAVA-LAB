11249A378
AIM:
    To write a Java Applet program to demonstrate CardLayout using buttons and ActionListener.
ALGORITHM:
1.Start the program.
2.Import the required Java packages such as java.awt, java.applet and java.awt.event.
3.Create a class named carddemo that extends Applet and implements ActionListener.
4.Declare three buttons and a Panel.
5.Create a CardLayout object.
6.In the init() method, create a panel and set its layout to CardLayout.
7.Create three buttons: First Button, Second Button and Third Button.
8.Add ActionListener to all three buttons.
9.Add the buttons to the panel using add() method.
10.In the actionPerformed() method, use buttonCardLayout.next(buttonPanel) to display the next card.
11.Stop the program.
  
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
OUTPUT:
