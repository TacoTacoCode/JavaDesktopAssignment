/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Vector;
import entity.Item;
import entity.Supplier;
import javax.swing.JOptionPane;
import service.ItemService;
import service.SupplierService;

/**
 *
 * @author QL
 */
public class Item_SupplierTable extends javax.swing.JFrame {

    CustomTableItem itemTable;
    CustomTableSupplier supplierTable;
    boolean addnew = false;
    ItemService itemService = new ItemService();
    SupplierService supplierService = new SupplierService();

    public Item_SupplierTable() {
        initComponents();
        this.setSize(900, 600);
        String[] header = {"itemCode", "itemName", "supCode", "unit", "price", "supplying"};
        int[] indexes = {0, 1, 2, 3, 4, 5};
        itemTable = new CustomTableItem(header, indexes, 6);
        tblItem.setModel(itemTable);

        String[] header2 = {"supCode", "supName", "Address", "Colloborating"};
        int[] indexes2 = {0, 1, 2, 3};
        supplierTable = new CustomTableSupplier(header2, indexes2, 6);
        tblSupplier.setModel(supplierTable);
        loadData();
        lblPageItem.setText(itemTable.getPageNo() + " / " + itemTable.getTotalPages());
        lblPageSup.setText(supplierTable.getPageNo() + " / " + supplierTable.getTotalPages());
        txtItemCode.setEditable(false);
        txtSupCode.setEditable(false);

    }

