package cap3.pag49.exercicio_b;

public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];
        int z = -1;

        while (z<2){ // toda matriz começa em 0
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z==1){
                h[z].name = "frodo";
            }
            if (z==2){
                h[z].name = "sam";
            }
            System.out.println(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }
}
