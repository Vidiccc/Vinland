package view;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Branch;
import model.Customer;
import model.RealEstate;
import model.Transaction;
import service.BranchService;
import service.CustomerService;
import service.RealEstateService;
import service.TransactionService;

public class MainFrame extends javax.swing.JFrame {
    BranchService brService;
    CustomerService cusService;
    RealEstateService realService;
    TransactionService tranService;
    
    DefaultTableModel defaultTableModel1, defaultTableModel2, defaultTableModel3, defaultTableModel4;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        brService = new BranchService();
        cusService = new CustomerService();
        realService = new RealEstateService();
        tranService = new TransactionService();
        
        
        //branchTable
        defaultTableModel1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        branchTable.setModel(defaultTableModel1);
        
        defaultTableModel1.addColumn("ID");
        defaultTableModel1.addColumn("Manager");
        defaultTableModel1.addColumn("Phone");
        defaultTableModel1.addColumn("Address");
        
        showBranchData(brService.selectAll());
        
        
        //customerTable
        defaultTableModel2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        customerTable.setModel(defaultTableModel2);
        
        defaultTableModel2.addColumn("ID");
        defaultTableModel2.addColumn("Name");
        defaultTableModel2.addColumn("Invested");
        defaultTableModel2.addColumn("Property");
        defaultTableModel2.addColumn("Phone");
        
        showCustomerData(cusService.selectAll());
        
        
        //realEstateTable
        defaultTableModel3 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        realEstateTable.setModel(defaultTableModel3);
        
        defaultTableModel3.addColumn("ID");
        defaultTableModel3.addColumn("Price");
        defaultTableModel3.addColumn("Area");
        defaultTableModel3.addColumn("Status");
        defaultTableModel3.addColumn("Owner");
        defaultTableModel3.addColumn("Promotion");
        defaultTableModel3.addColumn("Managed by Branch");
        
        showRealEstateData(realService.selectAll());
        
        
        //transactionTable
        defaultTableModel4 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        transactionTable.setModel(defaultTableModel4);
        
        defaultTableModel4.addColumn("ID");
        defaultTableModel4.addColumn("Amount");
        defaultTableModel4.addColumn("Date");
        defaultTableModel4.addColumn("Customer ID");
        defaultTableModel4.addColumn("Real Estate ID");
        
