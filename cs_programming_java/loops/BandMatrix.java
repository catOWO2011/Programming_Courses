/**
*  *  *  *  0  0  0  0  
*  *  *  *  *  0  0  0  
*  *  *  *  *  *  0  0  
*  *  *  *  *  *  *  0  
0  *  *  *  *  *  *  *  
0  0  *  *  *  *  *  *  
0  0  0  *  *  *  *  *  
0  0  0  0  *  *  *  *  
 */

 public class BandMatrix {
   public static void main(String[]args) {
    int n = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    // String currRow = "";
    // int row;
    // int asterisks = 2*width + 1;
    // int zeros = n - asterisks;

    // for  

    int row;
    int leftSpace = 0;
    int rightSpace = n - 1;
    int leftAsterisks;
    int rightAsterisks;
    int currLeftSpace;
    int currRightSpace;

    String bandMatrix = "";
    String currRowMatrix;

    for (row = 0; row < n; row++) {
      currRowMatrix = "*";
      // Left side of the row according to the diagonal
      leftAsterisks = width;
      for (currLeftSpace = 0; currLeftSpace < leftSpace; currLeftSpace++) {
        if (leftAsterisks > 0) {
          currRowMatrix = "*  " + currRowMatrix;
          leftAsterisks--;
        } else {
          currRowMatrix =  "0  " + currRowMatrix;
        }
      }
      leftSpace++;
      // Left side of the row according to the diagonal
      rightAsterisks = width;
      for (currRightSpace = 0; currRightSpace < rightSpace; currRightSpace++) {
        if (rightAsterisks > 0) {
          currRowMatrix = currRowMatrix + "  *";
          rightAsterisks--;
        } else {
          currRowMatrix = currRowMatrix + "  0";
        }
      }
      rightSpace--;

      bandMatrix += currRowMatrix + "\n";
    }

    System.out.print(bandMatrix);
  }
 }