/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceAdmin;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.CaseWorkRequest;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import Business.WorkQueue.IncidentWorkRequest;
import Business.WorkQueue.SubstanceAbuseCaseWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author joshiaditya
 */
public class CreateNewCaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewCaseJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    IncidentWorkRequest incidentWorkRequest;
    
    public CreateNewCaseJPanel(JPanel userProcessContainer, IncidentWorkRequest incidentWorkRequest,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.incidentWorkRequest = incidentWorkRequest;
        populateData();
    }
    
    public void populateData(){
        
        txtIncidentType.setText(incidentWorkRequest.getIncidentType().getValue());
        txtReportedBy.setText(incidentWorkRequest.getSender().getFirstName()+" "+incidentWorkRequest.getSender().getLastName());
        txtAddress.setText(incidentWorkRequest.getAddress());
        txtZipcode.setText(incidentWorkRequest.getZipCode());
        txtDate.setText(incidentWorkRequest.getRequestDate().toString());
        txtObservations.setText(incidentWorkRequest.getMessage());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtReportedBy = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservations = new javax.swing.JTextArea();
        txtIncidentType = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Create new case");

        jLabel2.setText("Incident Type:");

        jLabel3.setText("Incident Reported by:");

        txtReportedBy.setEnabled(false);

        jLabel4.setText("Location Address:");

        jLabel5.setText("Initial Observation:");

        txtObservations.setColumns(20);
        txtObservations.setRows(5);
        jScrollPane1.setViewportView(txtObservations);

        txtIncidentType.setEnabled(false);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Incident Occurance Date:");

        txtDate.setEnabled(false);

        jLabel7.setText("Zipcode:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit)
                            .addComponent(txtAddress)
                            .addComponent(jScrollPane1)
                            .addComponent(txtIncidentType)
                            .addComponent(txtReportedBy)
                            .addComponent(txtDate)
                            .addComponent(txtZipcode)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIncidentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtReportedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSubmit)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        if(!txtAddress.getText().trim().isEmpty() &&
           !txtObservations.getText().trim().isEmpty() &&
           !txtZipcode.getText().trim().isEmpty()){
            
                if(incidentWorkRequest.getIncidentType().getValue().equals(
                        IncidentWorkRequest.IncidentType.Gun_Violence.getValue())){
                    
                    GunViolenceCaseWorkRequest req = new GunViolenceCaseWorkRequest();
                    req.setIncidentOcuredDate(incidentWorkRequest.getRequestDate());
                    req.setIncidentReportedBy(incidentWorkRequest.getSender());
                    req.setIncidentType(incidentWorkRequest.getIncidentType().getValue());
                    req.setInitialObservation(txtObservations.getText().trim());
                    req.setAddress(txtAddress.getText().trim());
                    req.setZipCode(txtZipcode.getText().trim());
                    req.setIncidentID(incidentWorkRequest.getIncidentId());
                    req.setStatus("Open");
                
                    enterprise.getWorkQueue().getWorkRequestList().add(req);
                }
                
                if(incidentWorkRequest.getIncidentType().getValue().equals(
                        IncidentWorkRequest.IncidentType.Substance_Abuse.getValue())){
                    
                    SubstanceAbuseCaseWorkRequest req = new SubstanceAbuseCaseWorkRequest();
                    req.setIncidentOcuredDate(incidentWorkRequest.getRequestDate());
                    req.setIncidentReportedBy(incidentWorkRequest.getSender());
                    req.setIncidentType(incidentWorkRequest.getIncidentType().getValue());
                    req.setInitialObservation(txtObservations.getText().trim());
                    req.setAddress(txtAddress.getText().trim());
                    req.setZipCode(txtZipcode.getText().trim());
                    req.setIncidentID(incidentWorkRequest.getIncidentId());
                    req.setStatus("Open");
                
                    enterprise.getWorkQueue().getWorkRequestList().add(req);
                }
                
                incidentWorkRequest.setCaseCreated(true);
                
                JOptionPane.showMessageDialog(null, "Case created!");
                
                txtAddress.setText("");
                txtDate.setText("");
                txtIncidentType.setText("");
                txtObservations.setText("");
                txtReportedBy.setText("");
                txtZipcode.setText("");
                
        }else{
            JOptionPane.showMessageDialog(this, "Please enter all details!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtIncidentType;
    private javax.swing.JTextArea txtObservations;
    private javax.swing.JTextField txtReportedBy;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
