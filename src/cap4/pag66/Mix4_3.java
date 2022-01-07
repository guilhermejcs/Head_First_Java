package cap4.pag66;

public class Mix4_3 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4_3[] m4a = new Mix4_3[20];
        int x = 0;

        while (x<7){
            m4a[x] = new Mix4_3();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x +1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

    public int maybeNew(int index){
        if (index<7){
            Mix4_3 m4 = new Mix4_3();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
/*
RESPOSTA: 14 1
 */
