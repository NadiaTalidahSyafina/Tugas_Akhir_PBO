
package datapegawai07169modul4;

import java.util.Scanner;
import Entity07169.*;
import Controller07169.*;
import view.*;

public class DataPegawai07169Modul4 {
   static Scanner inp = new Scanner (System.in);
   static Nadia07169_PegawaiController pegawai = new Nadia07169_PegawaiController();
   static Nadia07169_AdminController admin  = new Nadia07169_AdminController();
   private static int cekData,loop;

    public static void main(String[] args) {
        GUI g = new GUI();
                
//    int pil;
//       do{
//           System.out.println("1. pegawai ");
//           System.out.println("2. admin ");
//           System.out.println("0. exit");
//           System.out.print("pilih ");
//           pil = inp.nextInt();
//           switch(pil){
//               case 1 :
//                   Pegawai();
//                   break; 
//               case 2 :
//                   LoginAdmin();
//                   break;
//               
//           } 
//       }while (pil!=0);
//    }
//
//    public static void Pegawai() {
//       System.out.print ("Nomor Pokok Pegawai = ");
//       String npp = inp.next();
//       System.out.print ("Nama Pegawai = ");
//       String nama = inp.next();
//       System.out.print ("Masukkan No Telp = ");
//       String notelp = inp.next();
//       for (int i = 0; i < Nadia07169_JabatanEntity.nama.length; i++) {
//            System.out.println(i + ". " + Nadia07169_JabatanEntity.nama[i]);
//        }
//        System.out.print("Tulis Jabatan  = ");
//        int indexjabatan = inp.nextInt();
//        pegawai.insert(nama, npp, notelp);
//        loop++;
//    }
//
//    public static void LoginAdmin() {
//        try{
//        System.out.print("masukkan nama : ");
//        String nama = inp.next();
//        System.out.print("masukkan password : ");
//        String password = inp.next();
//        cekData = admin.cekdataAdmin(nama, password);
//        for (int i=0;i<loop;i++){
//            System.out.println("nama : " + pegawai.getDataPegawai(i).getNama());
//            System.out.println("npp : " + pegawai.getDataPegawai(i).getNpp());
//            System.out.println("no telp :" + pegawai.getDataPegawai(i).getNo_telp());
//        }
//        }catch(Exception e){
//            System.out.println("nama atau password salah");
//        }
//    }
//    
//    public static void dataadmin(){
//        String nama[] = {"Admin1", "Admin2"};
//        String password[] = {"1"," 2"};
//        String npp[]= {"1","2"};
//        String no_telp[] = {"123","1234"};
//                
//        for (int i=0;i<nama.length;i++){
//            admin.insert(nama[i],password[i],npp[i],no_telp[i]);
//        }
    }
}
