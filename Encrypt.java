public class Encrypt extends Symmetric {
    Encrypt(){}
    Encrypt(String message, String password)
    {
        super();
        this.message  =  message;
    }
    void setData()
    {
        System.out.print("Enter Your Message::> ");
        this.message = super.StrScanner.nextLine();
        super.passwordSetter();

    }
    void show()
    {
        System.out.println(hash);
    }
    void encryptMain()
    {
        String temp = "";
        int itemp;
        for(int i=0;i<this.message.length();i++)
        {

            itemp = (int) message.charAt(i);
            temp += String.valueOf(Character.toChars(itemp+(int)password.charAt(i%password.length())));
        }
        this.hash = temp;
        
        
    }
    
}
