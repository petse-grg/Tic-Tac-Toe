
import java.util.Random;
import java.util.Scanner;

/**
 * This class initializes tic tac toe board.
 * Currently, the board is designed to play against computer.
 * Computer moves are manipulated using java.util.Random library.
 * Also most of the components(instance variable and methods) are written to fit
 * a implementation of 2 players game.
 **/

public class BoardSetUp {

    private final char[][] board = { { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' } };

    private final char COMPUTER_SYMBOL = 'O';
    private int playerMove;
    private int computerMove;

    ValidatePlacement moveValidation = new ValidatePlacement();
    Scanner scanner = new Scanner(System.in);
    Player[] player = new Player[] {};

    /**
     * Constructor.
     * 
     * @param player array of player.
     *               //used arrays of Player to implement 2 players later.
     */
    public BoardSetUp(Player[] player) {
        initializeBoard(board);
        this.player = player;
    }

    /**
     * Prints the tictactoe board.
     * 
     * @param board to display board on console.
     */
    public void initializeBoard(char[][] board) {
        for (char[] row : board) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    /**
     * Allow a player and a computer to start the game.
     */
    public void play() {
        while (!isGameOver(board)) {
            playerTurn(board);
            if (isGameOver(board)) {
                break;
            }
            computerTurn(board);
            if (isGameOver(board)) {
                break;
            }
        }
    }

    /**
     * Prints the player symbol on the board and check if the move is valid.
     * 
     * @param board for the player to place its symbol.
     */
    public void playerTurn(char[][] board) {
        while (true) {
            System.out.println("Where would you like to play? (1-9)");
            playerMove = scanner.nextInt();
            if (moveValidation.isValidMove(board, playerMove)) {
                break;
            } else {
                System.out.println("Invalid move " + player[0].getPlayerName());
            }
        }
        moveValidation.move(board, player[0].getPlayerSymbol(), playerMove);
        initializeBoard(board);
        GameWinner.playerMoves.add(playerMove);
    }

    /**
     * Prints the player symbol on the board and check if the move is valid.
     * 
     * @param board for the computer to place its symbol.
     */
    public void computerTurn(char[][] board) {
        Random rand = new Random();
        while (true) {
            computerMove = rand.nextInt(9) + 1;
            if (moveValidation.isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer chose " + computerMove);
        moveValidation.move(board, COMPUTER_SYMBOL, computerMove);
        initializeBoard(board);
        GameWinner.computersMoves.add(computerMove);
    }

    /**
     * returns true if the game is ended.
     * 
     * @param board for the computer to place its symbol.
     */
    public boolean isGameOver(char[][] board) {
        GameWinner isGameEnded = new GameWinner();
        boolean flag = isGameEnded.checkWinner();
        if (flag) {
            return flag;
        }
        return flag;
    }
}
