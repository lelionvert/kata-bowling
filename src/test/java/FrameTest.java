import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FrameTest {
    @Test
    public void in_a_frame_the_bowler_get_up_to_two_tries_to_knock_down_the_pins() {
        Frame frame = new Frame();
        assertThat(frame.getMaximalNumberOfTries()).isEqualTo(Frame.MAXIMUM_NUMBER_OF_TRIES);
    }
}