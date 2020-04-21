public class Board {
    int size = 8;
    String[][] grid = new String[size][size];

    public Board() {
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                grid[row][col] = "-";
            }
        }
    }

    public void printBoard() {
        System.out.println("Updated board:");
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.print("\n");
        }
    }


    public void makeMove(int col, String token) {

        for(int i = size-1; i >= 0; i--) {
            if(grid[i][col].equals("-")){
                grid[i][col] = token;
                break;
            }
        }

    }

    public boolean colHasRoom(int col) {
        if(grid[0][col].equals("-")) {
            return true;
        }
        return false;
    }

    public boolean checkWin(String token) {

        boolean v = checkWinVertical(token);
        boolean h = checkWinHorizontal(token);
        boolean d = checkWinDiagonal(token);

        return v || h || d;
    }

    public boolean checkWinVertical(String token) {

        for(int col = 0; col < 8; col++) {
            for(int row = 0; row < 5; row++){

                if(grid[row][col].equals(token) &&
                        grid[row+1][col].equals(token) &&
                        grid[row+2][col].equals(token) &&
                        grid[row+3][col].equals(token)) {
                        return true;
                }
            }
        }
        return false;
    }

    public boolean checkWinHorizontal(String token) {
        return false;
    }

    public boolean checkWinDiagonal(String token) {
        return false;
    }

}
