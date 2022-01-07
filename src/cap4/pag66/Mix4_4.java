package cap4.pag66;

public class Mix4_4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4_4[] m4a = new Mix4_4[20];
        int x = 0;

        while (x<19){
            m4a[x] = new Mix4_4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x +1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index){
        if (index<1){
            Mix4_4 m4 = new Mix4_4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
/*
RESPOSTA: 20 1
 */
