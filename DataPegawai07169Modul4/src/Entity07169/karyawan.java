/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity07169;

/**
 *
 * @author HP
 */
public class karyawan {
    protected String npp, nama, no_telp;
    
    public karyawan(String nama, String npp, String no_telp) {
        this.npp = npp;
        this.nama = nama;
        this.no_telp = no_telp;
    }

    public String getNpp() {
        return npp;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
}
