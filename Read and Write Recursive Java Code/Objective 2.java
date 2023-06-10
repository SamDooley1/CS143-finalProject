/*
Writing recursive code was an interesting new concept. I found it very interesting how it calls itself 
repeatedly until it reaches a certain endpoint. Something I struggled with when writing recursive code, 
however, was integrating it with linked lists. I still struggle a bit with linked lists and nodes so when 
combining the two of these it proved a difficult challenge. I managed to overcome this by continuing to 
read and study linked lists on forums and the Java Oracle outside of my coursework. 
*/

/*
I chose this code because it was the lab that combined the linked lists with recursion. It seems a little
odd to me because of its lack of a typical base case. zybooks link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/9/section/15
*/
import java.util.Scanner;

public class LabProgram {
   
   /* TODO: Write recursive printLinkedList() method here. */
   public static void printLinkedList(IntNode headNode) {
      if(headNode != null) {
         headNode.printData();
         printLinkedList(headNode.getNext());
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int size;
      int value;
      
      size = scnr.nextInt();
      value = scnr.nextInt();
      IntNode headNode = new IntNode(value); // Make head node as the first node
      IntNode lastNode = headNode;      // Node to add after
      IntNode newNode = null;           // Node to create
      
      // Insert the second and the rest of the nodes
      for (int n = 0; n < size - 1; ++n) {
         value = scnr.nextInt();
         newNode = new IntNode(value);
         lastNode.insertAfter(newNode);
         lastNode = newNode;
      }
      
      // Call printLinkedList() with the head node
      printLinkedList(headNode);
   }
}
