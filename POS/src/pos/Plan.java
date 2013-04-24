/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Plan extends javax.swing.JFrame {
 int Charge , Expense,Total;
 String Details,Cname;
    /**
     * Creates new form Plan
     */
    public Plan() {
        initComponents();
        setTitle("Plan");
        setLocation(238,0);
        setSize(660,500);
        getContentPane().setBackground(new Color(129,134,138));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalLabel = new javax.swing.JLabel();
        chargeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        detailsLabel = new javax.swing.JLabel();
        expenseLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        chargeTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        planLabel = new javax.swing.JLabel();
        expenseTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        cashLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        totalLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        totalLabel.setText("Total");

        chargeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        chargeLabel.setText("Plan charge");

        detailsTextArea.setColumns(20);
        detailsTextArea.setFont(new java.awt.Font("Comic Sans MS", 0, 13));
        detailsTextArea.setRows(5);
        detailsTextArea.setAutoscrolls(false);
        detailsTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                detailsTextAreaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(detailsTextArea);

        detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        detailsLabel.setText("Work Details");

        expenseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        expenseLabel.setText("Extra Expenses");

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        chargeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                chargeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                chargeTextFieldFocusLost(evt);
            }
        });
        chargeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chargeTextFieldKeyReleased(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nameLabel.setText("Client Name");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        planLabel.setFont(new java.awt.Font("Times New Roman", 1, 36));
        planLabel.setForeground(new java.awt.Color(0, 102, 102));
        planLabel.setText("Plan / Design ");

        expenseTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expenseTextFieldFocusGained(evt);
            }
        });
        expenseTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                expenseTextFieldKeyReleased(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        cashLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cashLabel.setForeground(new java.awt.Color(255, 0, 0));
        cashLabel.setText("Cash");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(planLabel)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalLabel)
                                    .addComponent(expenseLabel)
                                    .addComponent(detailsLabel)
                                    .addComponent(chargeLabel)
                                    .addComponent(nameLabel))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(expenseTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                            .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                            .addComponent(chargeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(183, 183, 183))
                                    .addComponent(cashLabel)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chargeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chargeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenseLabel)
                    .addComponent(expenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(cashLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       
        int flag = 0;
        
        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
            flag++;
        }
        
        if(chargeTextField.getText().equals(""))
        {
            chargeLabel.setForeground(Color.red);
            flag++;
        }
        
        if(flag == 0)
         {  
             Cname= nameTextField.getText();
             Details = detailsTextArea.getText();
             Charge=Integer.parseInt(chargeTextField.getText());
             Expense =Integer.parseInt( expenseTextField.getText());
             Total=Charge+Expense;
             
              
             try {
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Plan values(?,?,?,?,?,?)");    
                                               
                        prp.setString(1,Cname);
                        prp.setString(2,Details);
                        prp.setInt(3,Charge);
                        prp.setInt(4,Expense);
                        prp.setInt(5,Total);
                        prp.setDate(6,sqlDate);
                                            
                        prp.executeUpdate(); 
                         JOptionPane.showMessageDialog(null,"Plan details added succesfully");
                         
                         nameTextField.setText("");
                         chargeTextField.setText("");
                         expenseTextField.setText("");
                         detailsTextArea.setText("");
                         cashLabel.setText("Cash");
                         con.commit();
                         con.close();
             }                               
             
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,""+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
                System.out.println(e.getMessage());
            }
             
             
                 
          }  
       
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained

        nameLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost

        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void chargeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chargeTextFieldFocusGained

        chargeLabel.setForeground(Color.black);
        
        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeTextFieldFocusGained

    private void chargeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chargeTextFieldFocusLost

        if(chargeTextField.getText().equals(""))
        {
            chargeLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeTextFieldFocusLost

    private void chargeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chargeTextFieldKeyReleased
        
        if(Functions.NumericValidate(chargeTextField))
        {
            if(chargeTextField.getText().equals(""))
            {
                Charge = 0;
            } else Charge = Integer.parseInt(chargeTextField.getText());
            
            if(expenseTextField.getText().equals(""))
            {
                Expense = 0;
            } else Expense = Integer.parseInt(expenseTextField.getText());
            
            Total = Charge + Expense ;
            
            cashLabel.setText(Integer.toString(Total));
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeTextFieldKeyReleased

    private void expenseTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expenseTextFieldFocusGained

        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        if(chargeTextField.getText().equals(""))
        {
            chargeLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseTextFieldFocusGained

    private void expenseTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_expenseTextFieldKeyReleased

        if(Functions.NumericValidate(expenseTextField))
        {
            if(chargeTextField.getText().equals(""))
            {
                Charge = 0;
            } else Charge = Integer.parseInt(chargeTextField.getText());
            
            if(expenseTextField.getText().equals(""))
            {
                Expense = 0;
            } else Expense = Integer.parseInt(expenseTextField.getText());
            
            Total = Charge + Expense ;
            
            cashLabel.setText(Integer.toString(Total));
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseTextFieldKeyReleased

    private void detailsTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_detailsTextAreaFocusGained

        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsTextAreaFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Plan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JLabel chargeLabel;
    private javax.swing.JTextField chargeTextField;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JLabel expenseLabel;
    private javax.swing.JTextField expenseTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel planLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
