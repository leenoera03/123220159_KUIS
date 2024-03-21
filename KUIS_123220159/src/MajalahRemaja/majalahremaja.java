/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MajalahRemaja;



/**
 *
 * @author Lab Informatika
 */
public interface majalahremaja HitungMajalahRemaja {
    private double jumlahr;
    
   public majalahanak(double jumlahr){
    this.jumlahr = jumlahr;
   }
   
   public double getJumlah(double jumlahr){
   return jumlahr;
   }
   
   public void setJumlah(double jumlah){
    this.jumlahr = jumlah;
   }
   
 @Override
 public double Total(){
     return jumlahr * 15200; 
 }
   
}
