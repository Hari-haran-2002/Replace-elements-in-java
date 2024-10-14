import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Print the original list
        System.out.println("Original ArrayList: " + list);

        // Replace the second element (index 1) with a specified element
        if (list.size() > 1) {
            list.set(1, "Blueberry"); // Replaces the element at index 1
        }

        // Print the list after replacement
        System.out.println("ArrayList after replacing the second element: " + list);
    }
}
