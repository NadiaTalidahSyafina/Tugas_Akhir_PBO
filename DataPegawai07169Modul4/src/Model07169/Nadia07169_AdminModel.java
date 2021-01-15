/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model07169;

import Entity07169.Nadia07169_AdminEntity;
import java.util.ArrayList;

public class Nadia07169_AdminModel  {
    ArrayList<Nadia07169_AdminEntity> dataadmin;
    
    public Nadia07169_AdminModel(){
        dataadmin = new ArrayList();
    }
        public void insert_Admin(Nadia07169_AdminEntity admin) {
        dataadmin.add(admin);
    }
    
    public ArrayList<Entity07169.Nadia07169_AdminEntity> getDataAdmin() {
        return dataadmin;
    }
    public int cekData(String nama, String password){
         int loop=0;
         for(Nadia07169_AdminEntity adminEntity : dataadmin ){
           if(adminEntity.getNama().equals(nama)&&adminEntity.getPassword().equals(password)){
               break;
           }else{
               loop++;
           } 
         }
         return loop;
     }
    
    public void view (){
        for (Nadia07169_AdminEntity adminEntity : dataadmin){
            System.out.println("nama     : " + adminEntity.getNama());
            System.out.println("password : " + adminEntity.getPassword());
        }
    }

    public void delete(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nadia07169_AdminEntity getDataAdmin(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
