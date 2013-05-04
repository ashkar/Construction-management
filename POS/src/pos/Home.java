/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Home.java
 *
 * Created on Mar 26, 2013, 5:22:38 PM
 */
package pos;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Home
 */
public class Home extends javax.swing.JFrame {

    int i = 0;
    
    /** Creates new form Home */
    public Home() {
        initComponents();
        
        setTitle("POS");
        setVisible(true);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new Color(129,134,100));
        
//        inventoryButton.getInputMap(JButton.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_I,0),"inventory");
//        inventoryButton.getActionMap().put("inventory",new AbstractAction()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                inventoryButtonActionPerformed(e);
//            }
//        });
        
//        JDesktopPane desktop = new JDesktopPane();
//        JFrame frame = new JFrame();
//        
//        frame.setContentPane(desktop);
//    
//        JInternalFrame internalframe = new JInternalFrame();
//        
//        desktop.add(internalframe);
        
//        projectLabel.setVisible(false);
//        inventoryLabel.setVisible(false);
//        workLabel.setVisible(false);
//        reportsLabel.setVisible(false);
//        paymentsLabel.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        carrierButton = new javax.swing.JButton();
        inventoryButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        calcButton = new javax.swing.JButton();
        woodButton = new javax.swing.JButton();
        expenseButton = new javax.swing.JButton();
        wqButton = new javax.swing.JButton();
        dcButton = new javax.swing.JButton();
        planButton = new javax.swing.JButton();
        odcButton = new javax.swing.JButton();
        billingButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(87, 91, 87));

        inventoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png"))); // NOI18N
        inventoryButton.setBorder(null);
        inventoryButton.setBorderPainted(false);
        inventoryButton.setContentAreaFilled(false);
        inventoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryButton.setFocusPainted(false);
        inventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseExited(evt);
            }
        });
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        reportButton.setBorder(null);
        reportButton.setBorderPainted(false);
        reportButton.setContentAreaFilled(false);
        reportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportButton.setFocusPainted(false);
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportButtonMouseExited(evt);
            }
        });
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        carrierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrier.png"))); // NOI18N
        carrierButton.setBorder(null);
        carrierButton.setBorderPainted(false);
        carrierButton.setContentAreaFilled(false);
        carrierButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carrierButton.setFocusPainted(false);
        carrierButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carrierButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carrierButtonMouseExited(evt);
            }
        });
        carrierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrierButtonActionPerformed(evt);
            }
        });

        inventoryButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/project.png"))); // NOI18N
        inventoryButton1.setBorder(null);
        inventoryButton1.setBorderPainted(false);
        inventoryButton1.setContentAreaFilled(false);
        inventoryButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventoryButton1.setFocusPainted(false);
        inventoryButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventoryButton1MouseExited(evt);
            }
        });
        inventoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryButton)
                    .addComponent(inventoryButton1)
                    .addComponent(carrierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventoryButton1)
                .addGap(31, 31, 31)
                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carrierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(87, 91, 87));
        jPanel2.setPreferredSize(new java.awt.Dimension(383, 383));

        calcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc.png"))); // NOI18N
        calcButton.setBorder(null);
        calcButton.setBorderPainted(false);
        calcButton.setContentAreaFilled(false);
        calcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcButton.setFocusPainted(false);
        calcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcButtonMouseExited(evt);
            }
        });
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        woodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wood.png"))); // NOI18N
        woodButton.setBorder(null);
        woodButton.setBorderPainted(false);
        woodButton.setContentAreaFilled(false);
        woodButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        woodButton.setFocusPainted(false);
        woodButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                woodButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                woodButtonMouseExited(evt);
            }
        });
        woodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                woodButtonActionPerformed(evt);
            }
        });

        expenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expense.png"))); // NOI18N
        expenseButton.setBorder(null);
        expenseButton.setBorderPainted(false);
        expenseButton.setContentAreaFilled(false);
        expenseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expenseButton.setFocusPainted(false);
        expenseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                expenseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                expenseButtonMouseExited(evt);
            }
        });
        expenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenseButtonActionPerformed(evt);
            }
        });

        wqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/work.png"))); // NOI18N
        wqButton.setBorder(null);
        wqButton.setBorderPainted(false);
        wqButton.setContentAreaFilled(false);
        wqButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wqButton.setFocusPainted(false);
        wqButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wqButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wqButtonMouseExited(evt);
            }
        });
        wqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wqButtonActionPerformed(evt);
            }
        });

        dcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dc.png"))); // NOI18N
        dcButton.setBorder(null);
        dcButton.setBorderPainted(false);
        dcButton.setContentAreaFilled(false);
        dcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dcButton.setFocusPainted(false);
        dcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dcButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dcButtonMouseExited(evt);
            }
        });
        dcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcButtonActionPerformed(evt);
            }
        });

        planButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plan.jpg"))); // NOI18N
        planButton.setBorder(null);
        planButton.setBorderPainted(false);
        planButton.setContentAreaFilled(false);
        planButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        planButton.setFocusPainted(false);
        planButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                planButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                planButtonMouseExited(evt);
            }
        });
        planButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planButtonActionPerformed(evt);
            }
        });

        odcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/odc.png"))); // NOI18N
        odcButton.setBorder(null);
        odcButton.setBorderPainted(false);
        odcButton.setContentAreaFilled(false);
        odcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odcButton.setFocusPainted(false);
        odcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odcButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odcButtonMouseExited(evt);
            }
        });
        odcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odcButtonActionPerformed(evt);
            }
        });

        billingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing.png"))); // NOI18N
        billingButton.setBorder(null);
        billingButton.setBorderPainted(false);
        billingButton.setContentAreaFilled(false);
        billingButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billingButton.setFocusPainted(false);
        billingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                billingButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                billingButtonMouseExited(evt);
            }
        });
        billingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcButton)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(billingButton)
                    .addComponent(woodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planButton))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wqButton)
                    .addComponent(odcButton)
                    .addComponent(dcButton))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(woodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wqButton)
                    .addComponent(expenseButton))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(odcButton)
                    .addComponent(planButton))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(billingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenu3.setText("jMenu3");
        jMenu1.add(jMenu3);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");
        jMenu1.add(jRadioButtonMenuItem2);

        jMenu4.setText("jMenu4");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        jMenu5.add(jCheckBoxMenuItem1);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jMenu5.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseEntered

        inventoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory1.png")));
        inventoryButton.setToolTipText("Inventory");
        //inventoryLabel.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButtonMouseEntered

    private void inventoryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseExited

        inventoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png")));
        //inventoryLabel.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButtonMouseExited

    private void reportButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseEntered

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report1.png")));
        reportButton.setToolTipText("Reports");
        //reportsLabel.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_reportButtonMouseEntered

    private void reportButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseExited

        reportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png")));
        //reportsLabel.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_reportButtonMouseExited

    private void billingButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseEntered

        billingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing1.png")));
        billingButton.setToolTipText("Payments");
        //paymentsLabel.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonMouseEntered

    private void billingButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billingButtonMouseExited

        billingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billing.png")));
        //paymentsLabel.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonMouseExited

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed

        Add add = new Add();
        
//        Add add;
        
//        JDesktopPane desktop = new JDesktopPane();
//        JFrame frame = new JFrame();
        
//        setContentPane(new Add());
    
//        JInternalFrame internalframe = new JInternalFrame();
//        
//        desktop.add(new Add());
        
//        JDesktopPane.getAllFrames();
//        Window.isShowing();
//        Component.isVisible();
        
//        i++;
//        Add add;
//        if(i>0)
//        {
//            add = new Add();
//            if(i>1)
//            {
//              
//            }
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed

        Reports reports = new Reports();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_reportButtonActionPerformed

    private void billingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingButtonActionPerformed

        Paymentnew payment = new Paymentnew();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_billingButtonActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        
        try
        {
            Runtime.getRuntime().exec("calc");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Only for Windows");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonActionPerformed

    private void calcButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseEntered

        calcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc1.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonMouseEntered

    private void calcButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseExited

        calcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calc.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_calcButtonMouseExited

    private void carrierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrierButtonActionPerformed

        Carrier carrier = new Carrier();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_carrierButtonActionPerformed

    private void carrierButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrierButtonMouseEntered

        carrierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrier1.png")));
        carrierButton.setToolTipText("Carrier");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_carrierButtonMouseEntered

    private void carrierButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrierButtonMouseExited

        carrierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrier.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_carrierButtonMouseExited

    private void woodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_woodButtonActionPerformed

        Wood wood = new Wood();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_woodButtonActionPerformed

    private void woodButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_woodButtonMouseEntered

        woodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wood1.png")));
        woodButton.setToolTipText("Wood");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_woodButtonMouseEntered

    private void woodButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_woodButtonMouseExited

        woodButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wood.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_woodButtonMouseExited

    private void expenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenseButtonActionPerformed

        office off = new office();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseButtonActionPerformed

    private void expenseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseButtonMouseEntered

        expenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expense1.png")));
        expenseButton.setToolTipText("Office Expense");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseButtonMouseEntered

    private void expenseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenseButtonMouseExited

        expenseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expense.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_expenseButtonMouseExited

    private void wqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wqButtonActionPerformed
        
        WorkQuote wq = new WorkQuote();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_wqButtonActionPerformed

    private void wqButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wqButtonMouseEntered

        wqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/work1.png")));
        wqButton.setToolTipText("Work Quote");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_wqButtonMouseEntered

    private void wqButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wqButtonMouseExited

        wqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/work.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_wqButtonMouseExited

    private void dcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcButtonActionPerformed

        OurLabourDailyUpdate dc = new OurLabourDailyUpdate();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_dcButtonActionPerformed

    private void dcButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcButtonMouseEntered

        dcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dc1.png")));
        dcButton.setToolTipText("Labour Daily Charges");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_dcButtonMouseEntered

    private void dcButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcButtonMouseExited

        dcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dc.png")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_dcButtonMouseExited

    private void planButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planButtonActionPerformed

        Plan plan = new Plan();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_planButtonActionPerformed

    private void planButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planButtonMouseEntered

        planButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plan1.jpg")));
        planButton.setToolTipText("Plan");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_planButtonMouseEntered

    private void planButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planButtonMouseExited

        planButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plan.jpg")));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_planButtonMouseExited

    private void inventoryButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButton1MouseEntered

        inventoryButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/project1.png")));
        inventoryButton1.setToolTipText("Project");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButton1MouseEntered

    private void inventoryButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButton1MouseExited
       inventoryButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/project.png")));  // TODO add your handling code here:
    }//GEN-LAST:event_inventoryButton1MouseExited

    private void inventoryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButton1ActionPerformed
             Project project = new Project ();
    }//GEN-LAST:event_inventoryButton1ActionPerformed

    private void odcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odcButtonActionPerformed

        OtherLabourDailyCharges odc = new OtherLabourDailyCharges();

        // TODO add your handling code here:
    }//GEN-LAST:event_odcButtonActionPerformed

    private void odcButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odcButtonMouseExited

        odcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/odc.png")));

        // TODO add your handling code here:
    }//GEN-LAST:event_odcButtonMouseExited

    private void odcButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odcButtonMouseEntered

        odcButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/odc1.png")));
        odcButton.setToolTipText("Contractor work update");

        // TODO add your handling code here:
    }//GEN-LAST:event_odcButtonMouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billingButton;
    private javax.swing.JButton calcButton;
    private javax.swing.JButton carrierButton;
    private javax.swing.JButton dcButton;
    private javax.swing.JButton expenseButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JButton inventoryButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JButton odcButton;
    private javax.swing.JButton planButton;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton woodButton;
    private javax.swing.JButton wqButton;
    // End of variables declaration//GEN-END:variables
}
