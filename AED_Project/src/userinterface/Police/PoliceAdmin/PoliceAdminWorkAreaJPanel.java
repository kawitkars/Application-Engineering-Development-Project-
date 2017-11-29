/*
 * AdminWorkAreaJPanel.java
 *
 */

package userinterface.Police.PoliceAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sneha Kawitkar
 */
public class PoliceAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem ecoSystem;
    /** Creates new form AdminWorkAreaJPanel */
    public PoliceAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.ecoSystem = ecoSystem;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnBroadcastMsg = new javax.swing.JButton();
        btnUserReportedIncidents = new javax.swing.JButton();
        manageCaseBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 250, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 250, -1));

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 250, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 30));

        btnBroadcastMsg.setText("Broadcast a Message");
        btnBroadcastMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBroadcastMsgActionPerformed(evt);
            }
        });
        add(btnBroadcastMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, -1));

        btnUserReportedIncidents.setText("User Reported Incidents");
        btnUserReportedIncidents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserReportedIncidentsActionPerformed(evt);
            }
        });
        add(btnUserReportedIncidents, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, -1));

        manageCaseBtn.setText("Manage Cases");
        manageCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCaseBtnActionPerformed(evt);
            }
        });
        add(manageCaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 230, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        PoliceManageUserAccountJPanel muajp = new PoliceManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("PoliceManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        PoliceManageEmployeeJPanel manageEmployeeJPanel = new PoliceManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("PoliceManageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        PoliceManageOrganizationJPanel manageOrganizationJPanel = new PoliceManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("PoliceManageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void btnUserReportedIncidentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserReportedIncidentsActionPerformed
        // TODO add your handling code here:
        UserReportedIncidentsJPanel panel = new UserReportedIncidentsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("UserReportedIncidentsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserReportedIncidentsActionPerformed

    private void btnBroadcastMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBroadcastMsgActionPerformed
        // TODO add your handling code here:
        BroadcastMessageJPanel panel = new BroadcastMessageJPanel(userProcessContainer, userAccount, enterprise, network);
        userProcessContainer.add("BroadcastMessageJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBroadcastMsgActionPerformed

    private void manageCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCaseBtnActionPerformed
        // TODO add your handling code here:
        ManageCasesJPanel manageCasesJPanel = new ManageCasesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageCasesJPanel", manageCasesJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCaseBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBroadcastMsg;
    private javax.swing.JButton btnUserReportedIncidents;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCaseBtn;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
