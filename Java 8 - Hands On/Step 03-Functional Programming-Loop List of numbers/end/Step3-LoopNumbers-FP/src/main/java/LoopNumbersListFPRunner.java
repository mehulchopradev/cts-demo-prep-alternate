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

    public static String getOddNosString(List<Integer> nos) {
        final StringBuilder builder = new StringBuilder();
        nos.forEach(no -> {
            if (no % 2 != 0) {
                builder.append(no);
                builder.append(',');
            }
        });

        if (builder.length() == 0) {
            return "";
        }
        return builder.toString().substring(0, builder.length()-1);
    }

    public static String getDeductedMarksString(List<Integer> nos) {
        StringBuilder builder = new StringBuilder();
        nos.forEach(no -> {
            builder.append(no > 0 ? no - 1 : no);
            builder.append(',');
        });

        if (builder.length() == 0) {
            return "";
        }

        return builder.toString().substring(0, builder.length()-1);
    }
}
