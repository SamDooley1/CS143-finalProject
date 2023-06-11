/*
Binary search was one of the first problems in this class that I never overcame. I came close 
to completing it but by the end I was only able to score an 8/10 for the lab. (As I’m writing 
this I actually just went back and checked the solution you put out for it. My problem was 
just that I forgot to initialize the recursion variable at the beginning…*sigh*) So while I 
know now that my problem didn’t have to do with my binary search algorithm. At the time of 
writing the code I was unaware of this, and it caused me a lot of stress trying to figure it 
out. Looking back now had I Initialized that variable I would probably be a lot less jaded toward 
this algorithm. 
*/

//ZyBooks Link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/3/section/12
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class LabProgram {
   // Read and return an ArrayList of integers.
   static int recursions; //the variable I forgot to assign a value to. 
   static int comparisons = 0;
   
   private static ArrayList<Integer> readNums(Scanner scnr) {
      int size = scnr.nextInt();                // Read size of ArrayList
      ArrayList<Integer> nums = new ArrayList<Integer>();
      for (int i = 0; i < size; ++i) {          // Read the numbers
         nums.add(scnr.nextInt());
      }
      return nums;
   }

   static public int binarySearch(int target, ArrayList<Integer> integers,
                                    int lower, int upper) {
      /* Type your code here. */
      int midpoint;
      
      recursions++;
      midpoint = (lower + upper) / 2;
      
      comparisons++;
      if (integers.get(midpoint) == target) {
         return midpoint;
      }
      else if (lower == upper){
         return -1;
      }
      else if (integers.get(midpoint) < target) {
         comparisons++;
         return binarySearch(target, integers, midpoint + 1, upper);
      }
      else {
         comparisons++;
         return binarySearch(target, integers, lower, midpoint - 1);
      }
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      // Input a list of integers
      ArrayList<Integer> integers = readNums(scnr);

      // Input a target value for the search
      int target = scnr.nextInt();

      int index = binarySearch(target, integers, 0, integers.size() - 1);

      System.out.printf("index: %d, recursions: %d, comparisons: %d\n",
                        index, recursions, comparisons);
   }
}
