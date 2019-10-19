
package Model;

import java.util.ArrayList;

/**
 *
 * @author sam
 */
public class UserList {
    
    /* 
       This should be implemented differently.
       Each time the app is opened, the ArrayList will be created
       essentially overwriting any previous ArrayList. We need to implement
       some kind of database scheme. For now, it will create default creds for
       a demo user: "Admin" : "password"
    */
    User user;
    ArrayList<User> userList;
    String invalidUser = "The username/password is incorrect";
    
    public UserList(User user) {
        
    }
    
    
    /* Empty constructor can be used for creating dummy account for testing */
    
    public UserList() {
        userList = new ArrayList<User>();
        createDefaultUser(); // Dummy method to create default creds
    }
    
    public User createDefaultUser(){
        user = new User("admin", "password");
        userList.add(this.user);
        
        return this.user;
    }
    
    public Boolean compareCreds(String user, String pass) {
        // Check if User/pw exists
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getEmail().equals(user)) {
                if (userList.get(i).getPassword().equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false; // Default to False - better safe than sorry
    }
    
    public String getUserEmail() {
        return this.user.email.toString();
    }
    
    public String getUserPassword() {
        return this.user.password.toString();
    }
}
