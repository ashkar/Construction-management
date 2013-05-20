/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Date;
import javax.swing.JComboBox;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;




/**
 *
 * @author lenovo
 */
public class Project extends javax.swing.JFrame {

    String Cname,Pname,Address,Details ; 
    int Cid;
     int temp = 0;
    JComboBox comboname;
    //Date sqlDate;
    
    /**
     * Creates new form Project
     */
    public Project() {
        initComponents();
        setTitle("Projec Details");
        setSize(660,500);
           setLocation(284,45);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
       //Functions.FillCombo( cnameCombo, "CUSTNAME" , "Customer");
       //AutoCompleteDecorator.decorate(cnameCombo);
        
    }
    
     public Project(int i,JComboBox combo) {
        initComponents();
        setTitle("Projec Details");
        setSize(660,500);
        setLocation(238,0);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
       //Functions.FillCombo( cnameCombo, "CUSTNAME" , "Customer");
      // AutoCompleteDecorator.decorate(cnameCombo);
        comboname = combo;
        temp = i;
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        c_nameLabel = new javax.swing.JLabel();
        p_nameLabel = new javax.swing.JLabel();
        s_addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        s_addressTextArea = new javax.swing.JTextArea();
        detailsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        projectTextField = new javax.swing.JTextField();
        cnametf = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Project details");

        c_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        c_nameLabel.setText("Customer Name");

        p_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        p_nameLabel.setText("Project Name");

        s_addressLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        s_addressLabel.setText("Site Address");

        s_addressTextArea.setColumns(20);
        s_addressTextArea.setRows(5);
        jScrollPane1.setViewportView(s_addressTextArea);

        detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        detailsLabel.setText("Other Details");

        detailsTextArea.setColumns(20);
        detailsTextArea.setRows(5);
        jScrollPane2.setViewportView(detailsTextArea);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        phoneLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        phoneLabel.setText("Phone");

        phoneTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_addressLabel)
                    .addComponent(detailsLabel)
                    .addComponent(c_nameLabel)
                    .addComponent(p_nameLabel)
                    .addComponent(phoneLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(projectTextField)
                    .addComponent(cnametf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addGap(128, 128, 128))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_nameLabel)
                    .addComponent(cnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
  
        String cname,pname,address,details,mobile ;
        int flag=0;
        
          c_nameLabel.setForeground(Color.black);
          p_nameLabel.setForeground(Color.black);
        if(cnametf.getText().equals("") )
            {
            c_nameLabel.setForeground(Color.red);
            flag++;
            }   
        if(projectTextField.getText().equals(""))
            {
            p_nameLabel.setForeground(Color.red);
            flag++;
            }

         
    if(flag==0)
         {  
             cname = (String) cnametf.getText();
             pname = projectTextField.getText();
             address=s_addressTextArea.getText();
             details=detailsTextArea.getText();
             mobile = phoneTextField.getText();
             
              
             try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  Statement  st = con.createStatement();
                  java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Project (PRONAME,CUSTNAME,ADDRESS,DETAILS,PRODATE,Mobile) values(?,?,?,?,?,?)");    
                                               
                        prp.setString(1,pname);
                        prp.setString(2,cname);
                        prp.setString(3,address);
                        prp.setString(4,details);
                        prp.setDate(5,sqlDate);
                        prp.setString(6,mobile);
                        prp.executeUpdate(); 
                       //  JOptionPane.showMessageDialog(null,"New Project Added");
                         
                        if(temp == 1)
                         {
                             comboname.addItem(pname);
                             comboname.setSelectedItem(pname);
                         }
                        Functions.DisposeFunc(this);
                         cnametf.setText("");
                         projectTextField.setText("");
                         s_addressTextArea.setText("");
                         detailsTextArea.setText("");
                         con.commit();
                         con.close();
                         dispose();
             }                               
             
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The Err is :"+e);
                System.out.println(e.getMessage());
            } 
    }//GEN-LAST:event_addButtonActionPerformed
    }
        private void phoneTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTextFieldKeyReleased
       Functions.NumericValidation(phoneTextField);
    }//GEN-LAST:event_phoneTextFieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Project().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel c_nameLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cnametf;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel p_nameLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField projectTextField;
    private javax.swing.JLabel s_addressLabel;
    private javax.swing.JTextArea s_addressTextArea;
    // End of variables declaration//GEN-END:variables
}
