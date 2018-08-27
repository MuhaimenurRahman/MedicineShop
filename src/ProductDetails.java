
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhaimenur
 */
public class ProductDetails extends javax.swing.JFrame {

    public ResultSet rs;
    public Statement st;
    public Connection con;
    String table_Click, table_Click1, table_Click2, table_Click3, table_Click4, table_Click5, table_Click6, table_Click7, table_Click8, table_Click9, click, click1, click2, click3;
    private PreparedStatement pst;
    private String sql;
    String medicine_total_for_add;

    public ProductDetails() {
        initComponents();
        this.setResizable(false);
        setLocationRelativeTo(null);
        Connection();
    }

    public void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_shop", "root", "");
            st = con.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        company_name = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Medicine_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Purchase_date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MFD_date = new com.toedter.calendar.JDateChooser();
        Exp_date = new com.toedter.calendar.JDateChooser();
        number_of_pac = new javax.swing.JTextField();
        pata_per_pack = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancle = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        total_medicine = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        rate_per_tablet = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        commission_field = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Product_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DueTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Combo_2 = new javax.swing.JComboBox();
        Date_2 = new com.toedter.calendar.JDateChooser();
        Due = new javax.swing.JTextField();
        Paid = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Deleted = new javax.swing.JButton();
        Searching = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        TotalDue = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("          Enter Product Details");

