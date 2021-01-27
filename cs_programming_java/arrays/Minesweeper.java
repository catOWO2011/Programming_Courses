public class Minesweeper {
  public static void main(String[]args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    int k = Integer.parseInt(args[2]);

    char[][] grid = new char[m][n];

    int i;
    int j;

    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        grid[i][j] = '0';
        // if (k > 0) {
        //   randomValue = (int)(Math.random() * 2);
        // } else {
        //   randomValue = 0;
        // }
        
        // if (randomValue == 1) {
        //   grid[i][j] = '*';
        //   k--;
        // } else {
        //   grid[i][j] = '0';
        // }
      }
    }

    while (k > 0) {
      i = (int) (Math.random() * m);
      j = (int) (Math.random() * n);
      if (grid[i][j] != '*') {
        grid[i][j] = '*';
        k--;
      }
    }

    int mines;
    int dirI;
    int dirJ;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (grid[i][j] != '*') {
          mines = 0;
          for (dirI = -1; dirI < 2; dirI++) {
            for (dirJ = -1; dirJ < 2; dirJ++) {
              if (i + dirI > -1 && i + dirI < m && 
              j + dirJ > -1 && j + dirJ < n && 
              grid[i + dirI][j + dirJ] == '*') {
                mines++;
              }
            }
          }

          grid[i][j] = (char) (mines + '0');
        }
      }
    }

    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        if (j > 0) {
          System.out.print("  " + grid[i][j]);
        } else {
          System.out.print(grid[i][j]);
        }
      }
      System.out.println();
    }
  }
}