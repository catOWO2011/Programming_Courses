public class Birthday {
  public static void main(String[]args) {
    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    int birthday;
    int numberOfPeople = 1;
    boolean[]birthdays = new boolean[n];
    boolean hasTheSameBirthday;
    int idx;
    int trial;
    int[]timesPeopleGetRoom = new int[100];
    for (trial = 0; trial < trials; trial++) {
      

      for (idx = 0; idx < n; idx++) {
        birthdays[idx] = false;
      }

      numberOfPeople = 0;
      hasTheSameBirthday = false;
      while (!hasTheSameBirthday) {
        birthday = (int)(Math.random() * n);
        if (birthdays[birthday]) {
          hasTheSameBirthday = true;
        } else {
          birthdays[birthday] = true;
        }
        numberOfPeople++;
      }
      timesPeopleGetRoom[numberOfPeople]++;
    }

    double fraction;
    boolean exceeds = false;
    int totalTimes = 0;
    idx = 1;
    while (!exceeds) {
      totalTimes += timesPeopleGetRoom[idx];
      fraction = ((double) totalTimes) / ((double) trials);
      if (fraction >= 0.5) {
        exceeds = true;
      }

      System.out.println(idx + "\t" + timesPeopleGetRoom[idx] + "\t" + fraction);
      idx++;
    }
  }
}