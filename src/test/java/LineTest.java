import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    public void if_the_pins_are_never_all_knocked_down_in_a_frame_the_score_of_the_line_is_equal_to_the_number_of_knocked_pins() {
        Line line = new Line();
        int numberOfPinsKnockedDownByTry = 3;

        int totalTries = 20;
        for (int numberOfTry = 0; numberOfTry < totalTries; numberOfTry++) {
            line.roll(numberOfPinsKnockedDownByTry);
        }
        assertThat(line.getPoints()).isEqualTo(numberOfPinsKnockedDownByTry * totalTries);
    }

    @Test
    public void each_line_include_ten_frames_for_the_bowler() {
        Line line = new Line();
        assertThat(line.size()).isEqualTo(Line.NUMBER_OF_FRAME_IN_A_LINE);
    }

    @Test
    public void total_number_of_pins_knocked_in_a_frame_should_be_the_sum_of_the_two_tries() {

    }
}