/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220159;

/**
 *
 * @author Lab Informatika
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    JLabel header = new JLabel("Welcome");
    JLabel subheader = new JLabel("Silahkan masuk untuk melanjutkan");
    
    JLabel labelNim = new JLabel("NIM");
    JTextField inputNim = new JTextField();

    JButton tombolLogin = new JButton("Masuk");
    
    LoginPage(){

    setVisible(true);
    setSize(480,480);
    setTitle("Login Page");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);

    add(header);
    add(subheader);
    add(labelNim);
    add(inputNim);
    add(tombolLogin);

    header.setFont(header.getFont().deriveFont(20,0f));
    header.setBounds(20, 20, 440, 24);
    subheader.setBounds(20, 50, 440, 12);
    
    labelNim.setBounds(20, 84, 440, 12);
    inputNim.setBounds(18, 100, 440, 32);
    
    tombolLogin.setBounds(20, 150, 452, 24);
    tombolLogin.addActionListener(this);
    }
    
     @Override
    public void actionPerformed(ActionEvent e){
    try{
        String nim = inputNim.getText();
        
        if(nim.isEmpty()){
            throw new Exception("Harap isi NIM anda !");
        }
        new UtamaPage(nim);
        
        this.dispose();
    }catch(Exception error){
    
    JOptionPane.showMessageDialog(this, error.getMessage());
    }
   }
}





