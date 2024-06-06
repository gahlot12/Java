// Write a program that does the following

// Create an ArrayList of integers, add the elements [12, 25, 34, 46] to it
// Remove the number 25 from the ArrayList
// Print the final ArrayList

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);

        // Remove element equal to 25
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) == 25) {
                numbers.remove(i);
                break;
            }
        }
        
        for (int i = 0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
