/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Salas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CrearSala extends javax.swing.JFrame {
    ArrayList<SalaCine> salas = new ArrayList();
    /**
     * Creates new form CrearSala
     */
    public CrearSala() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtFilas = new javax.swing.JTextField();
        TxtSillas = new javax.swing.JTextField();
        CbxTipoS = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        CbxTipo3D = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Crear Sala");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 90, 30);

        jLabel2.setText("Numero de filas:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 110, 30);

        jLabel3.setText("Numero de Sillas:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 130, 110, 30);

        jLabel4.setText("Tipo de sala:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 110, 30);
        getContentPane().add(TxtFilas);
        TxtFilas.setBounds(150, 80, 40, 30);

        TxtSillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSillasActionPerformed(evt);
            }
        });
        getContentPane().add(TxtSillas);
        TxtSillas.setBounds(150, 130, 40, 30);

        CbxTipoS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "3D" }));
        CbxTipoS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbxTipoSMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CbxTipoSMousePressed(evt);
            }
        });
        CbxTipoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxTipoSActionPerformed(evt);
            }
        });
        getContentPane().add(CbxTipoS);
        CbxTipoS.setBounds(150, 180, 80, 30);

        jLabel5.setText("Tipo de 3D:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 110, 30);

        BtnGuardar.setText("Siguiente..");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnGuardar);
        BtnGuardar.setBounds(60, 340, 100, 23);

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelarMouseClicked(evt);
            }
        });
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar);
        BtnCancelar.setBounds(170, 340, 90, 23);

        CbxTipo3D.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIGITAL", "REAL", "EXTREME" }));
        CbxTipo3D.setEnabled(false);
        getContentPane().add(CbxTipo3D);
        CbxTipo3D.setBounds(150, 240, 80, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-320)/2, (screenSize.height-413)/2, 320, 413);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSillasActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
        
        if(this.TxtFilas.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Numero de filas esta vacio!",
            "Información necesaria",JOptionPane.WARNING_MESSAGE);
        else if(this.TxtSillas.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Numero de sillas esta vacio!",
            "Información necesaria",JOptionPane.WARNING_MESSAGE);
        else if(this.CbxTipoS.getSelectedIndex()==0){
            this.salas.add(new SalaNormal(Integer.parseInt(this.TxtFilas.getText()),Integer.parseInt(this.TxtSillas.getText())));
            JOptionPane.showMessageDialog(this,"Sala de cine guardada con éxito.","Sala creada",
                JOptionPane.INFORMATION_MESSAGE);
        }else if(this.CbxTipoS.getSelectedIndex()==1){
            if(this.CbxTipo3D.getSelectedIndex()==0){
                this.salas.add(new Sala3D(Integer.parseInt(this.TxtFilas.getText()),Integer.parseInt(this.TxtSillas.getText()),1));
                JOptionPane.showMessageDialog(this,"Sala de cine guardada con éxito.","Sala creada",
                JOptionPane.INFORMATION_MESSAGE);
            }else if(this.CbxTipo3D.getSelectedIndex()==1){
                this.salas.add(new Sala3D(Integer.parseInt(this.TxtFilas.getText()),Integer.parseInt(this.TxtSillas.getText()),2));
                JOptionPane.showMessageDialog(this,"Sala de cine guardada con éxito.","Sala creada",
                JOptionPane.INFORMATION_MESSAGE);
            }else if(this.CbxTipo3D.getSelectedIndex()==2){
                this.salas.add(new Sala3D(Integer.parseInt(this.TxtFilas.getText()),Integer.parseInt(this.TxtSillas.getText()),3));
                JOptionPane.showMessageDialog(this,"Sala de cine guardada con éxito.","Sala creada",
                JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void CbxTipoSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxTipoSMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTipoSMouseClicked

    private void CbxTipoSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxTipoSMousePressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTipoSMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void CbxTipoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTipoSActionPerformed
        if(this.CbxTipoS.getSelectedIndex()==0)
            this.CbxTipo3D.setEnabled(false);
        else if(this.CbxTipoS.getSelectedIndex()==1)
            this.CbxTipo3D.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTipoSActionPerformed

    private void BtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelarMouseClicked
        super.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelarMouseClicked

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox CbxTipo3D;
    private javax.swing.JComboBox CbxTipoS;
    private javax.swing.JTextField TxtFilas;
    private javax.swing.JTextField TxtSillas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
