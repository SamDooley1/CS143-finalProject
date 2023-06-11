/*
Queues weren’t too difficult of a concept to understand, having dealt with queues in everyday life 
like food lines, music queues, waiting for an operator on the phone when you call a service number, 
etc. While understanding the concept is important, it takes much more than that to properly implement 
it. But the something I struggled with a lot is in Lab 6.9 was getting the queue to output the counter 
with my proper position in the queue. Thinking back to when I was dealing with it I believe I overcame 
this by rearranging different things within my code to get my counter to track my queue position 
properly. 
*/

//ZyBooks Link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/6/section/9

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
