import java.util.Arrays;
import java.util.List;

public class LoopNumbersListFPRunner {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(5, 6, 3, 8, 10, 7, 2, 1, 9);

        String oddNos = getOddNosString(nos);
        System.out.println("The odd numbers are " + oddNos);

        String deductedMarks = getDeductedMarksString(nos);
        System.out.println("The deducted marks are " + deductedMarks);
    }

    /*
    * Build a method named getOddNosString that takes a List<Integer> as an input parameter
    * and returns a comma separated String of all the odd numbers from the input list.
    * If the user passes in an empty list to this function, it should return an empty string.
    * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
    */


    /*
    * Build a method named getDeductedMarksString that takes a List<Integer> as an input parameter
    * and returns a comma separated String of all the marks from the input list, but each of them deducted by 1.
    * If the user passes in an empty list to this function, it should return an empty string.
    * Assume that there will always be some List<Integer> object that will be passed as an input to this function (can be empty as explained above).
    * Also if any of the marks scored in the input list is 0, then in the final list the marks should be 0 only, and not -1
    */
}
