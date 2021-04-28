/**
 * MainApplication
 */
import java.io.File;
import java.util.*;


public class MainApplication 
{
    static Scanner newScanner = new Scanner(System.in);
    



    public static void main(String[] args) 
    {
        Encrypt mEncrypt;
        Decrypt mDecrypt; 
        String choice;
        do 
        {
            displayMenu();
            System.out.print(">> ");
            choice = newScanner.next();
            switch (choice)
            {
                case "E":
                    mEncrypt = new Encrypt();
                    mEncrypt.setData();
                    mEncrypt.encryptMain();
                    mEncrypt.show();
                    // Show Data
                    break;
                case "D":
                    mDecrypt = new Decrypt();
                    mDecrypt.setData();
                    mDecrypt.decryptMain();
                    mDecrypt.show();
                    break;
                    //show unencrypted text
                case "Q":
                    break;
                default:
                    System.out.println("COMMAND NOT FOUND<");
    
            }


        }while(!choice.equals("Q"));
        newScanner.close();
       
    }
    static void displayMenu()
    {
        try{
            File bruce = new File("/home/ash/Java/Project/banner.txt");
            Scanner mainScanner = new Scanner (bruce);
        
        
            while (mainScanner.hasNextLine())
            {
                System.out.println(mainScanner.nextLine());
            }
            mainScanner.close();
        }catch(Exception e)
        {
            System.out.println("Ehehe File not found");
        }
        System.out.println("#-# Usage--");
        System.out.println("[X]Type E for Encryption");
        System.out.println("[X]Type D for Decryption");
        System.out.println("[X]Type Q to Exit");
        
        

    }
}