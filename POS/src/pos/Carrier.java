package pos;


import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class Carrier extends javax.swing.JFrame {
    
    String pname,vdate,work,to,from,vno,lname,goods;
    int vcharge,lcharge,total;

    /** Creates new form Career */
    public Carrier() {
        initComponents();
        setTitle("Carrier Details");
        setSize(660, 600);
        setLocation(238,0);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
        Functions.FillCombo(workCombo,"WORK","Names"); 
        Functions.FillCombo(project_nameCombo, "PRONAME", "Project");
        Functions.FillCombo(fromCombo, "Place", "Names");
        Functions.FillCombo(toCombo, "Place", "Names");
        AutoCompleteDecorator.decorate(fromCombo);
        AutoCompleteDecorator.decorate(toCombo);
        AutoCompleteDecorator.decorate(workCombo);
        AutoCompleteDecorator.decorate(project_nameCombo);
        
    }


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
        vehicle_chargeTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        vehicle_numberTextField = new javax.swing.JTextField();
        goodsLabel = new javax.swing.JLabel();
        workLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        workCombo = new javax.swing.JComboBox();
        goodsTextField = new javax.swing.JTextField();
        labour_nameTextField = new javax.swing.JTextField();
        labour_chargeTextField = new javax.swing.JTextField();
        fromCombo = new javax.swing.JComboBox();
        toCombo = new javax.swing.JComboBox();
        extra_expenseLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        labour_daily_chargesLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labour_daily_chargesLabel.setForeground(new java.awt.Color(0, 102, 102));

        project_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        project_nameLabel.setText("Project Name");

        project_nameCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        project_nameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        project_nameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                project_nameComboItemStateChanged(evt);
            }
        });
        project_nameCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                project_nameComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                project_nameComboFocusLost(evt);
            }
        });

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

        vehicle_chargeTextField.setMaximumSize(new java.awt.Dimension(138, 26));
        vehicle_chargeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicle_chargeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vehicle_chargeTextFieldFocusLost(evt);
            }
        });
        vehicle_chargeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vehicle_chargeTextFieldKeyReleased(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        vehicle_numberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehicle_numberTextFieldFocusGained(evt);
            }
        });

        goodsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        goodsLabel.setText("Goods Carries");

        workLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        workLabel.setText("Work");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        workCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        workCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        workCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                workComboItemStateChanged(evt);
            }
        });
        workCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                workComboFocusLost(evt);
            }
        });

        goodsTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                goodsTextFieldFocusGained(evt);
            }
        });

        labour_nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                labour_nameTextFieldFocusGained(evt);
            }
        });

        labour_chargeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                labour_chargeTextFieldFocusGained(evt);
            }
        });
        labour_chargeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labour_chargeTextFieldKeyReleased(evt);
            }
        });

        fromCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        fromCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        toCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        toCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        extra_expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        extra_expenseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        extra_expenseLabel.setForeground(new java.awt.Color(0, 102, 102));
        extra_expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extra_expenseLabel.setText("Transport");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(extra_expenseLabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(project_nameLabel)
                        .addComponent(dateLabel)
                        .addComponent(fromLabel)
                        .addComponent(toLabel)
                        .addComponent(goodsLabel)
                        .addComponent(workLabel)
                        .addComponent(labour_nameLabel)
                        .addComponent(labour_chargeLabel)
                        .addComponent(vehicle_numberLabel)
                        .addComponent(vehicle_chargeLabel)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(labour_daily_chargesLabel)
                        .addGap(241, 241, 241))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(vehicle_chargeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vehicle_numberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labour_chargeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(project_nameCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fromCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goodsTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labour_nameTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(extra_expenseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(project_nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(project_nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromLabel)
                            .addComponent(fromCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(toLabel)
                            .addComponent(toCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goodsLabel)
                            .addComponent(goodsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workLabel)
                            .addComponent(workCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labour_nameLabel)
                    .addComponent(labour_nameTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labour_chargeLabel)
                    .addComponent(labour_chargeTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicle_numberLabel)
                    .addComponent(vehicle_numberTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicle_chargeLabel)
                    .addComponent(vehicle_chargeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labour_daily_chargesLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vehicle_chargeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicle_chargeTextFieldKeyReleased
            Functions.NumericValidation(vehicle_chargeTextField);     
    }//GEN-LAST:event_vehicle_chargeTextFieldKeyReleased

    private void labour_chargeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labour_chargeTextFieldKeyReleased
            Functions.NumericValidation(labour_chargeTextField);        // TODO add your handling code here:
    }//GEN-LAST:event_labour_chargeTextFieldKeyReleased

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int flag = 0;
        //String newdate="";
        
        //Functions.dateFunction(date,newdate, dateLabel, flag);
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
            flag++;
        }
        
        if (date.getEditor().getText().equals("") )
        {
        dateLabel.setForeground(Color.red); 
        
        }
        if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
            flag++;
        }
        
       if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
            flag++;
        }
        
        
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
            flag++;
        }
        
        if(vehicle_chargeTextField.getText().equals(""))
        {
            vehicle_chargeLabel.setForeground(Color.red);
            flag++;
        }
        
        if(flag == 0)
        {
            pname =(String)project_nameCombo.getSelectedItem();
            work = (String)workCombo.getSelectedItem();
            vcharge =Integer.parseInt(vehicle_chargeTextField.getText());
            from = (String) fromCombo.getSelectedItem();
            to = (String) toCombo.getSelectedItem();
            
            if(vehicle_numberTextField.getText().equals(""))
            {
                vno = "";
            } else vno = vehicle_numberTextField.getText();
            
            if(goodsTextField.getText().equals(""))
            {
                goods = "";
            } else goods = goodsTextField.getText();
            
            if(labour_nameTextField.getText().equals(""))
            {
                lname = "";
            } else lname = labour_nameTextField.getText();
            
            if(labour_chargeTextField.getText().equals(""))
            {
                lcharge = 0;
            }else lcharge =Integer.parseInt(labour_chargeTextField.getText());
            
            total = lcharge+vcharge ;
            
            try 
            {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
                String newdate=    formater.format(date.getDate()); 
                //java.sql.Date newdate = new java.sql.Date(new java.util.Date().getTime());
                PreparedStatement prp=con.prepareStatement("insert into Transport (TRAN_PRO,TRAN_DATE,TRAN_WORK,TRAN_FROM,TRAN_TO,TRAN_GOODS,TRAN_DRIVER,TRAN_DRI_CHARGE,TRAN_VEHICLE,TRAN_VEH_CHARGE,TOTAL) values(?,?,?,?,?,?,?,?,?,?,?)");    
                                               
                        
                        prp.setString(1,pname);
                        prp.setString(2,newdate);  
                        prp.setString(3,work);
                        prp.setString(4,from);
                        prp.setString(5, to);
                        prp.setString(6, goods);
                        prp.setString(7, lname);
                        prp.setInt(8, lcharge);
                        prp.setString(9,vno);
                        prp.setInt(10,vcharge);
                        prp.setInt(11,total);
                        prp.executeUpdate(); 
                         
                         Functions.DisposeFunc(this);
                         vehicle_chargeTextField.setText("");
                         labour_nameTextField.setText("");
                         labour_chargeTextField.setText(""); 
                         vehicle_numberTextField.setText("");
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
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void project_nameComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_project_nameComboFocusGained

        project_nameLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_project_nameComboFocusGained

    private void project_nameComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_project_nameComboFocusLost

        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_project_nameComboFocusLost

    private void workComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workComboFocusGained

        workLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
        if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboFocusGained

    private void workComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workComboFocusLost
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboFocusLost

    private void goodsTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_goodsTextFieldFocusGained

        goodsLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
       if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
        if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
        }
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_goodsTextFieldFocusGained

    private void vehicle_numberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicle_numberTextFieldFocusGained

        vehicle_numberLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
     if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
       if(toCombo.getSelectedItem().equals("Select"))
       {
            toLabel.setForeground(Color.red);
        }
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_numberTextFieldFocusGained

    private void labour_nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labour_nameTextFieldFocusGained

        labour_nameLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
       if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
        }
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_labour_nameTextFieldFocusGained

    private void vehicle_chargeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicle_chargeTextFieldFocusGained

        vehicle_chargeLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
       if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
       if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
        }
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_chargeTextFieldFocusGained

    private void vehicle_chargeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehicle_chargeTextFieldFocusLost

        if(vehicle_chargeTextField.getText().equals(""))
        {
            vehicle_chargeLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicle_chargeTextFieldFocusLost

    private void labour_chargeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_labour_chargeTextFieldFocusGained

        labour_chargeLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        if(fromCombo.getSelectedItem().equals("Select"))
        {
            fromLabel.setForeground(Color.red);
        }
        
        if(toCombo.getSelectedItem().equals("Select"))
        {
            toLabel.setForeground(Color.red);
        }
        
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_labour_chargeTextFieldFocusGained

    private void project_nameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_project_nameComboItemStateChanged

        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        } else project_nameLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_project_nameComboItemStateChanged

    private void workComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_workComboItemStateChanged

        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        } else workLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Functions.NewItem(fromCombo,"Place");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Functions.NewItem(toCombo, "Place");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Functions.NewItem(workCombo, "WORK");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Carrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Carrier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel extra_expenseLabel;
    private javax.swing.JComboBox fromCombo;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel goodsLabel;
    private javax.swing.JTextField goodsTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel labour_chargeLabel;
    private javax.swing.JTextField labour_chargeTextField;
    private javax.swing.JLabel labour_daily_chargesLabel;
    private javax.swing.JLabel labour_nameLabel;
    private javax.swing.JTextField labour_nameTextField;
    private javax.swing.JComboBox project_nameCombo;
    private javax.swing.JLabel project_nameLabel;
    private javax.swing.JComboBox toCombo;
    private javax.swing.JLabel toLabel;
    private javax.swing.JLabel vehicle_chargeLabel;
    private javax.swing.JTextField vehicle_chargeTextField;
    private javax.swing.JLabel vehicle_numberLabel;
    private javax.swing.JTextField vehicle_numberTextField;
    private javax.swing.JComboBox workCombo;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}