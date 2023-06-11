/*
Linked lists were something I struggled with throughout this quarter. They share a lot of similarities with 
array lists which I also feel like I don’t have a strong grasp on. The thing I think I struggle with the 
most for these is making sure I declare them properly and building the method calls correctly in another file. 
I was able to overcome my struggles with think lists by rereading over the zybooks module for it and watching 
some Youtube videos about them in my free time.
*/

/*
I picked this code for this topic because it was the first lab with linked lists and I struggled with it more
than the ones following it. ZyBooks Link: https://learn.zybooks.com/zybook/SKAGITCS143WymanSpring2023/chapter/6/section/7
*/

import java.util.Scanner;
import java.util.LinkedList;

public class ShoppingList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Declare a LinkedList called shoppingList of type ListItem
      LinkedList<ListItem> shoppingList = new LinkedList<ListItem>(); 
      String item = scnr.nextLine();
      
      // TODO: Scan inputs (items) and add them to the shoppingList LinkedList
      //       Read inputs until a -1 is input
      while(!item.equals(-1)) {
         shoppingList.add(new ListItem(item));
         item = scnr.nextLine();
         if (item.equals("-1")) {
            break;
         }
      }
      
      // TODO: Print the shoppingList LinkedList using the printNodeData() method
      for(int i = 0; i < shoppingList.size(); i++) {
         ListItem curr = shoppingList.get(i);
         curr.printNodeData();
      }
    
   }
}
