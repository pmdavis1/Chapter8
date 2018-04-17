

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    private static int[] xPos = {720, 80, 400, 720};
    private static int[] yPos = {600, 600, 40, 600};
    
    public static void main(String[] args)
    {
     double length = Math.sqrt((Math.pow((xPos[0]-xPos[1]),2) + (Math.pow((yPos[0]-yPos[1]),2))));
     System.out.print(length);
    }
    
}


