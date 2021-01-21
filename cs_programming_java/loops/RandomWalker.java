public class RandomWalker {
  public static void main(String[]args) {
    int r = Integer.parseInt(args[0]);

    boolean stop = false;
    int x = 0;
    int y = 0;
    int steeps = 0;

    while (!stop && r > 0) {
      int randomDirection = (int) (Math.random()*4);

      System.out.println("(" + x + ", " + y + ")");

      switch (randomDirection) {
        case 0:
          y++;
          break;
        case 1:
          x++;
          break;
        case 2:
          y--;
          break;
        case 3:
          x--;
          break;
      }

      if (Math.abs(x) + Math.abs(y) == r) {
        stop = true;
      }

      steeps++;
    }

    System.out.println("(" + x + ", " + y + ")");

    System.out.println("steps = " + steeps);
  }
}