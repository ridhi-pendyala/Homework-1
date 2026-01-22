import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        String SONNET = """ 
                Two households, both alike in dignity,
                In fair Verona, where we lay our scene,
                From ancient grudge break to new mutiny,
                Where civil blood makes civil hands unclean.
                From forth the fatal loins of these two foes
                A pair of star-cross’d lovers take their life;
                Whose misadventured piteous overthrows
                Do with their death bury their parents’ strife.
                The fearful passage of their death-mark’d love,
                And the continuance of their parents’ rage,
                Which, but their children’s end, nought could remove,
                Is now the two hours’ traffic of our stage;
                The which if you with patient ears attend,
                What here shall miss, our toil shall strive to mend.""";

            int correct = 0;
            int incorrect = 0;
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            //sonnet broken up by spaces, but keeping punctuation attached to the closest word
            String[] words = SONNET.split(" ");



            while (correct < 3 && incorrect < 3) {

                int stop = random.nextInt(words.length);

               //removes the punctuation, but keeps apostrophe and -, which are used in the words
                //String correctWord = words[stop].replaceAll("[\\p{Punct}&&[^’'-]]", "");
                Prithee test = new Prithee(words, stop);
                String correctWord = test.getWord().replaceAll("[\\p{Punct}&&[^’'-]]", "");

                for (int i = 0; i < stop; i++) {
                    System.out.print(words[i] + " ");
                }
                System.out.println("_____");

                System.out.print("What word comes next? ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase(correctWord)) {
                    System.out.println("That was correct!\n");
                    correct++;
                } else {
                    System.out.println("\nThat was incorrect.\nThe correct word was: " + correctWord + "\n");
                    incorrect++;
                }

            }
            scanner.close();


    }
}
