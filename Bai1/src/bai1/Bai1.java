/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Bai1 extends Frame {

    
        TextField txtA, txtB, txtKQ;
        Button btnCong, btnTru, btnNhan, btnChia;
        Label lblA, lblB, lblKQ, lblRong;
        
        public Bai1(){
            XuLySuKienCuaSo boLangNge = new XuLySuKienCuaSo();
            addWindowListener( boLangNge);
            setSize(400,200);
            setTitle("Bai1 awt");
            GridLayout lay = new GridLayout(4,2);
            setLayout(lay);
            lblA = new Label("a= ");
            add(lblA);
            txtA = new TextField(20);
            add(txtA);
            lblB = new Label("b= ");
            add(lblB);
            txtB = new TextField(20);
            add(txtB);
            lblRong = new Label("");
            add(lblRong);
            
            btnCong = new Button("+");
            btnCong.addActionListener(new LangNgheCong());
            add(btnCong);
            btnTru = new Button("-");
            btnTru.addActionListener(new LangNgheTru());
            add(btnTru);
            btnNhan = new Button("*");
            btnNhan.addActionListener(new LangNgheNhan());
            add(btnNhan);
            btnChia = new Button("/");
            btnChia.addActionListener(new LangNgheChia());
            add(btnChia);
            
            Panel p = new Panel();
            p.setLayout(new FlowLayout());
            p.add(btnCong);
            p.add(btnTru);
            p.add(btnNhan);
            p.add(btnChia);
            
            add(p);
            lblKQ = new Label("Kq= ");
            add(lblKQ);
            txtKQ = new TextField(20);
            add(txtKQ);
            setVisible(true);
        }
        
        public static void main(String[] args) {
            new Bai1();
        }
    
        class LangNgheCong implements ActionListener{
             @Override
             public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int kq = a+b;
                txtKQ.setText(String.valueOf(kq));
            }
        }
        class LangNgheTru implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int kq = a-b;
                txtKQ.setText(String.valueOf(kq));
            }
        }
        
        class LangNgheNhan implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int kq = a*b;
                txtKQ.setText(String.valueOf(kq));
            }
        }
        
        class LangNgheChia implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                float a = Integer.parseInt(txtA.getText());
                float b = Integer.parseInt(txtB.getText());
                float kq = a/b;
                txtKQ.setText(String.valueOf(kq));
            }
        }
        
       static class XuLySuKienCuaSo implements WindowListener {
            public void windowOpened(WindowEvent e) {
            }
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // Kết thúc chương trình
            }
            public void windowClosed(WindowEvent e) {
            }
            public void windowIconified(WindowEvent e) {
            }
            public void windowDeiconified(WindowEvent e) {
            }
            public void windowActivated(WindowEvent e) {
            }
            public void windowDeactivated(WindowEvent e) {
            }
   }
}
    
    
