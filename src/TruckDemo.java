// Extend Vehicle to create a Truck specialisation.
class Truck extends Vehicle {
  private int cargocap; // cargo capacity in pounds

  // This is a constructor for Truck.
  Truck(int p, int f, int m, int c) {
    /* Initialise Vehicle members using
       Vehicle's constructor. */
    super(p, f, m);
    cargocap = c;
  }

  // Accessor methods for cargocap.
  int getCargo() { return cargocap; }
  void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
  public static void main(String[] args) {

    // construct some trucks
    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);
    double gallons;
    int dist = 252;

    gallons = semi.fuelneeded(dist);
    System.out.println("Semi can carry " + semi.getCargo() + " pound");
    System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");

    gallons = pickup.fuelneeded(dist);
    System.out.println("Pickup can carry " + pickup.getCargo() + " pound");
    System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.\n");

  }

}
