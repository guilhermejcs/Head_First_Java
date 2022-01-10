package cap9.pag196;

public class GC {
    public static GC doStuff(){
        GC newGC = new GC();
        doStuff2(newGC);
        return newGC;
    }

    public static void main(String[] args) {
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();

        // chama mais métodos
        // copyGC = null; Variável fora de escopo
        // gc2 = null; Libera a referência para o garbage colector
        // newGC = gc3; Variável fora de escopo
        // gc1 = null; Libera a referência para o garbage colector
        // newGC = null; Variável fora de escopo
        // gc4 = null; O objeto ainda está referenciado em gc3
        // gc3 = gc2; O objeto ainda está referenciado em gc4
        // gc1 = gc4; Libera a referência para o garbage colector
        // gc3 = null; O objeto ainda está referenciado em gc4

    }

    public static void doStuff2(GC copyGC){
        GC localGC = copyGC;
    }
}
