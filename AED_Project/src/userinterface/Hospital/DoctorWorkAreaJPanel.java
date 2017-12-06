/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Varshney
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
   JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem ecoSystem;

    

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        populateAllRequestsTable();
        
    }
    
    public void populateAllRequestsTable() {

        DefaultTableModel dtm = (DefaultTableModel) allWorkRequestJTable.getModel();
        dtm.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest req : org.getWorkQueue().getWorkRequestList()) {
                if (req instanceof HospitalWorkRequest) {
                    
                    if(req.getStatus().equalsIgnoreCase("Not Assigned"))
                    {
                   

                        Object[] row = new Object[4];
                        row[0] = req;
                        row[1] = ((HospitalWorkRequest) req).getMessage();
                        row[2] = ((HospitalWorkRequest) req).getSender();
                        row[3] = ((HospitalWorkRequest) req).getStatus();

                        dtm.addRow(row);
                    
                }
                }

            }

        }
    }

     public void assignToMe(){
         
         
         int selectedRow;
         selectedRow = allWorkRequestJTable.getSelectedRow();
         
         if (selectedRow >= 0) {
             
             HospitalWorkRequest hospitalWorkRequest= (HospitalWorkRequest) allWorkRequestJTable.getValueAt(selectedRow, 0);
             hospitalWorkRequest.setReceiver(userAccount);
             hospitalWorkRequest.setStatus("Assigned");
             userAccount.getWorkQueue().getWorkRequestList().add(hospitalWorkRequest);
             
             JOptionPane.showMessageDialog(null, "Case Assigned Successfully!");
           
        }
         
         else
         {
            JOptionPane.showMessageDialog(null, "Please select a row from the cases table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
         }
      
     }
     
     public void populateMyRequestsTable(){
         
        DefaultTableModel dtm = (DefaultTableModel) myWorkRequestJTable.getModel();
        dtm.setRowCount(0);
        
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (WorkRequest req : userAccount.getWorkQueue().getWorkRequestList()) {
                if (req instanceof HospitalWorkRequest) {
                    
                   
                        Object[] row = new Object[5];
                        row[0] = req;
                        row[1] = ((HospitalWorkRequest) req).getMessage();
                        row[2] = ((HospitalWorkRequest) req).getSender();
                        row[3] = ((HospitalWorkRequest) req).getReceiver();
                        row[4] = ((HospitalWorkRequest) req).getStatus();

                        dtm.addRow(row);
                    
                
                }

            }
            
        }

                
        
         
         
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        allWorkRequestJTable = new javax.swing.JTable();
        assignRequestjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        myWorkRequestJTable = new javax.swing.JTable();
        myCasesjButton = new javax.swing.JButton();

        allWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Case Id", "Message", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(allWorkRequestJTable);
        if (allWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            allWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            allWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            allWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        assignRequestjButton.setText("Assign To Me");
        assignRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignRequestjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Requests Allocated To Me for Test:");

        myWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Case Id", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(myWorkRequestJTable);
        if (myWorkRequestJTable.getColumnModel().getColumnCount() > 0) {
            myWorkRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            myWorkRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        myCasesjButton.setText("Show My cases");
        myCasesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCasesjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(assignRequestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(myCasesjButton)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignRequestjButton)
                    .addComponent(myCasesjButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignRequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignRequestjButtonActionPerformed
        // TODO add your handling code here:
        assignToMe();
        populateAllRequestsTable();
       
    }//GEN-LAST:event_assignRequestjButtonActionPerformed

    private void myCasesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCasesjButtonActionPerformed
        // TODO add your handling code here:
         populateMyRequestsTable();
    }//GEN-LAST:event_myCasesjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allWorkRequestJTable;
    private javax.swing.JButton assignRequestjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton myCasesjButton;
    private javax.swing.JTable myWorkRequestJTable;
    // End of variables declaration//GEN-END:variables
}
