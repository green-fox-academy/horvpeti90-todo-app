import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewTaskAdder {
  public static void taskadder(String add) {
    Path filePath = Paths.get("D:\\green fox\\greenfox\\horvpeti90todoapp\\TODOApplication\\src\\tasks.txt");
    try {
      List<String> todos = Files.readAllLines(filePath);
      todos.add(add);


    } catch (IOException e) {

    }
  }
}
