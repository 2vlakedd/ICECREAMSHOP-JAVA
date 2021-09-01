import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class shop extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form shop
     */
    public shop() {
   
        
        
        
        initComponents();
        Chocolate.addMouseListener(this);
        Cookiesandcream.addMouseListener(this); 
        MixIcecream.addMouseListener(this);
        Strawberry.addMouseListener(this);
        Vanilla.addMouseListener(this);
        Cocacola.addMouseListener(this);
        orange.addMouseListener(this);
        Shake.addMouseListener(this);  
        Mint.addMouseListener(this); 
        MangoIcecream.addMouseListener(this); 
        Rockyroad.addMouseListener(this); 
        CherryPieIceCream.addMouseListener(this);
        Water.addMouseListener(this);
        Coffee.addMouseListener(this);
        Tshirt.addMouseListener(this);
        Tshirt1.addMouseListener(this);
        Alcohol.addMouseListener(this);
        Toy.addMouseListener(this);
        Toy1.addMouseListener(this);
       Book.addMouseListener(this);
        jTable2.setForeground(Color.WHITE);
        jTable2.setBackground(Color.BLACK);

    }
    DefaultTableModel model = new DefaultTableModel();
  

            
           
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtsub = new javax.swing.JTextField();
        Money = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        Tshirt = new javax.swing.JLabel();
        Tshirt1 = new javax.swing.JLabel();
        Toy = new javax.swing.JLabel();
        Toy1 = new javax.swing.JLabel();
        Book = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cookiesandcream = new javax.swing.JLabel();
        Chocolate = new javax.swing.JLabel();
        Vanilla = new javax.swing.JLabel();
        MixIcecream = new javax.swing.JLabel();
        Strawberry = new javax.swing.JLabel();
        Mint = new javax.swing.JLabel();
        Rockyroad = new javax.swing.JLabel();
        CherryPieIceCream = new javax.swing.JLabel();
        MangoIcecream = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        orange = new javax.swing.JLabel();
        Shake = new javax.swing.JLabel();
        Cocacola = new javax.swing.JLabel();
        Coffee = new javax.swing.JLabel();
        Alcohol = new javax.swing.JLabel();
        Water = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("ICE CREAM SHOP");

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        txtsub.setBackground(new java.awt.Color(153, 255, 255));
        txtsub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsub.setForeground(new java.awt.Color(255, 255, 255));
        txtsub.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(51, 153, 255)));
        txtsub.setCaretColor(new java.awt.Color(153, 255, 255));

        Money.setBackground(new java.awt.Color(153, 255, 255));
        Money.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Money.setForeground(new java.awt.Color(51, 102, 255));
        Money.setText("0000");

        jTable2.setBackground(new java.awt.Color(153, 255, 255));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel11.setBackground(new java.awt.Color(153, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("Total:");

        jLabel12.setBackground(new java.awt.Color(153, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("Your Money:");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Checkout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Money))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Money, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setInheritsPopupMenu(true);

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        Tshirt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Tshirt 2.jpg"))); // NOI18N
        Tshirt.setToolTipText("");
        Tshirt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tshirt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Tshirt.jpg"))); // NOI18N
        Tshirt1.setToolTipText("");
        Tshirt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Toy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/toy.jpg"))); // NOI18N
        Toy.setToolTipText("");
        Toy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Toy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/toy1.jpg"))); // NOI18N
        Toy1.setToolTipText("");
        Toy1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Book.jpg"))); // NOI18N
        Book.setToolTipText("");
        Book.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Toy1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tshirt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tshirt1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Toy, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Toy, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tshirt1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tshirt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Toy1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Book, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Freebies", jPanel5);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        Cookiesandcream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Cookies-and-Cream.jpg"))); // NOI18N
        Cookiesandcream.setText("jLabel2");
        Cookiesandcream.setToolTipText("");
        Cookiesandcream.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Chocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Chocolate.jpg"))); // NOI18N
        Chocolate.setText("jLabel2");
        Chocolate.setToolTipText("");
        Chocolate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Vanilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Vanilla.jpg"))); // NOI18N
        Vanilla.setText("jLabel2");
        Vanilla.setToolTipText("");
        Vanilla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MixIcecream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Mix.jpg"))); // NOI18N
        MixIcecream.setText("jLabel2");
        MixIcecream.setToolTipText("");
        MixIcecream.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MixIcecream.setName(""); // NOI18N

        Strawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Strawberry.jpg"))); // NOI18N
        Strawberry.setText("jLabel2");
        Strawberry.setToolTipText("");
        Strawberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Mint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/mint chocolate chip ice cream.jpg"))); // NOI18N
        Mint.setText("jLabel2");
        Mint.setToolTipText("");
        Mint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Rockyroad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/rocky road icecream.jpg"))); // NOI18N
        Rockyroad.setText("jLabel2");
        Rockyroad.setToolTipText("");
        Rockyroad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CherryPieIceCream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Cherry Pie Ice Cream.jpg"))); // NOI18N
        CherryPieIceCream.setText("jLabel2");
        CherryPieIceCream.setToolTipText("");
        CherryPieIceCream.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MangoIcecream.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Mango icecream.jpg"))); // NOI18N
        MangoIcecream.setText("jLabel2");
        MangoIcecream.setToolTipText("");
        MangoIcecream.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Mint, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rockyroad, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CherryPieIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MangoIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Vanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(MixIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cookiesandcream, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cookiesandcream, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MixIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CherryPieIceCream, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MangoIcecream, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Mint, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Rockyroad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ICE CREAM", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Orange juice.jpg"))); // NOI18N
        orange.setToolTipText("");
        orange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Shake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Chocolate shake.jpg"))); // NOI18N
        Shake.setText("jLabel2");
        Shake.setToolTipText("");
        Shake.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Cocacola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Cocacola.jpg"))); // NOI18N
        Cocacola.setToolTipText("");
        Cocacola.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Coffee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Coffee.jpg"))); // NOI18N
        Coffee.setToolTipText("");
        Coffee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Alcohol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Alcohol.jpg"))); // NOI18N
        Alcohol.setToolTipText("");
        Alcohol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ice cream and drinks/Water.jpg"))); // NOI18N
        Water.setToolTipText("");
        Water.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Shake, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Water, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Shake, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cocacola, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Water, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DRINK", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(633, 633, 633))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultTableModel model=(DefaultTableModel) jTable2.getModel();
