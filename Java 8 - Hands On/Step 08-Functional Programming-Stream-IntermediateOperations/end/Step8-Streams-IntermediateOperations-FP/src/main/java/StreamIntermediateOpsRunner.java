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

    public static String getDistinctDecendingOrder(List<Integer> nos) {
        StringBuilder builder = new StringBuilder();
        nos.stream().distinct().sorted((n1, n2) -> n2.compareTo(n1)).forEach(no -> {
            builder.append(no);
            builder.append(',');
        });

        if (builder.length() == 0) {
            return "";
        }

        return builder.toString().substring(0, builder.length() - 1);
    }

    public static String getAllOddsDeductedByOne(List<Integer> nos) {
        StringBuilder builder = new StringBuilder();
        nos.stream().filter(no -> no % 2 != 0).map(no -> no - 1).forEach(no -> {
            builder.append(no);
            builder.append(',');
        });

        if (builder.length() == 0) {
            return "";
        }

        return builder.toString().substring(0, builder.length() - 1);
    }

    public static String getAllDeductedByOne(List<Integer> nos) {
        StringBuilder builder = new StringBuilder();
        nos.stream().map(no -> no > 0 ? no - 1 : no).forEach(no -> {
            builder.append(no);
            builder.append(',');
        });

        if (builder.length() == 0) {
            return "";
        }

        return builder.toString().substring(0, builder.length() - 1);
    }

    public static String getAllEvensMoreThanFour(List<Integer> nos) {
        final StringBuilder builder = new StringBuilder();
        nos.stream().filter(no -> no % 2 == 0 && no > 4).forEach(no -> {
            builder.append(no);
            builder.append(',');
        });

        if (builder.length() == 0) {
            return "";
        }

        return builder.toString().substring(0, builder.length() - 1);
    }
}
