package main;
import java.awt.BorderLayout;
import main.options.*;
import javax.swing.*;
public class MenuPrincipal extends javax.swing.JFrame{
    
    //Declaración de objetos swing
    private javax.swing.JLabel Bienvenida;  //Texto de bienvenida
    private javax.swing.JPanel Contenido;   //Panel que contiene el contenido de las opciones
    private javax.swing.JPanel Fondo;       //Panel de fondo
    private javax.swing.JPanel Op1;         //Panel que contiene funge como botón para la opción 1
    private javax.swing.JPanel Op2;         // ""    ""    ""     ""    ""    ""   ""  "" opción 2
    private javax.swing.JPanel Op3;         // ""    ""    ""     ""    ""    ""   ""  "" opción 3
    private javax.swing.JPanel Op4;         // ""    ""    ""     ""    ""    ""   ""  "" opción 4
    private javax.swing.JPanel Op5;         // ""    ""    ""     ""    ""    ""   ""  "" opción 5
    private javax.swing.JPanel Op6;         // ""    ""    ""     ""    ""    ""   ""  "" opción 6
    private javax.swing.JPanel Op7;         // ""    ""    ""     ""    ""    ""   ""  "" opción 7
    private javax.swing.JPanel Op8;         // ""    ""    ""     ""    ""    ""   ""  "" opción 8
    private javax.swing.JPanel Op9;         // ""    ""    ""     ""    ""    ""   ""  "" opción 9
    private javax.swing.JPanel Op10;        // ""    ""    ""     ""    ""    ""   ""  "" opción 10
    private javax.swing.JPanel Opciones;    //Panel que contiene todas las opciones como botones
    private javax.swing.JPanel Title;       //Panel de cabecera
    private javax.swing.JLabel Titulo;      //Etiqueta de título
    private javax.swing.JLabel jLabel1;     //Etiqueta de la opción 1
    private javax.swing.JLabel jLabel10;    //   ""     ""   opción 2
    private javax.swing.JLabel jLabel11;    //   ""     ""   opción 3
    private javax.swing.JLabel jLabel12;    //   ""     ""   opción 4
    private javax.swing.JLabel jLabel4;     //   ""     ""   opción 5
    private javax.swing.JLabel jLabel5;     //   ""     ""   opción 6
    private javax.swing.JLabel jLabel6;     //   ""     ""   opción 7
    private javax.swing.JLabel jLabel7;     //   ""     ""   opción 8
    private javax.swing.JLabel jLabel8;     //   ""     ""   opción 9
    private javax.swing.JLabel jLabel9;     //   ""     ""   opción 10
    private javax.swing.JButton jButton4;   //Botón de Home

    int xMouse, yMouse; //Variables que guardan coordenadas del puntero
    
    public MenuPrincipal() {
        super("Los POOderosos RadaMarceDiego"); //Título
        initComponents();         //El constructor inicializa las variables de swing y les aplica atributos
        Cero p = new Cero();      //Inicializar el panel de bienvenida
        show(p);
    }
    
