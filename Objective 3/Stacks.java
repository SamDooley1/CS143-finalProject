/*
I was unable to find a piece of code that we wrote in this class that 
pertains specifically to the use of the stack. So, for that reason I 
decided to write a separate snippet of code that does pertain to it. 
While the code that I provided isn’t necessarily “the stack” itself, 
it functions as a stack does. It takes data in and outputs it in a 
first in last out order. I cannot think of any struggles I had with 
this topic because I feel like it was a small concept that wasn’t used 
much in our coding throughout the quarter. 
*/

int[] array = new int[5]

for(int i = 0; i < array.size(); i++) {
  array[i] = scnr.nextInt();
}

for (int i = array.size() - 1; i <= 0; i--) {
  system.out.println(array[i]);
}
