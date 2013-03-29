
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datebutton.setText("date ");
        datebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datebuttonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datepicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(datepicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(datebutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datebuttonActionPerformed
      
        
        String abc = datepicker.getDate().toString(); 
        if (abc=="")
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
                  ResultSet res = st.executeQuery("select COUNT(datetest) from test where datetest between #03/06/13# and #03/04/2013# ");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
