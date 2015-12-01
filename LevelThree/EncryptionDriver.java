package LevelThree;

import java.util.Scanner;

public class EncryptDriver {

    /**
     *  Main driver class that initiates the program. 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a phrase to encrypt.");
        String input = scan.nextLine();
        
        String encrypted = Bitshifter.encrypt(input);
        
        System.out.println(encrypted);
        
        System.out.println(Bitshifter.decrypt(encrypted));
        
    
        
    }
}
