package Controller07169;

import Entity07169.Nadia07169_PegawaiEntity;

public class Nadia07169_PegawaiController {
    public Nadia07169_PegawaiController() {
    }
    public Nadia07169_PegawaiEntity getDataPegawai(int index) {
        return Nadia07169_AllObjectModel.pegawai.getDataPegawai(index);
    }
    public void insert(String nama, String npp, String no_telp) {
        Nadia07169_AllObjectModel.pegawai.insert_Pegawai(new Nadia07169_PegawaiEntity(nama,npp,no_telp));
    }
    
}
