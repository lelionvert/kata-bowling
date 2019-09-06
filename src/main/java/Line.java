class Line {

    static final int NUMBER_OF_FRAME_IN_A_LINE = 10;
    private int score;
    private Frame[] frames;

    Line() {
        frames = new Frame[NUMBER_OF_FRAME_IN_A_LINE];
    }

    void roll(int numberOfPins) {
         score += numberOfPins;
    }

    public int getPoints() {
        return score;
    }

    public int size() {
        return frames.length;
    }
}
