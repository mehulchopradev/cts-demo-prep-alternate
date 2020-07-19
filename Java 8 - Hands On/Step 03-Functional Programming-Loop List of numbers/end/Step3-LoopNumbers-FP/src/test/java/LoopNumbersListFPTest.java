import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopNumbersListFPTest {

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
    public void testOddNosString() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("1a", Arrays.asList(3, 7, 8, 4, 9, 1), "3,7,9,1"),
                new Scenario("1b", Arrays.asList(), ""),
                new Scenario("1c", Arrays.asList(8, 4), "")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = LoopNumbersListFPRunner.getOddNosString(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }

    @Test
    public void testDeductedMarksString() {
        List<Scenario> scenarios = Arrays.asList(
                new Scenario("2a", Arrays.asList(3, 7, 8, 4, 9, 1), "2,6,7,3,8,0"),
                new Scenario("2b", Arrays.asList(), ""),
                new Scenario("2c", Arrays.asList(0, 5), "0,4")
        );

        scenarios.forEach(scenario -> {
            System.out.println("Running test " + scenario.id);
            String actual = LoopNumbersListFPRunner.getDeductedMarksString(scenario.input);
            assertEquals(scenario.output, actual);
            System.out.println("Passing test " + scenario.id);
        });
    }
}