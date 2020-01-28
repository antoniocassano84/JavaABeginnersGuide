// Character variables can be handled like integers.
class CharArithDemo {
  public static void main(String args[]) {
    char ch;

    ch = 'X';
    System.out.println("ch contains " + ch);

    ch++; // increment ch
    System.out.println("ch is now " + ch);

    ch = 90; // give ch the value Z
    System.out.println("ch is now " + ch);

    ch = 0; // give ch the value ''
    System.out.println("ch is now " + ch);
    System.out.println("Empty char " + (char) 0);
  }
}
