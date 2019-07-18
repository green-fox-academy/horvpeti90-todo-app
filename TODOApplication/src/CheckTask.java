import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckTask {
  public static void checkTheTask(String number) {
    Path filePath = Paths.get("tasks.txt");
    try {
      List<String> todos = Files.readAllLines(filePath);
      if (todos.size() > Integer.parseInt(number) - 1) {
        todos.set(Integer.parseInt(number) - 1,"[X] " + todos.get(Integer.parseInt(number)-1).substring(4));
        Files.write(filePath, todos);
      }
      else {
        System.out.println("Unable to check: index is out of bound");
      }
    }
    catch (Exception e) {
      System.out.println("Unable to check: index is not a number");
    }
  }
}
