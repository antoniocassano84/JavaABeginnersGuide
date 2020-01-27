/*
   Compute your weight on the moon.

   Call this file Moon.java.
*/
class Moon {
  public static void main(String args[]) {
    double earthweight; // weight on earth
    double moonweight; // weight on moon

    earthweight = 165;

    moonweight = earthweight * 0.17;

    System.out.println(earthweight +
            " earth-pounds is equivalent to " +
            moonweight + " moon-pounds.");
  }

}
