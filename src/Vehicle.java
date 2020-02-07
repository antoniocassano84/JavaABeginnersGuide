// A Vehicle class

class Vehicle {
  int passengers; // number of passengers
  int fuelcap;    // fuel capacity in gallons
  int mpg;        // fuel consumption in miles per gallons

  // Return the range.
  int range() {
    return fuelcap * mpg;
  }
}
