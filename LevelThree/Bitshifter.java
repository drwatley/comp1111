package LevelThree;

/**
 * Bitshifter is a class that represents 
 * a substitution cipher. It shifts characters
 * up the unicode charset. Using the arrays of ints 
 * it shifts each character by the integer value
 * of one int in the array.
 */
public class Bitshifter {
    
    /**An array of ints, randomly typed numbers */
    private static final int[] chain = {
            451, 321, 5412, 345, 125, 154, 4547, 945
    };
    
    /**An array of ints, randomly typed numbers */
    private static final int[] chained = {
            956, 453, 35435, 13254, 657, 2424, 32
    };
    
    /**encrypt is the main method of the class that 
    does the actual encryption. Takes the first letter
    of the word of phrase and shifts it by the integer
    value of the first integer in the chain array. It 
    then continues on in this fashion for each character
    and resets to the start of the int array if it runs
    out of numbers before the phrase is done encrypting.
    A second layers of encryption, in a similar fashion is
    also performed.*/
    public static String encrypt(String key) {
        String firstLayer = "";
        int l = key.length();
        char ch; 
        int ck = 0;
        
        for(int i = 0; i < l; i++) {
            if(ck >= chain.length - 1){
                ck = 0;
            }
            ch = key.charAt(i);
            ch += chain[ck];
            firstLayer += ch;
            ck++;    
        }
        
        String secondLayer = "";
        ck = 0;
        
        for(int i = 0; i < l; i++) {
            if(ck > chain.length - 1) {
                ck = 0;
            }
            ch = firstLayer.charAt(i);
            ch += chained[ck];
            secondLayer += ch;
            ck++;
        }
        String result = secondLayer;
        return result;
    }
    
    /**
     * Decrypt method reverses the process of 
     * the encrypt method. It does the same thing 
     * but backwards, making this a symmetric
     * key.
     */
    public static String decrypt(String key) {
        String firstLayer = "";
        int l = key.length();
        char ch; 
        int ck = 0;
        
        for(int i = 0; i < l; i++) {
            if(ck >= chain.length - 1){
                ck = 0;
            }
            ch = key.charAt(i);
            ch -= chain[ck];
            firstLayer += ch;
            ck++;    
        }
        
        String secondLayer = "";
        ck = 0;
        
        for(int i = 0; i < l; i++) {
            if(ck > chain.length - 1) {
                ck = 0;
            }
            ch = firstLayer.charAt(i);
            ch -= chained[ck];
            secondLayer += ch;
            ck++;
        }
        String result = secondLayer;
        return result;
    }
    
    
}

