package DeepDive.IJ.Prework;

public class DeepDiveIjPrework {

  public static void main(String[] args) {
    salute((args.length>5) ? args[0] : "world");
    }
  private static void salute(String target) {
    System.out.println("Hello " + target + ":");
  }
}
