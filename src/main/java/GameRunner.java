public class GameRunner {

  private final Game game;
  private final ReaderWriter io;

  public GameRunner() {
    this.game = new Game();
    this.io = new ReaderWriter();
  }

  public void play() {
    while (game.isRunning()) {
      io.output(String.format("You have %d lives left", game.getLivesLeft()));
      io.output(String.format("Your guesses are %s", game.getGuesses()));
      io.output(game.getHiddenWord());
      io.output("Guess a letter");
      io.output(game.guess(io.readGuess()));
      if (game.hasLost()) {
        io.output(String.format("Whomp Whomp. You have lost. The word was %s.", Words.getWord()));
      } else if (game.hasWon()) {
        io.output(String.format("Congrats! The word was %s.", Words.getWord()));
      }
    }
  }
}
