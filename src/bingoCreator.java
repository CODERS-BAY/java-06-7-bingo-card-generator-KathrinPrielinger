import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class bingoCreator {
    public static void main(String[] args) {

        String bingo[] = {"B |", "I |", "N |", "G |", "O |"};

        for (int i = 0; i < bingo.length; i++){
            System.out.print(bingo[i]);
        }
        System.out.println();

        String[][] bingoNumbers = new String[5][5];

        //Array mit Zahlen füllen
        int randomNumber;

        for (int i = 0; i < bingoNumbers.length; i++) {
            for (int j = 0; j < bingoNumbers[i].length; j++) {

                if (j == 0) {
                    randomNumber = ThreadLocalRandom.current().nextInt(1, 15);

                    //randomNumber formatieren
                    String formattedRandomNumber = String.format("%2d", randomNumber);
                    //randomNumber in Array bingoNumbers speichern
                    bingoNumbers[i][j] = formattedRandomNumber;
                }
                if (j == 1) {
                    randomNumber = ThreadLocalRandom.current().nextInt(16, 30);
                    //randomNumber in Array bingoNumbers speichern
                    bingoNumbers[i][j] = Integer.toString(randomNumber);
                }
                if (j == 2) {
                    randomNumber = ThreadLocalRandom.current().nextInt(31, 45);
                    //randomNumber in Array bingoNumbers speichern
                    bingoNumbers[i][j] = Integer.toString(randomNumber);
                }
                if (j == 3) {
                    randomNumber = ThreadLocalRandom.current().nextInt(46, 60);
                    //randomNumber in Array bingoNumbers speichern
                    bingoNumbers[i][j] = Integer.toString(randomNumber);
                }
                if (j == 4) {
                    randomNumber = ThreadLocalRandom.current().nextInt(61, 75);
                    //randomNumber in Array bingoNumbers speichern
                    bingoNumbers[i][j] = Integer.toString(randomNumber);
                }

                //Stelle durch "  " ersetzen
                bingoNumbers[2][2] = "  ";

                System.out.print(bingoNumbers[i][j] + "|");
            }
            System.out.println();
        }
    }
}