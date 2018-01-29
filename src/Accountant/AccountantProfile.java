/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accountant;

import Doctor.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mahmoud160312
 */
public class AccountantProfile extends javax.swing.JFrame {

    /**
     * Creates new form DoctorProfile
     */
    public AccountantProfile() {
        initComponents();
        CenteredFrame(this);  
    }
    public void CenteredFrame(javax.swing.JFrame objFrame){
           Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
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
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Accountant Profile");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(50, 0, 210, 70);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Logout");
        jLabel12.setToolTipText("");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        jPanel6.add(jLabel12);
        jLabel12.setBounds(830, 50, 50, 20);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Home");
        jLabel15.setToolTipText("");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        jPanel6.add(jLabel15);
        jLabel15.setBounds(780, 50, 50, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hds/photo/home icon.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);
        jButton1.setBounds(790, 20, 30, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hds/photo/logout icon.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(840, 20, 30, 30);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(10, 50, 886, 70);

        jLabel2.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 226, 90, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("City:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 459, 110, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Status:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 340, 110, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Phone: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 459, 60, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Age:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 290, 80, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 290, 80, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Date:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 340, 110, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Second Name:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(364, 226, 110, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 399, 110, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Accountant ID:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(260, 170, 120, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 227, 140, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 290, 140, 30);

        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 400, 470, 30);

        jTextField5.setEnabled(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 459, 140, 30);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(494, 226, 150, 30);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(496, 343, 150, 30);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(496, 460, 150, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(380, 170, 140, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(490, 290, 160, 30);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 153, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Married ", "Single" }));
        jComboBox2.setEnabled(false);
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(170, 340, 140, 30);

        jLabel16.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Salary");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(80, 518, 89, 30);

        jTextField8.setEnabled(false);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(170, 519, 140, 30);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Enter your ID to get your Information");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 140, 270, 20);

        jButton3.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 204));
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(750, 510, 100, 40);

        jButton4.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("Load");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(750, 160, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12KeyPressed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int replay = JOptionPane.showConfirmDialog(this, "are you sure you want to back to Home Page", "", JOptionPane.YES_NO_OPTION, 1);
        if (replay == JOptionPane.YES_OPTION) {
            AccountantPortal f=new AccountantPortal();
            this.setVisible(false);
            f.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int replay = JOptionPane.showConfirmDialog(this, "are you sure you want to logout", "", JOptionPane.YES_NO_OPTION, 1);
        if (replay == JOptionPane.YES_OPTION) {

            AccountantLoginForm f = new AccountantLoginForm();
            this.setVisible(false);
            f.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            
          try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbs", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select *from accountant");

            ResultSet set = stmt.executeQuery();

            String check_id;
            check_id = jTextField3.getText();

            String id = "", first_name = "",
                    second_name = "", age = "", address = "", gender = "", rstatus = "", phone = "", city = "", rdate = "", salary = "";

            while (set.next()) {
                id = set.getString("accountant_id");
                   
                if (check_id.equals(id)) {
                    first_name = set.getString("first_name");
                    second_name = set.getString("second_name");
                    age = set.getString("age");
                    address = set.getString("address");
                    gender = set.getString("gender");
                    phone = set.getString("phone");
                    city = set.getString("city");
                    rstatus = set.getString("Astatus");
                    rdate = set.getString("Adate");
                    salary = set.getString("salary");
                    break;
                }

            }
            //check if it empty********************************
            if ("".equals(check_id)) {
                JOptionPane.showMessageDialog(this, "please write Your ID before click Load:)", "ALARM", JOptionPane.ERROR_MESSAGE);
            } //************** check for exist*********************************
            else if (!check_id.equals(id)) {
                JOptionPane.showMessageDialog(this, "Your ID Is't correct check it ", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            
            } else {
                jTextField1.setText(first_name);
                jTextField7.setText(second_name);
                jTextField2.setText(age);
                jTextField9.setText(rdate);
                jTextField4.setText(address);
                jTextField5.setText(city);
                jTextField10.setText(phone);
                jTextField8.setText(salary);
               
                //******************* check for gender ***********************
                if ("Male".equals(gender)) {
                    jComboBox1.setSelectedIndex(1);
                } else if ("Female".equals(gender)) {
                    jComboBox1.setSelectedIndex(2);
                }

                //************* check for status ***********
               
                 if ("Single".equals(rstatus)) {
                    jComboBox2.setSelectedIndex(2);
                }
                 else
                    jComboBox2.setSelectedIndex(1);
                //**********************************************************************
                
                //************ to disable entereing id after click Load *************
                jTextField3.enable(false);
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getErrorCode());
        }
            


   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            
            String accountant_id = jTextField3.getText();
        String first_name = jTextField1.getText();
        String second_name = jTextField7.getText();
        String age = jTextField2.getText();
        String gender = jComboBox1.getSelectedItem().toString();
        String date = jTextField9.getText();
        String phone = jTextField10.getText();
        

        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbs", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update  accountant set first_name=?,second_name=?,"
                    + "age=?,gender=?,phone=? where accountant_id=?");

            //******************* to check if it search before enter update by getting data **************
            if ("".equals(accountant_id) || "".equals(first_name)) 
            {
                JOptionPane.showMessageDialog(this, "Please Load your information before you enter Edit :)", "Sorry", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                int maccountant_id= Integer.parseInt(accountant_id);
                int mage = Integer.parseInt(age);
                int mphone = Integer.parseInt(phone);
                

                stmt.setString(1, first_name);
                stmt.setString(2, second_name);
                stmt.setInt(3, mage);
                stmt.setString(4, gender);
                stmt.setInt(5, mphone);
                stmt.setInt(6, maccountant_id);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Done... Information Saved","Confirm",JOptionPane.INFORMATION_MESSAGE);
                jTextField1.setText("");
                jTextField7.setText("");
                jTextField2.setText("");
                jTextField9.setText("");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField10.setText("");
                jTextField8.setText("");
                
                             
           }

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getErrorCode());
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountantProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
