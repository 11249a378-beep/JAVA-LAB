11249A378
 AIM:
     To write a Java program to demonstrate Thread Priority by creating three threads and assigning different priorities to them.
 ALGORITHM:
1.Start the program.
2.Create three classes A, B and C by extending the Thread class.
3.Override the run() method in each class.
4.Display thread messages using System.out.println().
5.Create objects for all three threads in the main() method.
6.Set the priority of Thread C to MAX_PRIORITY (10).
7.Set the priority of Thread B to threadA.getPriority()+1 (6).
8.Set the priority of Thread A to MIN_PRIORITY (1).
9.Start all three threads using the start() method.
10.Display the end of the main thread.
11.Stop the program.
 
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}
OUTPUT:
start thread A
start thread B
start thread C
Thread A started
Thread B started
thread C started
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread c =1
thread c =2
thread c =3
thread c =4
exit from c
end of main thread
RESULT:
      Thus, the Java program was successfully executed to demonstrate Thread Priority using three threads with different priority levels: Minimum, Normal and Maximum.
