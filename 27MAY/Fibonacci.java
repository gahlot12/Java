/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Fibonacci{
    public int nthFibonacci(int n){
        int prev2 = 0;
        int prev = 1;
        
        for(int i = 0;i<n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev2;
    }
}
public class Main
{
	public static void main(String[] args) {
		Fibonacci Fib = new Fibonacci();
		int n = 12;
		int nthFibNo = Fib.nthFibonacci(n);
		System.out.println(nthFibNo);
	}
}
