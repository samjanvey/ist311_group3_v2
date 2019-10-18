
package Controller;

import Model.Model;
import View.View;

import java.awt.Color;
import static java.awt.Color.cyan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Controller
{
    Model model;
    View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }   
    
    private void addLoginListner(){
        view.getMf().getlPanel().getLogin().addActionListener(
        new ActionListener(){
            @Override
            public void LoginPressed(ActionEvent click){
                Object clickSource = click.getSource();
                
                if(clickSource instanceof JButton){
                    //GET USER AND PASSWORD STRINGS AND PASS TO COMPARE METHOD
                }
            }
        }
        );
    }
}

