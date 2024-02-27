import java.util.Scanner;

/**
 * class for player. This class contains the player information.
 */
public class Player {
    
    private String playerName;
    private char playerId;
    private char playerSymbol;
    private Scanner scanner = new Scanner(System.in);

    /**
     * getter for Player Name
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * player name setter
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * player ID getter
     */
    public char getPlayerId() {
        return playerId;
    }

    /**
     * player ID setter
     */
    public void setPlayerId(char playerId) {
        this.playerId = playerId;
    }

    /**
     * player Symbol getter
     */
    public char getPlayerSymbol() {
        return playerSymbol;
    }

    /**
     * player Symbol setter
     */
    public void setPlayerSymbol(char playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    /**
     * Ask for player name
     */
    public void playerInfo() {
        System.out.print("Player " + playerId + " user name: ");
        playerName = scanner.nextLine();
        System.out.println("Player Name: " + playerName);
    }
}