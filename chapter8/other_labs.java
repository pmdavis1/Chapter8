

/**
 * Write a description of class other_labs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class other_labs
{
    public static void main(String[] args)
    {
     System.out.println(collect(1000));
    }
    
    public static int collect(int monetaryGoal)
    {
        
        if (monetaryGoal >= 10)
        { return collect(monetaryGoal/10);      
        }
        else         
         return 1;
    }
    
    public static boolean pallindrome(String word)
    {
    
    }

}
