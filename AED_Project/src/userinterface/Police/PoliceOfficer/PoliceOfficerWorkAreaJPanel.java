/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceOfficer;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CaseWorkRequest;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import Business.WorkQueue.IncidentWorkRequest;
import Business.WorkQueue.RobberyCaseWorkRequest;
import Business.WorkQueue.SubstanceAbuseCaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sneha
 */
public class PoliceOfficerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceOfficerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;

    public PoliceOfficerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.network = network;
        lblName.setText(userAccount.getEmployee().getName());
        lblRole.setText(userAccount.getRole().toString());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ReportedIncidentTable = new javax.swing.JTable();
        btnStartInv = new javax.swing.JToggleButton();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnCloseCase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ReportedIncidentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Case ID", "Incident Type", "Date", "Area ZipCode", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportedIncidentTable);

        btnStartInv.setText("Go to case file");
        btnStartInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartInvActionPerformed(evt);
            }
        });

        lblName.setText("jLabel1");

        lblRole.setText("jLabel2");

        btnCloseCase.setText("Close case");
        btnCloseCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseCaseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Police Officer Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName)
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRole))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCloseCase, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnStartInv, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblRole)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnStartInv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCloseCase)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartInvActionPerformed
        // TODO add your handling code here:
        int selectedRow = ReportedIncidentTable.getSelectedRow();
        if (selectedRow >= 0) {
            CaseWorkRequest request = (CaseWorkRequest) ReportedIncidentTable.getValueAt(selectedRow, 0);
            
            if(request.getIncidentType().equals(IncidentWorkRequest.IncidentType.Substance_Abuse.getValue())){
                SubstanceAbuseCaseWorkRequest sb = (SubstanceAbuseCaseWorkRequest) request;
                SubstanceAbuseCaseInvestigationJPanel panel = new SubstanceAbuseCaseInvestigationJPanel(userProcessContainer, sb,userAccount, network);
                userProcessContainer.add("SubstanceAbuseCaseInvestigationJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer); 
            }
            
            if(request.getIncidentType().equals(IncidentWorkRequest.IncidentType.Gun_Violence.getValue())){
                GunViolenceCaseWorkRequest gv = (GunViolenceCaseWorkRequest) request;
                GunViolenceCaseInvestigationJPanel panel = new GunViolenceCaseInvestigationJPanel(userProcessContainer, gv,userAccount, network);
                userProcessContainer.add("GunViolenceCaseInvestigationJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer); 
            }
            
            if(request.getIncidentType().equals(IncidentWorkRequest.IncidentType.Robbery.getValue())){
                RobberyCaseWorkRequest rob = (RobberyCaseWorkRequest) request;
                RobberyCaseInvestigationJPanel panel = new RobberyCaseInvestigationJPanel(userProcessContainer, rob,userAccount, network);
                userProcessContainer.add("RobberyCaseInvestigationJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer); 
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a case from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnStartInvActionPerformed

    private void btnCloseCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseCaseActionPerformed
        // TODO add your handling code here:
        int selectedRow = ReportedIncidentTable.getSelectedRow();
        if (selectedRow >= 0) {
            CaseWorkRequest request = (CaseWorkRequest) ReportedIncidentTable.getValueAt(selectedRow, 0);
            request.setStatus("Closed");
            populateTable();
            JOptionPane.showMessageDialog(null, "Case status updated to Closed!");
        }
    }//GEN-LAST:event_btnCloseCaseActionPerformed

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) ReportedIncidentTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest req : userAccount.getWorkQueue().getWorkRequestList()) {

            if (req instanceof CaseWorkRequest) {
 
                 CaseWorkRequest caseRequest = (CaseWorkRequest) req;
                 Object[] row = new Object[5];
                 row[0] = caseRequest;
                 row[1] = caseRequest.getIncidentType();
                 row[2] = caseRequest.getIncidentOcuredDate();
                 row[3] = caseRequest.getZipCode();
                 row[4] = caseRequest.getStatus();
                 
                 dtm.addRow(row);
                 
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportedIncidentTable;
    private javax.swing.JButton btnCloseCase;
    private javax.swing.JToggleButton btnStartInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    // End of variables declaration//GEN-END:variables
}