int row = jTable2.getSelectedRow();
model.removeRow(row);
        int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          txtsub.setText(Integer.toString(sum));
           
        
       
                  
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        this.toBack();
        checkout newframe = new checkout();
       String x=Money.getText ();
        String y= txtsub.getText ();
int money=Integer.parseInt(x);  
int moneyzs =Integer.parseInt(y); 
int change=money-moneyzs;
        newframe.toFront();
        checkout.jTable1.setModel(model);
        checkout.jLabel2.setText(txtsub.getText());
         checkout.jLabel6.setText(Money.getText());
         
         checkout.jLabel4.setText(Integer.toString(change));
        newframe.setVisible (true);
        
        dispose ();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alcohol;
    private javax.swing.JLabel Book;
    private javax.swing.JLabel CherryPieIceCream;
    private javax.swing.JLabel Chocolate;
    private javax.swing.JLabel Cocacola;
    private javax.swing.JLabel Coffee;
    private javax.swing.JLabel Cookiesandcream;
    private javax.swing.JLabel MangoIcecream;
    private javax.swing.JLabel Mint;
    private javax.swing.JLabel MixIcecream;
    public static javax.swing.JLabel Money;
    private javax.swing.JLabel Rockyroad;
    private javax.swing.JLabel Shake;
    private javax.swing.JLabel Strawberry;
    private javax.swing.JLabel Toy;
    private javax.swing.JLabel Toy1;
    private javax.swing.JLabel Tshirt;
    private javax.swing.JLabel Tshirt1;
    private javax.swing.JLabel Vanilla;
    private javax.swing.JLabel Water;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    private javax.swing.JLabel orange;
    public static javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
             
 String x=Money.getText ();
 int money=Integer.parseInt(x);  


