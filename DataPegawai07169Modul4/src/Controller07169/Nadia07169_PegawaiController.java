package Controller07169;

import Entity07169.Nadia07169_PegawaiEntity;

public class Nadia07169_PegawaiController {
    public Nadia07169_PegawaiController() {
    }
    public Nadia07169_PegawaiEntity getDataPegawai(int index) {
        return Nadia07169_AllObjectModel.pegawai.getDataPegawai(index);
    }
    public void insert(String nama, String npp, String no_telp,int idxjabat) {
        Nadia07169_AllObjectModel.pegawai.insert_Pegawai(new Nadia07169_PegawaiEntity(nama,npp,no_telp,idxjabat));
    }
    public int cekdataPegawai(String nama){
        int cekdata = Nadia07169_AllObjectModel.pegawai.cekpegawai(nama);
        return cekdata;
    }
    
    public void delete(int index){
        Nadia07169_AllObjectModel.pegawai.delete(index);
    }
}
