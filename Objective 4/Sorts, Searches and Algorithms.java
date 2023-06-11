/*
Regarding sorting and searching algorithms, something I struggled with a lot was learning how to 
anticipate and determine runtime. Understanding how to translate things like O(N log N) was so 
scary when I first started trying to use it. With reading and practice from zybooks I was able to 
gain a firm understanding of this concept. However, I don’t think this translates well to actual 
written code, so for that I would say that implementing outputs of iterations of sorting methods. 
This ties in with writing the actual sorting algorithm itself because even if your output is 
working properly but your sort isn’t working properly you will still get an incorrect output. I 
was able to overcome this with consistent troubleshooting and reworking of my code to form proper 
outputs. 
*/

/*
This code was chosen because it was one of mine from the algorithms module that I spent the most 
amount of time troubleshooting for proper outputs on my iterations. ZyBooks Link:
https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/3/section/10
*/

import java.util.Scanner;

public class LabProgram {
   // Read and return an array of integers.
   // The first integer read is number of integers that follow.
   private static int[] readNums() {
      Scanner scnr = new Scanner(System.in);
      int size = scnr.nextInt();                // Read array size
      int[] numbers = new int[size];            // Create array
      for (int i = 0; i < size; ++i) {          // Read the numbers
         numbers[i] = scnr.nextInt();
      }
      return numbers;
   }

   // Print the numbers in the array, separated by spaces
   // (No space or newline before the first number or after the last.)
   private static void printNums(int[] nums) {
      for (int i = 0; i < nums.length; ++i) {
         System.out.print(nums[i]);
         if (i < nums.length - 1) {
            System.out.print(" ");
         }
      }
      System.out.println();
   }

   // Exchange nums[j] and nums[k].
   private static void swap(int[] nums, int j, int k) {
      int temp = nums[j];
      nums[j] = nums[k];
      nums[k] = temp;
   }

   // Sort numbers
   /* TODO: Count comparisons and swaps. Output the array at the end of each iteration. */
   public static void insertionSort(int[] numbers) {
      int i;
      int j;
      int comparisons = 0;
      int swaps = 0;

      for (i = 1; i < numbers.length; i++) {
         j = i;
         while (j > 0) {
            comparisons++;
            if (numbers[j] < numbers[j - 1]) {
               swap(numbers, j, j - 1);
               swaps++;
               --j;
            }
            else {
               break;
            }
         }
         
         printNums(numbers);
         
      }
      
      System.out.println();
      System.out.println("comparisons: " + comparisons);
      System.out.print("swaps: " + swaps);
   }

   public static void main(String[] args) {

      int[] numbers = readNums();
      
      printNums(numbers);
      System.out.println();

      insertionSort(numbers);
      System.out.println();
   }
}