    private void show(JPanel u){  //Método que permite actualizar el panel de contenido de las opciones
        u.setSize(640,520);
        u.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(u,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }

    //Método que inicializa componentes
    private void initComponents() {

        Fondo = new javax.swing.JPanel();       //Inicializar los objetos de swing
        Opciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Op1 = new javax.swing.JPanel();
        Op2 = new javax.swing.JPanel();
        Op3 = new javax.swing.JPanel();
        Op4 = new javax.swing.JPanel();
        Op5 = new javax.swing.JPanel();
        Op6 = new javax.swing.JPanel();
        Op7 = new javax.swing.JPanel();
        Op8 = new javax.swing.JPanel();
        Op9 = new javax.swing.JPanel();
        Op10 = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); //Inicializar Ventana
        setTitle("Los POOderosos RadaMarceDiego");
        setLocationByPlatform(true);
        setResizable(false);

        /*
         *  Inicia el diseño de interfaz
         */
        Fondo.setBackground(new java.awt.Color(204, 204, 204));
        Fondo.setMinimumSize(new java.awt.Dimension(0, 0));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Opciones.setBackground(new java.awt.Color(148, 25, 25));
        Opciones.setForeground(new java.awt.Color(148, 25, 25));
        Opciones.setPreferredSize(new java.awt.Dimension(360, 520));

        Op1.setBackground(new java.awt.Color(148, 25, 25));
        Op1.setForeground(new java.awt.Color(148, 25, 25));
        Op1.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generar arreglo numerico aleatorio");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op1Layout = new javax.swing.GroupLayout(Op1);
        Op1.setLayout(Op1Layout);
        Op1Layout.setHorizontalGroup(
            Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op1Layout.setVerticalGroup(
            Op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Op2.setBackground(new java.awt.Color(148, 25, 25));
        Op2.setForeground(new java.awt.Color(148, 25, 25));
        Op2.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Generar arreglo numerico con datos solicitados");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op2Layout = new javax.swing.GroupLayout(Op2);
        Op2.setLayout(Op2Layout);
        Op2Layout.setHorizontalGroup(
            Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Op2Layout.setVerticalGroup(
            Op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Op3.setBackground(new java.awt.Color(148, 25, 25));
        Op3.setForeground(new java.awt.Color(148, 25, 25));
        Op3.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Generar arreglo de cadenas con datos solicitados");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op3Layout = new javax.swing.GroupLayout(Op3);
        Op3.setLayout(Op3Layout);
        Op3Layout.setHorizontalGroup(
            Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Op3Layout.setVerticalGroup(
            Op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Op4.setBackground(new java.awt.Color(148, 25, 25));
        Op4.setForeground(new java.awt.Color(148, 25, 25));
        Op4.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Generar arreglo de objetos con datos solicitados");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op4Layout = new javax.swing.GroupLayout(Op4);
        Op4.setLayout(Op4Layout);
        Op4Layout.setHorizontalGroup(
            Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        Op4Layout.setVerticalGroup(
            Op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Op5.setBackground(new java.awt.Color(148, 25, 25));
        Op5.setForeground(new java.awt.Color(148, 25, 25));
        Op5.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mostrar elementos del arreglo");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op5Layout = new javax.swing.GroupLayout(Op5);
        Op5.setLayout(Op5Layout);
        Op5Layout.setHorizontalGroup(
            Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Op5Layout.setVerticalGroup(
            Op5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Op6.setBackground(new java.awt.Color(148, 25, 25));
        Op6.setForeground(new java.awt.Color(148, 25, 25));
        Op6.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ordenar arreglo");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op6Layout = new javax.swing.GroupLayout(Op6);
        Op6.setLayout(Op6Layout);
        Op6Layout.setHorizontalGroup(
            Op6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Op6Layout.setVerticalGroup(
            Op6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Op7.setBackground(new java.awt.Color(148, 25, 25));
        Op7.setForeground(new java.awt.Color(148, 25, 25));
        Op7.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Buscar elemento en arreglo");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op7Layout = new javax.swing.GroupLayout(Op7);
        Op7.setLayout(Op7Layout);
        Op7Layout.setHorizontalGroup(
            Op7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        Op7Layout.setVerticalGroup(
            Op7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Op8.setBackground(new java.awt.Color(148, 25, 25));
        Op8.setForeground(new java.awt.Color(148, 25, 25));
        Op8.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Escribir contenido de arreglo en archivo");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op8Layout = new javax.swing.GroupLayout(Op8);
        Op8.setLayout(Op8Layout);
        Op8Layout.setHorizontalGroup(
            Op8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        Op8Layout.setVerticalGroup(
            Op8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        Op9.setBackground(new java.awt.Color(148, 25, 25));
        Op9.setForeground(new java.awt.Color(148, 25, 25));
        Op9.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Leer contenido del archivo");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op9Layout = new javax.swing.GroupLayout(Op9);
        Op9.setLayout(Op9Layout);
        Op9Layout.setHorizontalGroup(
            Op9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op9Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Op9Layout.setVerticalGroup(
            Op9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Op9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Op10.setBackground(new java.awt.Color(148, 25, 25));
        Op10.setForeground(new java.awt.Color(148, 25, 25));
        Op10.setPreferredSize(new java.awt.Dimension(360, 46));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Salir");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Op10Layout = new javax.swing.GroupLayout(Op10);
        Op10.setLayout(Op10Layout);
        Op10Layout.setHorizontalGroup(
            Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Op10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        Op10Layout.setVerticalGroup(
            Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(Op10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Op10Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );

        javax.swing.GroupLayout OpcionesLayout = new javax.swing.GroupLayout(Opciones);
        Opciones.setLayout(OpcionesLayout);
        OpcionesLayout.setHorizontalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Op3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(Op2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(Op1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(Op4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OpcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Op10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(627, 627, 627))
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addGroup(OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Op9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Op7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Op6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Op5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Op8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OpcionesLayout.setVerticalGroup(
            OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesLayout.createSequentialGroup()
                .addComponent(Op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        Fondo.add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 520));

        Contenido.setBackground(new java.awt.Color(255, 245, 245));
        Contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Contenido.setForeground(new java.awt.Color(255, 245, 245));
        Contenido.setPreferredSize(new java.awt.Dimension(640, 520));

        Bienvenida.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        Bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenida.setText("Bienvenido al programa");

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(1129, 1129, 1129)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        Fondo.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 640, 520));

        Title.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 2, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Proyecto Programación Orientada a Objetos I");
        Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TituloMouseDragged(evt);
            }
        });
        Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TituloMousePressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(171, 86, 80));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(23, 18, 18));
        jButton4.setText("🏠");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TitleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap())
        );

        Fondo.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();

        /*
         *  Finaliza el diseño de interfaz
         */
    }

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) { //Eventos que detectan el clic de las opciones
        Uno p = new Uno();
        show(p);
    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
        Dos p = new Dos();
        show(p);
    }

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
        Tres p = new Tres();
        show(p);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        Cuatro p = new Cuatro();
        show(p);
    }

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        Cinco p = new Cinco();
        show(p);
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
        Seis p = new Seis();
        show(p);
    }

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {
        Siete p = new Siete();
        show(p);
    }

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {
        Ocho p = new Ocho();
        show(p);
    }
    
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {
        Nueve p = new Nueve();
        show(p);
    }

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void TituloMousePressed(java.awt.event.MouseEvent evt) { //Evento que detecta cuando se presiona la barra de título
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

    //Evento que permmite mover la ventana con la barra de título
    private void TituloMouseDragged(java.awt.event.MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }

    //Eventos cambian el color del panel de las opciones cuando el puntero les pasa por encima
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {
        Op1.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {
        Op1.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {
        Op2.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {
        Op2.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {
       Op3.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {
        Op3.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        Op4.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
        Op4.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {
        Op5.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {
        Op5.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {
        Op6.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {
        Op6.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {
        Op7.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {
        Op7.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {
        Op8.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {
        Op8.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {
        Op9.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {
        Op9.setBackground(new java.awt.Color(148,25,25));
    }

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {
        Op10.setBackground(new java.awt.Color(204, 63, 63));
    }

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {
        Op10.setBackground(new java.awt.Color(148,25,25));
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        Cero p = new Cero();
        show(p);
    }
      
    public static void main(String args[]) { //El main
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        //Crea e imprime el jframe
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    
}
