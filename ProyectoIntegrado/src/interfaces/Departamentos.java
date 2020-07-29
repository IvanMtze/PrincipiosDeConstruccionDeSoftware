/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DAO.FactoryDAO;
import DAO.IDAOGeneral;
import DAO.Departamento;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oswaldo
 */
public class Departamentos extends javax.swing.JPanel {

    /**
     * Creates new form Departamento
     */
    public Departamentos() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consolaDepartamento = new javax.swing.JTextPane();
        guardarDepartamento = new javax.swing.JToggleButton();
        buscarDepartamento = new javax.swing.JToggleButton();
        editarDepartamento = new javax.swing.JToggleButton();
        eliminarDepartamento = new javax.swing.JToggleButton();
        regresar = new javax.swing.JToggleButton();
        claveDepartamento = new javax.swing.JTextField();
        nombreDepartamento = new javax.swing.JTextField();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEPARTAMENTO");

        jScrollPane1.setViewportView(consolaDepartamento);

        guardarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Guardar.png"))); // NOI18N
        guardarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDepartamentoActionPerformed(evt);
            }
        });

        buscarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buscar.png"))); // NOI18N
        buscarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarDepartamentoActionPerformed(evt);
            }
        });

        editarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Editar.png"))); // NOI18N
        editarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDepartamentoActionPerformed(evt);
            }
        });

        eliminarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Eliminar.png"))); // NOI18N
        eliminarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDepartamentoActionPerformed(evt);
            }
        });

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Regresar.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        claveDepartamento.setForeground(new java.awt.Color(153, 153, 153));
        claveDepartamento.setText("Clave:");
        claveDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claveDepartamentoMouseClicked(evt);
            }
        });

        nombreDepartamento.setForeground(new java.awt.Color(153, 153, 153));
        nombreDepartamento.setText("Nombre:");
        nombreDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreDepartamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(claveDepartamento)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nombreDepartamento))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(claveDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void claveDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveDepartamentoMouseClicked
        claveDepartamento.setText("");
        claveDepartamento.setForeground(Color.black);
    }//GEN-LAST:event_claveDepartamentoMouseClicked

    private void nombreDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreDepartamentoMouseClicked
        nombreDepartamento.setText("");
        nombreDepartamento.setForeground(Color.black);
    }//GEN-LAST:event_nombreDepartamentoMouseClicked

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void guardarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDepartamentoActionPerformed
        consolaDepartamento.setText("");
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);
        Departamento d = new Departamento();

        d.setClave(claveDepartamento.getText());
        d.setNombre(nombreDepartamento.getText());
        formato();
        if (daop.guardar(d)) {
            consolaDepartamento.setText("Guardado");
        } else {
            consolaDepartamento.setText("NO se pudo guardar");
        }
    }//GEN-LAST:event_guardarDepartamentoActionPerformed

    private void buscarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarDepartamentoActionPerformed
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);
        Departamento d = new Departamento();
        d.setClave(claveDepartamento.getText());
        ResultSet r = daop.buscar(d);
        if (r != null) {
            try {
                r.next();
                claveDepartamento.setText(r.getString(1));
                nombreDepartamento.setText(r.getString(2));

            } catch (SQLException ex) {
                Logger.getLogger(Departamentos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }

    }//GEN-LAST:event_buscarDepartamentoActionPerformed

    private void editarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDepartamentoActionPerformed
        consolaDepartamento.setText("");
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);
        Departamento d = new Departamento();

        d.setClave(claveDepartamento.getText());
        d.setNombre(nombreDepartamento.getText());
        formato();
        if (daop.editar(d)) {
            consolaDepartamento.setText("Guardado");
        } else {
            consolaDepartamento.setText("NO se pudo guardar");
        }    }//GEN-LAST:event_editarDepartamentoActionPerformed

    private void eliminarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDepartamentoActionPerformed
        consolaDepartamento.setText("");
        IDAOGeneral daop = FactoryDAO.create(FactoryDAO.TypeDAO.DEPARTAMENTO);
        Departamento d = new Departamento();

        d.setClave(claveDepartamento.getText());
        d.setNombre(nombreDepartamento.getText());
        formato();
        if (daop.eliminar(d)) {
            consolaDepartamento.setText("eliminado");
        } else {
            consolaDepartamento.setText("NO se pudo eliminar");
        }
    }//GEN-LAST:event_eliminarDepartamentoActionPerformed

    private void formato() {
        consolaDepartamento.setText("");
        claveDepartamento.setForeground(Color.DARK_GRAY);
        claveDepartamento.setText("Clave:");

        nombreDepartamento.setForeground(Color.DARK_GRAY);
        nombreDepartamento.setText("Nombre:");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buscarDepartamento;
    private javax.swing.JTextField claveDepartamento;
    private javax.swing.JTextPane consolaDepartamento;
    private javax.swing.JToggleButton editarDepartamento;
    private javax.swing.JToggleButton eliminarDepartamento;
    private javax.swing.JToggleButton guardarDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreDepartamento;
    private javax.swing.JToggleButton regresar;
    // End of variables declaration//GEN-END:variables
}
