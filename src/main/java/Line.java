class Line {

    private int score;
    private Frame[] frames;

    Line() {
        frames = new Frame[10];
    }

    void calculatePoints(int numberOfPins) {
         score += numberOfPins;
    }

    public int getPoints() {
        return score;
    }

    public int size() {
        return frames.length;
    }
}
