import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<Character> guesses;
    private int livesLeft;
    private final String word;

    private  String hiddenWord;

    public Game() {
        this.guesses = new ArrayList<>();
        this.livesLeft = 10;
        this.word = Words.generateWord();
        this.hiddenWord= new String(new char[word.length()]).replace("\0", "_");
    }

    public List<Character> getGuesses() {
        return guesses;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String guess(char guess){
        if(guesses.contains(guess)){
            return "You have already guessed this character";
        } else if (!word.contains(String.valueOf(guess))){
            livesLeft--;
            guesses.add(guess);
            return "Incorrect guess. You hav lost a life.";
        }
        guesses.add(guess);
        StringBuilder sb = new StringBuilder();
        for (char c: word.toCharArray()){
            if (guesses.contains(c)) {
                sb.append(c);
            }else {
                sb.append("_");
            }
        }
        hiddenWord = sb.toString();
        return "You have guessed correctly";
    }

    public boolean isRunning(){
        return !hasLost() && !hasWon();
    }

    public boolean hasLost(){
        return livesLeft <= 0;
    }

    public boolean hasWon(){
        return !hiddenWord.contains("_");
    }
}
