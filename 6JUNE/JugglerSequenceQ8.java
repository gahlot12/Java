public class JugglerSequenceQ8 {
    public static void JuglerSeq(int n){
        int a = n;
        System.out.print(a+" ");

        while (a!=1) {
            int b = 0;
            if(a%2==0){
                b = (int)Math.floor(Math.sqrt(a));
            }
            else{
                b = (int)Math.floor(Math.sqrt(a)*Math.sqrt(a)*Math.sqrt(a));
            }
            System.out.print(b+" ");
            a=b;
        }
    }
    public static void main(String[] args) {
        JuglerSeq(3); 
        System.out.println(); 
        JuglerSeq(9); 
    }
}
