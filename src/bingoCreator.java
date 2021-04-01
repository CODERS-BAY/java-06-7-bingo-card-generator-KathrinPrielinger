import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class bingoCreator {
    public static void main(String[] args) {

        writeBingo();

        String[][] bingoNumbers = new String[5][5];

        //Array mit Zahlen füllen
        int randomNumber;

        for (int i = 0; i < bingoNumbers.length; i++) {
            for (int j = 0; j < bingoNumbers[i].length; j++) {

                bingoNumbers[i][j] = fillColumns(bingoNumbers, i, j, 1, 15);

                bingoNumbers[i][j] = fillColumns(bingoNumbers, i, j, 16, 30);

                bingoNumbers[i][j] = fillColumns(bingoNumbers, i, j, 31, 45);

                bingoNumbers[i][j] = fillColumns(bingoNumbers, i, j, 46, 60);

                bingoNumbers[i][j] = fillColumns(bingoNumbers, i, j, 61, 75);

                //Stelle durch "  " ersetzen
                bingoNumbers[2][2] = "  ";

                System.out.print(bingoNumbers[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void writeBingo() {
        String bingo[] = {"B |", "I |", "N |", "G |", "O |"};

        for (int i = 0; i < bingo.length; i++){
            System.out.print(bingo[i]);
        }
        System.out.println();
    }

    public static String fillColumns(String[][] bingoNumbers, int i, int j, int min, int max) {
        int randomNumber;
        if (j == 0) {
            randomNumber = ThreadLocalRandom.current().nextInt(min, max);

            //randomNumber formatieren
            String formattedRandomNumber = String.format("%2d", randomNumber);
            //randomNumber in Array bingoNumbers speichern
            bingoNumbers[i][j] = formattedRandomNumber;
        }
        return bingoNumbers[i][j];
    }
}