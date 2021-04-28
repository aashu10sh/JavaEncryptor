public class Decrypt extends Symmetric {
    Decrypt(){}
    Decrypt(String hash, String password)
    {
        super();
        this.hash = hash;
    }
    void setData()
    {
        System.out.print("Enter Your Encrypted Text::> ");
        this.hash = super.StrScanner.nextLine();
        super.passwordSetter();

    }
    @Override
    void show() {
        System.out.println(message);
    }
    void decryptMain()
    {
    
        String temp = "";
        int itemp;
        for(int i=0;i<this.hash.length();i++)
        {
            itemp = (int) hash.charAt(i);
            temp += String.valueOf(Character.toChars(itemp-(int)password.charAt(i%password.length())));
        }
        this.message = temp;
    }
    
}
