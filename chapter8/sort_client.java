

/**
 * Write a description of class sort_client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class sort_client
{
   public static void main(String[] args)
   {
       int MAX = 5000000;
       
       int[] num = new int[MAX];
       Random gen = new Random();
       
       for (int i = 0; i < MAX; i++)
       {
           num[i] = gen.nextInt(10000)+1;
       }
       
       for (int j = 4980000; j<MAX; j++)
       {
          System.out.print(num[j]+"\t"); 
       }
       
       RecursiveSorts.quickSort(num);
       
       
   }

}
