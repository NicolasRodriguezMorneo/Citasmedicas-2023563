package Vista;

public class Consultar_Medico extends javax.swing.JInternalFrame {

    private Controlador.GestorMedicoControl gestormedicocontrol;
    public Consultar_Medico() {
        initComponents();
        gestormedicocontrol = new Controlador.GestorMedicoControl(this);
        AceptarBtn.addActionListener(gestormedicocontrol);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        M_Id = new javax.swing.JRadioButton();
        M_Ape = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ValorTxt = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();
        M_Nom = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Médico");

        M_Id.setText("Identificación");
        M_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_IdActionPerformed(evt);
            }
        });

        M_Ape.setText("Apellidos");

        jLabel1.setText("Valor a Buscar");

        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Identificación", "Nombres", "Apellidos"
            }
        ));
        jScrollPane1.setViewportView(Tbl_datos);

        M_Nom.setText("Nombres");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(ValorTxt)
                        .addGap(14, 14, 14)
                        .addComponent(AceptarBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(M_Id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(M_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(M_Ape, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_Id)
                    .addComponent(M_Ape)
                    .addComponent(M_Nom))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AceptarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_IdActionPerformed

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AceptarBtn;
    public javax.swing.JRadioButton M_Ape;
    public javax.swing.JRadioButton M_Id;
    public javax.swing.JRadioButton M_Nom;
    public javax.swing.JTable Tbl_datos;
    public javax.swing.JTextField ValorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
