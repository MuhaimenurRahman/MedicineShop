
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.print.*;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Muhaimenur
 */
public class Homepage extends javax.swing.JFrame {

    public ResultSet rs,rs1;
    public Statement st,st1;
    public Connection con,con1;
    double priceTotal = 0;
    String table_Click, table_Click1, table_Click2,table_Click3,key_char,conc;
    private PreparedStatement pst;
    private static final String NOT_SELECTABLE_OPTION = " - Select an Option - ";
    int Tablet ,total_medicines;
    public Homepage() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
      
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CustomerName = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Commission = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TotalPrices = new javax.swing.JTextField();
        Sell = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Cancle = new javax.swing.JButton();
        Text_Date = new com.toedter.calendar.JDateChooser();
        productSearch = new javax.swing.JComboBox();
        Pay = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBar = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        Contra = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jTextField1.setText("jTextField1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicine Shop.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name  :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product Name     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity               :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price                      :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Commission         :");

        CustomerName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        CustomerName.setName(""); // NOI18N
        CustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CustomerNameKeyTyped(evt);
            }
        });

        ProductName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ProductName.setName(""); // NOI18N
        ProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProductNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ProductNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProductNameKeyTyped(evt);
            }
        });

        Quantity.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        Price.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        Commission.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Product Name", "Quantity", "Date", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tables);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("TOTAL PRICE :");

        TotalPrices.setEditable(false);
        TotalPrices.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        Sell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sell.setText("SELL");
        Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellActionPerformed(evt);
            }
        });
        Sell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SellKeyPressed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reset.setText("RESET TABLE");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Date                      :");

        Cancle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancle.setText("LOG OUT");
        Cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleActionPerformed(evt);
            }
        });

        Text_Date.setDateFormatString("yyyy-MM-dd ");

        productSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productSearchMouseClicked(evt);
            }
        });
        productSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSearchActionPerformed(evt);
            }
        });

        Pay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Pay.setText("Print");
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        MenuBar.setText("File");
        MenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBarActionPerformed(evt);
            }
        });
        MenuBar.add(jSeparator1);

        jMenuItem5.setText("Shortest List");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuBar.add(jMenuItem5);
        MenuBar.add(jSeparator2);

        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        MenuBar.add(jMenuItem6);

        jMenuBar1.add(MenuBar);

        Contra.setText("Contact Us");
        Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraActionPerformed(evt);
            }
        });

        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Contra.add(About);

        jMenuBar1.add(Contra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomerName)
                            .addComponent(Commission, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(Price)
                            .addComponent(Quantity)
                            .addComponent(ProductName)
                            .addComponent(Text_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sell, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(Reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(productSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Commission, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(Text_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellActionPerformed
        try {
            String Customer = CustomerName.getText();
            String Product = productSearch.getSelectedItem().toString();
            //String Product = ProductName.getText();

            String QuantityOfProduct = Quantity.getText();
            String SellingDate = ((JTextField) Text_Date.getDateEditor().getUiComponent()).getText();

            String PriceOfProduct = Price.getText();
            String commission = Commission.getText();
            //int num = Integer.parseInt(PriceOfProduct);
            double num = Double.parseDouble(PriceOfProduct);
            int num1 = Integer.parseInt(QuantityOfProduct);
            int commition = Integer.parseInt(commission);
            double num2 = (double) (num * num1);
            double num3 = (num2 * commition) / 100;
            double num4 = num2 - num3;
            String totalPricesss = String.valueOf(num4);
            String Text1_date = ((JTextField) Text_Date.getDateEditor().getUiComponent()).getText();

            
            total_medicines = Tablet- num1; 
            //System.out.println(""+total_medicines);
            if(total_medicines > 40)
            {
            String sql1 = "insert into sell(CUSTOMER_NAME,PRODUCT_NAME,QUANTITY,SELLING_DATE,COMMISSION,PRICE) values (?,?,?,?,?,?)";

            pst = con.prepareStatement(sql1);

            pst.setString(1, CustomerName.getText());
            pst.setString(2, productSearch.getSelectedItem().toString());
            pst.setString(3, QuantityOfProduct);
            pst.setString(4, SellingDate);
            pst.setString(5, commission);
            pst.setString(6, totalPricesss);
            pst.execute();

            String sql2 = "insert into abouttosell(CUSTOMER_NAME,PRODUCT_NAME,QUANTITY,SELLING_DATE,COMMISSION,PRICE) values (?,?,?,?,?,?)";
            pst = con.prepareStatement(sql2);
            pst.setString(1, CustomerName.getText());
            pst.setString(2, productSearch.getSelectedItem().toString());
            pst.setString(3, QuantityOfProduct);
            pst.setString(4, SellingDate);
            pst.setString(5, commission);
            pst.setString(6, totalPricesss);
            pst.execute();

            DefaultTableModel model = (DefaultTableModel) tables.getModel();
            model.addRow(new Object[]{CustomerName.getText(), productSearch.getSelectedItem().toString(), Quantity.getText(), ((JTextField) Text_Date.getDateEditor().getUiComponent()).getText(), num4});

            String sql6 = "UPDATE PRODUCT SET TOTAL_TABLET='" + total_medicines + "' WHERE MEDICINE_NAME='" + Product + "' ";
            pst = con.prepareStatement(sql6);
            pst.execute();
           
            
            priceTotal = priceTotal + num4;
            //TotalPrices.setText(String.valueOf(priceTotal));
            TotalPrices.setText(String.valueOf(new DecimalFormat("##.###").format(priceTotal)));
            

            ProductName.setText("");
            Quantity.setText("");
            Price.setText("");
            Commission.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Stock Over, Please Refill Your Stock...");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Database Error");
        }
    }//GEN-LAST:event_SellActionPerformed

    private void CancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleActionPerformed
        Login login = new Login();
        login.show();;
        this.dispose();
    }//GEN-LAST:event_CancleActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {
                DefaultTableModel model = (DefaultTableModel) tables.getModel();
                model.removeRow(tables.getSelectedRow());
                double num5 = Double.parseDouble(table_Click2);
                priceTotal = priceTotal - num5;
                TotalPrices.setText(String.valueOf(priceTotal));
                
                String sql = "delete from sell Where CUSTOMER_NAME='" + table_Click + "' AND Product_Name='" + table_Click1 + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                
                int tablet_del = Integer.parseInt(table_Click3);      
                total_medicines = total_medicines + tablet_del;
                
                String sql7 = "UPDATE PRODUCT SET TOTAL_TABLET='" + total_medicines + "' WHERE MEDICINE_NAME='" + table_Click1 + "' ";
                pst = con.prepareStatement(sql7);
                pst.execute();
             
    

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void tablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesMouseClicked
        try {
            int row = tables.getSelectedRow();
            table_Click = (tables.getModel().getValueAt(row, 0).toString());
            table_Click1 = (tables.getModel().getValueAt(row, 1).toString());
            table_Click2 = (tables.getModel().getValueAt(row, 4).toString());
            table_Click3 = (tables.getModel().getValueAt(row, 2).toString());
        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tablesMouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {
                String sql = "truncate sell";
                pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel model = (DefaultTableModel) tables.getModel();
                while (model.getRowCount() > 0) {
                    for (int i = 0; i < model.getRowCount(); i++) {
                        model.removeRow(i);
                    }
                }
                CustomerName.setText("");
                priceTotal = 0;
                TotalPrices.setText("0");
                ProductName.setText("");
                Quantity.setText("");
                Price.setText("");
                Commission.setText("");
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_ResetActionPerformed

    private void CustomerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerNameKeyTyped
//        try {
//
//            String ex = CustomerName.getText();
//            // System.out.println(""+ex+"");
//            String str = "SELECT Customer_name FROM Customer WHERE Customer_name LIKE ? ";
//            pst = con.prepareStatement(str);
//            pst.setString(1, ex);
//            pst.execute();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, "Error");
//        }
    }//GEN-LAST:event_CustomerNameKeyTyped

    private void MenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBarActionPerformed

    }//GEN-LAST:event_MenuBarActionPerformed

    private void ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraActionPerformed


    }//GEN-LAST:event_ContraActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        Contract contracts = new Contract();
        contracts.show();
    }//GEN-LAST:event_AboutActionPerformed

    private void ProductNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductNameKeyPressed
        productSearch.removeAllItems();
        String str = ProductName.getText() + evt.getKeyChar();
        String str2 = str.concat("%");
        try {
            String sql = "select * from product where MEDICINE_NAME like '" + str2 + "' ";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String pat = rs.getString("MEDICINE_NAME");
                productSearch.addItem(pat.trim());
            }
           

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
         
         
    }//GEN-LAST:event_ProductNameKeyPressed

    public void KeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("yes pressed");

        }

    }


    private void ProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductNameKeyReleased

    }//GEN-LAST:event_ProductNameKeyReleased

    private void ProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductNameKeyTyped

    }//GEN-LAST:event_ProductNameKeyTyped

    private void productSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchActionPerformed

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_shop", "root", "");
            st1 = con1.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
              
        try{
           String str5 = productSearch.getSelectedItem().toString();
          // System.out.println(""+str5);
           
           String sql2 = "select * from product where MEDICINE_NAME = '" + str5 + "' ";
            rs1 = st1.executeQuery(sql2);
            while (rs1.next()) {
                String rate = rs1.getString("RATE_PER_TABLET");
                Price.setText(rate);
                String commissions = rs1.getString("COMMISSION");
                Commission.setText(commissions);
                String tab = rs1.getString("TOTAL_TABLET");
                Tablet = Integer.parseInt(tab);
                //System.out.println(""+Tablet);
            }
           
           }
           catch (Exception e) 
           {
           // JOptionPane.showMessageDialog(rootPane, "Database Error");
           }
    }//GEN-LAST:event_productSearchActionPerformed

    private void productSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productSearchMouseClicked

    }//GEN-LAST:event_productSearchMouseClicked

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        /* try{
         MessageFormat header = new MessageFormat(" MEDICINE RECEIPT ");
            
         MessageFormat  footer = new MessageFormat("page{0,number,integer} ");
            
         tables.print(JTable.PrintMode.FIT_WIDTH, header, footer);
         }
         catch(java.awt.print.PrinterException e)
         {
         JOptionPane.showMessageDialog(rootPane, "Can't Print");
         }*/

        try {
            JasperReport jasperReport = null;
            InputStream path = this.getClass().getResourceAsStream("report1.jrxml");
            JasperPrint jasperPrint = null;
            jasperReport = JasperCompileManager.compileReport(path);
            HashMap parameters = new HashMap();
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, con);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (JRException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_PayActionPerformed


    private void SellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellKeyPressed

    }//GEN-LAST:event_SellKeyPressed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       shortestList stockList = new shortestList();
       stockList.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JButton Cancle;
    private javax.swing.JTextField Commission;
    private javax.swing.JMenu Contra;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JButton Delete;
    private javax.swing.JMenu MenuBar;
    private javax.swing.JButton Pay;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Sell;
    private com.toedter.calendar.JDateChooser Text_Date;
    private javax.swing.JTextField TotalPrices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox productSearch;
    private javax.swing.JTable tables;
    // End of variables declaration//GEN-END:variables
}
