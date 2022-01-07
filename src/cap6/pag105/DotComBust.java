package cap6.pag105;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        // primeiro cria alguns objetos DotCom e fornece seus locais
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        System.out.println("Seu objetico é eliminar três dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Tente eliminar todas com o menor número de palpites");
        for (DotCom dotComToSet: dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // encerra o loop for
    } // encerra o método setUpGame

    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Insira um palpite");
            checUserGuess(userGuess);
        } // encerra o while
        finishGame();
    } // encerra o método startPlaying
    private void checUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "errado";
        for (DotCom dotComToTest : dotComsList){
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("correto")){
                break;
            }
            if (result.equals("eliminar")){
                dotComsList.remove(dotComToTest);
                break;
            }
        } // encerra for
        System.out.println(result);
    } // encerra o método

    private void finishGame(){
        System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto está vazio.");
        if (numOfGuesses <= 18){
            System.out.println("Você só usou " + numOfGuesses + " palpites.");
            System.out.println("Não haverá pesca com essas opções");
        }
    } // encerra o método

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    } // encerra o método
}
