public class TryAndCatch {
    public static void main(String[] args) {  
        try{
            int a[] = new int[7];
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        try{
            int b = 59/0;
            System.out.println(b);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occur");
        }
        try {
            try{
                System.out.println("What if divided by zero");
                int c = 0/0;
                System.out.println(c);
            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException occurs and handled");
            }
        } catch (Exception e) {
            System.out.println("Handled the exception");
        }
        System.out.println("Normal flow");
    }  
}
