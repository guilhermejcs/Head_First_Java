package cap2.pag33.exercicio_a;

public class TapeDeskTestDrive {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck(); // Precisa instanciar a classe TapeDeck
        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true){
            t.recordTape();
        }
    }
}
