/*
   Try This 5-1

   Demonstrate the Bubble sort.
*/
class Bubble {
  public static void main(String args[]) {
    int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
    int a, b, t, n;

    //display original array
    System.out.print("Original array is: ");
    displayArray(nums);

    // This is the Bubble sort
    for(a=1; a < nums.length; a++) // from index 1 to 8
      for(n = 1, b=nums.length-1; b >= a; b--, n++) { // from index 9 to 'a'
        if(nums[b-1] > nums[b]) { // if out of order exchange elements
          System.out.print(a + " - " + n + ") Swapping " + nums[b-1] + " with "+ nums[b] + ": " );
          t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t;
          displayArray(nums);
        }
      }
    // display sorted array
    System.out.print("Sorted array is:");
    displayArray(nums);
  }

  private static void displayArray(int[] nums) {
    for(int i=0; i < nums.length; i++)
      System.out.print(" " + nums[i]);
    System.out.println();
  }
}
