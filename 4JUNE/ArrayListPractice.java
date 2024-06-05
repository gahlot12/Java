import java.util.ArrayList;
import java.util.Collections;
//Include Collections to use sort method in the arrayList
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("Lamborghini");
        cars.add("Audi");
        cars.add("Range_Rover");

        cars.add(0,"Rolls_Royce");
        // for (String string : cars) {
        //     System.out.println(string);
        // }

        // //get is used to access an element in the arraylist
        // System.out.println(cars.get(3)); 

        // //set is used to modify an element
        // cars.set(3,"Mustang");
        // System.out.println(cars.get(3)); 

        // // remove is used to remove an element
        // cars.remove(4);
        // System.out.println(cars.get(4)); 
        // Array out of bound exception will occur for the remove case;

        // // clear is used to remove all the element in the arrayList
        // cars.clear();
        // System.out.println(cars.get(0)); 
        // same out of bound exception will occur

        Collections.sort(cars);
        for (String string : cars) {
                System.out.println(string);
        }
    }
}
