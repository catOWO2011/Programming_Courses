public class RandomWalkers {
  public static void main(String[]args) {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    boolean stop;
    int x;
    int y;
    int steeps;

    double average = 0;

    for (int t = 0; t < trials; t++) {
      stop = false;
      x = 0;
      y = 0;
      steeps = 0;
      while (!stop && r > 0) {
        int randomValue = (int) (Math.random()*4);

        switch (randomValue) {
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
      average += steeps;
    }

    average /= trials;

    System.out.println("average number of steps = " + average);
  }
}