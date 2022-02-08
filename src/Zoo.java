import java.util.ArrayList;
import java.util.List;

public class Zoo {

  static ArrayList<Bird> birds = new ArrayList<>();

  /**
   * Feeds different bird sections of the zoo.
   *
   */
  public static void feed() {
    System.out.println("Feeding birds");
    for (Bird bird: birds){
      bird.eat();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting a bird to a section");
    bird.checkWings();
    list.add(bird);
    System.out.println(bird);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    for (Bird bird: birds) {
      System.out.println(bird);
    }
  }
}