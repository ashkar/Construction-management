package pos;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class Add extends javax.swing.JFrame {
String brand,pname, material ,vendor,billid,work ; 

//int i = 0;
double quantity,cost,rate ,totalcost,totalrate ;
    /**
     * Creates new form Add
     */
    public Add() {

        initComponents();
        Functions.FillCombo(project_nameCombo, "PRONAME", "Project");
        Functions.FillCombo(vendorCombo, "VENNAME", "Vendor");
        Functions.FillCombo(workCombo, "WORK", "Names");
        Functions.FillCombo(materialCombo, "Material", "Names");
        
        AutoCompleteDecorator.decorate(project_nameCombo);
        AutoCompleteDecorator.decorate(vendorCombo);
        AutoCompleteDecorator.decorate(workCombo);
        AutoCompleteDecorator.decorate(materialCombo);
        setTitle("Add");
        setVisible(true);
        setSize(660,770);
        setLocation(238,0);
        getContentPane().setBackground(new Color(129,134,138));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        costLabel = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        rateLabel = new javax.swing.JLabel();
        vendorLabel = new javax.swing.JLabel();
        materialLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        bill_noLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        costTextField = new javax.swing.JTextField();
        project_nameLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        bill_noTextField = new javax.swing.JTextField();
        workLabel = new javax.swing.JLabel();
        add_vendorButton = new javax.swing.JButton();
        add_projectButton = new javax.swing.JButton();
        project_nameCombo = new javax.swing.JComboBox();
        bill_dateLabel = new javax.swing.JLabel();
        date = new org.jdesktop.swingx.JXDatePicker();
        brandLabel = new javax.swing.JLabel();
        brandTextField = new javax.swing.JTextField();
        vendorCombo = new javax.swing.JComboBox();
        workCombo = new javax.swing.JComboBox();
        addwork = new javax.swing.JButton();
        materialCombo = new javax.swing.JComboBox();
        materialButton = new javax.swing.JButton();
        typeCombo = new javax.swing.JComboBox();
        typeLabel = new javax.swing.JLabel();
        measuretypeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Material Inventory");

        jPanel1.setBackground(new java.awt.Color(129, 134, 138));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        costLabel.setBackground(new java.awt.Color(255, 255, 255));
        costLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        costLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        costLabel.setText("Cost");

        rateTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rateTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rateTextFieldFocusLost(evt);
            }
        });
        rateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rateTextFieldKeyReleased(evt);
            }
        });

        rateLabel.setBackground(new java.awt.Color(255, 255, 255));
        rateLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        rateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rateLabel.setText("Rate");

        vendorLabel.setBackground(new java.awt.Color(255, 255, 255));
        vendorLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        vendorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vendorLabel.setText("Vendor");

        materialLabel.setBackground(new java.awt.Color(255, 255, 255));
        materialLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        materialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materialLabel.setText("Material");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        bill_noLabel.setBackground(new java.awt.Color(255, 255, 255));
        bill_noLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        bill_noLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bill_noLabel.setText("Bill No.");

        quantityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTextFieldFocusLost(evt);
            }
        });
        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyReleased(evt);
            }
        });

        costTextField.setNextFocusableComponent(rateTextField);
        costTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                costTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                costTextFieldFocusLost(evt);
            }
        });
        costTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costTextFieldKeyReleased(evt);
            }
        });

        project_nameLabel.setBackground(new java.awt.Color(255, 255, 255));
        project_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        project_nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        project_nameLabel.setText("Project Name");

        quantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        quantityLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel.setText("Quantity");

        bill_noTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bill_noTextFieldFocusGained(evt);
            }
        });

        workLabel.setBackground(new java.awt.Color(255, 255, 255));
        workLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workLabel.setText("Work");

        add_vendorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        add_vendorButton.setBorder(null);
        add_vendorButton.setBorderPainted(false);
        add_vendorButton.setContentAreaFilled(false);
        add_vendorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add_vendorButton.setFocusPainted(false);
        add_vendorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_vendorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_vendorButtonMouseExited(evt);
            }
        });
        add_vendorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_vendorButtonActionPerformed(evt);
            }
        });

        add_projectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        add_projectButton.setBorder(null);
        add_projectButton.setBorderPainted(false);
        add_projectButton.setContentAreaFilled(false);
        add_projectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add_projectButton.setFocusPainted(false);
        add_projectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_projectButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_projectButtonMouseExited(evt);
            }
        });
        add_projectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_projectButtonActionPerformed(evt);
            }
        });

        project_nameCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        project_nameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        project_nameCombo.setNextFocusableComponent(materialCombo);
        project_nameCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                project_nameComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                project_nameComboFocusLost(evt);
            }
        });

        bill_dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        bill_dateLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        bill_dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bill_dateLabel.setText("Bill Date");

        brandLabel.setBackground(new java.awt.Color(255, 255, 255));
        brandLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        brandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandLabel.setText("Brand");

        brandTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                brandTextFieldFocusGained(evt);
            }
        });

        vendorCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        vendorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        vendorCombo.setNextFocusableComponent(typeCombo);
        vendorCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vendorComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendorComboFocusLost(evt);
            }
        });

        workCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        workCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        workCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                workComboFocusLost(evt);
            }
        });

        addwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addwork.setBorder(null);
        addwork.setBorderPainted(false);
        addwork.setContentAreaFilled(false);
        addwork.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addwork.setFocusPainted(false);
        addwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addworkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addworkMouseExited(evt);
            }
        });
        addwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addworkActionPerformed(evt);
            }
        });

        materialCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        materialCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        materialCombo.setNextFocusableComponent(quantityTextField);
        materialCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                materialComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                materialComboFocusLost(evt);
            }
        });

        materialButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        materialButton.setBorder(null);
        materialButton.setBorderPainted(false);
        materialButton.setContentAreaFilled(false);
        materialButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        materialButton.setFocusPainted(false);
        materialButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                materialButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                materialButtonMouseExited(evt);
            }
        });
        materialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButtonActionPerformed(evt);
            }
        });

        typeCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Per Unit", "Total Price" }));
        typeCombo.setNextFocusableComponent(costTextField);
        typeCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typeComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                typeComboFocusLost(evt);
            }
        });

        typeLabel.setBackground(new java.awt.Color(255, 255, 255));
        typeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("Price type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel)
                            .addComponent(materialLabel)
                            .addComponent(project_nameLabel)
                            .addComponent(vendorLabel)
                            .addComponent(bill_noLabel)
                            .addComponent(bill_dateLabel)
                            .addComponent(workLabel)
                            .addComponent(typeLabel)
                            .addComponent(brandLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rateLabel)
                                .addComponent(costLabel)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(brandTextField)
                                .addComponent(materialCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(workCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vendorCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typeCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bill_noTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(project_nameCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(measuretypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(add_projectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(materialButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_vendorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addwork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(project_nameLabel)
                        .addComponent(project_nameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_projectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materialLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(materialButton)
                        .addComponent(materialCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel)
                    .addComponent(measuretypeTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendorLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(add_vendorButton)
                        .addComponent(vendorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeLabel)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costLabel)
                            .addComponent(costTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rateLabel)
                            .addComponent(rateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bill_noLabel)
                            .addComponent(bill_noTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bill_dateLabel)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workLabel)
                            .addComponent(workCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addwork))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        dispose();
        
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int flag = 0;
        String quan1="",quan2="",quan = "";
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
            flag++;
        }
        if(typeCombo.getSelectedItem().equals("Select"))
        {
            typeLabel.setForeground(Color.red);
            flag++;
        }
        if (date.getEditor().getText().equals("") )
        {
        bill_dateLabel.setForeground(Color.red); 
            flag++;
        }
        if(materialCombo.getSelectedItem().equals(""))
        {
            materialLabel.setForeground(Color.red);
            flag++;
        }
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
            flag++;
        }
        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
            flag++;
        }
        if(costTextField.getText().equals(""))
        {
            costLabel.setForeground(Color.red);
            flag++;
        }
        if(rateTextField.getText().equals(""))
        {
            rateLabel.setForeground(Color.red);
            flag++;
        }
        // DATE VALIDATION SHOULD BE HERE
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
            flag++;
        }
        if(!costTextField.getText().equals("") && !rateTextField.getText().equals(""))
        {
            rate = Double.parseDouble(rateTextField.getText());
            cost = Double.parseDouble(costTextField.getText());
            
            if(rate < cost)
            {
                flag++;
                rateTextField.setText("");
                rateLabel.setForeground(Color.red);
                JOptionPane.showMessageDialog(null,"Rate Cannot Be Less Than Cost");
            }
        }
        
        
        
        if(flag==0)
        {    pname    =(String)project_nameCombo.getSelectedItem();
             material = (String) materialCombo.getSelectedItem();
             quantity =Double.parseDouble(quantityTextField.getText());
             cost     =Double.parseDouble(costTextField.getText());
             rate     =Double.parseDouble(rateTextField.getText());
             quan1    = quantityTextField.getText();
             quan2    = measuretypeTextField.getText();
             quan     = quan1 + quan2 ; 
             
             
             if(brandTextField.getText().equals(""))
             {
                 brand = "";
             }
             else
             {
                 brand = brandTextField.getText();
             }
             if(bill_noTextField.getText().equals(""))
             {
                 billid = "";
             }
             else
             {
                 billid = bill_noTextField.getText();
             }
     
             work     =(String)workCombo.getSelectedItem();
             vendor   =(String)vendorCombo.getSelectedItem();
            
             if(typeCombo.getSelectedItem().equals("Per Unit"))
             {  totalcost  = cost * quantity ;
                totalrate  = rate * quantity ;   
             }
             else
                 
             {
                 totalcost=cost;
                 totalrate=rate;
             }   
             try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  //Statement  st = con.createStatement();
                  
                  
                  SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
               String newdate=    formater.format(date.getDate()); 
                java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Inventory(BRAND,PRONAME,MATERIAL,QUANTITY,VENNAME,INVCOST,INVPRICE,INVTOTALCOST,INVTOTALPRICE,INVDATE,INVBILLNO,WORKNAME,BILLDATE) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");    
                                               
                        prp.setString(1, brand); 
                        prp.setString(2,pname);
                        prp.setString(3,material);  
                        prp.setString(4,quan);
                        prp.setString(5,vendor);
                        prp.setDouble(6, cost);
                        prp.setDouble(7, rate);
                        prp.setDouble(8, totalcost);
                        prp.setDouble(9, totalrate);
                        prp.setDate(10,sqlDate);
                        prp.setString(11,billid);
                        prp.setString(12,work);
                        prp.setString(13, newdate);
                        prp.executeUpdate(); 
                        Functions.DisposeFunc(this);
                         project_nameCombo.setSelectedItem("Select");
                         materialCombo.setSelectedItem("Select");
                         quantityTextField.setText("");
                         costTextField.setText(""); 
                         rateTextField.setText("");
                         bill_noTextField.setText("");
                         workCombo.setSelectedItem("Select");
                         vendorCombo.setSelectedItem("Select");
                         brandTextField.setText("");
                         date.getEditor().setText("");
                         workLabel.setForeground(Color.black);
                         vendorLabel.setForeground(Color.black);
                         typeLabel.setForeground(Color.black);
                         bill_dateLabel.setForeground(Color.black);
                       
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
            }
             
             
                 
             
              
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void add_projectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_projectButtonActionPerformed
    Project project =new Project(1,project_nameCombo);        // TODO add your handling code here:
    }//GEN-LAST:event_add_projectButtonActionPerformed

    private void add_vendorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_vendorButtonActionPerformed
    Vendor vendor=new Vendor(1,vendorCombo);        // TODO add your handling code here:
    }//GEN-LAST:event_add_vendorButtonActionPerformed

    private void quantityTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyReleased
        Functions.NumericValidate(quantityTextField);        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldKeyReleased

    private void costTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costTextFieldKeyReleased
        Functions.NumericValidate(costTextField);// TODO add your handling code here:
    }//GEN-LAST:event_costTextFieldKeyReleased

    private void rateTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rateTextFieldKeyReleased
