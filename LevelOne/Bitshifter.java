


/**
 * Bitshifter represents a 
 * simple substitution cipher 
 * and is used as an example for class
 * room.
 */
public class Bitshifter {
    
    /**
     * Encrypt method encrypts a word 
     * or phrase by shifting it 10 units 
     * up on the unicode charset.
     */ 
    public static String encrypt(String key) {
        String result = "";
        int l = key.length();
        char ch; 
        for(int i = 0; i < l; i++) {
            ch = key.charAt(i);
            ch += 10;
            result += ch;
        }
        return result;
    }
    
    /**
     * Decrypt reverses the encrypt method's work
     * simply by doing the same thing but in reverse.
     * Thus making this program a symmetric key.
     */
    public static String decrypt(String key) {
        String result = "";
        int l = key.length();
        char ch; 
        for(int i = 0; i < l; i++) {
            ch = key.charAt(i);
            ch -= 10;
            result += ch;
        }
        return result;
    }
}
