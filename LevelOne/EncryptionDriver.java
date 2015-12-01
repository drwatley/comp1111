import java.util.Scanner;
/**Drive class for encryption example. */
public class EncryptDriver {
    /**Main entry point for the program, it enters 
    and performs the programs main function of encryption.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a phrase to encrypt.");
        String input = scan.nextLine();
        
        String encrypted = Bitshifter.encrypt(input);
        
        System.out.println(encrypted);
        
        System.out.println(Bitshifter.decrypt(encrypted));
    }

}
