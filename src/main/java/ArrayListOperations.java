import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        System.out.println("Colors List: " + colors);

        System.out.println("Iterating through colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(0, "Purple");
        System.out.println("After adding 'Purple' at the first position: " + colors);

        String elementAtIndex2 = colors.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        colors.set(1, "Orange");
        System.out.println("After updating index 1 with 'Orange': " + colors);

        colors.remove(2);
        System.out.println("After removing the third element: " + colors);

        String searchColor = "Blue";
        boolean containsColor = colors.contains(searchColor);
        System.out.println("List contains 'Blue': " + containsColor);

        Collections.sort(colors);
        System.out.println("After sorting: " + colors);

        ArrayList<String> copiedList = new ArrayList<>(colors);
        System.out.println("Copied List: " + copiedList);

        Collections.reverse(colors);
        System.out.println("After reversing: " + colors);

        boolean listsAreEqual = colors.equals(copiedList);
        System.out.println("Original and copied list are equal: " + listsAreEqual);

        colors.clear();
        System.out.println("After clearing the list: " + colors);

        boolean isEmpty = colors.isEmpty();
        System.out.println("List is empty: " + isEmpty);

        colors.ensureCapacity(20);
        System.out.println("Increased capacity of the list to 20.");

        colors.trimToSize();
        System.out.println("Trimmed the list capacity to the current size.");
    }
}
