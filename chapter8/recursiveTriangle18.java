import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);
        

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       //Find the distance between 2 points ex. - x,y & x1,y1
     
       double length = Math.sqrt((Math.pow((xPos[0]-xPos[1]),2) + (Math.pow((yPos[0]-yPos[1]),2))));
       
      
       int []xPos1 = new int[4];
           for (int i = 0; i < xPos.length-1; i++)
           {
            xPos1[i] = (xPos[i] + xPos[i+1])/2;
            System.out.println("a");
           }
           xPos1[3] = xPos1[0];
       int []yPos1 = new int[4];
           for (int i = 0; i < xPos.length-1; i++)
           {
            yPos1[i] = (yPos[i] + yPos[i+1])/2; 
             System.out.println("b");
           }
           yPos1[3] = yPos1[0];
           
       if (length >= 10)
       {
        Triangle(xPos1, yPos1, page);
       }       
           
       page.drawPolyline (xPos1, yPos1, xPos1.length);
           
       }
        // base case is the distance between the two lines, can be set to whatever
        //if the segment/distance is 30 or so, good length to stop
        //{
            //find the mid points of each line segment


            //make the x and y array (3 points + first point to finish triangle)


            //draw the Triangle
            //page.drawPolyline (xNew, yNew, xNew.length);

            //create x,y Array using the midpoints you calculated
            //example




            // Recursive calls for each section of triangle



        //}



   }//end of Triangle

