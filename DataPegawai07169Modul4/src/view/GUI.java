/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class GUI {
    JFrame logreg = new JFrame();
    JLabel data,top,admintxt;
    JTextField nppup,notelpup,namaup,jab,adm,passadm;
    JLabel nama,nip,jabl;
    
    public GUI(){
        logreg.setSize(700, 630);
        logreg.setLayout(null);
        logreg.getContentPane().setBackground(Color.GREEN);
        top = new JLabel("DATA PEGAWAI KANTOR");
        top.setBounds(75, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        logreg.add(top);
        
        
        
        logreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logreg.setVisible(true);
        logreg.setLocationRelativeTo(null);
    }
}
