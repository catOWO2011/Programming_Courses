public class DiscreteDistribution {
  public static void main(String[]arg) {
    int m = Integer.parseInt(arg[0]);
    
    int n = arg.length - 1;

    int [] S = new int[n + 1];
    S[0] = 0;
    // Fill S with cumulative sums
    for (int i = 1; i <= n; i++) {
      S[i] = S[i - 1] + Integer.parseInt(arg[i]);
    }

    int r;

    boolean found;
    int idx;
    
    for (int i = 0; i < m; i++) {
      r = (int) (Math.random()* S[n]);
      found = false;
      idx = 1;
      while (idx <= n && !found) {
        if (S[idx] > r) {
          found = true;
        } else {
           idx++;
        }
      }
      // System.out.println(" r = " + r + " S = "  + S[idx]);
      if (i > 0) {
        System.out.print(" " + idx);
      } else {
        System.out.print(idx);
      }
    }

    System.out.println();
  }
}