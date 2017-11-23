/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.User;

import Business.Incident.Incident;
import javax.swing.JPanel;

/**
 *
 * @author Sneha
 */
public class ReportAnIncidentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportAnIncidentJPanel
     */
    
    JPanel userProcessContainer;
    Incident incident;
    

    ReportAnIncidentJPanel(JPanel userProcessContainer, Incident incident) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.incident= incident;
        
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
        IncidentreportComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("What kind of incident you want to report ?");

        IncidentreportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncidentreportComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncidentreportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncidentreportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IncidentreportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncidentreportComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IncidentreportComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IncidentreportComboBox;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
