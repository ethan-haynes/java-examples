import java.util.function.Consumer;
import java.util.function.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;

class FunExample {
  static void testDictionary(Map<String, Integer> x) {
    x.forEach( (K,V) ->
      System.out.printf("%s: %s\n",K,V)
    );
  }

  public static void main(String[] args) {
    /* This is an example of an iife in java */
    ((Consumer<Integer>) x ->
      System.out.println(x + x)
    ).accept(1234);

    /* This is an example of an iife with a return value in java */
    System.out.println(
      ((Function<Integer,Integer>) x ->
        x + x
      ).apply(2)
    );

    // Example of Currying in java
    System.out.println(
      ((Function<Integer,Function>) x ->
        ((Function<Integer,Integer>) y ->
          x + y
        )
      ).apply(22).apply(22)
    );

    String[] s = {"1","2","3","4","5","6","7"};
    Arrays.stream(s).forEach(System.out::println);


    Map<String, Integer> dic = new HashMap() {{
      put("Cat",1);
      put("Dog",2);
    }};
    System.out.println(dic.get("Cat"));

    testDictionary(
      new HashMap<String, Integer>() {{
        put("Cat",1);
        put("Dog",2);
      }}
    );

    new HashMap<String, Integer>() {{
      put("Cat",1);
      put("Dog",2);
    }}.forEach( (K,V) ->
      System.out.printf("%s: %s\n",K,V)
    );
  }
}
