import org.junit.Test;

import java.security.KeyStore;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

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

    @Test
    public void each_line_include_ten_frames_for_the_bowler() {
        Line line = new Line();
        assertThat(line.size()).isEqualTo(10);
    }
}