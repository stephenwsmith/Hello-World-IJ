package DeepDive.IJ.Prework;

public class DeepDiveIjPrework {

  public static void main(String[] args) {
    if (args.length > 0) {
      salute(args[0]);
    } else {

      salute(target,"Hey, It worked!");
    }
  }
  private static void salute(String target) {
    System.out.println("Hello" + target + ":");
  }
}