        company_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        company_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACME\t", "A.C.I.\t", "ARISTOPHARMA\t", "ALCO PHARMA\t", "APEX PHARMA\t", "ASIATIC", "BEXIMCO\t", "BIO PHARMA", "BEACON PHARMA\t", "DELTA PHARMA\t", "ESKAYEF\t", "EDRUC\t", "GLAXOSMITHKLINE\t", "GLOBE\t", "HEALTHCARE PHARMA\t", "INCEPTA PHARMA\t", "IBN SINA\t", "JAYSON\t", "KEMIKO PHARMA LTD.\t", "LIBRA\t", "MEDIMPEX\t", "NOVARTIS\t", "NOVO NORDISK\t", "NUVISTA PHARMA\t", "NAVANA\t", "OPSONIN PHARMA\t", "ORION PHARMA LTD.\t", "ORION INFUSION\t", "OPSO SALINE\t", "PACIFIC\t", "PHARMADESH\t", "POPULAR PHARMA\t", "ROCHE\t", "RADIANT PHARMA\t", "RENATA\t", "RANGS PHARMA\t", "RAK PHARMA LTD.\t", "SQUARE\t", "SANOFI AVENTIS\t", "SILVA PHARMA\t", "SANDOZ\t", "SUN PHARMA\t", "SMC\t", "SERVIER\t", "SOMATEC\t", "UNIMED &UNIHEALTH\t", "WHITE HORSE PHARMA\t", "ZISKA\t", " " }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Company Name          :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Medicine Name            :");

        Medicine_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Purchase Date             :");

        Purchase_date.setDateFormatString("yyyy-MM-dd");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("MFD Date                     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("EXP Date                     :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Number Of Pack         :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pata (Per Pack)          :");

        MFD_date.setDateFormatString("yyyy-MM-dd");

        Exp_date.setDateFormatString("yyyy-MM-dd");

        number_of_pac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pata_per_pack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pata_per_pack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pata_per_packKeyPressed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("ADD ");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setText("SEARCH");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cancle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancle.setText("CANCLE");
        cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Medicine ( P.P )          :");

        total_medicine.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total_medicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_medicineActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Rate (Per Pack)         : ");

        rate_per_tablet.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rate_per_tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rate_per_tabletActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Commission               :");

        commission_field.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        commission_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commission_fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(company_name, 0, 225, Short.MAX_VALUE)
                    .addComponent(Medicine_name)
                    .addComponent(Purchase_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MFD_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exp_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(number_of_pac)
                    .addComponent(pata_per_pack)
                    .addComponent(total_medicine)
                    .addComponent(rate_per_tablet)
                    .addComponent(commission_field))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company_name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Medicine_name, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Purchase_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MFD_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exp_date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number_of_pac, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(pata_per_pack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total_medicine, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rate_per_tablet, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commission_field, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        Product_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Product_table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COMPANY_NAME", "MEDICINE_NAME", "PURCHASE_DATE", "MFD_DATE", "EXP_DATE", "Number Of Pack", "Pata ( Per Pack )", "Total Medicine", "Rate ( Per Medicine )", "Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Product_table);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel9.setText("    Company Due Details");

        DueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company_Name", "Purchase_Date", "Paid_Price", "Due_Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DueTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DueTable);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Company Name    :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Purchase Date       :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Due Price                :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Paid Price               :");

        Combo_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACME\t", "A.C.I.\t", "ARISTOPHARMA\t", "ALCO PHARMA\t", "APEX PHARMA\t", "ASIATIC", "BEXIMCO\t", "BIO PHARMA", "BEACON PHARMA\t", "DELTA PHARMA\t", "ESKAYEF\t", "EDRUC\t", "GLAXOSMITHKLINE\t", "GLOBE\t", "HEALTHCARE PHARMA\t", "INCEPTA PHARMA\t", "IBN SINA\t", "JAYSON\t", "KEMIKO PHARMA LTD.\t", "LIBRA\t", "MEDIMPEX\t", "NOVARTIS\t", "NOVO NORDISK\t", "NUVISTA PHARMA\t", "NAVANA\t", "OPSONIN PHARMA\t", "ORION PHARMA LTD.\t", "ORION INFUSION\t", "OPSO SALINE\t", "PACIFIC\t", "PHARMADESH\t", "POPULAR PHARMA\t", "ROCHE\t", "RADIANT PHARMA\t", "RENATA\t", "RANGS PHARMA\t", "RAK PHARMA LTD.\t", "SQUARE\t", "SANOFI AVENTIS\t", "SILVA PHARMA\t", "SANDOZ\t", "SUN PHARMA\t", "SMC\t", "SERVIER\t", "SOMATEC\t", "UNIMED &UNIHEALTH\t", "WHITE HORSE PHARMA\t", "ZISKA\t", " " }));

        Date_2.setDateFormatString("yyyy-MM-dd");

        Paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaidActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Deleted.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Deleted.setText("DELETE");
        Deleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedActionPerformed(evt);
            }
        });

        Searching.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Searching.setText("SEARCH");
        Searching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchingActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Total Due Price:");

        TotalDue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalDueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Due))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date_2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Paid))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Combo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(340, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Date_2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Due, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Paid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deleted, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searching, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TotalDue, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Account Details");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Employee Details");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String str = (String) company_name.getSelectedItem();
        String Medicine = Medicine_name.getText();
        String Purchase = ((JTextField) Purchase_date.getDateEditor().getUiComponent()).getText();
        String MFD = ((JTextField) MFD_date.getDateEditor().getUiComponent()).getText();
        String EXP = ((JTextField) Exp_date.getDateEditor().getUiComponent()).getText();
       // String quantity_product = number_of_pac.getText();
        //String rate_product = pata_per_pack.getText();
         String pack_number = number_of_pac.getText();
         String total_pata = pata_per_pack.getText();
         String total_tablets = total_medicine.getText();
         String rate = rate_per_tablet.getText();
         String commision = commission_field.getText();
         
         
        int num = Integer.parseInt(pack_number);
        int num1 = Integer.parseInt(total_pata);
        int num2 = Integer.parseInt(total_tablets);
        int rates = Integer.parseInt(rate);
        int commission = Integer.parseInt(commision);
        
        int num3 = (num*num1*num2);
        
        float num4 = (float)rates/num3;
        

        try {
            String sql = "insert into product(COMPANY_NAME,MEDICINE_NAME,PURCHASE_DATE,MFD_DATE,EXP_DATE,NUMBER_OF_PACK,PATA,TOTAL_TABLET,RATE_PER_TABLET,COMMISSION) values ('" + str + "','" + Medicine + "','" + Purchase + "','" + MFD + "','" + EXP + "','" + num + "','" + num1 + "','" + num3 + "','" + num4 + "','" + commission + "')";
            pst = con.prepareStatement(sql);
            pst.execute();

            DefaultTableModel model = (DefaultTableModel) Product_table.getModel();
            model.addRow(new Object[]{str, Medicine, Purchase, MFD, EXP, num, num1, num3, num4,commission});

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");

        }
        Medicine_name.setText("");
        ((JTextField) Purchase_date.getDateEditor().getUiComponent()).setText("");
        ((JTextField) MFD_date.getDateEditor().getUiComponent()).setText("");
        ((JTextField) Exp_date.getDateEditor().getUiComponent()).setText("");
        number_of_pac.setText("");
        pata_per_pack.setText("");
        total_medicine.setText("");
        rate_per_tablet.setText("");
        commission_field.setText("");
        
    }//GEN-LAST:event_AddActionPerformed

    private void cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancleActionPerformed
        Login login = new Login();
        login.show();
        this.dispose();
    }//GEN-LAST:event_cancleActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (r == 0) {
            try {
                String sql = "delete from Product Where COMPANY_NAME='" + table_Click + "' AND MEDICINE_NAME='" + table_Click1 + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel model = (DefaultTableModel) Product_table.getModel();
                model.removeRow(Product_table.getSelectedRow());

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void Product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_tableMouseClicked
        try {
            int row = Product_table.getSelectedRow();
            table_Click = (Product_table.getModel().getValueAt(row, 0).toString());
            table_Click1 = (Product_table.getModel().getValueAt(row, 1).toString());
            table_Click2 = (Product_table.getModel().getValueAt(row, 2).toString());
            table_Click3 = (Product_table.getModel().getValueAt(row, 3).toString());
            table_Click4 = (Product_table.getModel().getValueAt(row, 4).toString());
            table_Click5 = (Product_table.getModel().getValueAt(row, 5).toString());
            table_Click6 = (Product_table.getModel().getValueAt(row, 6).toString());
            table_Click7 = (Product_table.getModel().getValueAt(row,7).toString()); 
            table_Click8 = (Product_table.getModel().getValueAt(row, 8).toString());
            table_Click9 = (Product_table.getModel().getValueAt(row,9).toString()); 

            company_name.setSelectedItem(table_Click);
            Medicine_name.setText(table_Click1);
            ((JTextField) Purchase_date.getDateEditor().getUiComponent()).setText(table_Click2);
            ((JTextField) MFD_date.getDateEditor().getUiComponent()).setText(table_Click3);
            ((JTextField) Exp_date.getDateEditor().getUiComponent()).setText(table_Click4);
            number_of_pac.setText(table_Click5);
            pata_per_pack.setText(table_Click6);
           // total_medicine.setText(table_Click7);
            //rate_per_tablet.setText(table_Click8);
            medicine_total_for_add = table_Click7;
            System.out.println(" "+medicine_total_for_add);
            commission_field.setText(table_Click9);

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_Product_tableMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
            String Searching = "Select COMPANY_NAME,MEDICINE_NAME,PURCHASE_DATE,MFD_DATE,EXP_DATE,NUMBER_OF_PACK,PATA,TOTAL_TABLET,RATE_PER_TABLET,COMMISSION from Product where Company_name=?";
            pst = con.prepareStatement(Searching);
            pst.setString(1, (String) company_name.getSelectedItem());
            rs = pst.executeQuery();
            Product_table.setModel(DbUtils.resultSetToTableModel(rs));
            Product_table.getColumnModel().getColumn(0).setPreferredWidth(80);
            Product_table.getColumnModel().getColumn(1).setPreferredWidth(80);
            Product_table.getColumnModel().getColumn(2).setPreferredWidth(80);
            Product_table.getColumnModel().getColumn(3).setPreferredWidth(80);
            Product_table.getColumnModel().getColumn(4).setPreferredWidth(80);
            Product_table.getColumnModel().getColumn(5).setPreferredWidth(90);
            Product_table.getColumnModel().getColumn(6).setPreferredWidth(35);
            Product_table.getColumnModel().getColumn(5).setPreferredWidth(50);
            Product_table.getColumnModel().getColumn(6).setPreferredWidth(55);
            Product_table.getColumnModel().getColumn(6).setPreferredWidth(40);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Search");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void PaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaidActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String name = (String) Combo_2.getSelectedItem();
        String Dates = ((JTextField) Date_2.getDateEditor().getUiComponent()).getText();
        String DuePrice = Due.getText();
        String PaidPrice = Paid.getText();
        int Paids = Integer.parseInt(PaidPrice);
        int Dues = Integer.parseInt(DuePrice);

        try {
            String sql3 = "insert into DueDetails(COMPANY_NAME,PURCHASE_DATE,Paid_Price,Due_Price) values ('" + name + "','" + Dates + "','" + Paids + "','" + Dues + "')";
            pst = con.prepareStatement(sql3);
            pst.execute();

            DefaultTableModel model = (DefaultTableModel) DueTable.getModel();
            model.addRow(new Object[]{name, Dates, Paids, Dues});
          Due.setText("");
          Paid.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");

        }
    }//GEN-LAST:event_SaveActionPerformed

    private void TotalDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalDueActionPerformed

    private void DeletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {
                String sql5 = "delete from DueDetails Where COMPANY_NAME='" + click + "' AND PAID_PRICE='" + click2 + "'AND DUE_PRICE='" + click3 + "'";
                pst = con.prepareStatement(sql5);
                pst.execute();
                DefaultTableModel models = (DefaultTableModel) DueTable.getModel();
                models.removeRow(DueTable.getSelectedRow());

                 Due.setText("");
          Paid.setText("");
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DeletedActionPerformed

    private void DueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DueTableMouseClicked
        int DueRow = DueTable.getSelectedRow();
        click = (DueTable.getModel().getValueAt(DueRow, 0).toString());
        click1 = (DueTable.getModel().getValueAt(DueRow, 1).toString());
        click2 = (DueTable.getModel().getValueAt(DueRow, 2).toString());
        click3 = (DueTable.getModel().getValueAt(DueRow, 3).toString());

        Combo_2.setSelectedItem(click);
        ((JTextField) Date_2.getDateEditor().getUiComponent()).setText(click1);
        Due.setText(click2);
        Paid.setText(click3);

    }//GEN-LAST:event_DueTableMouseClicked

    private void SearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchingActionPerformed
        try {
            String Searching = "Select COMPANY_NAME,PURCHASE_DATE,Paid_Price,Due_Price from DueDetails where Company_name=?";
            pst = con.prepareStatement(Searching);
            pst.setString(1, (String) Combo_2.getSelectedItem());
            rs = pst.executeQuery();

            DueTable.setModel(DbUtils.resultSetToTableModel(rs));
            DueTable.getColumnModel().getColumn(0).setPreferredWidth(85);
            DueTable.getColumnModel().getColumn(1).setPreferredWidth(115);
            DueTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            DueTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            int RowCount = DueTable.getRowCount();
            int sum = 0;
            for (int i = 0; i < RowCount; i++) {
                sum = sum + Integer.parseInt(DueTable.getValueAt(i, 3).toString());

            }
            TotalDue.setText(String.valueOf(sum));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Search");
        }
    }//GEN-LAST:event_SearchingActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String str1 = (String) company_name.getSelectedItem();
        String Medicine1 = Medicine_name.getText();
        String Purchase1 = ((JTextField) Purchase_date.getDateEditor().getUiComponent()).getText();
        String MFD1 = ((JTextField) MFD_date.getDateEditor().getUiComponent()).getText();
        String EXP1 = ((JTextField) Exp_date.getDateEditor().getUiComponent()).getText();
        String number_of_p = number_of_pac.getText();
        String pata = pata_per_pack.getText();
        
        String Medicine_P_P = total_medicine.getText();
        String rate_product = rate_per_tablet.getText();
        String Commission_of_P = commission_field.getText();
        int num = Integer.parseInt(number_of_p);
        int num1 = Integer.parseInt(pata);
        int num2 = Integer.parseInt(Medicine_P_P);
        int num3= Integer.parseInt(rate_product);
        int num4= Integer.parseInt(Commission_of_P);
        int num6= Integer.parseInt(medicine_total_for_add);
         int total_medicines = (num*num1*num2) + num6;
        
        float num5 = (float)num3/total_medicines;
        
        

        int q = JOptionPane.showConfirmDialog(null, "Do you really want to update", "Update", JOptionPane.YES_NO_OPTION);
        if (q == 0) {
            try {
                String sql6 = "UPDATE PRODUCT SET COMPANY_NAME='" + str1 + "'  ,MEDICINE_NAME='" + Medicine1 + "'  ,PURCHASE_DATE='" + Purchase1 + "'  ,MFD_DATE='" + MFD1 + "'  ,EXP_DATE='" + EXP1 + "'  ,NUMBER_OF_PACK='" + num + "'  ,PATA ='" + num1 + "',TOTAL_TABLET='" + total_medicines + "',RATE_PER_TABLET='" + num5 + "',COMMISSION='" + num4 + "' WHERE MEDICINE_NAME='" + table_Click1 + "' AND COMPANY_NAME='" + table_Click + "'";
                pst = con.prepareStatement(sql6);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Database Error");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AccountDetails account = new AccountDetails();
        account.show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EmployeeDetails employee = new EmployeeDetails();
        employee.show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pata_per_packKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pata_per_packKeyPressed
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String str = (String) company_name.getSelectedItem();
            String Medicine = Medicine_name.getText();
            String Purchase = ((JTextField) Purchase_date.getDateEditor().getUiComponent()).getText();
            String MFD = ((JTextField) MFD_date.getDateEditor().getUiComponent()).getText();
            String EXP = ((JTextField) Exp_date.getDateEditor().getUiComponent()).getText();
            String quantity_product = Quantity.getText();
            String rate_product = Rate.getText();
            int num = Integer.parseInt(quantity_product);
            int num1 = Integer.parseInt(rate_product);

            try {
                String sql = "insert into product(COMPANY_NAME,MEDICINE_NAME,PURCHASE_DATE,MFD_DATE,EXP_DATE,QUANTITY_PER_PACK,RATE_PER_PACK) values ('" + str + "','" + Medicine + "','" + Purchase + "','" + MFD + "','" + EXP + "','" + num + "','" + num1 + "')";
                pst = con.prepareStatement(sql);
                pst.execute();

                DefaultTableModel model = (DefaultTableModel) Product_table.getModel();
                model.addRow(new Object[]{str, Medicine, Purchase, MFD, EXP, num, num1});

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Database Error");

            }
            Medicine_name.setText("");
            ((JTextField) Purchase_date.getDateEditor().getUiComponent()).setText("");
            ((JTextField) MFD_date.getDateEditor().getUiComponent()).setText("");
            ((JTextField) Exp_date.getDateEditor().getUiComponent()).setText("");
            Quantity.setText("");
            Rate.setText("");

        }
        */
    }//GEN-LAST:event_pata_per_packKeyPressed

    private void total_medicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_medicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_medicineActionPerformed

    private void rate_per_tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rate_per_tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rate_per_tabletActionPerformed

    private void commission_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commission_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commission_fieldActionPerformed

    
    // @param args the command line arguments
     
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
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox Combo_2;
    private com.toedter.calendar.JDateChooser Date_2;
    private javax.swing.JButton Deleted;
    private javax.swing.JTextField Due;
    private javax.swing.JTable DueTable;
    private com.toedter.calendar.JDateChooser Exp_date;
    private com.toedter.calendar.JDateChooser MFD_date;
    private javax.swing.JTextField Medicine_name;
    private javax.swing.JTextField Paid;
    private javax.swing.JTable Product_table;
    private com.toedter.calendar.JDateChooser Purchase_date;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JButton Searching;
    private javax.swing.JTextField TotalDue;
    private javax.swing.JButton Update;
    private javax.swing.JButton cancle;
    private javax.swing.JTextField commission_field;
    private javax.swing.JComboBox company_name;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField number_of_pac;
    private javax.swing.JTextField pata_per_pack;
    private javax.swing.JTextField rate_per_tablet;
    private javax.swing.JTextField total_medicine;
    // End of variables declaration//GEN-END:variables
}
