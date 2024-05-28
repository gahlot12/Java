/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal{
    String name;
    
    Animal(String name){
        this.name = name;
    }
    
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    String breed;
    
    Dog(String name,String breed){
        super(name);
        this.breed = breed;
    }
    void sound() {
        super.sound(); // Call superclass method using super keyword
        System.out.println("Dog barks");
    }
    void displayDetails() {
        System.out.println("Name: " + super.name); // Access superclass variable using super keyword
        System.out.println("Breed: " + this.breed);
    }
}
public class Main
{
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", "Labrador");
        dog.sound(); // Output: Animal makes a sound, Dog barks
        dog.displayDetails(); // Output: Name: Buddy, Breed: Labrador
	}
}
