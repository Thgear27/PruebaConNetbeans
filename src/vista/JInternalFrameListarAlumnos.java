package vista;

import control.ArregloAlumnos;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;

public class JInternalFrameListarAlumnos extends javax.swing.JInternalFrame {

    ArregloAlumnos arr;
    
    public JInternalFrameListarAlumnos(ArregloAlumnos arr) {
        this.arr = arr;
        initComponents();
        Listar();
    }
    
    public void Listar() {
        int opcionFiltroSexo = cmbSexo.getSelectedIndex();
        int opcionFiltroAprobado = cmbEstado.getSelectedIndex();
        boolean filtroPasadoSexo = true;
        boolean filtroPasadoAprobado = true;
        
        String columns[] = { "Codigo", "Nombre", "Apellido Paterno", "Apellido Materno", "Sexo", "Promedio" };
        DefaultTableModel mt = new DefaultTableModel(null, columns);
        Table2.setModel(mt);
        for (int i = 0; i < arr.indice(); i++) {
            Alumno c = arr.obtener(i);
            Object rowData[] = {c.getCodigo(), c.getNombre(), c.getApellidoPaterno(), c.getApellidoMaterno(), c.getSexo(), c.getPromedio()};
            if (opcionFiltroAprobado == 1) {
                if (c.getPromedio() > 11.0 ) {
                    filtroPasadoAprobado = true;
                } else {
                    filtroPasadoAprobado = false;
                }
            }
            if (opcionFiltroAprobado == 2) {
                if (c.getPromedio() < 11.0) {
                    filtroPasadoAprobado = true;
                } else {
                    filtroPasadoAprobado = false;
                }
            }
            if (opcionFiltroSexo == 1) {
                if (c.getSexo() == Alumno.Sexo.HOMBRE) {
                    filtroPasadoSexo = true;
                } else {
                    filtroPasadoSexo = false;
                }
            }
            if (opcionFiltroSexo == 2) {
                if (c.getSexo() == Alumno.Sexo.MUJER) {
                    filtroPasadoSexo = true;
                } else {
                    filtroPasadoSexo = false;
                }
            }
            if (filtroPasadoAprobado && filtroPasadoSexo) {
                mt.addRow(rowData);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        Table2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filtros:");

        cmbSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No filtro", "Hombre", "Mujer" }));

        cmbEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No filtro", "Aprobado", "Desaprobado" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Sexo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Estado");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Listar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table2;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
