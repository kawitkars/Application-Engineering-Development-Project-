/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Analysis;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GunViolenceCaseWorkRequest;
import Business.WorkQueue.SubstanceAbuseCaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Sneha
 */
public class AnalysisByIncidentType extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisByIncidentType
     */
    private JPanel userProcessContainer;
    private Network network;

    public AnalysisByIncidentType(JPanel userProcessContainer, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        generateBarAnalysis();
    }

    public void generateBarAnalysis() {
        int gunCount = 0;
        int substanceCount = 0;
        int robberyCount = 0;

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    for (WorkRequest req : ua.getWorkQueue().getWorkRequestList()) {
                        if (req instanceof GunViolenceCaseWorkRequest) {
                            gunCount++;
                        } else if (req instanceof SubstanceAbuseCaseWorkRequest) {
                            substanceCount++;
                        }
                        // else if(req instanceof RobberyCaseWorkRequest){
                        //       
                        //     }
                    }
                }
            }
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(gunCount, "", "Gun Voilence");
        dataset.setValue(substanceCount, "", "Substance Abuse");
        //  dataset.setValue(robberyCount, "", "Robbery");
        JFreeChart chart = ChartFactory.createBarChart("Analysis by Incident", "", "", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartPanel = new ChartPanel(chart);
        Panel.setLayout(new BorderLayout());
        Panel.removeAll();
        //Panel.add(chartPanel,BorderLayout.CENTER);
        Panel.add(chartPanel, BorderLayout.CENTER);
        //Panel.add(chartPanel);
        Panel.validate();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();

        Panel.setBackground(new java.awt.Color(102, 102, 102));
        Panel.setForeground(new java.awt.Color(153, 153, 153));
        Panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
