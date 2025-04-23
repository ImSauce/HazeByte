
package Classes;

public class serverCredentials {
    private String serverIP;
    private String userID;
    private String password;

    public serverCredentials(String serverIP, String userID, String password) {
        this.serverIP = serverIP;
        this.userID = userID;
        this.password = password;
    }

    public String getServerIP() { return serverIP; }
    public String getUserID() { return userID; }
    public String getPassword() { return password; }
}