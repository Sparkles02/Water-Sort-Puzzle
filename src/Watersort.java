import java.util.Scanner;
import java.util.Random;

public class WaterSort {
	Character top = null;
	// create constants for colors
	static Character red= new Character('r');
	static Character blue = new Character('b');
	static Character yellow= new Character('g');
	// Bottles declaration
	
	
	public static void showAll( StackAsMyArrayList bottles[])
	{
		for (int i = 0; i<=4; i++)
		 {
			 System.out.println("Bottle "+ i+ ": " + bottles[i]);
		 }
	}
	
    public static void main(String args[])
    {
		 int moves = 0;// number of moves to mix the water
		 int source = 0; // number of bottle to pour FROM
		 int target = 0; // number of bottle to pour TO
		 int max = 4; // total number of items allowed per bottle
		 Random randomNum = new Random();
		 // Bottles declaration
		 StackAsMyArrayList bottles[] = new StackAsMyArrayList[5];
		 //You can do this with a for also
		 bottles[0] = new StackAsMyArrayList<Character>();
		 bottles[1] = new StackAsMyArrayList<Character>();
		 bottles[2] = new StackAsMyArrayList<Character>();
		 bottles[3] = new StackAsMyArrayList<Character>();
		 bottles[4] = new StackAsMyArrayList<Character>();
		 
		 //////STRATEGY #1
		 while (moves<4) // 4 moves per 3 colors = 12 moves required
        {
          // get source bottle
          target = randomNum.nextInt(max+1);
          while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(blue);
		  target = randomNum.nextInt(max+1);
		  while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(red);
		  target = randomNum.nextInt(max+1);
		  while (bottles[target].getStackSize() == 4)// target is full
             {
               target = randomNum.nextInt(max);
             }
          bottles[target].push(yellow);
          showAll(bottles);
          // increment valid moves
          moves++;
        }
		
		 ///// STRATEGY #2
		 
		 
		 // Fill 3 bottles with specific colors
		 // need not be uniform colours - just easy to do it with a for
		/* for (int i = 0; i<4; i++)
		 {
			 bottles[0].push(red);
			 bottles[1].push(blue);
			 bottles[2].push(yellow);
			
		 }
		 // show all bottles
		 showAll(bottles);
		 
		 // Creating initial problem for player to solve with random numbers
		
	    int moves = 0;
		int max = 4;
		Random randomNum = new Random();
	    while (moves<=100) // use 100 valid moves to mix bottles
	    {
		  // get source bottle
          source = randomNum.nextInt(max);
		  while (bottles[source].getStackSize() ==0)// source is empty
		  {
			  source = randomNum.nextInt(max);
		  }
	      System.out.println(source);
		  // get target bottle
		  target =  randomNum.nextInt(max);
		  while (bottles[target].getStackSize() == 4)// target is full
		  {
			  target = randomNum.nextInt(max);
		  }
	      System.out.println(target);
		  // pour from source to target
		  bottles[target].push(bottles[source].pop());
		  
		  //show bottles
		  showAll(bottles);
		 
		  // increment valid moves
    	  moves++;
		}
		*/
		  

    }
}
