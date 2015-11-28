package LevelThree;

public class Bitshifter {
    
    private static final int[] chain = {
            451, 321, 5412, 345, 125, 154, 4547, 945
    };
    
    private static final int[] chained = {
            956, 453, 35435, 13254, 657, 2424, 32
    };
    
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