Functions.NumericValidate(rateTextField);        // TODO add your handling code here:
    }//GEN-LAST:event_rateTextFieldKeyReleased

    private void add_projectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_projectButtonMouseEntered

        add_projectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_projectButtonMouseEntered

    private void add_projectButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_projectButtonMouseExited

        add_projectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_projectButtonMouseExited

    private void add_vendorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_vendorButtonMouseEntered

        add_vendorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_vendorButtonMouseEntered

    private void add_vendorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_vendorButtonMouseExited

        add_vendorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_add_vendorButtonMouseExited

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

    private void quantityTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTextFieldFocusGained

        quantityLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldFocusGained

    private void quantityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTextFieldFocusLost

        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldFocusLost

    private void brandTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_brandTextFieldFocusGained

        brandLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
       if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTextFieldFocusGained

    private void vendorComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendorComboFocusGained

        vendorLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
       if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorComboFocusGained

    private void vendorComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendorComboFocusLost

        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_vendorComboFocusLost

    private void costTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costTextFieldFocusGained

        costLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_costTextFieldFocusGained

    private void costTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costTextFieldFocusLost

        if(costTextField.getText().equals(""))
        {
            costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_costTextFieldFocusLost

    private void rateTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateTextFieldFocusGained

        rateLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
        }
        
        if(costTextField.getText().equals(""))
        {
            costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTextFieldFocusGained

    private void rateTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rateTextFieldFocusLost

        if(rateTextField.getText().equals(""))
        {
            rateLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTextFieldFocusLost

    private void bill_noTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bill_noTextFieldFocusGained

        bill_noLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
        if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
        }
        
        if(costTextField.getText().equals(""))
        {
            costLabel.setForeground(Color.red);
        }
        
        if(rateTextField.getText().equals(""))
        {
            rateLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_noTextFieldFocusGained
    
    private void workComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workComboFocusGained

        workLabel.setForeground(Color.black);
        
        if(project_nameCombo.getSelectedItem().equals("Select"))
        {
            project_nameLabel.setForeground(Color.red);
        }
        
      if(materialCombo.getSelectedItem().equals("Select"))
        {
            materialLabel.setForeground(Color.red);
        }
        
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        if(vendorCombo.getSelectedItem().equals("Select"))
        {
            vendorLabel.setForeground(Color.red);
        }
        
        if(costTextField.getText().equals(""))
        {
            costLabel.setForeground(Color.red);
        }
        
        if(rateTextField.getText().equals(""))
        {
            rateLabel.setForeground(Color.red);
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

    private void addworkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addworkMouseEntered
 addwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_addworkMouseEntered

    private void addworkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addworkMouseExited
  addwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_addworkMouseExited

    private void addworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addworkActionPerformed

        String worknew =  JOptionPane.showInputDialog(null, "Enter New Work");
        while (worknew.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter new work");
            worknew = JOptionPane.showInputDialog(null, "Enter New Work");
        }
        try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                 PreparedStatement prp=con.prepareStatement("insert into Names(WORK) values(?)");
                 prp.setString(1, worknew);
                 prp.executeUpdate(); 
                 workCombo.setSelectedItem(worknew);
                  con.commit();
                  con.close();
        }
         
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
             }     
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addworkActionPerformed

    private void materialComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_materialComboFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_materialComboFocusGained

    private void materialComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_materialComboFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_materialComboFocusLost

    private void materialButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButtonMouseEntered

    private void materialButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materialButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButtonMouseExited

    private void materialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButtonActionPerformed
        String matnew =  JOptionPane.showInputDialog(null, "Enter New  Material");
        while (matnew.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter new Material");
            matnew = JOptionPane.showInputDialog(null, "Enter New Material");
        }
        try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                 PreparedStatement prp=con.prepareStatement("insert into Names(Material) values(?)");
                 prp.setString(1, matnew);
                 prp.executeUpdate(); 
                 materialCombo.setSelectedItem(matnew);
                  con.commit();
                  con.close();
        }
         
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
             }     
                // TODO add your handling code here:
    }//GEN-LAST:event_materialButtonActionPerformed

    private void typeComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeComboFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboFocusGained

    private void typeComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typeComboFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboFocusLost

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Add().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton add_projectButton;
    private javax.swing.JButton add_vendorButton;
    private javax.swing.JButton addwork;
    private javax.swing.JLabel bill_dateLabel;
    private javax.swing.JLabel bill_noLabel;
    private javax.swing.JTextField bill_noTextField;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JTextField brandTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JTextField costTextField;
    private org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton materialButton;
    private javax.swing.JComboBox materialCombo;
    private javax.swing.JLabel materialLabel;
    private javax.swing.JTextField measuretypeTextField;
    private javax.swing.JComboBox project_nameCombo;
    private javax.swing.JLabel project_nameLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel rateLabel;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JComboBox typeCombo;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JComboBox vendorCombo;
    private javax.swing.JLabel vendorLabel;
    private javax.swing.JComboBox workCombo;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}
