import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    @Test
    public void when_a_number_of_pins_fail_we_win_the_same_number_points() {
        Score score = new Score();

        int numberOfPins = 5;
        int expectedNumberOfPoints = 5;
        assertThat(expectedNumberOfPoints).isEqualTo(score.calculatePoints(numberOfPins));
    }

    @Test
    public void addtionPoints() {
        int numberOfPins = 3;
        Score score = new Score();
        score.calculatePoints(numberOfPins);
        numberOfPins = 4;

        int frameScore = score.calculatePoints(numberOfPins);

        int expectednumberOfPoints = 7;
        assertThat(expectednumberOfPoints).isEqualTo(frameScore);
    }
}