        showTransactionData(tranService.selectAll());
    }
    
    private void showBranchData(ArrayList<Branch> branches) {
        for(Branch br : branches) {
            defaultTableModel1.addRow(new Object[]{br.getBid(), br.getManager(), br.getPhone(), br.getAddress()});
        }
    }
    
    private void showCustomerData(ArrayList<Customer> customers) {
        for(Customer cus : customers) {
            defaultTableModel2.addRow(new Object[]{cus.getCid(), cus.getName(),
                                            cus.getInvested(), cus.getProperty(), cus.getPhone()});
        }
    }
    
    private void showRealEstateData(ArrayList<RealEstate> reals) {
        for(RealEstate real : reals) {
            defaultTableModel3.addRow(new Object[]{real.getRid(), real.getPrice(),
                                            real.getArea(), real.getStatus(), real.getOwner(),
                                            real.getPromotion(), real.getBid()});
        }
    }
        
    private void showTransactionData(ArrayList<Transaction> trans) {
        for(Transaction tran : trans) {
            defaultTableModel4.addRow(new Object[]{tran.getTid(), tran.getAmount(),
                                            tran.getDate(), tran.getCid(), tran.getRid()});
        }
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vinlandLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        branchPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        branchAddButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchTable = new javax.swing.JTable();
        branchRefreshButton = new javax.swing.JButton();
        branchDeleteButton = new javax.swing.JButton();
        branchUpdateButton = new javax.swing.JButton();
        realEstatePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        realEstateAddButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        realEstateTable = new javax.swing.JTable();
        realEstateRefreshButton = new javax.swing.JButton();
        realEstateDeleteButton = new javax.swing.JButton();
        realEstateUpdateButton = new javax.swing.JButton();
        customerPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        customerAddButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerRefreshButton = new javax.swing.JButton();
        customerDeleteButton = new javax.swing.JButton();
        customerUpdateButton = new javax.swing.JButton();
        transactionPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        transactionAddButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        transactionRefreshButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        calculatorMenuItem = new javax.swing.JMenuItem();
        formattedCalculatorMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vinland");
        setPreferredSize(new java.awt.Dimension(850, 410));

        vinlandLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vinlandLabel.setForeground(new java.awt.Color(0, 102, 153));
        vinlandLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vinlandLabel.setText("Vinland Real Estate Management System");

        branchAddButton.setText("Add");
        branchAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchAddButtonActionPerformed(evt);
            }
        });

        branchTable.setModel(new javax.swing.table.DefaultTableModel(
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
        branchTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        branchTable.setPreferredSize(new java.awt.Dimension(800, 200));
        branchTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(branchTable);

        branchRefreshButton.setText("Refresh");
        branchRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchRefreshButtonActionPerformed(evt);
            }
        });

        branchDeleteButton.setText("Delete");
        branchDeleteButton.setToolTipText("");
        branchDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchDeleteButtonActionPerformed(evt);
            }
        });

        branchUpdateButton.setText("Update");
        branchUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(branchAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branchUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(branchDeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(branchRefreshButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchAddButton)
                    .addComponent(branchRefreshButton)
                    .addComponent(branchDeleteButton)
                    .addComponent(branchUpdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout branchPanelLayout = new javax.swing.GroupLayout(branchPanel);
        branchPanel.setLayout(branchPanelLayout);
        branchPanelLayout.setHorizontalGroup(
            branchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(branchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        branchPanelLayout.setVerticalGroup(
            branchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(branchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Branch", branchPanel);

        realEstateAddButton.setText("Add");
        realEstateAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realEstateAddButtonActionPerformed(evt);
            }
        });

        realEstateTable.setModel(new javax.swing.table.DefaultTableModel(
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
        realEstateTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        realEstateTable.setPreferredSize(new java.awt.Dimension(800, 200));
        realEstateTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(realEstateTable);

        realEstateRefreshButton.setText("Refresh");
        realEstateRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realEstateRefreshButtonActionPerformed(evt);
            }
        });

        realEstateDeleteButton.setText("Delete");
        realEstateDeleteButton.setToolTipText("");
        realEstateDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realEstateDeleteButtonActionPerformed(evt);
            }
        });

        realEstateUpdateButton.setText("Update");
        realEstateUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realEstateUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(realEstateAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(realEstateUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(realEstateDeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(realEstateRefreshButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realEstateAddButton)
                    .addComponent(realEstateRefreshButton)
                    .addComponent(realEstateDeleteButton)
                    .addComponent(realEstateUpdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout realEstatePanelLayout = new javax.swing.GroupLayout(realEstatePanel);
        realEstatePanel.setLayout(realEstatePanelLayout);
        realEstatePanelLayout.setHorizontalGroup(
            realEstatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realEstatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        realEstatePanelLayout.setVerticalGroup(
            realEstatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realEstatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Real Estate", realEstatePanel);

        customerAddButton.setText("Add");
        customerAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerAddButtonActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customerTable.setPreferredSize(new java.awt.Dimension(800, 200));
        customerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(customerTable);

        customerRefreshButton.setText("Refresh");
        customerRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRefreshButtonActionPerformed(evt);
            }
        });

        customerDeleteButton.setText("Delete");
        customerDeleteButton.setToolTipText("");
        customerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDeleteButtonActionPerformed(evt);
            }
        });

        customerUpdateButton.setText("Update");
        customerUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(customerAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerUpdateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerDeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerRefreshButton)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerAddButton)
                    .addComponent(customerRefreshButton)
                    .addComponent(customerDeleteButton)
                    .addComponent(customerUpdateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customer", customerPanel);

        transactionAddButton.setText("Add");
        transactionAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionAddButtonActionPerformed(evt);
            }
        });

        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
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
        transactionTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        transactionTable.setPreferredSize(new java.awt.Dimension(800, 200));
        transactionTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transactionTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(transactionTable);

        transactionRefreshButton.setText("Refresh");
        transactionRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(transactionAddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(transactionRefreshButton)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionAddButton)
                    .addComponent(transactionRefreshButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout transactionPanelLayout = new javax.swing.GroupLayout(transactionPanel);
        transactionPanel.setLayout(transactionPanelLayout);
        transactionPanelLayout.setHorizontalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        transactionPanelLayout.setVerticalGroup(
            transactionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transactionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transaction", transactionPanel);

        jMenu1.setText("System");

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Calculator");

        calculatorMenuItem.setText("Calculator");
        calculatorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(calculatorMenuItem);

        formattedCalculatorMenuItem.setText("Formatted calculator");
        formattedCalculatorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedCalculatorMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(formattedCalculatorMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(vinlandLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(vinlandLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void branchRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchRefreshButtonActionPerformed
        defaultTableModel1.setRowCount(0);
        showBranchData(brService.selectAll());
    }//GEN-LAST:event_branchRefreshButtonActionPerformed

    private void branchAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchAddButtonActionPerformed
        new AddBranchFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_branchAddButtonActionPerformed

    private void branchDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchDeleteButtonActionPerformed
        int row = branchTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to delete!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            int confirm = JOptionPane.showConfirmDialog(MainFrame.this,
                            "Are you sure you want to delete this file?");
            
            if (confirm == JOptionPane.YES_OPTION) {
                int bid = Integer.valueOf(String.valueOf(branchTable.getValueAt(row, 0)));
                Branch br = new Branch();
                br.setBid(bid);
                
                brService.delete(br);
                
                defaultTableModel1.setRowCount(0);
                showBranchData(brService.selectAll());
            }
        }
    }//GEN-LAST:event_branchDeleteButtonActionPerformed

    private void branchUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchUpdateButtonActionPerformed
        int row = branchTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to update!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
                int bid = Integer.valueOf(String.valueOf(branchTable.getValueAt(row, 0)));
                Branch br = new Branch();
                br.setBid(bid); 
                
                new UpdateBranchFrame(br.getBid()).setVisible(true);
                this.dispose();
                defaultTableModel1.setRowCount(0);
                showBranchData(brService.selectAll());
        }
    }//GEN-LAST:event_branchUpdateButtonActionPerformed

    private void realEstateAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realEstateAddButtonActionPerformed
        new AddRealEstateFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_realEstateAddButtonActionPerformed

    private void realEstateRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realEstateRefreshButtonActionPerformed
        defaultTableModel3.setRowCount(0);
        showRealEstateData(realService.selectAll());
    }//GEN-LAST:event_realEstateRefreshButtonActionPerformed

    private void realEstateDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realEstateDeleteButtonActionPerformed
        int row = realEstateTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to delete!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            int confirm = JOptionPane.showConfirmDialog(MainFrame.this,
                            "Are you sure you want to delete this file?");
            
            if (confirm == JOptionPane.YES_OPTION) {
                int rid = Integer.valueOf(String.valueOf(realEstateTable.getValueAt(row, 0)));
                RealEstate real = new RealEstate();
                real.setRid(rid);
                
                realService.delete(real);
                
                defaultTableModel3.setRowCount(0);
                showRealEstateData(realService.selectAll());
            }
        }
    }//GEN-LAST:event_realEstateDeleteButtonActionPerformed

    private void realEstateUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realEstateUpdateButtonActionPerformed
        int row = realEstateTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to update!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
                int rid = Integer.valueOf(String.valueOf(realEstateTable.getValueAt(row, 0)));
                RealEstate real = new RealEstate();
                real.setRid(rid); 
                System.out.println(rid);
                        
                new UpdateRealEstateFrame(real.getRid()).setVisible(true);
                this.dispose();
                defaultTableModel3.setRowCount(0);
                showRealEstateData(realService.selectAll());
        }
    }//GEN-LAST:event_realEstateUpdateButtonActionPerformed

    private void customerAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerAddButtonActionPerformed
        new AddCustomerFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerAddButtonActionPerformed

    private void customerRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRefreshButtonActionPerformed
        defaultTableModel2.setRowCount(0);
        showCustomerData(cusService.selectAll());
    }//GEN-LAST:event_customerRefreshButtonActionPerformed

    private void customerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDeleteButtonActionPerformed
        int row = customerTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to delete!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            int confirm = JOptionPane.showConfirmDialog(MainFrame.this,
                            "Are you sure you want to delete this file?");
            
            if (confirm == JOptionPane.YES_OPTION) {
                int cid = Integer.valueOf(String.valueOf(customerTable.getValueAt(row, 0)));
                Customer cus = new Customer();
                cus.setCid(cid);
                
                cusService.delete(cus);
                
                defaultTableModel2.setRowCount(0);
                showCustomerData(cusService.selectAll());
            }
        }
    }//GEN-LAST:event_customerDeleteButtonActionPerformed

    private void customerUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateButtonActionPerformed
        int row = customerTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(MainFrame.this, "Please choose a row to update!",
                            "Error", JOptionPane.ERROR_MESSAGE);
        }else {
                int cid = Integer.valueOf(String.valueOf(customerTable.getValueAt(row, 0)));
                Customer cus = new Customer();
                cus.setCid(cid); 
                
                new UpdateCustomerFrame(cus.getCid()).setVisible(true);
                this.dispose();
                defaultTableModel2.setRowCount(0);
                showCustomerData(cusService.selectAll());
        }
    }//GEN-LAST:event_customerUpdateButtonActionPerformed

    private void transactionAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionAddButtonActionPerformed
        new AddTransactionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactionAddButtonActionPerformed

    private void transactionRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionRefreshButtonActionPerformed
        defaultTableModel4.setRowCount(0);
        showTransactionData(tranService.selectAll());
    }//GEN-LAST:event_transactionRefreshButtonActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        new LoginFormFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formattedCalculatorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedCalculatorMenuItemActionPerformed
        new FormattedCalculatorFrame().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_formattedCalculatorMenuItemActionPerformed

    private void calculatorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorMenuItemActionPerformed
        new CalculatorFrame().setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_calculatorMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton branchAddButton;
    private javax.swing.JButton branchDeleteButton;
    private javax.swing.JPanel branchPanel;
    private javax.swing.JButton branchRefreshButton;
    private javax.swing.JTable branchTable;
    private javax.swing.JButton branchUpdateButton;
    private javax.swing.JMenuItem calculatorMenuItem;
    private javax.swing.JButton customerAddButton;
    private javax.swing.JButton customerDeleteButton;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JButton customerRefreshButton;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton customerUpdateButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem formattedCalculatorMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JButton realEstateAddButton;
    private javax.swing.JButton realEstateDeleteButton;
    private javax.swing.JPanel realEstatePanel;
    private javax.swing.JButton realEstateRefreshButton;
    private javax.swing.JTable realEstateTable;
    private javax.swing.JButton realEstateUpdateButton;
    private javax.swing.JButton transactionAddButton;
    private javax.swing.JPanel transactionPanel;
    private javax.swing.JButton transactionRefreshButton;
    private javax.swing.JTable transactionTable;
    private javax.swing.JLabel vinlandLabel;
    // End of variables declaration//GEN-END:variables
}
