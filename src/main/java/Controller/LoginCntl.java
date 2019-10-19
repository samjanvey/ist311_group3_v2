
package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author sam
 * Controller will handle just the Login Scheme and will hand control back after successful login
 */
public class LoginCntl {
    Model model;
    View view;
    Controller controller;
    
    /* 
       Display to the user that either username and/or password is invalid 
       as to not leak information about whether the username exists or not.
       This should be the default response no matter what component of the 
       authentication scheme is incorrect.
    */
    private final String invalidUser = "Username and/or Password incorrect";
    
    public LoginCntl(Controller controller) {
        this.controller = controller;
    }
    
    
    private void addLoginListener(){
        view.getMf().getlPanel().getLogin().addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){
                Object clickSource = click.getSource();
                
                if(clickSource instanceof JButton){
                    System.out.println("Clicking"); // debugging
                    
                    //GET USER AND PASSWORD STRINGS AND PASS TO COMPARE METHOD
                    String userName = view.getMf().getlPanel().getUser().toString();
                    String password = view.getMf().getlPanel().getPassword().toString();
                    System.out.println(""+userName + " : "+password); // debugging
                    
                    if(!model.getUserList().compareCreds(userName, password)){
                        // Display UserList.invalidUser;
                        view.getMf().getlPanel().getAuth().setText(invalidUser);
                        view.getMf().getlPanel().setBackground(Color.red);
                        
                    } else {
                        // Login Successful
                    }
                }
            }
        }
        );
    }
}
