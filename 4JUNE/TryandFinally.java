public class TryandFinally {
    public static void main(String[] args) {
        try {
            Integer x = null; // Use Integer instead of int to hold null
            System.out.println(x.toString()); // This will throw a NullPointerException
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }
        finally{
            System.out.println("This is the finally block. It is executed whether an exception is handled or not.");
        }
        System.out.println("Normal flow of the code");
    }
}
