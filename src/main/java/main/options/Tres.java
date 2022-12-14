package main.options;

import javax.swing.JLabel;

public class Tres extends javax.swing.JPanel {

    // Declaración de objetos swing
    private javax.swing.JLabel ArrayLabel;      //Label que imprime array terminado
    private javax.swing.JButton But1;           //Botón de generar array
    private javax.swing.JPanel Content;         //Panel principal
    private javax.swing.JButton Sig;            //Boton de siguiente elemento
    private javax.swing.JTextField TextField;   //Textfield de input
    private javax.swing.JComboBox<Integer> cants;   //Lista de cantidad de elementos
    private javax.swing.JLabel jLabel1;     //Label de diseño
    private javax.swing.JLabel jLabel3;     // ""     ""
    private javax.swing.JLabel jLabel4;     // ""     ""
    private javax.swing.JLabel textoArray;  // ""     ""

    private int i;  //Contador de array
    public static String str[]; //Array
    public static int cant; //Tamaño del array

    public Tres() {
        initComponents();
    }
    
    public static String getstar(){ //Método que traduce el array a String
        String s="[";
        if(str.length > 0)
            for(int i=0 ; i<str.length ; i++){
                if(str[i]!=null)
                    s+=str[i];
                else
                    s+=" ";
                if(i<str.length-1)
                    s+=", ";
            }
        s+="]";
        return s;
    }

    
    @SuppressWarnings("unchecked")
    
    //Inicializar componentes
    private void initComponents() {

        //inicializar objetos java
        Content = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoArray = new javax.swing.JLabel();
        ArrayLabel = new javax.swing.JLabel();
        cants = new javax.swing.JComboBox<>();
        But1 = new javax.swing.JButton();
        Sig = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();

        /*
         * Diseño
         */
        Content.setBackground(new java.awt.Color(255, 245, 245));
        Content.setForeground(new java.awt.Color(255, 245, 245));
        Content.setPreferredSize(new java.awt.Dimension(640, 520));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("contendrá el arreglo: ");

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la cantidad de elementos que ");

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ARREGLO DE CADENAS");

        textoArray.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        textoArray.setForeground(new java.awt.Color(0, 0, 0));
        textoArray.setText("Ingrese la cadena #0: ");

        ArrayLabel.setBackground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        ArrayLabel.setForeground(new java.awt.Color(0, 0, 0));
        ArrayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(cant > 0)
        ArrayLabel.setText(getstar());
        else
        ArrayLabel.setText("[ ]");
        ArrayLabel.setPreferredSize(new java.awt.Dimension(640, 22));

        cants.setBackground(new java.awt.Color(232, 161, 155));
        cants.setForeground(new java.awt.Color(232, 161, 155));
        cants.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 1,2,3,4,5,6,7,8,9,10}));

        But1.setBackground(new java.awt.Color(171, 86, 80));
        But1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        But1.setForeground(new java.awt.Color(23, 18, 18));
        But1.setText("Generar Array");
        But1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But1ActionPerformed(evt);
            }
        });

        Sig.setBackground(new java.awt.Color(171, 86, 80));
        Sig.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Sig.setForeground(new java.awt.Color(23, 18, 18));
        Sig.setText("Siguiente");
        Sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigActionPerformed(evt);
            }
        });

        TextField.setPreferredSize(new java.awt.Dimension(150, 28));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(ContentLayout.createSequentialGroup()
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(textoArray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sig))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel4))
                    .addGroup(ContentLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoArray)
                    .addComponent(Sig)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(ArrayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
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
    
    private void But1ActionPerformed(java.awt.event.ActionEvent evt) {//Método que inicializa el array
        cant = (Integer)cants.getSelectedItem();
        str = new String[cant];
        i = 0;
        textoArray.setText("Ingrese la cadena #"+(i+1)+": ");
        ArrayLabel.setText(getstar());
        ArrayLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    private void SigActionPerformed(java.awt.event.ActionEvent evt) {//Método que guarda elementos de array
        str[i] = TextField.getText();
        textoArray.setText("Ingrese la cadena #"+(i+2)+": ");
        if(i==cant-2)
            Sig.setText("Finalizar");
        if(i==cant-1){
            textoArray.setText(" ");
            TextField.setVisible(false);
            Sig.setText(" ");
            Sig.setOpaque(false);
            Sig.setContentAreaFilled(false);
            Sig.setBorderPainted(false);
        }
        i++;
        ArrayLabel.setText(getstar());
        ArrayLabel.setHorizontalAlignment(JLabel.CENTER);
        TextField.setText("");
    }


    
}
