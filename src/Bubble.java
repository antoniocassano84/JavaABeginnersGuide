/*
   Try This 5-1

   Demonstrate the Bubble sort.
*/
class Bubble {
  public static void main(String args[]) {
    int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };

    displayArray(nums, "Original array is: ");

    // This is the Bubble sort
    bubbleSort(nums);
     
    displayArray(nums, "Sorted array is:");

  }

  private static void displayArray(int[] nums, String msg) {
    System.out.print(msg);
    for(int i=0; i < nums.length; i++)
      System.out.print(" " + nums[i]);
    System.out.println();
  }

  private static void bubbleSort(int[] nums) {
    for(int a=1; a < nums.length; a++) // from index 1 to 8
      for(int n = 1, b=nums.length-1; b >= a; b--, n++) { // from index 9 to 'a'
        if(nums[b-1] > nums[b]) { // if out of order exchange elements
          System.out.print(a + " - " + n + ") Swapping " + nums[b-1] + " with "+ nums[b] + ": " );
          int t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t;
          displayArray(nums, null);
    }
  }

  }
}
