package Controller07169;

import Entity07169.Nadia07169_AdminEntity;

public class Nadia07169_AdminController {
    public Nadia07169_AdminController() {
    }
    
    public Nadia07169_AdminEntity getDataAdmin(int index) {
        return Nadia07169_AllObjectModel.admin.getDataAdmin(index);
    }
    
    public void dataadmin(){
        String nama[] = {"Admin1", "Admin2"};
        String password[] = {"1"," 2"};
        String npp[]= {"1","2"};
        String no_telp[] = {"123","1234"};
                
        for (int i=0;i<nama.length;i++){
            Nadia07169_AllObjectModel.admin.insert_Admin(new Nadia07169_AdminEntity(nama[i],password[i],npp[i],no_telp[i]));
        }
    }

    public void insert(String nama, String npp, String no_telp, String Password) {
        Nadia07169_AllObjectModel.admin.insert_Admin(new Nadia07169_AdminEntity(nama,npp,no_telp,Password));
    }
    
    public int cekdataAdmin(String nama,String password){
        int cekdata = Nadia07169_AllObjectModel.admin.cekData(nama, password);
        return cekdata;
    }


}