    void loadData() {
        itemTable.getData().clear();
        supplierTable.getData().clear();
        try {
            Vector<Item> itemList = itemService.getAllItem();
            Vector<Supplier> supplierList = supplierService.getAllSupplier();
            for (Item item : itemList) {
                itemTable.getData().add(item);
            }
            for (Supplier supplier : supplierList) {
                supplierTable.getData().add(supplier);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        itemTable.setTotalRecords();
        itemTable.setTotalPages();
        itemTable.setCurrentRowIndex();
        supplierTable.setTotalRecords();
        supplierTable.setTotalPages();
        supplierTable.setCurrentRowIndex();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        btnGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtUnit = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        rbtSupTrue = new javax.swing.JRadioButton();
        rbtSupFalse = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSupCode = new javax.swing.JTextField();
        txtSupName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        rbtCollTrue = new javax.swing.JRadioButton();
        rbtCollFalse = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblPageItem = new javax.swing.JLabel();
        btnPreItem = new javax.swing.JButton();
        btnNextItem = new javax.swing.JButton();
        btnSearchItem = new javax.swing.JButton();
        txtSearchItem = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        lblPageSup = new javax.swing.JLabel();
        btnPreSup = new javax.swing.JButton();
        btnNextSup = new javax.swing.JButton();
        btnSearchSupplier = new javax.swing.JButton();
        txtSearchSupplier = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Item"));

        jLabel1.setText("Code");

        jLabel2.setText("Name");

        jLabel4.setText("Unit");

        jLabel5.setText("Price");

        jLabel6.setText("Supplying");

        btnGroup1.add(rbtSupTrue);
        rbtSupTrue.setText("True");

        btnGroup1.add(rbtSupFalse);
        rbtSupFalse.setText("False");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtSupTrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtSupFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPrice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbtSupFalse, rbtSupTrue});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemCode)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtSupTrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtSupFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel4, jLabel5, jLabel6});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbtSupFalse, rbtSupTrue});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier"));

        jLabel7.setText("SupCode");

        jLabel8.setText("SupName");

        jLabel9.setText("Address");

        jLabel10.setText("Colloborating");

        txtSupCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupCodeActionPerformed(evt);
            }
        });

        txtSupName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupNameActionPerformed(evt);
            }
        });

        btnGroup2.add(rbtCollTrue);
        rbtCollTrue.setText("True");

        btnGroup2.add(rbtCollFalse);
        rbtCollFalse.setText("False");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSupCode, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtSupName, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(rbtCollTrue, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtCollFalse, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupCode)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSupName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtCollTrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtCollFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel7, jLabel8, jLabel9});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbtCollFalse, rbtCollTrue});

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
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
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        lblPageItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageItem.setText("PageNo will be display here");

        btnPreItem.setText("Previous");
        btnPreItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreItemActionPerformed(evt);
            }
        });

        btnNextItem.setText("Next");
        btnNextItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnPreItem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPageItem, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnNextItem, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNextItem, btnPreItem});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblPageItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPreItem)
                .addComponent(btnNextItem))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNextItem, btnPreItem});

        btnSearchItem.setText("Search By Name");
        btnSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnSearchItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Items", jPanel5);

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSupplier);

        lblPageSup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageSup.setText("PageNo will be display here");
        lblPageSup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnPreSup.setText("Previous");
        btnPreSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreSupActionPerformed(evt);
            }
        });

        btnNextSup.setText("Next");
        btnNextSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnPreSup, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPageSup, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnNextSup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNextSup, btnPreSup});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblPageSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPreSup)
                .addComponent(btnNextSup))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNextSup, btnPreSup});

        btnSearchSupplier.setText("Search By Name");
        btnSearchSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(btnSearchSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Suppliers", jPanel6);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

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
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExit, btnNew, btnRemove, btnSave});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSupCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupCodeActionPerformed

    }//GEN-LAST:event_txtSupCodeActionPerformed

    private void txtSupNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupNameActionPerformed

    }//GEN-LAST:event_txtSupNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Save", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        btnNewActionPerformed(null);
        int selectedIndex = tblItem.getSelectedRow() + itemTable.getCurrentRowIndex();
        if (selectedIndex >= itemTable.getData().size() || evt == null) {
            return;
        }
        Item it = itemTable.getData().get(selectedIndex);
        txtItemCode.setText(it.getItemCode());
        txtItemName.setText(it.getItemName());
        txtUnit.setText(it.getUnit());
        txtPrice.setText(it.getPrice());
        rbtSupTrue.setSelected(it.isSupplying());
        rbtSupFalse.setSelected(!it.isSupplying());

        try {
            Supplier sp = supplierService.getSupplierByCode(it.getSupCode());
            if (sp != null) {
                txtSupCode.setText(sp.getSupCode());
                txtSupName.setText(sp.getSupName());
                txtAddress.setText(sp.getAddress());
                rbtCollTrue.setSelected(sp.isColloborating());
                rbtCollFalse.setSelected(!sp.isColloborating());
            }
            if (sp == null) {
                txtSupCode.setText("");
                txtSupName.setText("");
                txtAddress.setText("");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        txtItemCode.setEditable(false);
        txtSupCode.setEditable(true);
        addnew = false;
    }//GEN-LAST:event_tblItemMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtItemCode.setText("");
        txtItemName.setText("");
        txtUnit.setText("");
        txtPrice.setText("");
        txtSupCode.setText("");
        txtSupName.setText("");
        txtAddress.setText("");
        rbtSupTrue.setSelected(false);
        rbtSupFalse.setSelected(false);
        rbtCollFalse.setSelected(false);
        rbtCollTrue.setSelected(false);
        txtItemCode.setEditable(true);
        txtSupCode.setEditable(true);
        addnew = true;
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (addnew) {
            Object obj = this.isvalid();
            if (obj instanceof Item) {
                Item it = (Item) obj;
                for (Item item : itemTable.getData()) {
                    if (it.getItemCode().equals(item.getItemCode())) {
                        JOptionPane.showMessageDialog(this, "Code duplicated.");
                        txtItemCode.requestFocus();
                        btnNewActionPerformed(null);
                        return;
                    }
                }
                if (it.getSupCode() != null) {
                    boolean flag = false;
                    for (Supplier supplier : supplierTable.getData()) {
                        if (it.getSupCode().equals(supplier.getSupCode())) {
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        JOptionPane.showMessageDialog(this, "No supplier found!!");
                        btnNewActionPerformed(null);
                        return;
                    }
                }
                try {
                    itemService.insertItem(it);
                    itemTable.getData().add(it);
                    tblItem.updateUI();
                    itemTable.setTotalRecords();
                    itemTable.setTotalPages();
                    lblPageItem.setText(itemTable.getPageNo() + " / " + itemTable.getTotalPages());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (obj instanceof Supplier) {
                Supplier sp = (Supplier) obj;
                for (Supplier item : supplierTable.getData()) {
                    if (sp.getSupCode().equals(item.getSupCode())) {
                        JOptionPane.showMessageDialog(this, "Code duplicated.");
                        txtItemCode.requestFocus();
                        return;
                    }
                }
                try {
                    supplierService.insertSupplier(sp);
                    supplierTable.getData().add(sp);
                    supplierTable.setTotalRecords();
                    supplierTable.setTotalPages();
                    tblSupplier.updateUI();
                    lblPageSup.setText(supplierTable.getPageNo() + " / " + supplierTable.getTotalPages());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            if (txtItemCode.getText().length()!= 0) {
                Item it = new Item(txtItemCode.getText(), txtItemName.getText(),
                        txtSupCode.getText(), txtUnit.getText(), txtPrice.getText(), rbtSupTrue.isSelected());
                try {
                    itemService.updateItem(it);
                    int selectedIndex = tblItem.getSelectedRow() + itemTable.getCurrentRowIndex();
                    itemTable.getData().set(selectedIndex, it);
                    tblItem.updateUI();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());

                }
                tblItem.updateUI();
            } else {
                Supplier sp = new Supplier(txtSupCode.getText(), txtSupName.getText(),
                        txtAddress.getText(), rbtCollTrue.isShowing());
                try {
                    supplierService.updateSupplier(sp);
                    int selectedIndex = tblSupplier.getSelectedRow() + supplierTable.getCurrentRowIndex();
                    supplierTable.getData().set(selectedIndex, sp);
                    tblSupplier.updateUI();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    Object isvalid() {
        String itemCode = txtItemCode.getText().trim().toUpperCase();
        txtItemCode.setText(itemCode);
        String supCode = txtSupCode.getText().trim().toUpperCase();
        txtSupCode.setText(supCode);
        if (itemCode.length() != 0) {
            if (itemCode.matches("E\\d{4}")) {
                return new Item(txtItemCode.getText(), txtItemName.getText().trim(),
                        txtSupCode.getText().trim().toUpperCase(), txtUnit.getText().trim(),
                        txtPrice.getText().trim(), rbtSupTrue.isSelected());
            }
        } else if (supCode.length() != 0) {
            return new Supplier(supCode, txtSupName.getText().trim(),
                    txtAddress.getText().trim(), rbtCollTrue.isSelected());
        }
        return null;
    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Are you sure", "Remove?", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
            int selectedIndex;
            String code;
            if (tblItem.getSelectedRow() > -1) {
                code = txtItemCode.getText().trim();
                selectedIndex = tblItem.getSelectedRow() + itemTable.getCurrentRowIndex();
                try {
                    if (itemService.removeItem(code) > 0) {
                        itemTable.getData().remove(selectedIndex);
                        tblItem.updateUI();
                        itemTable.setTotalRecords();
                        itemTable.setTotalPages();
                        lblPageItem.setText(itemTable.getPageNo() + " / " + itemTable.getTotalPages());
                    }
                } catch (Exception ex) {
                }
            }
            if (tblSupplier.getSelectedRow() > -1) {
                Item it = null;
                code = txtSupCode.getText().trim();
                selectedIndex = tblSupplier.getSelectedRow() + supplierTable.getCurrentRowIndex();
                try {
                    for (Item item : itemTable.getData()) {
                        if (item.getSupCode().equalsIgnoreCase(code)) {
                            item.setSupCode("");
                            it = item;
                            it.setSupCode(null);
                            itemService.removeItem(item.getItemCode());
                            itemService.insertItem(it);
                        }
                    }
                    supplierService.removeSupplier(code);
                    supplierTable.getData().remove(selectedIndex);
                    tblItem.updateUI();
                    tblSupplier.updateUI();
                    supplierTable.setTotalRecords();
                    supplierTable.setTotalPages();
                    lblPageSup.setText(supplierTable.getPageNo() + " / " + supplierTable.getTotalPages());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        btnNewActionPerformed(null);
        int selectedIndex = tblSupplier.getSelectedRow() + supplierTable.getCurrentRowIndex();
        if (selectedIndex >= supplierTable.getData().size() || evt == null) {
            return;
        }
        Supplier sp = supplierTable.getData().get(selectedIndex);
        txtSupCode.setText(sp.getSupCode());
        txtSupName.setText(sp.getSupName());
        txtAddress.setText(sp.getAddress());
        rbtCollTrue.setSelected(sp.isColloborating());
        rbtCollFalse.setSelected(!sp.isColloborating());
        txtItemCode.setEditable(false);
        txtSupCode.setEditable(true);
        addnew = false;
    }//GEN-LAST:event_tblSupplierMouseClicked

    private void btnNextItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextItemActionPerformed
        int nextPageNumber = itemTable.getPageNo() + 1;
        if (nextPageNumber > itemTable.getTotalPages()) {
            return;
        }
        lblPageItem.setText(nextPageNumber + " / " + itemTable.getTotalPages());
        itemTable.setPageNo(nextPageNumber);
        itemTable.setCurrentRowIndex();
        tblItem.updateUI();
    }//GEN-LAST:event_btnNextItemActionPerformed

    private void btnPreItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreItemActionPerformed
        int previousPageNumber = itemTable.getPageNo() - 1;
        if (previousPageNumber == 0) {
            return;
        }
        lblPageItem.setText(previousPageNumber + " / " + itemTable.getTotalPages());
        itemTable.setPageNo(previousPageNumber);
        itemTable.setCurrentRowIndex();
        tblItem.updateUI();
    }//GEN-LAST:event_btnPreItemActionPerformed

    private void btnPreSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreSupActionPerformed
        int previousPageNumber = supplierTable.getPageNo() - 1;
        if (previousPageNumber == 0) {
            return;
        }
        lblPageSup.setText(previousPageNumber + " / " + supplierTable.getTotalPages());
        supplierTable.setPageNo(previousPageNumber);
        supplierTable.setCurrentRowIndex();
        tblSupplier.updateUI();

    }//GEN-LAST:event_btnPreSupActionPerformed

    private void btnNextSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSupActionPerformed
        int nextPageNumber = supplierTable.getPageNo() + 1;
        if (nextPageNumber > supplierTable.getTotalPages()) {
            return;
        }
        lblPageSup.setText(nextPageNumber + " / " + supplierTable.getTotalPages());
        supplierTable.setPageNo(nextPageNumber);
        supplierTable.setCurrentRowIndex();
        tblSupplier.updateUI();
    }//GEN-LAST:event_btnNextSupActionPerformed

    private void btnSearchSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSupplierActionPerformed
        String s = txtSearchSupplier.getText().trim();
        boolean flag = false;
        Vector<Supplier> searchSupplier = new Vector<>();
        for (Supplier sp : supplierTable.getData()) {
            if (sp.getSupName().contains(s)) {
                searchSupplier.add(sp);
                flag = true;
            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(this, "Not found!!!");
            loadData();
        } else {
            loadDataSearchSupplier(searchSupplier);
        }
        lblPageSup.setText(supplierTable.getPageNo() + " / " + supplierTable.getTotalPages());
        txtSearchSupplier.setText("");
        tblItem.updateUI();
    }//GEN-LAST:event_btnSearchSupplierActionPerformed

    private void btnSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchItemActionPerformed
        String s = txtSearchItem.getText().trim();
        boolean flag = false;
        Vector<Item> searchItem = new Vector<>();
        for (Item item : itemTable.getData()) {
            if (item.getItemName().contains(s)) {
                searchItem.add(item);
                flag = true;
            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(this, "Not found!!!");
            loadData();
        } else {
            loadDataSearchItem(searchItem);
        }
        lblPageItem.setText(itemTable.getPageNo() + " / " + itemTable.getTotalPages());
        txtSearchSupplier.setText("");
        tblItem.updateUI();
    }//GEN-LAST:event_btnSearchItemActionPerformed
    void loadDataSearchItem(Vector<Item> list) {
        itemTable.getData().clear();
        for (Item item : list) {
            itemTable.getData().add(item);
        }
        itemTable.setTotalRecords();
        itemTable.setTotalPages();
        itemTable.setCurrentRowIndex();
    }

    void loadDataSearchSupplier(Vector<Supplier> list) {
        supplierTable.getData().clear();
        for (Supplier sp : list) {
            supplierTable.getData().add(sp);
        }
        supplierTable.setTotalRecords();
        supplierTable.setTotalPages();
        supplierTable.setCurrentRowIndex();
    }

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
            java.util.logging.Logger.getLogger(Item_SupplierTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item_SupplierTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item_SupplierTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item_SupplierTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Item_SupplierTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.ButtonGroup btnGroup2;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNextItem;
    private javax.swing.JButton btnNextSup;
    private javax.swing.JButton btnPreItem;
    private javax.swing.JButton btnPreSup;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchItem;
    private javax.swing.JButton btnSearchSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblPageItem;
    private javax.swing.JLabel lblPageSup;
    private javax.swing.JRadioButton rbtCollFalse;
    private javax.swing.JRadioButton rbtCollTrue;
    private javax.swing.JRadioButton rbtSupFalse;
    private javax.swing.JRadioButton rbtSupTrue;
    private javax.swing.JTable tblItem;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JTextField txtSearchSupplier;
    private javax.swing.JTextField txtSupCode;
    private javax.swing.JTextField txtSupName;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
