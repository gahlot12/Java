public class Ques8 {
    static boolean isAutomorphic(int n){
        int square = n * n;
        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n = n / 10;
            square /= 10; 
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
        System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");
    }
}
