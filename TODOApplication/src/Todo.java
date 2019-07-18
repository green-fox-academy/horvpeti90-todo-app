
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    TaskListReader ListReader = new TaskListReader();
    ApplicationInfo info = new ApplicationInfo();
    NewTaskAdder addtask = new NewTaskAdder();
    RemoveArg removetodos = new RemoveArg();

    if (args.length == 0) {
      info.appinfo();
    }
    else if (args[0].equals("-l")) {
      ListReader.taskList();
    }
    else if (args[0].equals("-a")) {
      if (args.length == 2){
        addtask.taskadder(args[1]);
      }
      else {
        System.out.println("Unable to add: no task provided");
      }
    }
    else if (args[0].equals("-r"));{
      if (args.length == 2) {
        removetodos.removearg(args[1]);
      }
      else {
        System.out.println("Unable to remove: no index provided");
      }
      }
  }
}




