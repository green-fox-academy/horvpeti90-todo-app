public class ApplicationInfo {
  public static void appinfo() {
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
