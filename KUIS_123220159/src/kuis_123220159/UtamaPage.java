/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220159;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class UtamaPage {
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Silahkan pilih menu dibawah ini ");
    
    JButton tombolAnak  = new JButton("Majalah Anak");
    JButton tombolRemaja  = new JButton("Majalah Remaja");
    JButton tombolDewasa  = new JButton("Majalah Dewasa");

    UtamaPage(){
        
    setVisible(true);
    setSize(480,480);
    setTitle("Halaman Utamae");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);

    add(header);
    add(subheader);
    add(tombolAnak);
    add(tombolRemaja);
    add(tombolDewasa);


    header.setText("Selamat Datang" + nim);
    header.setFont(header.getFont().deriveFont(20,0f));
    header.setBounds(20, 20, 440, 24);
    subheader.setBounds(20, 60, 440, 24);
    
    tombolAnak.setBounds(20, 110, 440, 24);
    tombolAnak.addActionListener(this);
    
    tombolRemaja.setBounds(20, 150, 440, 24);
    tombolRemaja.addActionListener(this);
    
    tombolDewasa.setBounds(20, 190, 440, 24);
    tombolDewasa.addActionListener(this);
}
 @Override
    public void actionPerformed(ActionEvent e){
   if(e.getSource() == tombolAnak){
       new majalahanak();
       this.dispose();
       
   }else if(e.getSource() == tombolRemaja){
       new najalahremaja();
       this.dispose();

   }else if(e.getSource() == tombolDewasa){
       new majalahdewasa();
       this.dispose();

   }
   }
}

