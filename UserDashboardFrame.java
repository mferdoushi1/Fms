/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight.managment.system;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 
 */
public class UserDashboardFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboardFrame
     */
    public UserDashboardFrame() {
        configDisplay();
        initComponents();
        openSearchFileMenu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        basePanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        serchFileMenu = new javax.swing.JMenu();
        myBookingManu = new javax.swing.JMenu();
        logoutManu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        serchFileMenu.setText("Search Flight");
        serchFileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serchFileMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(serchFileMenu);

        myBookingManu.setText("My Booking");
        myBookingManu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myBookingManuMouseClicked(evt);
            }
        });
        jMenuBar1.add(myBookingManu);

        logoutManu.setText("Setting");

        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        logoutManu.add(jMenuItem2);

        jMenuBar1.add(logoutManu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.setVisible(false);
       new LoginAndSignUpFrame().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void serchFileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchFileMenuMouseClicked
        openSearchFileMenu();
       
    }//GEN-LAST:event_serchFileMenuMouseClicked

    private void myBookingManuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingManuMouseClicked
        MyBookingLIstPanel bookingLIstPanel= new MyBookingLIstPanel();
        switchPanel(bookingLIstPanel);
    }//GEN-LAST:event_myBookingManuMouseClicked

    private void configDisplay() {
        this.setPreferredSize(new Dimension(1366, 700)); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.pack();
        this.setVisible(true); 
    }

    private void switchPanel(JPanel jPanel) {
        basePanel.removeAll();
        basePanel.repaint();
        basePanel.revalidate();
        
        basePanel.add(jPanel);
        basePanel.repaint();
        basePanel.revalidate();

    }

    private void openSearchFileMenu() {
        SearchFlightInternalPanel searchFlightInternalPanel = new SearchFlightInternalPanel();
        switchPanel(searchFlightInternalPanel);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu logoutManu;
    private javax.swing.JMenu myBookingManu;
    private javax.swing.JMenu serchFileMenu;
    // End of variables declaration//GEN-END:variables


}
