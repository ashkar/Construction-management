

import java.awt.List;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.tools.ant.types.Path;


public class test2 extends javax.swing.JFrame {
    int cid;
    

   
    public test2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datebutton = new javax.swing.JButton();
        datepicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datebutton.setText("date insert trial");
        datebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datebuttonActionPerformed(evt);
            }
        });

        datepicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datepickerActionPerformed(evt);
            }
        });

        jLabel1.setText("hi");

        jLabel2.setText("hi2");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        t3.setText("jLabel3");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("joption n combo test");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("quick test");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("copy test");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addComponent(jButton2)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jButton1)
                    .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(t3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datebuttonActionPerformed

         //datepicker.equals("");   
        //String abc = datepicker.getEditor().getText().equals("")         
        if (datepicker.getEditor().getText().equals("") )
        {
        JOptionPane.showMessageDialog(null, "Date idedo..grr..");
        
        }
        else{            
               SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
               String bbb=    formater.format(datepicker.getDate());
                 jLabel2.setText(bbb);
                             
                try {     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                          Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                          PreparedStatement prp=con.prepareStatement("insert into test values(?,?)");
                           
                          
                          prp.setString(1, "abc");
                          prp.setString(2, bbb);
                          prp.executeUpdate(); 
                          JOptionPane.showMessageDialog(null,"Date added succesfully");
                          con.commit();
                          con.close();
                          
                        }                               
                     catch(SQLException e)
                     {JOptionPane.showMessageDialog(null,"1"+e); }
                    catch(Exception e)
                    { JOptionPane.showMessageDialog(null,"The 1st error is:"+e);
                        System.out.println(e.getMessage());}
        
        }
    }//GEN-LAST:event_datebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int abc= 0;  
       String aa = "02/05/13";
       String bb = "04/30/2013";
          try      
            { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  Statement  st = con.createStatement();
                  ResultSet res = st.executeQuery("select COUNT(INVDATE) from Inventory where INVDATE between #"+aa+"# and #"+bb+"# ");
                   Boolean rec = res.next();
                  System.out.println("connected successfully");
                  
                  do
                  {
                     if(rec==true) {
                      abc =res.getInt(1);
                      }
                  }while (res.next());
                  
        //    String aaa = Integer.toString(abc)     ; 
                  
                    JOptionPane.showMessageDialog(null,""+abc);
        
        
        
            }   
          catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null,""+e);
            }
          catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
            }        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datepickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datepickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datepickerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
        
        int total = num1/num2;
        String total2 = Integer.toString(total);
        t3.setText(total2);
               
        
        
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Select = "Sports",input="";
        int num=0, i=0;
        try
        {            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
            Statement  st = con.createStatement();
            ResultSet res = st.executeQuery("select PRONAME from Project");
            while(res.next())
            {
                num++;
             }
            
            String[] sport = new String[num];
            
            ResultSet res1 = st.executeQuery("select PRONAME from Project");
            while(res1.next())
            {
                
                if(i<num)
                {
                    sport[i] = res1.getString("PRONAME");
                }
                i++;
            }
             input = (String) JOptionPane.showInputDialog(test2.this, "Please select your favorite sport",Select, JOptionPane.INFORMATION_MESSAGE,null,sport,null);
         }
        catch(SQLException e1)
        {
            JOptionPane.showMessageDialog(null,"INVALID datatype");
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"The error is1:"+e2);
            System.out.println(e2.getMessage());
        }


     JOptionPane.showMessageDialog(null,"You have selected: "+input);
    
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
//  String   abc=   Functions.comboption(this,"Sports","PRONAME","Project", "abc");
  //      JOptionPane.showMessageDialog(null,"You have selected: "+abc);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//            
//        Path source = Paths.
//     Path newdir = ...
//     Files.move(source, newdir.resolve(source.getFileName()), REPLACE_EXISTING);
// 
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new test2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datebutton;
    private org.jdesktop.swingx.JXDatePicker datepicker;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t3;
    // End of variables declaration//GEN-END:variables
}
