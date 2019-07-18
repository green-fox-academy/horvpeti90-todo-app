package TodoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    if (args.length == 0 ) {
      applicationinfo();
    }
     if (args [0].equals("-l")) {
       taskList();
     }
     if (args [0].equals("-a")) {

     }
  }

  private static void taskList() {
    Path filePath = Paths.get("D:\\green fox\\greenfox\\horvpeti90todoapp\\TODOApplication\\src\\tasks.txt");
    try {
      List<String> todos = Files.readAllLines(filePath);

      if (todos.size()== 0){
        System.out.println("No todos for today!:)");
      }
      else {
        for (int i = 0; i < todos.size(); i++) {
          System.out.println(i + 1 + " - " + todos.get(i));
        }
      }
    } catch (IOException e) {
      System.out.println("Error");
    }
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
