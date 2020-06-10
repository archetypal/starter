package io.archetypal.example;

public class Example {

  public static String hello(String something) {
    return "Hello, " + (something == null ? "World" : something);
  }

  /**
   * Run the example and return the desired exit code.
   * 
   * @return
   */
  public static int Run(String something) {
    System.out.println(hello(something));
    return 0;
  }

}
