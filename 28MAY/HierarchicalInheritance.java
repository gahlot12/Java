/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}
class Cow extends Animal{
    void moo(){
        System.out.println("Cow is mooing");
    }
}
public class Main
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat(); // Inherited from Animal
        dog.bark(); // Defined in Dog

        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Defined in Cat

        Cow cow = new Cow();
        cow.eat(); // Inherited from Animal
        cow.moo(); // Defined in Cow
	}
}
