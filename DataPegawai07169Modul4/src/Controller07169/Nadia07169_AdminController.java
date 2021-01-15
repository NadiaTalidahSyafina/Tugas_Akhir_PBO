package Controller07169;

import Entity07169.Nadia07169_AdminEntity;

public class Nadia07169_AdminController {
    public Nadia07169_AdminController() {
    }
    public Nadia07169_AdminEntity getDataAdmin(int index) {
        return Nadia07169_AllObjectModel.admin.getDataAdmin(index);
    }
    public void insert(String nama, String npp, String no_telp, String Password) {
        Nadia07169_AllObjectModel.admin.insert_Admin(new Nadia07169_AdminEntity(nama,npp,no_telp,Password));
    }
    
    public int cekdataAdmin(String nama,String password){
        int cekdata = Nadia07169_AllObjectModel.admin.cekData(nama, password);
        return cekdata;
    }

     public void delete(int index){
        Nadia07169_AllObjectModel.admin.delete(index);
    }
}
