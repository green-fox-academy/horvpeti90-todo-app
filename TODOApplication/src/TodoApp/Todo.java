package TodoApp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Todo {
  public static void main(String[] args) {
    if (args.length == 0 ) {
      applicationinfo();
    }
     if (args [0].equals("-l")) {
       tasklist();
     }
  }

  private static void tasklist() {
    Path filePath = Paths.get()

  }

  private static void applicationinfo() {
    String headerline = "Command Line Todo application";
    System.out.println(headerline);
    for (int i = 0; i <headerline.length() ; i++) {
      System.out.print("=");
    }
    String mainline ="\nCommand line arguments:\n";
    String linel ="-l  Lists all the tasks\n";
    String linea = "-a  Adds a new task\n";
    String liner = "-r   Removes an task\n";
    String linec = "-c   Completes an task\n";

    System.out.println(mainline + linel + linea + liner + linec);


  }
}
