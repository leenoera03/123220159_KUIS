/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MajalahAnak;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class majalahanak implements HitungMajalahAnak {
    JLabel header = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel inputKategori = new JLabel("Remaja");
    
    JLabel labelHarga = new JLabel("Harga");
    JLabel inputHarga = new JLabel("12.300");
   
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField inputJumlah = new JTextField();

    JButton tombolKembali = new JButton("Kembali");
    JButton tombolBeli = new JButton("Beli");
    
    majalahanak(){

    setVisible(true);
    setSize(480,480);
    setTitle("Majalah Anak");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);

    add(header);
    add(labelKategori);
    add(inputKategori);
    add(labelHarga);
    add(inputHarga);
    add(labelJumlah);
    add(inputJumlah);

   
    header.setFont(header.getFont().deriveFont(20,0f));
    header.setBounds(20, 20, 440, 24);
    labelKategori.setBounds(20, 50, 440, 12);
    
    labelJumlah.setBounds(20, 84, 440, 12);
    inputJumlah.setBounds(18, 100, 440, 32);
    
    tombolKembali.setBounds(20, 150, 452, 24);
    tombolKembali.addActionListener(this);
    
    tombolBeli.setBounds(20, 150, 452, 24);
    tombolBeli.addActionListener(this);
    }
    
    
    private double jumlah;
    
   public majalahanak(double jumlah){
    this.jumlah = jumlah;
   }
   
   public double getJumlah(double jumlah){
   return jumlah;
   }
   
   public void setJumlah(double jumlah){
    this.jumlah = jumlah;
   }
   
 @Override
 public double Total(){
     return jumlah * 15200; 
 }
   
}
