
package pos;
import java.sql.*;
import java.lang.System.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.JXDatePicker;


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datebutton.setText("date ");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(datebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jButton2))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3))
                .addContainerGap(74, Short.MAX_VALUE))
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
        else{            // Date ccc= (Date) datepicker.getDate();
                          //   jLabel1.setText(abc);
                // Date bcd = (Date) datepicker.getDate(); 
               // DateFormat shortDf = DateFormat.getDateInstance(DateFormat.SHORT);
                //Date date =(Date) shortDf.parse(abc);
               SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
               String bbb=    formater.format(datepicker.getDate());
                 jLabel2.setText(bbb);
               //Date date= (Date) formater.parse(abc); 
                //JOptionPane.showMessageDialog(null,""+date);
               //Date date = (Date) datepicker.getDate(); 
               //Date date=  (Date) new SimpleDateFormat("MM/dd/yyyy",Locale.ENGLISH).parse(abc);
                // java.sql.Date sqlDate = new java.sql.Date(datepicker.getDate());
               
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
        
          try      
            { Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  Statement  st = con.createStatement();
                  ResultSet res = st.executeQuery("select COUNT(INVDATE) from Inventory where INVDATE between #02/25/13# and #04/10/2013# ");
                   Boolean rec = res.next();
                  System.out.println("connected successfully");
                  
                  do
                  {
                     if(rec==true) {
                      abc =res.getInt(1);
                      }
                  }while (res.next());
                  
            String aaa = Integer.toString(abc)     ; 
                  
                    JOptionPane.showMessageDialog(null,""+aaa);
        
        
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JLabel t3;
    // End of variables declaration//GEN-END:variables
}