//try{
        if(me.getSource() == Chocolate)
        {
            
            String name = "Chocolate" ; 
            int price= 30;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
            
               
        }
        else if (me.getSource() == MangoIcecream)
        {
            
            String name = "Mango Ice cream" ; 
            int price= 45;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
            
               
        }
        else if (me.getSource() == Rockyroad)
        {
            
            String name = "Rockyroad" ; 
            int price= 99;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
            
               
        }
          else if (me.getSource() == CherryPieIceCream)
        {
            
            String name = "CherryPie IceCream" ; 
            int price= 99;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
            
               
        }
        else if(me.getSource() == Cookiesandcream)
        {
            String name = "Cookies and cream" ;
            int price= 70;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
            
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
               
            }
        }
        
         else if(me.getSource() == MixIcecream)
        {
            String name = "Mix ice cream" ;
            int price= 75;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
           
           txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
            }
             
        }
        
         else if(me.getSource() == Strawberry)
        {
            String name = "strawberry ice cream" ;
            int price= 45;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
            
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                
                
                       
            
               
            }
        }
         
        
         else if(me.getSource() == Vanilla)
        {
            String name = "vanilla" ;
            int price= 40;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
         
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                
                
                       
            
               
            }
        }
        
         else if( me.getSource() == Mint)
        {
            
            String name = "Mint chocolate chip ice cream" ; 
            int price= 45;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
                
            }
          
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
            
               
        }
        
        
         else if(me.getSource() == Cocacola)
        {
            String name = "Coca cola" ;
            int price= 30;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
            
           txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
            
               
            }
        }
        
         else if(me.getSource() == orange)
        {
            String name = "Orange juice" ;
            int price= 50;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
           
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                
                       
            
               
            }
        }
        
         else if(me.getSource() == Shake)
        {
            String name = "Shake" ;
            int price= 100;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
        else if(me.getSource() == Water)
        {
            String name = "Water" ;
            int price= 10;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
        else if(me.getSource() == Coffee)
        {
            String name = "Coffee" ;
            int price= 50;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
        else if(me.getSource() == Alcohol)
        {
            String name = "Alcohol" ;
            int price= 70;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
        else if(me.getSource() == Tshirt)
        {
            String name = "Tshirt" ;
            int price= 199;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
       
            
          
        
         else if(me.getSource() == Tshirt1)
        {
            String name = "Tshirt1" ;
            int price= 299;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
          else if(me.getSource() == Toy)
        {
            String name = "Toy" ;
            int price= 100;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
          else if(me.getSource() == Toy1)
        {
            String name = "Toy1" ;
            int price= 100;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
          else if(me.getSource() == Book)
        {
            String name = "Book" ;
            int price= 200;
            int qty =Integer.parseInt(JOptionPane.showInputDialog("Enter The Qty"));
            int total =price *qty;
            
            model = (DefaultTableModel)jTable2.getModel();
            
            model.addRow(new Object[]
            {
                 name,
                 price,
                 qty,
                 total,      
            });
            
            int sum =0;
            
            for(int i = 0; i <jTable2.getRowCount();i++)
            {
                sum= sum + Integer.parseInt(jTable2.getValueAt(i, 3).toString());
            }
       
            txtsub.setText(Integer.toString(sum));
        String y= txtsub.getText ();
        int moneyzs =Integer.parseInt(y);  
            String z=Money.getText ();
            int moneyz=Integer.parseInt(z);  
            System.out.println (moneyz + "+"+ moneyzs);
            if (moneyz <moneyzs){
                    int res ;
             res=moneyzs-money;
          
             
           int add= Integer.parseInt(JOptionPane.showInputDialog("please add"+ res));
            
  
          add=money+add;
          Money.setText (Integer.toString(add));
                
                       
                     
               
            }
            
          
        }
      //   }catch(NumberFormatException e){
  // JOptionPane.showMessageDialog(this, "Incorrect Value of Number", "Error", JOptionPane.ERROR_MESSAGE);

   //}                             
    }

    @Override
    public void mousePressed(MouseEvent me) {
      
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
}
