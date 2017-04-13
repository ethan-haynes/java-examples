import java.util.function.Consumer;
import java.util.function.Function;

class FunExample {
  public static void main(String[] args) {
    /* This is an example of an iife in java */
    ((Consumer<Integer>) y ->
      System.out.println(y + y)
    ).accept(1234);

    /* This is an example of an iife with a return value in java */
    System.out.println(
      ((Function<Integer,Integer>) y ->
        y + y
      ).apply(2)
    );
  }
}
