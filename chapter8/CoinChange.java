public class CoinChange {
    
    public static int[] coins = {1,5,10,20,100};
    public static int amount = 150;
    
    public static void main(String[] args) 
    {
        System.out.println(combo(150,0));
    }
    
    public static int combo(int amount, int currentCoin)
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
        for( int coin = currentCoin; coin < coins.length; coin++){
            nCombos += combo(amount - coins[coin],coin);
        }     
        
        return nCombos;
    }
}