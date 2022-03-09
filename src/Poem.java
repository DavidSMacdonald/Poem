public class Poem {
    private int numLines;
    private boolean free;
    public Poem() {
        numLines = 0;
    }
    public Poem(int n) {
        numLines = n;
    }

    public int getNumLines() {
        return numLines;
    }

    public void printRhythm() {
        System.out.println("Free verse!");
    }
}
