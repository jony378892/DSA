/* public class Fibonacci {
  public static void main(String[] args) {
    int pre2 = 0;
    int pre1 = 1;

    System.out.println(pre2);
    System.out.println(pre1);

    for (int fibo = 0; fibo < 18; fibo++) {
      int newFibo = pre1 + pre2;
      System.out.println(newFibo);

      pre2 = pre1;
      pre1 = newFibo;

    }
  }
} */

/* public class Fibonacci {

  static int count = 2;

  public static void fibonacci(int pre1, int pre2) {

    if (count <= 19) {
      int newFibo = pre1 + pre2;
      System.out.println(newFibo);

      pre2 = pre1;
      pre1 = newFibo;
      count += 1;
      fibonacci(pre1, pre2);
    }

  }

  public static void main(String[] args) {
    System.out.println(0);
    System.out.println(1);
    fibonacci(1, 0);
  }
} */

public class Fibonacci {

  public static int F(int n) {
    if (n <= 1) {
      return n;
    } else {
      return F(n - 1) + F(n - 2);
    }
  }

  public static void main(String[] args) {
    System.out.println(F(19));
  }
}