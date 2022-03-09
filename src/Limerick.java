public class Limerick extends Poem{
    public Limerick() {
        super(5);
    }

    public int getSyllables(int k) {
        switch (k) {
            case 1:
            case 2:
            case 5:
                return 9;
            case 3:
            case 4:
                return 6;
            default:
                return -1;
        }
    }

    public void printRhythm() {
        for (int i = 1; i <= getNumLines(); i++) {
            for (int j = 1; j < getSyllables(i); j++) {
                System.out.print("ta-");
            }
            System.out.println("ta");
        }
    }
}
