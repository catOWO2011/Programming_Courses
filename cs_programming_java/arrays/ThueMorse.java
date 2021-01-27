public class ThueMorse {
  public static void main (String[]arg) {
    int n = Integer.parseInt(arg[0]);

    int index;

    char[]morseSequence;
    char[]bitwiseNegation;

    if (n > 0) {
      morseSequence = new char[1];
      morseSequence[0] = '0';
      while (morseSequence.length < n) {
        bitwiseNegation = new char[morseSequence.length*2];
        for (index = 0; index < morseSequence.length; index++) {
          bitwiseNegation[index] = morseSequence[index];
          bitwiseNegation[morseSequence.length + index] = morseSequence[index] == '0' ? '1' : '0';
        }
        morseSequence = bitwiseNegation;
      }

      char[][]pattern = new char[n][n];

      int i;
      int j;
      char sign;

      for (i = 0; i < n; i++) {
        for (j = i; j < n; j++) {
          sign = '-';
          if (morseSequence[i] == morseSequence[j]) {
            sign = '+';
          }
          pattern[i][j] = pattern[j][i] = sign;
        }
      }

      for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
          if (j > 0) {
            System.out.print("  " + pattern[i][j]);
          } else {
            System.out.print(pattern[i][j]);
          }
        }
        System.out.println();
      }
    }
    
  }
}