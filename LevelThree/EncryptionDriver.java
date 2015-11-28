package LevelThree;

import java.util.ArrayList;
import java.util.Scanner;

import LevelTwo.Bitshifter;

public class EncryptDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> encrypted = new ArrayList<String>();
        ArrayList<String> decrypted = new ArrayList<String>();
        String[] holder;
        
        
        //System.out.println("enter a string");
        //String line = scan.nextLine();
        //line = Bitshifter.encrypt(line);
        //System.out.println(line);
        //System.out.println(Bitshifter.decrypt(line));
        
       
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            //System.out.println(line);
            line = Bitshifter.encrypt(line);
            //System.out.println(line);
            //line = Bitshifter.decrypt(line);
            //System.out.println(line);
            encrypted.add(line);   
            
        }
        
        for(String s: encrypted){
            System.out.println(s);
        }
        
        holder = new String[encrypted.size()];
        
        encrypted.toArray(holder);
        
        
        for(int i = 0; i < holder.length; i++) {
            System.out.println(holder[i]);
            String line = holder[i];
            line = Bitshifter.decrypt(line);
            System.out.println(line);
            decrypted.add(line);
           
        }
        
        
        for(String s: decrypted) {
            System.out.println(s);
        }
    }
}
