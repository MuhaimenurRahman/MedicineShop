
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class EmployeeDetails extends javax.swing.JFrame {

    public ResultSet rs;
    public Statement st;
    public Connection con;
    int len;
    FileInputStream fin;
    private String sql;
    private PreparedStatement pst;
    String table_Click, table_Click1, table_Click2, table_Click3, table_Click4, table_Click5, table_Click6, table_Click7, table_Click8, table_Click9;

    public EmployeeDetails() {
        initComponents();
        this.setResizable(false);
        Connection();
        setLocationRelativeTo(null);
        EmployeeTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        EmployeeTable.getColumnModel().getColumn(8).setPreferredWidth(150);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NameOfEmp = new javax.swing.JTextField();
        Designation = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Home = new javax.swing.JTextField();
        IdNo = new javax.swing.JTextField();
        PhoneNo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JoinDate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cancle = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Employee_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("          Enter Employee Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name Of Employee    :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Designation                :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address                      :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Home Distict              :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("National Id No.         :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Phone No.                 :");

        NameOfEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameOfEmpActionPerformed(evt);
            }
        });

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Joining Date              :");

        JoinDate.setDateFormatString("yyyy-MM-dd");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Salary                        :");

        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });
        Salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalaryKeyPressed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Search.setText("SEARCH");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Cancle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancle.setText("BACK");
        Cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Employee ID               :");

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE_ID", "EMPLOYEE_NAME", "DESIGNATION", "ADDRESS", "HOME_DISTRICT", "NATIONAL_ID_NO", "PHONE_NO", "JOINING_DATE", "SALARY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Employee_id))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NameOfEmp)
                                            .addComponent(Designation)
                                            .addComponent(Address)
                                            .addComponent(Home)
                                            .addComponent(IdNo)
                                            .addComponent(PhoneNo)
                                            .addComponent(JoinDate, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 266, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Employee_id, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameOfEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JoinDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            String sql1 = "insert into employeeDetails(Employee_id,Employee_name,Designation,Address,Home_District,National_id_no,Phone_no,Joining_date,salary) values (?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql1);
            pst.setString(1, Employee_id.getText());
            pst.setString(2, NameOfEmp.getText());
            pst.setString(3, Designation.getText());
            pst.setString(4, Address.getText());
            pst.setString(5, Home.getText());
            pst.setString(6, IdNo.getText());
            pst.setString(7, PhoneNo.getText());
            pst.setString(8, ((JTextField) JoinDate.getDateEditor().getUiComponent()).getText());
            pst.setString(9, Salary.getText());
            pst.execute();
            DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
            model.addRow(new Object[]{Employee_id.getText(), NameOfEmp.getText(), Designation.getText(), Address.getText(), Home.getText(), IdNo.getText(), PhoneNo.getText(), ((JTextField) JoinDate.getDateEditor().getUiComponent()).getText(), Salary.getText()});

            Employee_id.setText("");
            NameOfEmp.setText("");
            Designation.setText("");
            Address.setText("");
            Home.setText("");
            IdNo.setText("");
            PhoneNo.setText("");
            ((JTextField) JoinDate.getDateEditor().getUiComponent()).setText("");
            Salary.setText("");
            JOptionPane.showMessageDialog(rootPane, "Saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "DataBase Error");
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void NameOfEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameOfEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameOfEmpActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {

            String Searching = "Select * from employeeDetails where Employee_id=?";
            pst = con.prepareStatement(Searching);
            pst.setString(1, Employee_id.getText());
            rs = pst.executeQuery();
            EmployeeTable.setModel(DbUtils.resultSetToTableModel(rs));
            EmployeeTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(3).setPreferredWidth(400);
            EmployeeTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(7).setPreferredWidth(150);
            EmployeeTable.getColumnModel().getColumn(8).setPreferredWidth(150);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error in Search");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Do you really want to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {

                String sql = "delete from employeeDetails Where Employee_id='" + table_Click + "' AND Employee_name='" + table_Click1 + "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
                model.removeRow(EmployeeTable.getSelectedRow());

                Employee_id.setText("");
                NameOfEmp.setText("");
                Designation.setText("");
                Address.setText("");
                Home.setText("");
                IdNo.setText("");
                PhoneNo.setText("");
                ((JTextField) JoinDate.getDateEditor().getUiComponent()).setText("");
                Salary.setText("");

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void CancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancleActionPerformed
        ProductDetails pd = new ProductDetails();
        pd.show();
        this.dispose();
    }//GEN-LAST:event_CancleActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        int emp_id = Integer.parseInt(Employee_id.getText());
        String name = NameOfEmp.getText();
        String Deg = Designation.getText();
        String addre = Address.getText();
        String home_Dis = Home.getText();
        String national_id = IdNo.getText();
        String phone = PhoneNo.getText();
        String joinDate = ((JTextField) JoinDate.getDateEditor().getUiComponent()).getText();
        int salary = Integer.parseInt(Salary.getText());

        int q = JOptionPane.showConfirmDialog(null, "Do you really want to update", "Update", JOptionPane.YES_NO_OPTION);
        if (q == 0) {
            try {
                String sq15 = "UPDATE EmployeeDetails SET Employee_id='" + emp_id + "'  ,Employee_name='" + name + "'  ,Designation='" + Deg + "'  ,Address='" + addre + "'  ,Home_District='" + home_Dis + "'  ,National_ID_No='" + national_id + "'  ,Phone_no='" + phone + "',Joining_date= '" + joinDate + "', Salary='" + salary + "' WHERE Employee_id='" + table_Click + "'";
                pst = con.prepareStatement(sq15);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Database Error");
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        try {
            int row = EmployeeTable.getSelectedRow();
            table_Click = (EmployeeTable.getModel().getValueAt(row, 0).toString());
            table_Click1 = (EmployeeTable.getModel().getValueAt(row, 1).toString());
            table_Click2 = (EmployeeTable.getModel().getValueAt(row, 2).toString());
            table_Click3 = (EmployeeTable.getModel().getValueAt(row, 3).toString());
            table_Click4 = (EmployeeTable.getModel().getValueAt(row, 4).toString());
            table_Click5 = (EmployeeTable.getModel().getValueAt(row, 5).toString());
            table_Click6 = (EmployeeTable.getModel().getValueAt(row, 6).toString());
            table_Click7 = (EmployeeTable.getModel().getValueAt(row, 7).toString());
            table_Click8 = (EmployeeTable.getModel().getValueAt(row, 8).toString());

            Employee_id.setText(table_Click);
            NameOfEmp.setText(table_Click1);
            Designation.setText(table_Click2);
            Address.setText(table_Click3);
            Home.setText(table_Click4);
            IdNo.setText(table_Click5);
            PhoneNo.setText(table_Click6);
            ((JTextField) JoinDate.getDateEditor().getUiComponent()).setText(table_Click7);
            Salary.setText(table_Click8);

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void SalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String sql1 = "insert into employeeDetails(Employee_id,Employee_name,Designation,Address,Home_District,National_id_no,Phone_no,Joining_date,salary) values (?,?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql1);
                pst.setString(1, Employee_id.getText());
                pst.setString(2, NameOfEmp.getText());
                pst.setString(3, Designation.getText());
                pst.setString(4, Address.getText());
                pst.setString(5, Home.getText());
                pst.setString(6, IdNo.getText());
                pst.setString(7, PhoneNo.getText());
                pst.setString(8, ((JTextField) JoinDate.getDateEditor().getUiComponent()).getText());
                pst.setString(9, Salary.getText());
                pst.execute();
                DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
                model.addRow(new Object[]{Employee_id.getText(), NameOfEmp.getText(), Designation.getText(), Address.getText(), Home.getText(), IdNo.getText(), PhoneNo.getText(), ((JTextField) JoinDate.getDateEditor().getUiComponent()).getText(), Salary.getText()});

                Employee_id.setText("");
                NameOfEmp.setText("");
                Designation.setText("");
                Address.setText("");
                Home.setText("");
                IdNo.setText("");
                PhoneNo.setText("");
                ((JTextField) JoinDate.getDateEditor().getUiComponent()).setText("");
                Salary.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "DataBase Error");
            }
        }
    }//GEN-LAST:event_SalaryKeyPressed

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Cancle;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Designation;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JTextField Employee_id;
    private javax.swing.JTextField Home;
    private javax.swing.JTextField IdNo;
    private com.toedter.calendar.JDateChooser JoinDate;
    private javax.swing.JTextField NameOfEmp;
    private javax.swing.JTextField PhoneNo;
    private javax.swing.JTextField Salary;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
