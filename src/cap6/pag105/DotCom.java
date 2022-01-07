package cap6.pag105;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput) {

        String result = "errado";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "eliminar";
            } else {
                result = "correto";
            } // encerra if
        } // encerra a instrução if externa
        return result;
    } // fecha o método
} // fecha a classe
