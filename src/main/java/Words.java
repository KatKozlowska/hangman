import java.util.ArrayList;
import java.util.List;

public class Words {

  private static String word;

  private static final List<String> words = new ArrayList<>();

  static {
    words.add("SUPERFLUOUS");
    words.add("QUACK");
    words.add("BOOKKEEPER");
    words.add("SWIVEL");
    words.add("ROCK");
    words.add("LADYBUG");
    words.add("OXYGEN");
    words.add("ZIPPER");
    words.add("FUNNY");
    words.add("JELLY");
    words.add("PNEUMONIA");
    words.add("CATCH");
    words.add("STRETCH");
  }

  // gives one instance of word
  public static String getWord() {
    if (word == null) {
      return generateWord();
    }
    return word;
  }

  public static String generateWord() {
    int random = (int) (Math.random() * words.size());
    word = words.get(random);
    return word;
  }
}
