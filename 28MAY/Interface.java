/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Animal{
    //Method Signature
    void makeSound();
    void eat();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public void eat(){
        System.out.println("Dog is eating pedigree");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("Cat meows");
    }
    public void eat(){
        System.out.println("Cat is eating fish");
    }
}
public class Main
{
	public static void main(String[] args) {
		Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
	}
}
