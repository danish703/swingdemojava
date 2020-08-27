package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {

    public static void main(String[] args) {
       LoginForm loginForm = new LoginForm();
    }
    
}

class LoginForm extends JFrame implements ActionListener{
    JTextField username;
    JPasswordField password;
    JButton loginBtn,nextBtn;
    JLabel u,p;

    public LoginForm(){
        username = new JTextField(20);
        password = new JPasswordField(20);
        loginBtn = new JButton("Login");
        nextBtn = new JButton("Next Button");
        u = new JLabel("useranme");
        p = new JLabel("Password");
        add(u);
        add(username);
        add(p);
        add(password);
        add(loginBtn);
        add(nextBtn);
        loginBtn.addActionListener(this);
        nextBtn.addActionListener(this);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
       if(e.getSource()==loginBtn){
            String u = username.getText();
            char[] p = password.getPassword();
            String password_string="";
            for(int i=0;i<p.length;i++){
                password_string+=p[i];
            }
            if(u.compareTo("admin")==0 && password_string.compareTo("nepal123")==0){
              System.out.println("Login successfully");
            }else{
              System.out.println("Sorry username and password does not match");
            }
       }else if(e.getSource()==nextBtn){
           Container c = this.getContentPane();
           c.setBackground(Color.red);
           
          }
    }
    }
    
   

