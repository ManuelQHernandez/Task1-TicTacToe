public class Board {
    private int[] matrix = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    public void showBoardMapped(Board board) {
        for (int i = 0; i < board.matrix.length; i++) {
            System.out.print("|");
            System.out.print(i);
            if (i == 2)
                System.out.println("| ");
            if (i == 5)
                System.out.println("| ");
        }
        System.out.println("|");
        System.out.println();
    }

    public void cleanBoard(Board board) {

        for (int i = 0; i < board.matrix.length; i++) {
            System.out.print("|");
            System.out.print(" ");
            if (i == 2)
                System.out.println("| ");
            if (i == 5)
                System.out.println("| ");
        }
        System.out.println("|");
        System.out.println();
        board.matrix = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }

    public void showBoard(Board board) {
        for (int i=0; i < board.matrix.length; i++) {
            System.out.print('|');
            if (board.matrix[i] ==88)
                System.out.print('X');
            if (board.matrix[i] ==79)
                System.out.print('O');
            if (board.matrix[i] == -1)
                System.out.print(" ");
            if (i == 2)
                System.out.println('|');
            if (i == 5)
                System.out.println('|');
        }
        System.out.println('|');
        System.out.println();
    }

    public void placeMark(Board board, Player player, int position) {

        if (spaceCheck(board, position)) {
            board.matrix[position] = (char) player.getMarker();
        } else {
            System.err.println("Unavailable number!!");
        }

    }


    public boolean winCheck(Board board, Player player) {

        if (matrix[0] == player.getMarker() && (matrix[1] == player.getMarker()) && matrix[2] == player.getMarker())
            return true;
        if (matrix[3] == player.getMarker() && (matrix[4] == player.getMarker()) && matrix[5] == player.getMarker())
            return true;
        if (matrix[6] == player.getMarker() && (matrix[7] == player.getMarker()) && matrix[8] == player.getMarker())
            return true;

        if (matrix[0] == player.getMarker() && (matrix[3] == player.getMarker()) && matrix[6] == player.getMarker())
            return true;
        if (matrix[1] == player.getMarker() && (matrix[4] == player.getMarker()) && matrix[7] == player.getMarker())
            return true;
        if (matrix[2] == player.getMarker() && (matrix[5] == player.getMarker()) && matrix[8] == player.getMarker())
            return true;

        if (matrix[0] == player.getMarker() && (matrix[4] == player.getMarker()) && matrix[8] == player.getMarker())
            return true;
        if (matrix[2] == player.getMarker() && (matrix[4] == player.getMarker()) && matrix[6] == player.getMarker())
            return true;
        else
            return false;
    }


    public boolean spaceCheck(Board board, int position) {

        return (board.matrix[position] == -1);
    }

    public boolean boardCheck(Board board) {
        for (int i = 0; i < board.matrix.length; i++) {
            if (spaceCheck(board, i))
                return false;
        }
        return true;
    }
}
