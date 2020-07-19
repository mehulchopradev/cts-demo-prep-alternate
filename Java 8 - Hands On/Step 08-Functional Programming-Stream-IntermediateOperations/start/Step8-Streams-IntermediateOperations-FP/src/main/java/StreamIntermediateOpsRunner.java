import java.util.Arrays;
import java.util.List;

public class StreamIntermediateOpsRunner {

    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(6, 4, 3, 1, 2, 10, 4, 10, 8, 9, 3, 7);

        System.out.println("All Even numbers more than 4 are " + getAllEvensMoreThanFour(nos));
        System.out.println("All numbers deducted by 1 are " + getAllDeductedByOne(nos));
        System.out.println("All odd numbers deducted by 1 are " + getAllOddsDeductedByOne(nos));
        System.out.println("All distinct numbers in descending order are " + getDistinctDecendingOrder(nos));
    }

    /**
     * Build a method named getAllEvensMoreThanFour that takes a List<Integer> of numbers as input.
     * It finds all the even numbers more than four, using functional programming construct filter.
     * Finally it returns the output as a string with the numbers in it separated by a comma using functional programming construct forEach
     * If the user passes in an empty list to this function, it should return an empty string.
     * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
     */

    /**
     * Build a method named getAllDeductedByOne that takes a List<Integer> of numbers as input.
     * For each number from the input list it deducts 1 from each of them, using functional programming construct map.
     * Also if any of the marks scored in the input list is 0, then in the final list the marks should be 0 only, and not -1
     * Finally it returns the output as a string with the numbers in it separated by a comma using functional programming construct forEach
     * If the user passes in an empty list to this function, it should return an empty string.
     * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
     */

    /**
     * Build a method named getAllOddsDeductedByOne that takes a List<Integer> of numbers as input.
     * It finds the odd numbers from the input list and then deducts each of those odd numbers by 1, using functional programming constructs filter and map.
     * Finally it returns the output as a string with the numbers in it separated by a comma using functional programming construct forEach
     * If the user passes in an empty list to this function, it should return an empty string.
     * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
     */

    /**
     * Build a method named getDistinctDecendingOrder that takes a List<Integer> of numbers as input.
     * It finds the distinct numbers from the input list and sorts them, using functional programming constructs distinct and sorted.
     * Finally it returns the output as a string with the numbers in it separated by a comma using functional programming construct forEach
     * If the user passes in an empty list to this function, it should return an empty string.
     * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
     */
}
