/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/*
* Career.java
*
* Created on Mar 9, 2013, 12:45:54 PM
*/
package pos;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
*
* @author Home
*/
public class Paymentnew extends javax.swing.JFrame {
    
    String pname,vdate,work,to,from,vno,lname,goods,category,cname;
   

    /** Creates new form Career */
    public Paymentnew() {
        initComponents();
        setTitle("Paymentnew Details");
        //setSize(660,770);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
       // Functions.FillCombo(nameCombo,"WORK","Names"); 
        Functions.FillCombo(project_nameCombo, "PRONAME", "Project");
         
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
        categoryLabel = new javax.swing.JLabel();
        project_nameCombo = new javax.swing.JComboBox();
        date = new org.jdesktop.swingx.JXDatePicker();
        dateLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        project_nameLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameCombo = new javax.swing.JComboBox();
        amountTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox();
        checkLabel = new javax.swing.JLabel();
        checkTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labour_daily_chargesLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labour_daily_chargesLabel.setForeground(new java.awt.Color(0, 102, 102));

        categoryLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        categoryLabel.setText("Payment of");

        project_nameCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        project_nameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        dateLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        dateLabel.setText("Date");

        amountLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        amountLabel.setText("Amount");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        project_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        project_nameLabel.setText("For project");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nameCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        amountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountTextFieldFocusLost(evt);
            }
        });
        amountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTextFieldKeyReleased(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nameLabel.setText("Name");

        categoryCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Labour", "contractor", "Vendor", "Partner" }));
        categoryCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryComboItemStateChanged(evt);
            }
        });

        checkLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        checkLabel.setText("Check/DD No. ");

        checkTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                checkTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                checkTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(labour_daily_chargesLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(project_nameLabel)
                                    .addComponent(dateLabel)
                                    .addComponent(amountLabel)
                                    .addComponent(categoryLabel)
                                    .addComponent(checkLabel))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(project_nameCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoryCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labour_daily_chargesLabel)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(project_nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(categoryLabel)
                        .addGap(13, 13, 13)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(project_nameLabel)
                        .addGap(11, 11, 11)
                        .addComponent(dateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int amount=0,flag = 0;
        String check;
        pname    =(String)project_nameCombo.getSelectedItem();
        cname    =(String)nameCombo.getSelectedItem();
        category =(String)categoryCombo.getSelectedItem();
        
        project_nameLabel.setForeground(Color.black);
        nameLabel.setForeground(Color.black);
        categoryLabel.setForeground(Color.black);
        dateLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
        
            pname="";
        }
        
         
        
        if(((categoryCombo.getSelectedItem().equals("Labour"))||(categoryCombo.getSelectedItem().equals("Head of Contract")))&&project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
            flag++;
        }
         if(nameCombo.getSelectedItem().equals("Select"))
        {
            nameLabel.setForeground(Color.red);
            flag++;
        }
        if(categoryCombo.getSelectedItem().equals("Select"))
        {
            categoryLabel.setForeground(Color.red);
            flag++;
        }
        
        if(amountTextField.getText().equals(""))
        {
            amountLabel.setForeground(Color.red);
            flag++;
        }
        
          if (date.getEditor().getText().equals("") )
        {
            dateLabel.setForeground(Color.red);
            flag++;       
        }
        
          
        if(flag == 0)
        {
            
            amount   = Integer.parseInt(amountTextField.getText());
            check    = checkTextField.getText(); 
            SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
            String newdate =    formater.format(date.getDate()); 
          
            
            try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                 // java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Payment(category,cname,pname,pdate,amount,checkno) values(?,?,?,?,?,?)");    
                                               
                        prp.setString(1,category);
                        prp.setString(2,cname);
                        prp.setString(3,pname);  
                        prp.setString(4,newdate);
                        prp.setInt(5,amount);
                        prp.setString (6, check);
                        prp.executeUpdate(); 
                        JOptionPane.showMessageDialog(null,"payment added succesfully");
                       
                         project_nameCombo.setSelectedItem("Select");
                         nameCombo.setSelectedItem("Select");
                         categoryCombo.setSelectedItem("Select");
                         amountTextField.setText(""); 
                         checkTextField.setText("");
                         date.getEditor().setText("");
                         con.commit();
                         con.close();
             }                               
             
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Payment error"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"payment err:"+e);
               
            }
          
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void amountTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountTextFieldFocusGained
        
        amountLabel.setForeground(Color.black);
        
       
    }//GEN-LAST:event_amountTextFieldFocusGained

    private void amountTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountTextFieldFocusLost

        if(amountTextField.getText().equals(""))
        {
            amountLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldFocusLost

    private void categoryComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryComboItemStateChanged
  
      if(categoryCombo.getSelectedItem().equals("Labour"))
   {
         nameCombo.removeAllItems();
         project_nameCombo.setEnabled(true);
         Functions.FillCombo(nameCombo, "LABNAME","Labour");
         //  Functions.FillCombo( nameCombo, "CUSTNAME ", "Customer");
   
         }
   else if(categoryCombo.getSelectedItem().equals("Vendor"))
      {
        nameCombo.removeAllItems();
        Functions.FillCombo(nameCombo, "VENNAME","Vendor");
        project_nameCombo.setEnabled(false);
   
         }
   else  if(categoryCombo.getSelectedItem().equals("contractor"))
   {     project_nameCombo.setEnabled(true);
         nameCombo.removeAllItems();
         Functions.FillCombo(nameCombo, "contractor","contractor");
   
         }
  
   else if(categoryCombo.getSelectedItem().equals("Partner"))
   {
        project_nameCombo.setEnabled(false);
        nameCombo.removeAllItems();
       nameCombo.addItem("Hyder");
       nameCombo.addItem("Fasal");
       
   }
   
         AutoCompleteDecorator.decorate(nameCombo);
   // TODO add your handling code here:
    }//GEN-LAST:event_categoryComboItemStateChanged

    private void checkTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTextFieldFocusGained

    private void checkTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_checkTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTextFieldFocusLost

    private void amountTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextFieldKeyReleased

        Functions.NumericValidation(amountTextField);
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(Paymentnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paymentnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paymentnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paymentnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Paymentnew().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JComboBox categoryCombo;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel checkLabel;
    private javax.swing.JTextField checkTextField;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labour_daily_chargesLabel;
    private javax.swing.JComboBox nameCombo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox project_nameCombo;
    private javax.swing.JLabel project_nameLabel;
    // End of variables declaration//GEN-END:variables
}