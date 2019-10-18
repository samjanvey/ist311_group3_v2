/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.User;
import java.awt.Color;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;


public class LoginPanel extends JPanel{
    ArrayList<User> users;
    JTextField user;
    JTextField password;
    JButton login;
    JLabel auth;
    
    public LoginPanel(){
        super();
        
        setBackground(Color.CYAN);
        
        ArrayList<User> users = new ArrayList<User>();
        JTextField user = new JTextField("User ID");
        JTextField password = new JTextField("Password:");
        JButton login = new JButton("Login");
        JLabel auth = new JLabel("Please enter your user ID and password");
        
        add(user);
        add(password);
        add(login);
        add(auth);
        
    }

    
    // Getters and Setters
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public JTextField getUser() {
        return user;
    }

    public void setUser(JTextField user) {
        this.user = user;
    }

    public JTextField getPassword() {
        return password;
    }

    public void setPassword(JTextField password) {
        this.password = password;
    }

    public JButton getLogin() {
        return login;
    }

    public void setLogin(JButton login) {
        this.login = login;
    }

    public JLabel getAuth() {
        return auth;
    }

    public void setAuth(JLabel auth) {
        this.auth = auth;
    }
}
