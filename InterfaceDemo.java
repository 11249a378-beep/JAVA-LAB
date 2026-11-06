11249A378
AIM:
    To write a Java program to demonstrate the concept of an interface using the Animal interface and Dog class.
ALGORITHM:
1.Start the program.
2.Create an interface named Animal.
3.Declare an abstract method sound() inside the interface.
4.Create a class named Dog that implements the Animal interface.
5.Define the sound() method in the Dog class.
6.Print "Dog Barks" inside the method.
7.Create an object of the Dog class in the main method.
8.Call the sound() method using the object.
9.Stop the program.
    
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
OUTPUT:
Dog Barks
RESULT:
       Thus, the Java program to demonstrate the concept of an interface was executed successfully and the expected output was obtained.
