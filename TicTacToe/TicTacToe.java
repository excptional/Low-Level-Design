package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {

    Deque<Player> players;
    Board gameboard;

    TicTacToe() {
        players = new LinkedList<Player>();
        players.add(new Player("Player1", new PieceX()));
        players.add(new Player("Player2", new PiecesO()));

        gameboard = new Board(3);

    }

    public String playGame() {

        boolean isPlaying = true;

        while(isPlaying) {
            Player currentPlayer = players.remove();
            gameboard.printBoard();

            if(!gameboard.getFreeCells()) {
                isPlaying = false;
                continue;
            }

            System.out.print(currentPlayer.name + " -> Enter Position: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);

            boolean isValidMove;
            if( x >= gameboard.size || y >= gameboard.size) {
                isValidMove = false;
            }else {
                isValidMove = gameboard.addAtPosition(x, y, currentPlayer.piece);
            }

            if(!isValidMove) {
                System.out.println("Enter valid position to play your move");
                players.addFirst(currentPlayer);
                continue;
            }

            players.addLast(currentPlayer);

            if(isWin(x, y, currentPlayer.piece.pieceType)) {
                return currentPlayer.name;
            }

        }

        return "";
    }

    boolean isWin(int x, int y, PieceType pieceType) {
        boolean isrow = true;
        boolean isColumn = true;
        boolean isDiagonal = true;
        boolean isAntiDiagonal = true;
        for(int i = 0;i<gameboard.size;i++){
            if(gameboard.board[x][i] == null || gameboard.board[x][i].pieceType != pieceType){
                isrow = false;
            }
        }
        for(int i = 0;i<gameboard.size;i++){
            if(gameboard.board[i][y] == null || gameboard.board[i][y].pieceType != pieceType){
                isColumn = false;
            }
        }
        for(int i = 0,j=0;i<gameboard.size;i++,j++){
            if(gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType){
                isDiagonal = false;
            }
        }
        for(int i = 0,j= gameboard.size-1;i< gameboard.size;i++,j--){
            if(gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType){
                isAntiDiagonal = false;
            }
        }
        return isrow || isColumn || isDiagonal || isAntiDiagonal;
    }

}
