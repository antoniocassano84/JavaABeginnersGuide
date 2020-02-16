/*
   Try This 5-3
   A class that displays the binary representation of a value.
*/

class ShowBits {
  int numbits;

  ShowBits(int n) {
    numbits = n;
  }

  void show(long val) {
    long mask = 1;
    // left-shift a 1 into the proper position
    mask <<= numbits-1; // mask 10000000

    for(int spacer = 1; mask != 0; mask >>>= 1) {
      System.out.print((val & mask) != 0 ? "1" : "0");
      if((spacer++ % 8) == 0) System.out.print(" ");
    }
    System.out.println();
  }
}

// Demonstrate ShowBits.
class ShowBitsDemo {
  public static void main(String args[]) {
    ShowBits b = new ShowBits(8);
    ShowBits i = new ShowBits(32);
    ShowBits li = new ShowBits(64);

    System.out.println("123 in binary: ");
    b.show(123);

    System.out.println("\n87987 in binary: ");
    i.show(87987);

    System.out.println("\n237658768 in binary: ");
    li.show(237658768);

    // you can also show low-order bits of any integer
    System.out.println("\nLow order 8 bits of 87987 in binary: ");
    b.show(87987);
  }
}
