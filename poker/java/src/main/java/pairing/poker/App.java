package pairing.poker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  private static final Logger log = LoggerFactory.getLogger(App.class);

  public String getGreeting() {
    return "I'll compare poker hands when I grow up!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }

}
