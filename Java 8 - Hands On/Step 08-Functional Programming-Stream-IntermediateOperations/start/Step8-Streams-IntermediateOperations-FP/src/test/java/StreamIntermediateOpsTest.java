import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamIntermediateOpsTest {

    class Scenario {
        public String id;
        public List<Integer> input;
        public String output;

        public Scenario(String id, List<Integer> input, String output) {
            this.id = id;
            this.input = input;
            this.output = output;
        }
    }

    @Test
    public void testGetAllEvensMoreThanFour() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("1a", Arrays.asList(3, 7, 8, 4, 9, 6), "8,6"),
                new Scenario("1b", Arrays.asList(), ""),
                new Scenario("1c", Arrays.asList(1, 5), ""),
                new Scenario("1d", Arrays.asList(2, 5, 4, 1), "")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = StreamIntermediateOpsRunner.getAllEvensMoreThanFour(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }

    @Test
    public void testGetAllDeductedByOne() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("1a", Arrays.asList(3, 7, 8, 4, 9, 6), "2,6,7,3,8,5"),
                new Scenario("1b", Arrays.asList(), ""),
                new Scenario("1c", Arrays.asList(5, 0), "4,0")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = StreamIntermediateOpsRunner.getAllDeductedByOne(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }

    @Test
    public void testGetAllOddDeductedByOne() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("1a", Arrays.asList(3, 7, 8, 4, 9, 6), "2,6,8"),
                new Scenario("1b", Arrays.asList(), ""),
                new Scenario("1c", Arrays.asList(2, 8, 10), "")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = StreamIntermediateOpsRunner.getAllOddsDeductedByOne(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }

    @Test
    public void testGetDistinctDescendingOrder() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("1a", Arrays.asList(3, 7, 8, 4, 9, 6), "9,8,7,6,4,3"),
                new Scenario("1b", Arrays.asList(), ""),
                new Scenario("1c", Arrays.asList(2, 8, 10, 7, 10, 2), "10,8,7,2")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = StreamIntermediateOpsRunner.getDistinctDecendingOrder(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }
}
