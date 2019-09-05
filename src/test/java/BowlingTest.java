import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BowlingTest {

    @Test
    public void when_a_number_of_pins_fail_we_win_the_same_number_points() {
        Line line = new Line();
        int numberOfPins = 5;
        int expectedNumberOfPoints = 5;

        line.calculatePoints(numberOfPins);

        assertThat(expectedNumberOfPoints).isEqualTo(line.getPoints());
    }

    @Test
    public void total_frame_score_should_be_equal_to_the_sum_of_each_roll() {
        int numberOfPins = 3;
        Line line = new Line();
        line.calculatePoints(numberOfPins);
        numberOfPins = 4;

        line.calculatePoints(numberOfPins);

        int expectednumberOfPoints = 7;
        assertThat(expectednumberOfPoints).isEqualTo(line.getPoints());
    }



}