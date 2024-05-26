/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;

class GuessTheNumber{
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;
    
    public int getNumberOfGuesses(){
        return numberOfGuesses;
    }
    public void setNumberOfGuesses(int numberOfGuesses){
        this.numberOfGuesses = numberOfGuesses;
    }
    GuessTheNumber(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the Number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        numberOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, numberOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class Main
{
	public static void main(String[] args) {
		GuessTheNumber g = new GuessTheNumber();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
	}
}
