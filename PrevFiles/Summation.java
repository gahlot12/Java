/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		float [] arr = new float[5];
		float sum = 0f;
		Scanner s = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Enter 5 numbers to add: ");
            arr[i] = s.nextFloat();
            sum = sum + (float)arr[i];
        }
        System.out.println("The sum of the 5 numbers is : " + sum);
	}
}
