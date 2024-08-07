import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums.toString());
        System.out.println(nums.remove(2)); // removes the element from index 2 and returns the removes element 
        System.out.println(nums.remove(Integer.valueOf(5))); // removes the element 5 from the array list and returns true or false
        System.out.println(nums.get(2)); // fetches the number at index 2 --> this will give 4 after removal 

        // nums.clear(); // removes all the elements from the array list 

        // System.out.println(nums.toString()); // this will now print empty array list 


        // Update the elements inside an array list 
        nums.set(2, 9); // updates the element present at index 2 with value 9
        System.out.println(nums.toString());



        // Sort the array list 
        nums.sort(Comparator.naturalOrder()); // sorts the array list in natural increasing order 
        nums.sort(Comparator.reverseOrder()); // sorts the array list in reverse order


        System.out.println(nums.size()); // returns an integer depicting the size of the arryalist 
        System.out.println(nums.contains(9)); // returns true if arraylist contains this value, otherwise false


        System.out.println(nums.isEmpty()); // returns true if the arraylist is empty, otherwise false




        // For each loop

        nums.forEach(num -> {
            System.out.println(num * 2); // this wont change the original arraylist
        });

    }
}
