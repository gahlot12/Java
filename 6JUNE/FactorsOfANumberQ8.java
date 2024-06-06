// Find all factors of a Natural Number

public class FactorsOfANumberQ8 {
    public static void printDivisor(int n){
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }

    public static void printFactor(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n%i==0) 
            { 
                // If divisors are equal, print only one 
                if (n/i == i) 
                    System.out.print(" "+ i); 
       
                else // Otherwise print both 
                    System.out.print(i+" " + n/i + " " ); 
            }
        }
    }
    public static void main(String[] args) {
        // printDivisor(100);

        printFactor(100);
    }
}
