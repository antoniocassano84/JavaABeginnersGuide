// Find prime numbers between 2 and 100.
class Prime {
  public static void main(String args[]) {
    int i, j;
    boolean isprime;

    for(i =2; i < 100; i++) {
      isprime = true;
      System.out.println(">>> number is " + i);
      // see if the number is evenly divisible
      for(j = 2; j <= i/j; j++) {
        System.out.println("\tFactor: " + j + " | Check " + j +
                           " <= " + (i/j) + ": " + (j <= i/j) +
                           " | Is " + i + " divisible by " + j +
                           " ? " + ((i % j) == 0));
        // if it is, then it's not prime
        if ((i % j) == 0) {
          System.out.println("\t= " + i + " is NOT prime.");
          isprime = false;
        }
      }
      if(isprime) System.out.println("\t" + i + " is prime.");
    }
  }
}
