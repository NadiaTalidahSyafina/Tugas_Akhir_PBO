package view;

import Entity07169.Nadia07169_JabatanEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI {
    JFrame logreg = new JFrame();
    JTextArea area = new JTextArea();
    JScrollPane scarea;
    JLabel top,judularea,nama,password,namaP,npp,notelp,piljabatL,namaUL,namaDL;
    JButton admin,pegawai,change,login,register,update,delete;
    JPasswordField passwordadmin;
    JTextField namaadmintext,namapegawaitext,npptext,notelptext,namaU,namaD;
    JComboBox piljabat = new JComboBox(Nadia07169_JabatanEntity.nama);
    private int loop,cekData;
    private String datapegawai = "";
    public GUI(){
        logreg.setSize(650, 710);
        logreg.setLayout(null);
        logreg.getContentPane().setBackground(Color.PINK);
        top = new JLabel("Sistem Informasi Data Pegawai");
        top.setBounds(130, 10, 400, 40);
        top.setFont(new Font("Times New Roman",Font.BOLD,30));
        logreg.add(top);
        admin = new JButton ("ADMIN");
        admin.setBounds(130, 70, 100, 30);
        admin.setBackground(Color.GREEN);
        logreg.add(admin);
        pegawai = new JButton("PEGAWAI");
        pegawai.setBounds(430, 70, 100, 30);
        pegawai.setBackground(Color.YELLOW);
        logreg.add(pegawai);
        change = new JButton("CHANGE");
        change.setBounds(280, 70, 100, 30);
        change.setBackground(Color.CYAN);
        change.setEnabled(false);
        logreg.add(change);
        judularea = new JLabel("Data Pegawai");
        judularea.setBounds(100, 320, 200, 30);
        judularea.setFont(new Font("Times New Roman",Font.BOLD,20));
        logreg.add(judularea);
        scarea=new JScrollPane(area);
        scarea.setBounds(20, 360, 300, 300);
        area.setEditable(false);
        logreg.add(scarea);
        nama = new JLabel("Nama admin");
        nama.setBounds(100, 130, 100, 30);
        logreg.add(nama);
        namaadmintext = new JTextField();
        namaadmintext.setEditable(false);
        namaadmintext.setBounds(100, 160, 100, 30);
        logreg.add(namaadmintext);
        password = new JLabel("Password");
        password.setBounds(100, 190, 100, 30);
        logreg.add(password);
        passwordadmin = new JPasswordField();
        passwordadmin.setEditable(false);
        passwordadmin.setBounds(100, 220, 100, 30);
        logreg.add(passwordadmin);
        login = new JButton("LOGIN");
        login.setEnabled(false);
        login.setBounds(110, 260, 80, 30);
        logreg.add(login);
        namaP= new JLabel("Nama Pegawai");
        namaP.setBounds(430, 130, 100, 30);
        logreg.add(namaP);
        namapegawaitext = new JTextField();
        namapegawaitext.setEditable(false);
        namapegawaitext.setBounds(430, 160, 100, 30);
        logreg.add(namapegawaitext);
        npp= new JLabel("NPP Pegawai");
        npp.setBounds(430, 190, 100, 30);
        logreg.add(npp);
        npptext = new JTextField();
        npptext.setEditable(false);
        npptext.setBounds(430, 220, 100, 30);
        logreg.add(npptext);
        notelp = new JLabel("No Telp Pegawai");
        notelp.setBounds(430, 250, 100, 30);
        logreg.add(notelp);
        notelptext = new JTextField();
        notelptext.setEditable(false);
        notelptext.setBounds(430, 280, 100, 30);
        logreg.add(notelptext);
        piljabatL = new JLabel("Jabatan");
        piljabatL.setBounds(430, 310, 100, 30);
        logreg.add(piljabatL);
        piljabat.setBounds(430, 340, 100, 30);
        logreg.add(piljabat);
        register = new JButton("REGISTER");
        register.setBounds(435, 390, 90, 30);
        register.setEnabled(false);
        logreg.add(register);
        update = new JButton("UPDATE");
        update.setEnabled(false);
        update.setBounds(440, 510, 90, 30);
        logreg.add(update);
        namaUL = new JLabel("Nama yang akan diupdate");
        namaUL.setBounds(430, 440, 200, 30);
        logreg.add(namaUL);
        namaU = new JTextField();
        namaU.setEditable(false);
        namaU.setBounds(440, 470, 100, 30);
        logreg.add(namaU);
        delete = new JButton("DELETE");
        delete.setEnabled(false);
        delete.setBounds(440, 610, 90, 30);
        logreg.add(delete);
        namaD = new JTextField();
        namaD.setEditable(false);
        namaD.setBounds(440, 570, 100, 30);
        logreg.add(namaD);
        namaDL = new JLabel("Nama yang akan didelete");
        namaDL.setBounds(430, 540, 200, 30);
        logreg.add(namaDL);
        logreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logreg.setVisible(true);
        logreg.setLocationRelativeTo(null);
        
        admin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                passwordadmin.setEditable(true);
                namaadmintext.setEditable(true);
                login.setEnabled(true);
                admin.setEnabled(false);
                pegawai.setEnabled(false);
                change.setEnabled(true);
                namaU.setEditable(true);
                namaD.setEditable(true);
            }
        });
        
        pegawai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                namapegawaitext.setEditable(true);
                npptext.setEditable(true);
                notelptext.setEditable(true);
                register.setEnabled(true);
                admin.setEnabled(false);
                pegawai.setEnabled(false);
                change.setEnabled(true);
            }
        });
        
        change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passwordadmin.setEditable(false);
                namaadmintext.setEditable(false);
                namapegawaitext.setEditable(false);
                npptext.setEditable(false);
                notelptext.setEditable(false);
                register.setEnabled(false);
                admin.setEnabled(true);
                login.setEnabled(false);
                pegawai.setEnabled(true);
                change.setEnabled(false);
                update.setEnabled(false);
                delete.setEnabled(false);
                area.setText("");
                datapegawai = "";
            }
        });
        
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                String npp = npptext.getText();
                String nama = namapegawaitext.getText();
                String notelp = notelptext.getText();
                int indexjabatan = piljabat.getSelectedIndex();
                Nadia07169_allobjctrl.pegawai.insert(nama, npp, notelp,indexjabatan);
                loop++;
                JOptionPane.showMessageDialog(null, "REGISTER BERHASIL");
                kosong();
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null,"REGISTER GAGAL");
                }
            }
        });
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Nadia07169_allobjctrl.admin.dataadmin();
                    String nama = namaadmintext.getText();
                    String password = passwordadmin.getText();
                    cekData = Nadia07169_allobjctrl.admin.cekdataAdmin(nama, password);
                    JOptionPane.showMessageDialog(null, "LOGIN BERHASIL"+"selamat datang "+nama);
                    view();
                    area.setText(datapegawai);
                    update.setEnabled(true);
                    delete.setEnabled(true);
                    namapegawaitext.setEditable(true);
                    npptext.setEditable(true);
                    notelptext.setEditable(true);
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "LOGIN GAGAL");
                }
            }
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String newnpp = npptext.getText();
                    String newnama = namapegawaitext.getText();
                    String newnotelp = notelptext.getText();
                    int newindexjabatan = piljabat.getSelectedIndex();
                    int cek = Nadia07169_allobjctrl.pegawai.cekdataPegawai(namaU.getText());
                    Nadia07169_allobjctrl.pegawai.getDataPegawai(cek).setNama(newnama);
                    Nadia07169_allobjctrl.pegawai.getDataPegawai(cek).setNpp(newnpp);
                    Nadia07169_allobjctrl.pegawai.getDataPegawai(cek).setNo_telp(newnotelp);
                    Nadia07169_allobjctrl.pegawai.getDataPegawai(cek).setIdxjabat(newindexjabatan);
                    JOptionPane.showMessageDialog(null, "BERHASIL UPDATE");
                    view();
                    area.setText(datapegawai);
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "GAGAL UPDATE");
                }
            }
        });
        
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int cek = Nadia07169_allobjctrl.pegawai.cekdataPegawai(namaD.getText());
                    Nadia07169_allobjctrl.pegawai.delete(cek);
                    JOptionPane.showMessageDialog(null, "BERHASIL DELETE");
                    loop--;
                }catch(Exception er){
                    JOptionPane.showMessageDialog(null, "GAGAL DELETE");
                }
            }
        });
    }
    
    public void view(){
        for (int i=0;i<loop;i++){
            datapegawai += "**************************************************"+
                           "\nNama : " + Nadia07169_allobjctrl.pegawai.getDataPegawai(i).getNama()+
                           "\nNpp : " + Nadia07169_allobjctrl.pegawai.getDataPegawai(i).getNpp()+
                           "\nNo telp : " + Nadia07169_allobjctrl.pegawai.getDataPegawai(i).getNo_telp()+
                           "\nJabatan : "+ Nadia07169_JabatanEntity.nama[Nadia07169_allobjctrl.pegawai.getDataPegawai(i).getIdxjabat()]+"\n\n";
        }
    }
    
    public void kosong(){
        namapegawaitext.setText(null);
        npptext.setText(null);
        notelptext.setText(null);
    }
}
