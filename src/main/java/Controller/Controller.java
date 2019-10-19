
package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Controller
{
    Model model;
    View view;
    LoginCntl loginCntl;
    private final String invalidUser = "Username and/or Password incorrect";

    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        //loginCntl = new LoginCntl(this); // Instantiate Login Controller
        addLoginListener();
    }   
    
    public void addLoginListener(){
        System.out.println("Listener started");
        view.getMf().getlPanel().getLogin().addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){
                Object clickSource = click.getSource();
                
                if(clickSource == view.getMf().getlPanel().getLogin()){
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

