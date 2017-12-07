/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Police.PoliceOfficer;

import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author joshiaditya
 */
public class GunViolenceCaseInvestigationJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    GunViolenceCaseWorkRequest request;
    Network network;
    UserAccount userAccount;
    /**
     * Creates new form GunViolenceCaseInvestigationJPanel
     */
    public GunViolenceCaseInvestigationJPanel(JPanel userProcessContainer, GunViolenceCaseWorkRequest request, UserAccount userAccount, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.request = request;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
