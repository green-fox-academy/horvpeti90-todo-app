import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveArg {
  public static void removearg(String number) {
    Path filePath = Paths.get("tasks.txt");
    try {
      List<String> todos = Files.readAllLines(filePath);
      if (todos.size() > Integer.parseInt(number) - 1) {
        todos.remove(Integer.parseInt(number) - 1);
        Files.write(filePath, todos);
      }
      else {
        System.out.println("Unable to remove: index is out of bound");
      }
    }
    catch (Exception e) {
      System.out.println("Unable to remove: index is not a number");
    }
  }
}
