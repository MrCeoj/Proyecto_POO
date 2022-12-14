package main.options;
import java.io.*;
import javax.swing.JOptionPane;

public class Ocho extends javax.swing.JPanel {

    //Declaración de objetos swing
    private javax.swing.JPanel Content;     //Panel principal
    private javax.swing.JButton jButton1;   //Botones de funcion
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;     //Labels de diseño
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    public Ocho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    //Inicializar componentes
    private void initComponents() {
        
        //Inicializar objetos swing
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        /*
         * Diseño
         */
        setPreferredSize(new java.awt.Dimension(640, 520));

        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ESCRIBIR CONTENIDO DE");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ARREGLO EN ARCHIVO");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione el arreglo a respaldar");

        jButton1.setBackground(new java.awt.Color(171, 86, 80));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 18, 18));
        jButton1.setText("Respaldar arreglo numérico");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(171, 86, 80));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(23, 18, 18));
        jButton2.setText("Respaldar arreglo de cadenas");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addGap(0, 118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                            .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(211, 211, 211))
                        .addGroup(ContentLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(131, 131, 131)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131))))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        /*
         * Diseño
         */
    }

    //Método que escribe en el archivo de numeros
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        try {
            String ruta = "./src/main/java/main/options\\respaldo_num.txt";
            String contenido = Uno.getar() + "\n";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            JOptionPane.showMessageDialog(null, "Archivo escrito exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Excepcion " + e);
        }
        
    }

    //Método que escribe en el archivo de cadenas
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String ruta = "./src/main/java/main/options\\respaldo_str.txt";
            String contenido = Tres.getstar() + "\n";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            JOptionPane.showMessageDialog(null, "Archivo escrito exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Excepcion " + e);
        }
    }
    
}
