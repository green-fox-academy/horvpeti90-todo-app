
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    TaskListReader ListReader = new TaskListReader();
    ApplicationInfo info = new ApplicationInfo();
    if (args.length == 0) {
      info.appinfo();
    }
    if (args[0].equals("-l")) {
      ListReader.taskList();
    }
    if (args[0].equals("-a")) {

    }
  }
}



