package main.options;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Uno extends javax.swing.JPanel {
    
    //Declaración de objetos swing
    private javax.swing.JLabel ArrayLabel;  //Label que almacena el array terminado
    private javax.swing.JPanel Content;     //Panel principal de la opción
    private javax.swing.JLabel Title;       //Label de titulo
    private javax.swing.JComboBox<Integer> cants;   //Lista de selección de items, usada para establecer tamaño del array
    private javax.swing.JButton jButton1;   //Boton de confirmar
    private javax.swing.JLabel jLabel1;     //Label de diseño
    private javax.swing.JLabel jLabel3;     // ""     ""

    public static int num[];      //Array principal
    public static Integer cant = 0; //Variable que almacena cantidad

    public Uno() {
        initComponents();
    }
    
    // Función que traduce el array a String, los separa con una ','. Se utilizará en la opción 1 y 2
    public static String getar(){
        String s="[";
        if(num.length > 0)
            for(int i=0 ; i<num.length ; i++){
                s+=num[i];
                if(i<num.length-1)
                    s+=", ";
            }
        s+="]";
        return s;
    }
    
    
    //Inicializar componentes
    private void initComponents() {

        //Inicializar objetos swing
        Content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        ArrayLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cants = new javax.swing.JComboBox<>();

        /*
         * Diseño
         */
        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setForeground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la cantidad de elementos que ");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("contendrá el arreglo: ");

        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("ARREGLO ALEATORIO");

        ArrayLabel.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ArrayLabel.setForeground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(cant > 0)                            //Importante, detecta si el array está vacio antes de imprimir
        ArrayLabel.setText(getar());
        else
        ArrayLabel.setText("[ ]");
        ArrayLabel.setPreferredSize(new java.awt.Dimension(640, 22));

        jButton1.setBackground(new java.awt.Color(171, 86, 80));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(23, 18, 18));
        jButton1.setText("Generar array");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cants.setBackground(new java.awt.Color(232, 161, 155));
        cants.setForeground(new java.awt.Color(232, 161, 155));
        cants.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 1,2,3,4,5,6,7,8,9,10}));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Title))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addComponent(ArrayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
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

    //Método que genera el array aleatorio en clic del boton
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        cant = (Integer)cants.getSelectedItem();
        num = new int[cant];
        Double temp;
        for(int i=0 ; i<cant ; i++){
            temp = Math.random()*21;
            num[i] = temp.intValue();
        }
        ArrayLabel.setText(getar());
    }

    
}
