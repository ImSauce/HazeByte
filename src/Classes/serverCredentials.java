
package Classes;


public class serverCredentials {
    
    private String serverIP;
    private String userID;
    private String password;
    
    public void setServerIP(String UserverIP){
    
        this.serverIP = UserverIP;
        
    }
    
    public void setUserID(String UuserID){
    
        this.userID = UuserID;
        
    }
    
    public void setPass(String Upass){
    
        this.password = Upass;
        
    }
    
    public String getServerIP(){
    
        return this.serverIP;
        
    }
    
    public String getUserID(){
    
        return this.userID;
        
    }
    
    public String getPass(){
    
        return this.password;
        
    }
    
}
