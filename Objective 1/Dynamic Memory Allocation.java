/*
I learned that Java uses garbage collection to allocate and deallocate memory for things on the fly. 
This makes dealing with memory very intuitive and easy to do because java does the heavy lifting for me. 
While it hasn’t been very impactful yet, I think something that is going to be very important is managing 
my memory beyond the Java VM. When I stop coding in zybooks and start writing bigger and more complex 
programs in different languages, optimization is going to become important to ensure that my programs run 
efficiently. This has been a major problem in the AAA game industry in recent years. Games coming out are 
becoming more demanding and less optimized to the point that top-of-the-line hardware struggles to play 
new games. I don’t want my programs to be like that, so I want to work to make mine efficient and well 
optimized. 
*/

/*
I feel like nearly any code could work for this due to Java's VM handling the heavy lifting in its memory 
alocation. I chose this one however, because its from the memory module, uses memory to add input to nodes
with a loop and calls another method. Link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/5/section/8
*/
import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;
      int nodeNum;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
      nodeNum = scnr.nextInt();
         
      // TODO: For the scanned number of nodes, scan
      //       in data and insert into the linked list
      for (i = 0; i < nodeNum; i++) {
         miles = scnr.nextDouble();
         date = scnr.next();
         currNode = new MileageTrackerNode(miles, date);
         lastNode.insertAfter(currNode);
         lastNode = currNode;
      }
            

      // TODO: Call the printNodeData() method 
      //       to print the entire linked list
      currNode = headNode.getNext();
      while (currNode != null) {
         currNode.printNodeData();
         currNode = currNode.getNext();
      }
            
   }
}
