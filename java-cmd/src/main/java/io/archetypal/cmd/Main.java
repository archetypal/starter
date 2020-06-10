package io.archetypal.cmd;

import java.io.IOException;
import java.io.PrintStream;

import io.archetypal.example.Example;

/**
 * Interpret command line arguments and call Example.run().
 */
public class Main {

  /**
   * Send fatal message to System.err
   * 
   * @param message
   * @param status
   * 
   * @throws IOException
   */
  public static void fatal(String message, int status) throws IOException {
    System.err.println("fatal: " + message);
    System.err.println();
    help(System.err);
    System.exit(status);
  }

  /**
   * Emit help text to print stream. 
   * 
   * @param out
   * @throws IOException
   */
  public static void help(PrintStream out) throws IOException {
    out.println("usage: java -jar example.jar [<options>]");
    out.println();
    out.println("  -h    help text");
  }

  public static void main(String[] args) throws IOException {

    String something = null;
 
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      switch (arg) {
        case "-h":
          help(System.out);
          System.exit(0);
        default:
          if (something == null) {
            something = arg;
            continue;
          }
          fatal("Too many arguments", 6);
      }
    }

    // if (something == null) {
    //   fatal("You must specify something.", 1);
    // }

    System.exit(Example.Run(something));
  }

}
