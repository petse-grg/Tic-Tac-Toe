/*
 * This class validates if a player move or 
 * computer move is placed on valid spot of the arrays.
 * 
 */
public class ValidatePlacement {

    /**
     * Mark the moves.
     * 
     * @param board
     * @param symbol
     * @param position
     */
    public void move(char[][] board, char symbol, int position) {
        switch (position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }

    /**
     * validates player move and computer move.
     * 
     * @param board
     * @param position
     * @return boolean value.
     */
    public boolean isValidMove(char[][] board, int position) {
        switch (position) {
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][2] == ' ');
            case 3:
                return (board[0][4] == ' ');
            case 4:
                return (board[2][0] == ' ');
            case 5:
                return (board[2][2] == ' ');
            case 6:
                return (board[2][4] == ' ');
            case 7:
                return (board[4][0] == ' ');
            case 8:
                return (board[4][2] == ' ');
            case 9:
                return (board[4][4] == ' ');
            default:
                return false;
        }
    }
    /* EOF */
}
