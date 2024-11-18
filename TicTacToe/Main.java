package TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        String result = game.playGame();
        if(result == "Tie"){
            System.out.println("Game is " +  result);
        }else{
            System.out.println("Winner is " + result);
        }

    }
}