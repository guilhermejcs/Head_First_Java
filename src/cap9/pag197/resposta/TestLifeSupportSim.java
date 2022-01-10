package cap9.pag197.resposta;

import java.util.ArrayList;

class V2Radiator{
    V2Radiator(ArrayList list){
        for (int x = 0; x<5; x++){
            list.add(new SimUnit("V2Radiator"));
        }
    }
}

class V3Radiator /*extends V2Radiator*/ {
    V3Radiator(ArrayList lglist){
        // super(lglist);
        for (int g = 0; g<10; g++){
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot{
    RetentionBot(ArrayList rlist){
        rlist.add(new SimUnit("Retention"));
    }
}

public class TestLifeSupportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z=0; z<20; z++){
            RetentionBot ret = new RetentionBot(aList);
        }

        System.out.println("V2Radiator: " + SimUnit.v2);
        System.out.println("V3Radiator: " + SimUnit.v3);
        System.out.println("Retention:  " + SimUnit.ret);
        System.out.println("Emergia:    " + SimUnit.energia);


    }
}

class SimUnit{
    String botType;

    SimUnit(String type){
        botType = type;
        contador(type);
        energ(type);
    }



    int powerUse(){
        if ("Retention".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }

    // Contador de instâncias
    static int v2;
    static int v3;
    static int ret;

    private void contador(String type) {
        switch (type){
            case "V2Radiator":
                v2++;
                break;
            case "V3Radiator":
                v3++;
                break;
            case "Retention":
                ret++;
                break;
        }
    }

    // Energia utilizada
    static int energia;
    private void energ(String type){
        energia += powerUse();
    }
}