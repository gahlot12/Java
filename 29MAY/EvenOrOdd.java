public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 101;
        if((n|1) > n){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
