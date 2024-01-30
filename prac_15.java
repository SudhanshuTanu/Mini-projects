import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int guesses = 0;
    public int inputnumber;

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeUserInput() {
        System.out.println("Guess the no.. betweeen 0 to 100 ");
        try (Scanner sc = new Scanner(System.in)) {
            inputnumber = sc.nextInt();
        }
    }

    boolean isCorrect() {
        guesses++;
        if (inputnumber == number) {
            System.out.printf("You guessed it in %d attempts", guesses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("Enter HIgher number please");
        } else if (inputnumber > number) {
            System.out.println("Enter lower number please");
        }
        return false;

    }
}

public class prac_15 {
    public static void main(String[] args) {
        System.out.println("guess the no. game ! ");
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}
