import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This Class defines winning condition for the game.
 * as well as to check if there is a winner or not.
 * The condition for winner is saved in List.
 * This List is iterated in pveWinner() to check winner of player against
 * computer match.
 * 
 **/
public class GameWinner {

    private final int MAX_MOVE = 9;
    static ArrayList<Integer> playerMoves = new ArrayList<Integer>();
    static ArrayList<Integer> computersMoves = new ArrayList<Integer>();
    static final int totalMoves = playerMoves.size() + computersMoves.size();

    /**
     * returns boolean from pveWinner().
     */
    public boolean checkWinner() {
        return pveWinner();
    }

    /**
     * Saves all the requirments to win a game in List.
     */
    private List<List<Integer>> winnerCondition() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> bottomRow = Arrays.asList(7, 8, 9);
        List<Integer> firstColumn = Arrays.asList(1, 4, 7);
        List<Integer> midColumn = Arrays.asList(2, 5, 8);
        List<Integer> lastColumn = Arrays.asList(3, 6, 9);
        List<Integer> diagonal = Arrays.asList(1, 5, 9);
        List<Integer> reverseDiagonal = Arrays.asList(3, 5, 7);

        List<List<Integer>> winCondition = new ArrayList<List<Integer>>();

        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(bottomRow);
        winCondition.add(firstColumn);
        winCondition.add(midColumn);
        winCondition.add(lastColumn);
        winCondition.add(diagonal);
        winCondition.add(reverseDiagonal);

        return winCondition;
    }

    /**
     * Iterates over the List of winner requirments.
     * returns true if there is a winner or the game is draw.
     */
    private boolean pveWinner() {

        List<List<Integer>> winCondition = winnerCondition();
        for (List<Integer> list : winCondition) {
            if (playerMoves.containsAll(list)) {
                System.out.println("You Won!");
                return true; // TODO print name is possible
            } else if (computersMoves.containsAll(list)) {
                System.out.println("Computer Won!");
                return true;
            } else if (totalMoves == MAX_MOVE) {
                System.out.println("Draw");
                return true;
            }
        }
        return false;
    }
    /* EOF */
}