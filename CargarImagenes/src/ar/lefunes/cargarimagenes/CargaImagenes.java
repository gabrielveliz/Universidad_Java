/*
 * CargaImagenes.java
 *
 * Creada el 29/01/2009, 14:17:47
 */
package ar.lefunes.cargarimagenes;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Enrique Funes <http://lefunes.wordpress.com>
 */
public class CargaImagenes extends javax.swing.JFrame {

    private static final long serialVersionUID = -2175359093678346508L;

    public CargaImagenes() {
        initComponents();

        cargarImagenes();
    }

    private void cargarImagenes() {
        Image imagenInterna = new ImageIcon(getClass().getResource("satelite.jpg")).getImage();
        jPanelConFondo1.setImagen(imagenInterna);


        Image imagenExterna = new ImageIcon("tierra.jpg").getImage();
        jPanelConFondo2.setImagen(imagenExterna);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        final javax.swing.JLabel lbInterna = new javax.swing.JLabel();
        final javax.swing.JLabel lbExterna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga de Imagenes");

        jPanelConFondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbInterna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbInterna.setForeground(new java.awt.Color(255, 204, 102));
        lbInterna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInterna.setText("INTERNA");

        javax.swing.GroupLayout jPanelConFondo1Layout = new javax.swing.GroupLayout(jPanelConFondo1);
        jPanelConFondo1.setLayout(jPanelConFondo1Layout);
        jPanelConFondo1Layout.setHorizontalGroup(
            jPanelConFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConFondo1Layout.setVerticalGroup(
            jPanelConFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelConFondo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbExterna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbExterna.setForeground(new java.awt.Color(255, 204, 102));
        lbExterna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExterna.setText("EXTERNA");

        javax.swing.GroupLayout jPanelConFondo2Layout = new javax.swing.GroupLayout(jPanelConFondo2);
        jPanelConFondo2.setLayout(jPanelConFondo2Layout);
        jPanelConFondo2Layout.setHorizontalGroup(
            jPanelConFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
            .addGroup(jPanelConFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConFondo2Layout.setVerticalGroup(
            jPanelConFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(jPanelConFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelConFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelConFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CargaImagenes ci = new CargaImagenes();
                ci.setLocationRelativeTo(null);
                ci.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final ar.lefunes.jpanelconfondo.JPanelConFondo jPanelConFondo1 = new ar.lefunes.jpanelconfondo.JPanelConFondo();
    private final ar.lefunes.jpanelconfondo.JPanelConFondo jPanelConFondo2 = new ar.lefunes.jpanelconfondo.JPanelConFondo();
    // End of variables declaration//GEN-END:variables
}
