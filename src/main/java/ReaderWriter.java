import java.util.Scanner;

public class ReaderWriter {

    // there is only ever one scanner
    private final Scanner scanner;


    public ReaderWriter() {
        this.scanner = new Scanner(System.in);

    }

    // youre only allowed to type in one letter at a time
    // will always return an uppercase letter 
    public char readGuess(){
       Character guess = null;
       while(guess == null){
           String input = scanner.next();
           if(input.length() == 1){
                    guess = input.toUpperCase().charAt(0);
           } else {
                output("Invalid input! Try again.");
           }
       }
       return guess;
    }

    public void output(String output){
        System.out.println(output);
    }
}
