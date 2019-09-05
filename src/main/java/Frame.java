class Frame {

    static final int MAXIMUM_NUMBER_OF_TRIES = 2;
    private int[] tries;

    Frame() {
        tries = new int[MAXIMUM_NUMBER_OF_TRIES];
    }

    public int getMaximalNumberOfTries() {
        return tries.length;
    }
}
