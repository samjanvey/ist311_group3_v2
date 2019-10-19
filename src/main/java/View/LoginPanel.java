
package View;

import Model.User;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;


public class LoginPanel extends JPanel{
    ArrayList<User> users; // I don't think we need this here. We can handle the arraylist in the Model
    JTextField user;
    JTextField password;
    JButton login;
    JLabel auth;
    JLabel userLabel;
    
    public LoginPanel(){
        super();
        
        setBackground(Color.CYAN);
        
        ArrayList<User> users = new ArrayList<User>();
        JTextField user = new JTextField(30);
        
        /* Create Placeholder Text for Username and Password Fields */
        /* ======================================================== */
        
        user.setText("Username or Email");
        user.addFocusListener(
                new FocusListener() {
                    public void focusGained(FocusEvent e) {
                        if (user.getText().equals("Username or Email")) {
                            user.setText("");
                        }
                    }
                    
                    public void focusLost(FocusEvent arg0) {
                        if (user.getText().equals("")) {
                            user.setText("Username or Email");
                        }
                    }
                }
        );
        JTextField password = new JTextField(24);
        
        password.setText("Password");
        password.addFocusListener(
                new FocusListener() {
                    public void focusGained(FocusEvent e) {
                        if (password.getText().equals("Password")) {
                            password.setText("");
                        }
                    }
                    
                    public void focusLost(FocusEvent arg0) {
                        if (password.getText().equals("")) {
                            password.setText("Password");
                        }
                    }
                }
        );
        
        /* ===================================================== */
        
        
        JButton login = new JButton("Login");
        JLabel auth = new JLabel("Please enter your user ID and password");
        
        add(user);
        add(password);
        add(login);
        add(auth);
        login.requestFocusInWindow(); // I'm trying to get the initial focus to be on the button (not working)
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
