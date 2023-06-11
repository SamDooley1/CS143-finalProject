/*  
The terms abstraction and encapsulation still throw me for a loop, I struggle to understand 
where their implementation is actually at. While coding for the assignments in this class 
perhaps I used it without realizing it. But to me it seemed like a more of a background 
process that is just a byproduct of coding in Java, similar to memory management with garbage 
collection. In my eyes I overcame the problems with this by troubleshooting my code to make 
sure I had objects declared properly such as properly declaring public and private. 
*/

/*
I struggled to find code to represent this learning abjective because I feel like encapsulation
and especially abstraction were topics we didn't use very heavily in the time we spent coding in
this class. I chose this code to represent it because I struggled with positioning of my code to
get the counter to uptick the count of the people in the queue in order to get it to output 
Properly. Zybooks Link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/6/section/9
*/
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personName = "";
      int counter = 0;
      int youPosition = 0;
      String lineFront;

      Queue<String> peopleInQueue = new LinkedList<String>();
      
      personName = scnr.nextLine();
      while (!personName.equals("-1")) {
         // TODO: Add personName to peopleInQueue and 
         //       determine position of "You" (youPosition) 
         peopleInQueue.add(personName);
         if (personName.equals("You")) {
            youPosition = peopleInQueue.size();
         }
         personName = scnr.nextLine();
      }
      

      System.out.println("Welcome to the ticketing service... ");
      System.out.println("You are number " + youPosition + " in the queue.");

      // TODO: In a loop, remove head person from peopleInQueue,                                    
      //       output their name and that they have purchased a ticket,                             
      //       then output your position in the queue. When you are at                              
      //       the head, output that you can purchase your ticket.                                  
      while (!peopleInQueue.isEmpty()) {
         lineFront = peopleInQueue.poll();
         if (lineFront.equals("You")) {
            System.out.println("You can now purchase your ticket!");
            break;
         }
         else {
            counter++;
            System.out.println(lineFront + " has purchased a ticket.");
            System.out.println("You are now number " + (youPosition - counter));
         }
      }
   }
}
