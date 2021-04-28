import java.util.*;

abstract class Symmetric 
{
    protected String hash;
    protected String message;
    protected Scanner StrScanner = new Scanner(System.in);
    Symmetric(){}
    Symmetric( String password ) 
    {
        this.password = password;
    }
    protected String password;
    abstract void setData();
    void passwordSetter()
    {
        System.out.print("Enter your password::> ");
        this.password = StrScanner.nextLine();
        
    }
    abstract void show();

}

