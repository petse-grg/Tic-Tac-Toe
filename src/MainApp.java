
import java.util.Scanner;

/**
 * Main Class to start TicTacToe project.
 */

public class MainApp {

    /**
     *
     ** main method to start the application.
     ** application starts by asking user some information for the game.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pve to play against computer: ");
        String playerType = scanner.nextLine();
        System.out.println("Playing " + playerType);

        // Player vs Computer
        if (playerType.equalsIgnoreCase("pve")) {
            playerVsComputer(playerType);
        }
        scanner.close();
    }

    /**
     * creates a player object and board object.
     * Invokes play() method from BoardSetUp to start the game.
     * 
     * @param playerType
     */
    private static void playerVsComputer(String playerType) {
        Player firstPlayer = new Player();
        firstPlayer = new Player();
        firstPlayer.setPlayerId('1');
        firstPlayer.setPlayerSymbol('X');
        firstPlayer.playerInfo();

        Player[] players = new Player[] { firstPlayer };
        BoardSetUp computerBoard = new BoardSetUp(players);
        computerBoard.play();
    }
}