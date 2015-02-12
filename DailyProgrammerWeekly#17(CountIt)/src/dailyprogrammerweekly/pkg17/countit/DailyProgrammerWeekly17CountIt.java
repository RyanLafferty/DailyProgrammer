package dailyprogrammerweekly.pkg17.countit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ryan Lafferty
 * Description: Programming Weekly Challenge 17 Count It.
 * This program counts the occurrences of each letter in a
 * user inputted string.
 */
public class DailyProgrammerWeekly17CountIt 
{

    public static void main(String args[]) 
    {
        DailyProgrammerWeekly17CountIt run = new DailyProgrammerWeekly17CountIt();
    }
    
    public DailyProgrammerWeekly17CountIt()
    {
        Scanner uInput = new Scanner(System.in);
        ArrayList<Letter> letterCount = new ArrayList<Letter>();
        String buffer = null;
        int i = 0;
        boolean match = false;
        
        System.out.println("Please enter a string: ");
        buffer = uInput.nextLine();
        buffer.toLowerCase();
        
        for(i = 0; i < buffer.length(); i++)
        {
            if(buffer.charAt(i) >= 'A' && buffer.charAt(i) <= 'z')
            {
                if(letterCount.isEmpty() == true)
                {
                    letterCount.add(new Letter(buffer.charAt(i)));
                }
                else
                {
                    for(int j = 0; j < letterCount.size(); j++)
                    {
                        if(letterCount.get(j).getLetter() == buffer.charAt(i))
                        {
                            letterCount.get(j).incrementCount();
                            match = true;
                        }
                    }
                    
                    if(match == false)
                    {
                            letterCount.add(new Letter(buffer.charAt(i)));
                    }
                    match = false;
                }
            }
        }
        
        for(i = 0; i < letterCount.size(); i++)
        {
            System.out.println(letterCount.get(i).getLetter() + ": " + letterCount.get(i).getCount());
        }
        
    }
    
    /*Letter class, stores the letter and occurrence count.
    This class includes a void function used to increment count, a constructor
    that is used to setup the Letter object and get methods to get the Letter
    object data.*/
    public class Letter
    {
        private char letter;
        private int count;
        
        public Letter(char letter)
        {
            this.letter = letter;
            this.count = 1;
        }
        
        private void incrementCount()
        {
            this.count++;
        }
        
        private char getLetter()
        {
            return this.letter;
        }
        
        private int getCount()
        {
            return this.count;
        }
    }
    
}
