class Score {

    private int points;

    void calculatePoints(int numberOfPins) {
         points += numberOfPins;
    }

    public int getPoints() {
        return points;
    }
}
