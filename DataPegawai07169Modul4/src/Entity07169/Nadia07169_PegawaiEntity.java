/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07169;

public class Nadia07169_PegawaiEntity extends karyawan{
    private int idxjabat;
    
    public Nadia07169_PegawaiEntity(String nama, String npp, String no_telp,int idxjabat) {
        super (nama, npp, no_telp);
        this.idxjabat=idxjabat;
    }

    public int getIdxjabat() {
        return idxjabat;
    }

    public void setIdxjabat(int idxjabat) {
        this.idxjabat = idxjabat;
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
