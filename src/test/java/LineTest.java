import org.junit.Test;

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
    public void each_line_include_ten_frames_for_the_bowler() {
        Line line = new Line();
        assertThat(line.size()).isEqualTo(Line.NUMBER_OF_FRAME_IN_A_LINE);
    }
}