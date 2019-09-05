import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingTestTest {

    @Test
    public void name() {
        int numberOfPins = 5;
        int expectedNumberOfPoints = 5;
        Assertions.assertThat(expectedNumberOfPoints).isEqualTo(calculatePoints(numberOfPins));
    }

    private int calculatePoints(int numberOfPins) {
        return numberOfPins;
    }
}