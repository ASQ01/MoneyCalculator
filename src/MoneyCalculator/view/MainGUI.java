/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyCalculator.view;

import MoneyCalculator.model.FileManager;
import MoneyCalculator.model.Money;
import java.util.Vector;
import javax.swing.JFrame;

/**
 *
 * @author Álvaro
 */
public class MainGUI extends javax.swing.JDialog {
    private Vector currencyVector;

    /**
     * Creates new form MainGUI
     */
    public MainGUI(Vector currencyList) {
        super(new JFrame(), true);
        this.currencyVector = currencyList;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Currency2 = new javax.swing.JComboBox<>(this.currencyVector);
        ConversionResultText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AmountText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Currency1 = new javax.swing.JComboBox<>(this.currencyVector);
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Money Calculator");
        jLabel1.setAlignmentX(0.5F);

        Currency2.setFocusable(false);
        Currency2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Currency2ItemStateChanged(evt);
            }
        });
        Currency2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Currency2ActionPerformed(evt);
            }
        });

        ConversionResultText.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        ConversionResultText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Top currencies converter");

        AmountText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AmountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AmountTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmountTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmountTextKeyTyped(evt);
            }
        });

        jLabel4.setText("Amount:");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jLabel2.setText("Álvaro Antonio Suárez Quintana");

        Currency1.setFocusable(false);
        Currency1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Currency1ItemStateChanged(evt);
            }
        });
        Currency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Currency1ActionPerformed(evt);
            }
        });

        jLabel5.setText("to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ConversionResultText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2)))
                        .addGap(0, 262, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Currency1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(Currency2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Currency2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Currency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(ConversionResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Currency2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Currency2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Currency2ActionPerformed

    private void AmountTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountTextKeyTyped

    }//GEN-LAST:event_AmountTextKeyTyped

    private void AmountTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountTextKeyPressed

    }//GEN-LAST:event_AmountTextKeyPressed

    private void AmountTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountTextKeyReleased
        try{
            double amount = Double.parseDouble(AmountText.getText());
            Money firstselected = (Money) this.Currency1.getSelectedItem();
            Money secondselected = (Money) this.Currency2.getSelectedItem();
            double value = FileManager.getURLRequest(firstselected.getCode(), secondselected.getCode());
            double result = amount * value;
            ConversionResultText.setText(Double.toString(amount) + firstselected.getSymbol() + " = " + Double.toString(result) + secondselected.getSymbol());
        }
        
        catch (Exception e){
            ConversionResultText.setText("");
        }
    }//GEN-LAST:event_AmountTextKeyReleased

    private void Currency2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Currency2ItemStateChanged
        try{
            double amount = Double.parseDouble(AmountText.getText());
            Money firstselected = (Money) this.Currency1.getSelectedItem();
            Money secondselected = (Money) this.Currency2.getSelectedItem();
            double value = FileManager.getURLRequest(firstselected.getCode(), secondselected.getCode());
            double result = amount * value;
            ConversionResultText.setText(Double.toString(amount) + firstselected.getSymbol() + " = " + Double.toString(result) + secondselected.getSymbol());
        }
        
        catch (Exception e){
            ConversionResultText.setText("");
        }
    }//GEN-LAST:event_Currency2ItemStateChanged

    private void Currency1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Currency1ItemStateChanged
        try{
            double amount = Double.parseDouble(AmountText.getText());
            Money firstselected = (Money) this.Currency1.getSelectedItem();
            Money secondselected = (Money) this.Currency2.getSelectedItem();
            double value = FileManager.getURLRequest(firstselected.getCode(), secondselected.getCode());
            double result = amount * value;
            ConversionResultText.setText(Double.toString(amount) + firstselected.getSymbol() + " = " + Double.toString(result) + secondselected.getSymbol());
        }
        
        catch (Exception e){
            ConversionResultText.setText("");
        }
    }//GEN-LAST:event_Currency1ItemStateChanged

    private void Currency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Currency1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Currency1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountText;
    private javax.swing.JLabel ConversionResultText;
    private javax.swing.JComboBox<String> Currency1;
    private javax.swing.JComboBox<String> Currency2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
