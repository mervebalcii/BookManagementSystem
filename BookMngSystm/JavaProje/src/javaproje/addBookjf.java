/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproje;

import com.sun.org.apache.xml.internal.dtm.DTM;
import java.awt.Dialog;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author MERVE
 */
public class addBookjf extends javax.swing.JFrame {

    /**
     * Creates new form addBookjf
     */
    public addBookjf() {
        initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        booknametxt = new javax.swing.JTextField();
        genretxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bookIdtxt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        listbookbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Book Name");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Genre");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setText("Price");

        submitbtn.setBackground(new java.awt.Color(255, 255, 255));
        submitbtn.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel4.setText("Book Id");

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        listbookbtn.setBackground(new java.awt.Color(255, 255, 255));
        listbookbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        listbookbtn.setText("List Books");
        listbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listbookbtnActionPerformed(evt);
            }
        });

        searchbtn.setBackground(new java.awt.Color(255, 255, 255));
        searchbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        searchbtn.setText("Search Book");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("Update Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pricetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(genretxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(listbookbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchbtn)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bookIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(submitbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(bookIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(backbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(submitbtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(listbookbtn)
                        .addGap(51, 51, 51)
                        .addComponent(searchbtn)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)))
                .addGap(32, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
         
    String BOOKNAME,GENRE, sql_sorgu;
          
    int BOOKID, PRICE;
   
        
           BOOKID=Integer.parseInt(bookIdtxt.getText());
           BOOKNAME=booknametxt.getText();
           GENRE=genretxt.getText();
           PRICE=Integer.parseInt(pricetxt.getText());
           sql_sorgu= "INSERT INTO BOOKLİST(BOOKID,BOOKNAME,GENRE,PRICE)VALUES ("+ BOOKID +",'" + BOOKNAME + "'," + "'" + GENRE + "'," + PRICE + ")";
       
 try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/BOOKMNG", "MERVE", "1234");
            
            Statement stm=con.createStatement();
           ResultSet rs = stm.executeQuery("SELECT * FROM BOOKLİST");
           if(BOOKNAME.equals("")||GENRE.equals("") ){
                     JOptionPane.showMessageDialog(rootPane, " not null!!");
                     
                 }
          
            else{
               stm.executeUpdate(sql_sorgu);
                JOptionPane.showMessageDialog(null,"Book added!");
           }
          
            } catch (Exception ex) {
                System.out.println(ex);
           
        }
       
     
        
        
    }//GEN-LAST:event_submitbtnActionPerformed

    private void listbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listbookbtnActionPerformed
        // TODO add your handling code here:
    
        bookList bookL=new bookList();
        
         try {  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/BOOKMNG", "MERVE", "1234");
            Statement stm=con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM BOOKLİST");
          
         
         
            while(rs.next()){ 
               
                int x=rs.getInt("BOOKID");
                
                String bookname=rs.getString("BOOKNAME");
          
                String genre = rs.getString("GENRE");
             
                int price= rs.getInt("PRICE");
                
                 System.out.println(x + " " + bookname + " " + genre + " " + price);
               bookL.dtm.addRow(new Object[] {x , bookname, genre, price});
              

          bookL.setVisible(true);
         
                 }
               
            
            
                
            } catch (Exception ex) {
                System.out.println(ex);
          
                
                
                
                
        }
         
    }//GEN-LAST:event_listbookbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        secondjf main=new secondjf();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
       
 bookList bookl=new bookList(); 

        try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/BOOKMNG", "MERVE", "1234");
            Statement stm=con.createStatement();
           ResultSet rs = stm.executeQuery("SELECT * FROM BOOKLİST ");
           
            while(rs.next()){ 
                   
           int id=Integer.parseInt(bookIdtxt.getText());
             int xx=rs.getInt("BOOKID");
               if(xx==id){
                   
              String bookname=rs.getString("BOOKNAME");
                 bookIdtxt.getText();
                String genre = rs.getString("GENRE");
                genretxt.getText();
                int price= rs.getInt("PRICE");
                pricetxt.getText();
                
         
                 System.out.println(xx + " " + bookname + " " + genre + " " + price);
                 
                  bookl.dtm.addRow(new Object[] {xx , bookname, genre, price});
            bookl.setVisible(true);
              break;
                }
           
          if(id!=xx){
        
               JOptionPane.showMessageDialog(null,"Book is not in the list!");
          }
             }   
           
            } catch (Exception ex) {
                System.out.println(ex);
           
        }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      addBookjf add=new addBookjf();
      bookList bookt=new bookList();
      String BOOKNAME,GENRE, sql_sorgu, value;
     
    int BOOKID, PRICE;
   
        
        
       try {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/BOOKMNG", "MERVE", "1234");
            Statement stm=con.createStatement();
         
             int id=Integer.parseInt(bookIdtxt.getText());
          
          sql_sorgu="UPDATE BOOKLİST SET BOOKNAME=?, GENRE=?, PRICE=? WHERE BOOKID="+id ;
            PreparedStatement pst=con.prepareStatement(sql_sorgu);
            pst.setString(1,booknametxt.getText());
            pst.setString(2, genretxt.getText());
            pst.setInt(3, Integer.parseInt(pricetxt.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "book updated!");
          
            } catch (Exception ex) {
                System.out.println(ex);
           
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addBookjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBookjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBookjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBookjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBookjf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bookIdtxt;
    private javax.swing.JTextField booknametxt;
    private javax.swing.JTextField genretxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listbookbtn;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
