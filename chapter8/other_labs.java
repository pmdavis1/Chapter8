

/**
 * Write a description of class other_labs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class other_labs
{
    
    public static int[] bills = {1,5,10,20,100};
    public static int amount = 150;
    
    public static void main(String[] args)
    {
     System.out.println(collect(1000));
     System.out.println(pallindrome2("racecar"));
     System.out.println(gcd(8,22));
     System.out.println(combo(150,0));
    }
    
    public static int collect(int monetaryGoal)
    {
        System.out.println(1);
        if (monetaryGoal >= 10)
        { 
            return 1+collect(monetaryGoal/10)+collect(monetaryGoal/10)+
            collect(monetaryGoal/10)+collect(monetaryGoal/10)+collect(monetaryGoal/10)
            +collect(monetaryGoal/10)+collect(monetaryGoal/10)+collect(monetaryGoal/10)
            +collect(monetaryGoal/10)+collect(monetaryGoal/10);                 
        }
        else         
         return 1;

    }
    
//     public static boolean pallindrome(String word, String check, String word1)
//     {
//         if (word.length() -1 >= 0)
//         {
//         check += word.charAt(word.length()-1);   
//         pallindrome(word.substring(0,word.length()-1),check,word1);
//         }
//          if (check.equals(word1))
//         {
//         System.out.println(word);
//         return true;
//         }
//         else
//         return false;
//         
//     }
     
    public static boolean pallindrome2(String word)
    {
        if (word.length() == 0 || word.length() == 1)
        {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length()-1))
        {
          //checks the outer two letters, then substrings them off the string
        return(pallindrome2(word.substring(1,word.length()-1)));
        }
        
        return false;
    }
    
    public static int gcd(int num1, int num2)
    {
        if ((num2 <= num1)&&(num1%num2 == 0))
        {
            return num2;
        }
        else if (num1 < num2)
        {
            return gcd(num2, num1);
        }
        else
        {
            return gcd(num2, num1%num2);
        }        
     
    }
    
   public static int gcd2 ( int x , int y )
   {
    if ( y == 0 )                        
        { 
           return x;
        }
    else if ( x >= y && y > 0)
        {
            return gcd ( y , x % y );
        }
    else 
        {
            return gcd ( y , x );        // if x < y then go ahead and switch them around.
        }
   }

public static int gcd3(int m,int n)
{
if(n==0)
return m;
else if(n>m)
return gcd(n,m);
else
return gcd(n,m%n);
}
// 
//     public static int money(int value)
//     {
//         if (value > 100)
//         {
//             return (money(value/100) + money(value/20) + money(value/5) + money(value/1));
//         }
//          if (value > 20)
//         {
//             return money(value/20) + money(value/5) + money(value/1);
//         }
//          if (value > 5)
//         {
//             return money(value/5) + money(value/1);
//         }
//         else 
//         {
//             return 1;
//         }
//     }
//     
    public static int money2(int value)
    {
        if (value/100 > 0)
        {
            return (money2(value%100) + money2(value%20) + money2(value%5) + money2(value%1));
        }
        if (value%20 > 0)
        {
            return money2(value%20) + money2(value%5) + money2(value%1);
        }
        if (value %5 > 0)
        {
            return money2(value%5) + money2(value%1);
        }
        else 
        {
            return 1;
        }
    }

     public static int combo(int amount, int currentBill)
    {
        if( amount == 0)
        {
            return 1;
        }
        if( amount < 0)
        {
            return 0;
        }
        
        int nCombos = 0;
        for( int bill = currentBill; bill < bills.length; bill++)
        {
            nCombos += combo(amount - bills[bill],bill);
        }     
        
        return nCombos;
    }
}
