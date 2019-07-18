
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskListReader {
  public static void taskList() {
    Path filePath = Paths.get("tasks.txt");
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
}
