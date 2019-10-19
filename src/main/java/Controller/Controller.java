
package Controller;

import Model.Model;
import View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Controller
{
    Model model;
    View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }   
    
    private void addLoginListener(){
        view.getMf().getlPanel().getLogin().addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent click){
                Object clickSource = click.getSource();
                
                if(clickSource instanceof JButton){
                    //GET USER AND PASSWORD STRINGS AND PASS TO COMPARE METHOD
                    String userName = view.getMf().getlPanel().getUser().toString();
                    String password = view.getMf().getlPanel().getPassword().toString();
                    System.out.println(""+userName + " "+password); // debugging
                    
                    if(!model.getUserList().compareCreds(userName, password)){
                        // Display UserList.invalidUser;
                    } else {
                        
                    }
                }
            }
        }
        );
    }
}

