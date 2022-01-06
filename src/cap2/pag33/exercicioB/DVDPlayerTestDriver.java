package cap2.pag33.exercicioB;

public class DVDPlayerTestDriver {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRercord = true;
        d.playDVD();

        if (d.canRercord == true){
            d.recordDVD();
        }
    }
}
