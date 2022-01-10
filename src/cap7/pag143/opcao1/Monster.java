package cap7.pag143.opcao1;

public class Monster {
    boolean frighten(int d){
        System.out.println("arrrgh");
        return true;
    }
}

class  Vampire extends Monster{
    boolean frighten(int x){
        System.out.println("a bite?");
        return false;
    }
}

class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("breath fire");
        return true;
    }
}

class MonsterTestDrive{
    public static void main(String[] args) {
        Monster[] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(int x = 0; x < 3; x++){
            ma[x].frighten(x);
        }
    }
}
/*
RESPOSTA:
a bite?
breath fire
arrrgh
 */