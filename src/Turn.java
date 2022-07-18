import java.util.Random;
import java.util.Scanner;

public class Turn {


    Board board = new Board();

    Scanner sc = new Scanner(System.in);

    public void playerInput(Board board, Player player_1, Player player_2) {

        char marker = ' ';

        while (marker != 'X' && marker != 'x' && marker != 'O' && marker != 'o') {
            marker = sc.next().charAt(0);
            if (Character.toUpperCase(marker) == 'X') {
                player_1.setMarker('X');
                player_2.setMarker('O');
            } else if (Character.toUpperCase(marker) == 'O') {
                player_1.setMarker('O');
                player_2.setMarker('X');

            } else
                System.out.println("Error: Please Enter 'X' or 'O':/");

        }
        System.out.println("Player 1 -> '" + player_1.getMarker() + "' as marker.");
        System.out.println("Player 2 -> '" + player_2.getMarker() + "' as marker.");
    }


    public boolean playGame() {

        Character response = ' ';
        while (response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
            response = sc.next().charAt(0);
            if (Character.toUpperCase(response) == 'Y') {
                return true;

            } else if (Character.toUpperCase(response) == 'N') {
                return false;
            }
            System.err.println("ERROR: Enter 'Y' or 'N' Only :/");
        }

        return false;
    }


    public String whosTurn() {

        Random rd = new Random();
        int flip = rd.nextInt(1) + 0;

        if (flip == 0)
            return "Player_1";
        else
            return "Player_2";
    }


    public boolean replay() {
        Character replay = ' ';
        while (replay != 'Y' && replay != 'y' && replay != 'N' && replay != 'n') {
            replay = sc.next().charAt(0);
            if (Character.toUpperCase(replay) == 'Y') {
                return true;

            } else if (Character.toUpperCase(replay) == 'N') {
                return false;
            }
        }

        return false;
    }


    public int choosePosition(int position) {

        return position = (int) sc.nextInt();

    }

    public int botPosition(int position) {
        Random random = new Random();
        int iaTurn = 0+random.nextInt(8);

        return iaTurn;
    }
}
