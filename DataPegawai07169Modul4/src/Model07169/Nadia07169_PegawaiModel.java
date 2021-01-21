
package Model07169;

import Entity07169.Nadia07169_PegawaiEntity;
import java.util.ArrayList;

public class Nadia07169_PegawaiModel {
    ArrayList<Nadia07169_PegawaiEntity> datapegawai;
    

    public Nadia07169_PegawaiModel() {
        datapegawai = new ArrayList();   
    }

    public void insert_Pegawai(Nadia07169_PegawaiEntity pegawai) {
        datapegawai.add(pegawai);
    }
    public Entity07169.Nadia07169_PegawaiEntity getDataPegawai(int index) {
        return datapegawai.get(index);
    }
    public int cekpegawai(String nama){
        int loop = 0;
        for (Nadia07169_PegawaiEntity pegawaiEntity : datapegawai) {
            if (pegawaiEntity.getNama().equals(nama)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    public void delete(int index) { 
        datapegawai.remove(index);
    }
}
