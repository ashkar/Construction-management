/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/*
* abcd.java
*
* Created on Mar 9, 2013, 12:45:54 PM
*/
package pos;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
*
* @author Home
*/
public class abcd extends javax.swing.JFrame {
    
    String pname,vdate,work,to,from,vno,lname,goods;
    int vcharge,lcharge,total,inv=0;

    /** Creates new form abcd */
    public abcd() {
        initComponents();
        setTitle("abcd Details");
        //setSize(660,770);
        setVisible(true);
        getContentPane().setBackground(new Color(202,225,255));
        Functions.FillCombo(jComboBox1,"WORK","Names"); 
        Functions.FillCombo(project_nameCombo, "PRONAME", "Project");
         try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  Statement  st = con.createStatement();
                  ResultSet res = st.executeQuery("select TRAN_ID from Transport");
                  Boolean rec = res.next();
                  System.out.println("connected successfully");
                  do
                  {
                     if(rec==true) {
                      inv =res.getInt(1);
                      }
                  }while (res.next());
                  
                inv+=1 ;
        //String   abc=   (String)invno; 
           //     jTextField5.setText(Integer.toString(invno));
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
                System.out.println(e.getMessage());
            } 
        
    }

    /** This method is called from within the constructor to
* initialize the form.
* WARNING: Do NOT modify this code. The content of this method is
* always regenerated by the Form Editor.
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labour_daily_chargesLabel = new javax.swing.JLabel();
        project_nameLabel = new javax.swing.JLabel();
        project_nameCombo = new javax.swing.JComboBox();
        date = new org.jdesktop.swingx.JXDatePicker();
        dateLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        vehicle_numberLabel = new javax.swing.JLabel();
        vehicle_chargeLabel = new javax.swing.JLabel();
        labour_nameLabel = new javax.swing.JLabel();
        labour_chargeLabel = new javax.swing.JLabel();
        vehicle_chargeTextField1 = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        vehicle_numberTextField1 = new javax.swing.JTextField();
        labour_nameLabel1 = new javax.swing.JLabel();
        project_nameLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        vehicle_chargeTextField2 = new javax.swing.JTextField();
        vehicle_chargeTextField3 = new javax.swing.JTextField();
        vehicle_chargeTextField4 = new javax.swing.JTextField();
        vehicle_chargeTextField5 = new javax.swing.JTextField();
        vehicle_chargeTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labour_daily_chargesLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labour_daily_chargesLabel.setForeground(new java.awt.Color(0, 102, 102));

        project_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        project_nameLabel.setText("Project Name");

        project_nameCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        project_nameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        dateLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        dateLabel.setText("Date");

        fromLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fromLabel.setText("From");

        toLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        toLabel.setText("To");

        vehicle_numberLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        vehicle_numberLabel.setText("Vehicle Number");

        vehicle_chargeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        vehicle_chargeLabel.setText("Vehicle Charge");

        labour_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labour_nameLabel.setText("Labour Name");

        labour_chargeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labour_chargeLabel.setText("Labour Charge");

        vehicle_chargeTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vehicle_chargeTextField1KeyReleased(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        labour_nameLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labour_nameLabel1.setText("Goods Carries");

        project_nameLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        project_nameLabel1.setText("Work");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        vehicle_chargeTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicle_chargeTextField6ActionPerformed(evt);
            }
        });
        vehicle_chargeTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vehicle_chargeTextField6KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labour_daily_chargesLabel)
                        .addGap(229, 229, 229))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(vehicle_chargeLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(vehicle_chargeTextField1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(vehicle_numberLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(vehicle_numberTextField1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(project_nameLabel)
                                            .addComponent(dateLabel)
                                            .addComponent(project_nameLabel1))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(project_nameCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromLabel)
                                    .addComponent(labour_chargeLabel)
                                    .addComponent(labour_nameLabel)
                                    .addComponent(toLabel)
                                    .addComponent(labour_nameLabel1))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vehicle_chargeTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(vehicle_chargeTextField2)
                                    .addComponent(vehicle_chargeTextField4)
                                    .addComponent(vehicle_chargeTextField5)
                                    .addComponent(vehicle_chargeTextField6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labour_daily_chargesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(project_nameLabel)
                    .addComponent(project_nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel)
                    .addComponent(vehicle_chargeTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toLabel)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vehicle_chargeTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(project_nameLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labour_nameLabel1)
                    .addComponent(vehicle_chargeTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicle_numberLabel)
                    .addComponent(vehicle_numberTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(labour_nameLabel)
                    .addComponent(vehicle_chargeTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicle_chargeLabel)
                    .addComponent(vehicle_chargeTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(labour_chargeLabel)
                    .addComponent(vehicle_chargeTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vehicle_chargeTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicle_chargeTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_chargeTextField6ActionPerformed

    private void vehicle_chargeTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicle_chargeTextField1KeyReleased
            Functions.NumericValidation(vehicle_chargeTextField1);     
    }//GEN-LAST:event_vehicle_chargeTextField1KeyReleased

    private void vehicle_chargeTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicle_chargeTextField6KeyReleased
            Functions.NumericValidation(vehicle_chargeTextField6);        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_chargeTextField6KeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        pname =(String)project_nameCombo.getSelectedItem();
        work = (String)jComboBox1.getSelectedItem();
        vcharge =Integer.parseInt(vehicle_chargeTextField1.getText()  );
        vno = vehicle_numberTextField1.getText();
        from = vehicle_chargeTextField2.getText();
        to = vehicle_chargeTextField3.getText();
        goods = vehicle_chargeTextField4.getText();
        lname = vehicle_chargeTextField5.getText();
        lcharge =Integer.parseInt(vehicle_chargeTextField6.getText());
        total = lcharge+vcharge ;
        try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Transport values(?,?,?,?,?,?,?,?,?,?,?,?)");    
                                               
                        prp.setInt(1,inv);
                        prp.setString(2,pname);
                        prp.setDate(3,sqlDate);  
                        prp.setString(4,work);
                        prp.setString(5,from);
                        prp.setString(6, to);
                        prp.setString(7, goods);
                        prp.setString(8, vno);
                        prp.setInt(9, vcharge);
                        prp.setString(10,lname);
                        prp.setInt(11,lcharge);
                        prp.setInt(12,total);
                        prp.executeUpdate(); 
                        JOptionPane.showMessageDialog(null,"Project added succesfully");
                       
                         vehicle_chargeTextField1.setText("");
                         vehicle_chargeTextField5.setText("");
                         vehicle_chargeTextField6.setText(""); 
                         vehicle_numberTextField1.setText("");
                         con.commit();
                         con.close();
                         inv+=1;
             }                               
             
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"INVALID datatype");
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
                System.out.println(e.getMessage());
            }
             
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(abcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abcd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new abcd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel labour_chargeLabel;
    private javax.swing.JLabel labour_daily_chargesLabel;
    private javax.swing.JLabel labour_nameLabel;
    private javax.swing.JLabel labour_nameLabel1;
    private javax.swing.JComboBox project_nameCombo;
    private javax.swing.JLabel project_nameLabel;
    private javax.swing.JLabel project_nameLabel1;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel vehicle_chargeLabel;
    private javax.swing.JTextField vehicle_chargeTextField1;
    private javax.swing.JTextField vehicle_chargeTextField2;
    private javax.swing.JTextField vehicle_chargeTextField3;
    private javax.swing.JTextField vehicle_chargeTextField4;
    private javax.swing.JTextField vehicle_chargeTextField5;
    private javax.swing.JTextField vehicle_chargeTextField6;
    private javax.swing.JLabel vehicle_numberLabel;
    private javax.swing.JTextField vehicle_numberTextField1;
    // End of variables declaration//GEN-END:variables
}