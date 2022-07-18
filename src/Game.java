public class Game {

    private static Player p1 = new Player();

    private static Player p2 = new Player();
    private static Board board = new Board();

    protected static boolean ON;

    private static int position;


    public void startTicTacToe() {
        Turn pc = new Turn();


        System.out.println("TIC TAC TOE!!\n");
        board.showBoardMapped(board);
        ;
        while (true) {

            pc = new Turn();

            System.out.println("Player1, choose your mark ('X' or ''O): ");

            pc.playerInput(board, p1, p2);

            System.out.println("\nFlipping a dice...\n");

            String whosTurn = pc.whosTurn();

            System.out.println("The first to play is: " + whosTurn);

            System.out.println("Are you ready?");

            ON = pc.playGame();

            while (ON) {

                if (whosTurn == "Player_1") {

                    System.out.println("Player_1 Turn!");

                    board.showBoard(board);

                    System.out.println("\nPlease, Choose the position (Range 0-8): ");

                    position = pc.choosePosition(position);

                    board.placeMark(board, p1, position);

                    if (board.winCheck(board, p1)) {
                        board.showBoard(board);
                        System.out.println("Player_1 Has Won....Congratulation!!");
                        ON = false;
                    } else if (board.boardCheck(board)) {
                        board.showBoard(board);
                        System.out.println("TIE!");
                        ON = false;
                    } else
                        whosTurn = "Player_2";

                } else if (whosTurn == "Player_2") {

                    System.out.println("Player_2 Turn!");

                    board.showBoard(board);

                    System.out.println("\nWait please!! Bot is playing...");
                    position = pc.botPosition(position);

                    board.placeMark(board, p2, position);

                    if (board.winCheck(board, p2)) {
                        board.showBoard(board);
                        System.out.println("Player_2 Has Won.. Congratulation!!");
                        ON = false;
                    } else if (board.boardCheck(board)) {
                        board.showBoard(board);
                        System.out.println("TIE!");
                        ON = false;
                    } else
                        whosTurn = "Player_1";
                }
            }

            System.out.println("\nPlay Again? 'Y' or 'N'?");

            if (ON = pc.replay()) {
                board.cleanBoard(board);
                System.out.println("Game = " +ON);
                ON = true;
            } else {
                System.out.println("Bye!!");
                break;
            }
        }
    }
}
