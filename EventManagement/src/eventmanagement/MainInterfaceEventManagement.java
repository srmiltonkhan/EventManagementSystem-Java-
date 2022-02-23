
package eventmanagement;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

/**
 *
 * @author MILTON KHAN
 */
public class MainInterfaceEventManagement extends javax.swing.JFrame implements KeyListener,MouseListener
{
    DatabaseConnection dc = new DatabaseConnection();
    dbConnection dcc = new dbConnection();
    public MainInterfaceEventManagement()
    {
        this.setTitle("Event Management System");
        initComponents();
        showTableData();
        showOrderTableInfo();
        showImplementationTableInfo();
        txtProgramID.addKeyListener(this);
        txtProgID.addKeyListener(this);
        txtDueFee.addMouseListener(this);
        txtPaidFee.addKeyListener(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblReceiveDate = new javax.swing.JLabel();
        txtReceiveDate = new javax.swing.JTextField();
        lblClientName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtGmail = new javax.swing.JTextField();
        txtEventAddress = new javax.swing.JTextField();
        lblReceiveEvent = new javax.swing.JLabel();
        txtAdvancePaid = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblProgramID = new javax.swing.JLabel();
        lblProgramName = new javax.swing.JLabel();
        txtProgramID = new javax.swing.JTextField();
        txtProgramName = new javax.swing.JTextField();
        lblEmployeeName = new javax.swing.JLabel();
        lblTotalFee = new javax.swing.JLabel();
        lblPaidFee = new javax.swing.JLabel();
        lblDueFee = new javax.swing.JLabel();
        lblFinishedDate = new javax.swing.JLabel();
        lblEventAddress = new javax.swing.JLabel();
        lblPaidDate = new javax.swing.JLabel();
        txtEmployeesName = new javax.swing.JTextField();
        txtTotalFee = new javax.swing.JTextField();
        txtAdvancePaidFee = new javax.swing.JTextField();
        txtPaidFee = new javax.swing.JTextField();
        txtDueFee = new javax.swing.JTextField();
        txtProgramFinishedDate = new javax.swing.JTextField();
        txtEventAddress2 = new javax.swing.JTextField();
        txtPaidDate = new javax.swing.JTextField();
        btnSaveImplementation = new javax.swing.JButton();
        btnExitImplementation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAdvancePaidFee = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHoldEvents = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrderEventInfo = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableImplementationInfo = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblProgID = new javax.swing.JLabel();
        lblProgName = new javax.swing.JLabel();
        lblCLName = new javax.swing.JLabel();
        lblMoNo = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblAdvancePaid = new javax.swing.JLabel();
        lblRecDate = new javax.swing.JLabel();
        lblEventAdd = new javax.swing.JLabel();
        txtProgID = new javax.swing.JTextField();
        txtProgName = new javax.swing.JTextField();
        txtClName = new javax.swing.JTextField();
        txtMbNo = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtEventAdd = new javax.swing.JTextField();
        txtAdvancePd = new javax.swing.JTextField();
        txtRvDate = new javax.swing.JTextField();
        lblProgName2 = new javax.swing.JLabel();
        lblEmployeeNm = new javax.swing.JLabel();
        lblTlFee = new javax.swing.JLabel();
        lblAdpaid = new javax.swing.JLabel();
        lblPdFee = new javax.swing.JLabel();
        lblDEFee = new javax.swing.JLabel();
        txtEventAddress3 = new javax.swing.JLabel();
        lblFDate = new javax.swing.JLabel();
        txtProgName2 = new javax.swing.JTextField();
        txtEmployeeName2 = new javax.swing.JTextField();
        txtTotalFee2 = new javax.swing.JTextField();
        txtAdvancePaid2 = new javax.swing.JTextField();
        txtPaidFee2 = new javax.swing.JTextField();
        txtDueFee2 = new javax.swing.JTextField();
        txtEA = new javax.swing.JTextField();
        txtProgFDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPaidDate2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnSearch.setOpaque(true);

        lblID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblID.setText("Program ID:");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblName.setText("Program Name:");

        lblReceiveDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblReceiveDate.setText("Receive Date:");

        txtReceiveDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceiveDateActionPerformed(evt);
            }
        });

        lblClientName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblClientName.setText("Client Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Mobile No:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Gmail:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Event Address:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Advance Paid:");

        lblReceiveEvent.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        lblReceiveEvent.setText("Order Receive Program");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblReceiveDate, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(lblClientName)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(lblName))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID)
                        .addComponent(txtName)
                        .addComponent(txtClientName)
                        .addComponent(txtMobileNo)
                        .addComponent(txtReceiveDate, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEventAddress)
                        .addComponent(txtAdvancePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblReceiveEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblReceiveEvent)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEventAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdvancePaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReceiveDate)
                    .addComponent(txtReceiveDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnExit))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        btnSearch.addTab("Order Receive Program", jPanel1);

        lblProgramID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProgramID.setText("Program ID:");

        lblProgramName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProgramName.setText("Program Name:");

        txtProgramID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProgramIDActionPerformed(evt);
            }
        });

        lblEmployeeName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEmployeeName.setText("Employees Name:");

        lblTotalFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTotalFee.setText("Total Fee:");

        lblPaidFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPaidFee.setText("Paid Fee:");

        lblDueFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDueFee.setText("Due Fee:");

        lblFinishedDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblFinishedDate.setText("Program Finished Date:");

        lblEventAddress.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEventAddress.setText("Event Address:");

        lblPaidDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPaidDate.setText("Paid Date:");

        txtEmployeesName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeesNameActionPerformed(evt);
            }
        });

        btnSaveImplementation.setText("Save");
        btnSaveImplementation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveImplementationActionPerformed(evt);
            }
        });

        btnExitImplementation.setText("Exit");
        btnExitImplementation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitImplementationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setText("Implementation Program");

        lblAdvancePaidFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAdvancePaidFee.setText("Advance Paid Fee:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFinishedDate)
                                    .addComponent(lblEventAddress)
                                    .addComponent(lblPaidDate)
                                    .addComponent(lblDueFee)
                                    .addComponent(lblPaidFee))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProgramFinishedDate)
                                    .addComponent(txtPaidDate)
                                    .addComponent(txtEventAddress2)
                                    .addComponent(txtDueFee, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaidFee, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblProgramName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProgramID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblEmployeeName)
                                    .addComponent(lblTotalFee)
                                    .addComponent(lblAdvancePaidFee))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txtProgramID)
                                    .addComponent(txtProgramName)
                                    .addComponent(txtEmployeesName)
                                    .addComponent(txtTotalFee)
                                    .addComponent(txtAdvancePaidFee))))
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSaveImplementation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExitImplementation, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProgramID)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtProgramID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProgramName)
                                    .addComponent(txtProgramName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeName)
                            .addComponent(txtEmployeesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalFee))
                    .addComponent(txtTotalFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdvancePaidFee)
                    .addComponent(txtAdvancePaidFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaidFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaidFee))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDueFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDueFee))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEventAddress)
                    .addComponent(txtEventAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFinishedDate)
                    .addComponent(txtProgramFinishedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaidDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaidDate))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveImplementation)
                    .addComponent(btnExitImplementation))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        btnSearch.addTab("Implementation Program", jPanel2);

        tableHoldEvents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Program ID", "Program Name", "Client Name", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableHoldEvents);
        if (tableHoldEvents.getColumnModel().getColumnCount() > 0) {
            tableHoldEvents.getColumnModel().getColumn(0).setResizable(false);
            tableHoldEvents.getColumnModel().getColumn(1).setResizable(false);
            tableHoldEvents.getColumnModel().getColumn(2).setResizable(false);
            tableHoldEvents.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnSearch.addTab("Hold Programs", jPanel3);

        tableOrderEventInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Program ID", "Program Name", "Client Name", "Mobile No", "Gmail", "Event Address", "Advance Paid", "Receive Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrderEventInfo);
        if (tableOrderEventInfo.getColumnModel().getColumnCount() > 0) {
            tableOrderEventInfo.getColumnModel().getColumn(0).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(1).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(2).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(3).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(4).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(6).setResizable(false);
            tableOrderEventInfo.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        btnSearch.addTab("Order Receive Program Table", jPanel4);

        tableImplementationInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableImplementationInfo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnSearch.addTab("Implementation Program Table", jPanel5);

        lblProgID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProgID.setText("Program ID:");

        lblProgName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProgName.setText("Program Name:");

        lblCLName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblCLName.setText("Client Name:");

        lblMoNo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMoNo.setText("MobileNo:");

        lblEmailAddress.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEmailAddress.setText("Email Address:");

        lblAdvancePaid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAdvancePaid.setText("Advance Paid:");

        lblRecDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblRecDate.setText("Receive Date:");

        lblEventAdd.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEventAdd.setText("Event Address:");

        lblProgName2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblProgName2.setText("Program Name:");

        lblEmployeeNm.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEmployeeNm.setText("Employee Name:");

        lblTlFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTlFee.setText("Total Fee:");

        lblAdpaid.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblAdpaid.setText("Advance Paid:");

        lblPdFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblPdFee.setText("Paid Fee:");

        lblDEFee.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblDEFee.setText("Due Fee:");

        txtEventAddress3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtEventAddress3.setText("Event Address:");

        lblFDate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblFDate.setText("Program Finished Date:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Receive Program Event");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Implementation Program Event");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Paid Date:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txtEmailAddress))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRecDate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCLName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProgName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblProgID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEventAdd))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtClName, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtEventAdd)
                                            .addComponent(txtProgName)
                                            .addComponent(txtProgID)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                        .addComponent(txtRvDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblAdvancePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txtAdvancePd))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblMoNo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txtMbNo))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEventAddress3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProgName2)
                                            .addComponent(lblEmployeeNm)
                                            .addComponent(lblTlFee)
                                            .addComponent(lblDEFee)))
                                    .addComponent(lblFDate)
                                    .addComponent(lblAdpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPdFee)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProgName2)
                                    .addComponent(txtEmployeeName2)
                                    .addComponent(txtTotalFee2)
                                    .addComponent(txtDueFee2)
                                    .addComponent(txtEA)
                                    .addComponent(txtProgFDate, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtAdvancePaid2)
                                    .addComponent(txtPaidFee2)
                                    .addComponent(txtPaidDate2)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAdvancePaid, lblCLName, lblEmailAddress, lblEventAdd, lblMoNo, lblProgID, lblProgName, lblRecDate});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProgName2)
                            .addComponent(txtProgName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeNm)
                            .addComponent(txtEmployeeName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTlFee)
                            .addComponent(txtTotalFee2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdpaid)
                            .addComponent(txtAdvancePaid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPdFee)
                            .addComponent(txtPaidFee2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProgID)
                            .addComponent(txtProgID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProgName)
                            .addComponent(txtProgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCLName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMbNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMoNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEventAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDEFee)
                        .addComponent(txtDueFee2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEventAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdvancePd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvancePaid)
                    .addComponent(txtEventAddress3)
                    .addComponent(txtEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecDate)
                    .addComponent(txtRvDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPaidDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProgFDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFDate))
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAdvancePaid, lblCLName, lblEmailAddress, lblEventAdd, lblMoNo, lblProgID, lblProgName, lblRecDate});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAdvancePd, txtClName, txtEmailAddress, txtEventAdd, txtMbNo, txtProgID, txtProgName, txtRvDate});

        btnSearch.addTab("Search Program ID", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitImplementationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitImplementationActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitImplementationActionPerformed

    private void btnSaveImplementationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveImplementationActionPerformed
        insertImplementationData();
    }//GEN-LAST:event_btnSaveImplementationActionPerformed

    private void txtEmployeesNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeesNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeesNameActionPerformed

    private void txtProgramIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProgramIDActionPerformed

    }//GEN-LAST:event_txtProgramIDActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        insertOrderReceiveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtReceiveDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceiveDateActionPerformed

    }//GEN-LAST:event_txtReceiveDateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DeleteData();
        refreshSearchTextFields();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateData();
        refreshSearchTextFields();
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    //******** Refresh All TextField***********************//
    
    public void refreshTextFileds()
    {
        txtID.setText(null);
        txtName.setText(null);
        txtClientName.setText(null);
        txtMobileNo.setText(null);
        txtGmail.setText(null);
        txtEventAddress.setText(null);
        txtAdvancePaid.setText(null);
        txtReceiveDate.setText(null);
        
    }
    public void refreshImplementationTextFields()
    {
        txtProgramID.setText(null);
        txtProgramName.setText(null);
        txtEmployeesName.setText(null);
        txtTotalFee.setText(null);
        txtAdvancePaidFee.setText(null);
        txtPaidFee.setText(null);
        txtDueFee.setText(null);
        txtEventAddress2.setText(null);
        txtProgramFinishedDate.setText(null);
        txtPaidDate.setText(null);
        
    }
    
    public void refreshSearchTextFields()
    {
        txtProgName.setText(null);
        txtClName.setText(null);
        txtMbNo.setText(null);
        txtEmailAddress.setText(null);
        txtEventAdd.setText(null);
        txtAdvancePd.setText(null);
        txtRvDate.setText(null);
        txtProgName2.setText(null);
        txtEmployeeName2.setText(null);
        txtTotalFee2.setText(null);
        txtAdvancePaid2.setText(null);
        txtPaidFee2.setText(null);
        txtDueFee2.setText(null);
        txtEA.setText(null);
        txtPaidDate2.setText(null);
        txtProgFDate.setText(null);
        
        
    }
    public void implementationGetDataRefresh()
    {
        txtProgramName.setText(null);
        txtAdvancePaidFee.setText(null);
        txtEventAddress2.setText(null);
    }
    
    public void insertOrderReceiveData()
    {
        try
        {
            dc.statement.executeUpdate("INSERT INTO `orderreceiveevent`(`OrderID`, `OrderName`, `ClientName`, `MobileNo`, `Gmail`, `EventAddress`, `AdvancePaid`, `ReceiveDate`) VALUES ('"+txtID.getText()+"','"+txtName.getText()+"','"+txtClientName.getText()+"','"+txtMobileNo.getText()+"','"+txtGmail.getText()+"','"+txtEventAddress.getText()+"','"+txtAdvancePaid.getText()+"','"+txtReceiveDate.getText()+"')");
            dc.statement.executeUpdate("INSERT INTO `holdevents`(`OrderID`, `OrderName`, `ClientName`, `MobileNo`) VALUES ('"+txtID.getText()+"','"+txtName.getText()+"','"+txtClientName.getText()+"','"+txtMobileNo.getText()+"')");
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
            refreshTextFileds();
        }
        catch(HeadlessException | SQLException ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
        showTableData();
        showOrderTableInfo();
    }
    //*** InsertImplementationData*****///
    public void insertImplementationData()
    {
        try
        {
            dc.statement.executeUpdate("INSERT INTO `implementationevent`(`ProgramID`, `ProgramName`, `EmployeesName`, `TotalFee`,`AdvancePaid`, `PaidFee`, `DueFee`, `EventAddress`, `ProgramFinishedDate`, `PaidDate`) VALUES ('"+txtProgramID.getText()+"','"+txtProgramName.getText()+"','"+txtEmployeesName.getText()+"','"+txtTotalFee.getText()+"','"+txtAdvancePaidFee.getText()+"','"+txtPaidFee.getText()+"','"+txtDueFee.getText()+"','"+txtEventAddress2.getText()+"','"+txtProgramFinishedDate.getText()+"','"+txtPaidDate.getText()+"')");
            dc.statement.executeUpdate("DELETE FROM `holdevents` WHERE `OrderID` = '"+txtProgramID.getText()+"'");
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
            refreshImplementationTextFields();
        }
        catch(HeadlessException | SQLException ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
        showImplementationTableInfo();
        showTableData();
    }
 
    
    //** showTableData in HoldEvent Tab*****
    public void showTableData()
    {
        try
        {
            String sql = "SELECT * FROM `holdevents`";
            dc.resultSet = dc.statement.executeQuery(sql);
            tableHoldEvents.setModel(DbUtils.resultSetToTableModel(dc.resultSet));
           
           
        }
        catch(SQLException ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
    }
    
   public void showOrderTableInfo()
    {
        try
        {
            String sql = "SELECT * FROM `orderreceiveevent`";
            dc.resultSet = dc.statement.executeQuery(sql);
            tableOrderEventInfo.setModel(DbUtils.resultSetToTableModel(dc.resultSet));
           
           
        }
        catch(SQLException ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
    } 
   
   public void showImplementationTableInfo()
    {
        try
        {
            String sql = "SELECT * FROM `implementationevent`";
            dc.resultSet = dc.statement.executeQuery(sql);
            tableImplementationInfo.setModel(DbUtils.resultSetToTableModel(dc.resultSet));
           
           
        }
        catch(SQLException ae)
        {
            JOptionPane.showMessageDialog(null,ae);
        }
    } 
   //*****************Delete Data********************************************************
   public void DeleteData()
   {
       try
       {
           dcc.stat.executeUpdate("DELETE FROM `orderreceiveevent` WHERE `OrderID` = '"+txtProgID.getText()+"'");
           dcc.stat.executeUpdate("DELETE FROM `implementationevent` WHERE `ProgramID` = '"+txtProgID.getText()+"'");
           dcc.stat.executeUpdate("DELETE FROM `holdevents` WHERE `OrderID` = '"+txtProgID.getText()+"'");
           JOptionPane.showMessageDialog(null,"Data Delete Successfully");
       }
       catch(Exception ae)
       {
         JOptionPane.showMessageDialog(null,ae);  
       }
       showImplementationTableInfo();
       showTableData();
       showOrderTableInfo();
   }
   
   public void updateData()
   {
       try
       {
           dcc.stat.executeUpdate("UPDATE `holdevents` SET `OrderName`= '"+txtProgName.getText()+"',`ClientName`= '"+txtClName.getText()+"',`MobileNo`= '"+txtMbNo.getText()+"' WHERE `OrderID` = '"+txtProgID.getText()+"'");
           dcc.stat.executeUpdate("UPDATE `orderreceiveevent` SET `OrderName`='"+txtProgName.getText()+"',`ClientName`='"+txtClName.getText()+"',`MobileNo`= '"+txtMbNo.getText()+"',`Gmail`= '"+txtEmailAddress.getText()+"',`EventAddress`= '"+txtEventAdd.getText()+"',`AdvancePaid`= '"+txtAdvancePd.getText()+"',`ReceiveDate`= '"+txtRvDate.getText()+"' WHERE `OrderID` = '"+txtProgID.getText()+"'");
           dcc.stat.executeUpdate("UPDATE `implementationevent` SET `ProgramName`= '"+txtProgName2.getText()+"',`EmployeesName`='"+txtEmployeeName2.getText()+"',`TotalFee`='"+txtTotalFee2.getText()+"',`AdvancePaid`= '"+txtAdvancePaid2.getText()+"',`PaidFee`='"+txtPaidFee2.getText()+"',`DueFee`= '"+txtDueFee2.getText()+"',`EventAddress`='"+txtEA.getText()+"',`ProgramFinishedDate`= '"+txtProgFDate.getText()+"' WHERE `ProgramID` = '"+txtProgID.getText()+"'");
           JOptionPane.showMessageDialog(null,"Data Updated Successfully");
       }
       catch(Exception ae)
       {
          JOptionPane.showMessageDialog(null,ae);   
       }
       showImplementationTableInfo();
       showTableData();
       showOrderTableInfo();
   }
  //*********************end of keylistener**************
   public void getDataTextField()
    {
       try
       {
           String sql = ("SELECT `OrderName`, `ClientName`, `MobileNo`, `Gmail`, `EventAddress`, `AdvancePaid`, `ReceiveDate` FROM `orderreceiveevent` WHERE `OrderID` = '"+txtProgramID.getText()+"'");
           dcc.rs = dcc.stat.executeQuery(sql);
           while(dcc.rs.next())
           {
               txtProgramName.setText(dcc.rs.getString("OrderName")); 
               txtAdvancePaidFee.setText(dcc.rs.getString("AdvancePaid"));
               txtEventAddress2.setText(dcc.rs.getString("EventAddress"));

           }
       }
       catch(SQLException ae)
       {
           JOptionPane.showMessageDialog(null,ae);
       }
    }
   
   //******************************************************************************
    public void getTextFieldInSearchID()
    {
       try
       {
           String sql = ("SELECT `OrderName`, `ClientName`, `MobileNo`, `Gmail`, `EventAddress`, `AdvancePaid`, `ReceiveDate` FROM `orderreceiveevent` WHERE `OrderID` = '"+txtProgID.getText()+"'");
           dcc.rs = dcc.stat.executeQuery(sql);
           while(dcc.rs.next())
           {
               txtProgName.setText(dcc.rs.getString("OrderName")); 
               txtClName.setText(dcc.rs.getString("ClientName"));
               txtMbNo.setText(dcc.rs.getString("MobileNo"));
               txtEmailAddress.setText(dcc.rs.getString("Gmail"));
               txtEventAdd.setText(dcc.rs.getString("EventAddress"));
               txtAdvancePd.setText(dcc.rs.getString("AdvancePaid"));
               txtAdvancePaid2.setText(dcc.rs.getString("AdvancePaid"));
               txtRvDate.setText(dcc.rs.getString("ReceiveDate"));

           }
       }
       catch(SQLException ae)
       {
           JOptionPane.showMessageDialog(null,ae);
       }
    }
    
    //*********************************************************************
    
     public void getDateInImplementationTextField()
    {
       try
       {
           String sql = ("SELECT  `ProgramName`, `EmployeesName`, `TotalFee`, `PaidFee`, `DueFee`, `EventAddress`, `ProgramFinishedDate`, `PaidDate` FROM `implementationevent` WHERE `ProgramID`= '"+txtProgID.getText()+"'");
           dcc.rs = dcc.stat.executeQuery(sql);
           while(dcc.rs.next())
           {
               txtProgName2.setText(dcc.rs.getString("ProgramName")); 
               txtEmployeeName2.setText(dcc.rs.getString("EmployeesName"));
               txtTotalFee2.setText(dcc.rs.getString("TotalFee"));
               txtPaidFee2.setText(dcc.rs.getString("PaidFee"));
               txtDueFee2.setText(dcc.rs.getString("DueFee"));
               txtEA.setText(dcc.rs.getString("EventAddress"));
               txtPaidDate2.setText(dcc.rs.getString("PaidDate"));
               txtProgFDate.setText(dcc.rs.getString("ProgramFinishedDate"));
               

           }
       }
       catch(SQLException ae)
       {
           JOptionPane.showMessageDialog(null,ae);
       }
    }
     
     public void Totaldue()
     {
         String totalFee = txtTotalFee.getText();
         int storageTotalFee = Integer.parseInt(totalFee);
         
         String txtAdvanceFee = txtAdvancePaidFee.getText();
         int storageTxtAdvanceFee = Integer.parseInt(txtAdvanceFee);
         
        String txtPaidFeeTest = txtPaidFee.getText();
        int storagetxtPaidFee = Integer.parseInt(txtPaidFeeTest);
        
        int totalPaid = storageTxtAdvanceFee + storagetxtPaidFee;
        
        int totalDueResult = storageTotalFee - totalPaid;
        txtDueFee.setText(String.valueOf(totalDueResult));
     }
   
   //******************************************************************
     
     public void mouseExited(MouseEvent me)
    {

    }
    public void mouseEntered(MouseEvent me)
    {

    }
    public void mouseReleased(MouseEvent me)
    {

    }
    public void mousePressed(MouseEvent me)
    {

    }
    public void mouseClicked(MouseEvent me)
    {
         Totaldue();   
    }
     
   //******************************************************************
        public void keyPressed(KeyEvent ke)
        {

        }
        public void keyReleased(KeyEvent ke)
        {
             refreshSearchTextFields();
             implementationGetDataRefresh();
             getDataTextField(); 
             getTextFieldInSearchID();
             getDateInImplementationTextField();
             Totaldue();
             
             
        }
        public void keyTyped(KeyEvent ke)
        {

        }
   
   //***************************************************************** 
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfaceEventManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExitImplementation;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveImplementation;
    private javax.swing.JTabbedPane btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAdpaid;
    private javax.swing.JLabel lblAdvancePaid;
    private javax.swing.JLabel lblAdvancePaidFee;
    private javax.swing.JLabel lblCLName;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblDEFee;
    private javax.swing.JLabel lblDueFee;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblEmployeeNm;
    private javax.swing.JLabel lblEventAdd;
    private javax.swing.JLabel lblEventAddress;
    private javax.swing.JLabel lblFDate;
    private javax.swing.JLabel lblFinishedDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMoNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPaidDate;
    private javax.swing.JLabel lblPaidFee;
    private javax.swing.JLabel lblPdFee;
    private javax.swing.JLabel lblProgID;
    private javax.swing.JLabel lblProgName;
    private javax.swing.JLabel lblProgName2;
    private javax.swing.JLabel lblProgramID;
    private javax.swing.JLabel lblProgramName;
    private javax.swing.JLabel lblRecDate;
    private javax.swing.JLabel lblReceiveDate;
    private javax.swing.JLabel lblReceiveEvent;
    private javax.swing.JLabel lblTlFee;
    private javax.swing.JLabel lblTotalFee;
    private javax.swing.JTable tableHoldEvents;
    private javax.swing.JTable tableImplementationInfo;
    private javax.swing.JTable tableOrderEventInfo;
    private javax.swing.JTextField txtAdvancePaid;
    private javax.swing.JTextField txtAdvancePaid2;
    private javax.swing.JTextField txtAdvancePaidFee;
    private javax.swing.JTextField txtAdvancePd;
    private javax.swing.JTextField txtClName;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDueFee;
    private javax.swing.JTextField txtDueFee2;
    private javax.swing.JTextField txtEA;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeName2;
    private javax.swing.JTextField txtEmployeesName;
    private javax.swing.JTextField txtEventAdd;
    private javax.swing.JTextField txtEventAddress;
    private javax.swing.JTextField txtEventAddress2;
    private javax.swing.JLabel txtEventAddress3;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMbNo;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPaidDate;
    private javax.swing.JTextField txtPaidDate2;
    private javax.swing.JTextField txtPaidFee;
    private javax.swing.JTextField txtPaidFee2;
    private javax.swing.JTextField txtProgFDate;
    private javax.swing.JTextField txtProgID;
    private javax.swing.JTextField txtProgName;
    private javax.swing.JTextField txtProgName2;
    private javax.swing.JTextField txtProgramFinishedDate;
    private javax.swing.JTextField txtProgramID;
    private javax.swing.JTextField txtProgramName;
    private javax.swing.JTextField txtReceiveDate;
    private javax.swing.JTextField txtRvDate;
    private javax.swing.JTextField txtTotalFee;
    private javax.swing.JTextField txtTotalFee2;
    // End of variables declaration//GEN-END:variables

    
}
