class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Error: Cannot override the final method from Parent
    // void display() {
    //     System.out.println("This is an overridden method.");
    // }
}


public class FinalKeyword{
    final double PI = 3.14159;

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        // obj.PI = 3.14; // Error: Cannot assign a value to a final variable
        System.out.println("Value of PI: " + obj.PI);
    }
}