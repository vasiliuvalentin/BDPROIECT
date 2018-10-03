/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdproiect;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Vali
 */
public class ModificareColet extends javax.swing.JFrame {

    /**
     * Creates new form ModificareColet
     */
    public ModificareColet() {
        initComponents();
        this.getContentPane().setBackground(new Color(0 , 152, 152));
        this.setTitle("Modificare Client");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        Statement stmt;
        try {
            Connection con = Conexiune.DBConector();
            stmt = (Statement) con.createStatement();
            String query = "Select codc from colet";
            
            PreparedStatement st = con.prepareStatement(query);
 
            ResultSet rs = st.executeQuery();
    
            //textAfisare.append("CODA"+"\t"+"Nume"+"\t"+"Prenume"+"\t"+"CNP"+"\t"+"Adresa"+"\t"+"Salariu"+"\t"+"CodF"+"\n"+"\n");
            while (rs.next()) {
                comboColet.addItem(rs.getString("codc") );

            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboColet = new javax.swing.JComboBox<>();
        textNou = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        butonOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboSelectie = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("Actulizare Informatii");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Selectare colet");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Valoare noua");

        butonOk.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        butonOk.setText("MODIFICA");
        butonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOkActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Modificare ");

        comboSelectie.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        comboSelectie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cod Colet", "Destinatar", "Adresa Destinatar", "Suma" }));
        comboSelectie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSelectieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(textNou)
                    .addComponent(comboSelectie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboColet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonOk)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comboColet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboSelectie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textNou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(butonOk)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSelectieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSelectieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSelectieActionPerformed

    private void butonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOkActionPerformed
        String selectie = comboSelectie.getSelectedItem().toString();
       
       Statement stmt;
        String query=null;
        
        try {
            Connection con = Conexiune.DBConector();
            stmt = (Statement) con.createStatement();
            switch (selectie) {
                case "Cod Colet":
                    query = "UPDATE colet SET codc=? where codc=?";
                    break;
                case "Destinatar":
                    query = "UPDATE colet SET destinatar=? where codc=?";
                    break;
                case "Adresa Destinatar":
                    query = "UPDATE colet SET adr_dest=? where codc=?";
                    break;
                case "Suma":
                    query = "UPDATE colet SET suma=? where codc=?";
                    break;
               
            }
            JOptionPane.showMessageDialog(null, "Date actualizate!", "Succes", 1);
           
            
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, textNou.getText());
            st.setString(2, comboColet.getSelectedItem().toString());
            st.executeUpdate();
            
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
        }
    }//GEN-LAST:event_butonOkActionPerformed

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
            java.util.logging.Logger.getLogger(ModificareColet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificareColet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificareColet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificareColet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificareColet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonOk;
    private javax.swing.JComboBox<String> comboColet;
    private javax.swing.JComboBox<String> comboSelectie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textNou;
    // End of variables declaration//GEN-END:variables
}
