
package Entity07169;

public class Nadia07169_AdminEntity extends Nadia07169_PegawaiEntity {
   private String Password;
   public Nadia07169_AdminEntity(String nama, String npp, String no_telp, String Password){
       super (nama, npp, no_telp);
       this.Password = Password;
    }
    public String getNpp(){
        return npp;
    }
    
    public String getNama(){
        return nama;
    }
   
    public String getNo_telp(){
        return no_telp;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
}
