package Vista;

public class ConsultarPaciente extends javax.swing.JInternalFrame {
    
    private Controlador.GestorPacienteControl gestorpacienteControl;
    public ConsultarPaciente() {
        initComponents();
        gestorpacienteControl = new Controlador.GestorPacienteControl(this);
        AceptarBtn.addActionListener(gestorpacienteControl);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdb_identificacion = new javax.swing.JRadioButton();
        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        rdb_genero = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ValorTxt = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();
        CerrarBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        buttonGroup1.add(rdb_identificacion);
        rdb_identificacion.setText("Identificacion");

        buttonGroup1.add(rdb_nombres);
        rdb_nombres.setText("Nombres");

        buttonGroup1.add(rdb_apellidos);
        rdb_apellidos.setText("Apellidos");

        buttonGroup1.add(rdb_genero);
        rdb_genero.setText("Sexo");

        jLabel1.setText("Valor a buscar:");

        AceptarBtn.setText("Aceptar");
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tbl_datos);

        CerrarBtn.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ValorTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdb_identificacion)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_nombres)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_apellidos)
                                .addGap(18, 18, 18)
                                .addComponent(rdb_genero)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CerrarBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos)
                    .addComponent(rdb_genero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ValorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AceptarBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(CerrarBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_AceptarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AceptarBtn;
    public javax.swing.JButton CerrarBtn;
    public javax.swing.JTable Tbl_datos;
    public javax.swing.JTextField ValorTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_genero;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    // End of variables declaration//GEN-END:variables
}
