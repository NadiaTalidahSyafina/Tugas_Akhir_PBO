/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07169;

public class Nadia07169_PegawaiEntity {
    protected String npp, nama, no_telp; 
    
    public Nadia07169_PegawaiEntity(String nama, String npp, String no_telp) {
        this.npp = npp;
        this.nama = nama;
        this.no_telp = no_telp;
    }

    
    public String getNpp(){
        return this.npp;
    }
    
    public String getNama(){
        return this.nama;
    }
   
    public String getNo_telp(){
        return this.no_telp;
    }
}
