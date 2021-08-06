/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Process.LoaiSP;
import Process.Sanpham;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author howl1
 */
public class frmQuanLySP extends javax.swing.JFrame {
    public void Vohieuhoatf(boolean a)
         {
             this.textid.setEnabled(!a);
             this.texttenloai.setEnabled(!a);
             this.textsize.setEnabled(!a);
         }
         
          public void Vohieuhoatfsp(boolean a)
         {
             this.idsanpham.setEnabled(!a);
             this.idloaisp.setEnabled(!a);
             this.tensp.setEnabled(!a);
             this.gia.setEnabled(!a);
             this.brand.setEnabled(!a);
             this.SL.setEnabled(!a);
         }
         
            //HÀM KHÓA CÁC BUUTON
         public void Vohieuhoabt(boolean a)
         {
             this.btthem.setEnabled(a);
             this.btxoa.setEnabled(a);
             this.btsua.setEnabled(a);
             this.btluu.setEnabled(!a);
             this.btkluu.setEnabled(!a);            
         }
         
         public void Vohieuhoabtsp(boolean a)
         {
             this.themsp.setEnabled(a);
             this.xoasp.setEnabled(a);
             this.suasp.setEnabled(a);
             this.luusp.setEnabled(!a);
             this.kluusp.setEnabled(!a);            
         }
         
         public void setNulltf()
         {
             this.textid.setText("");
             this.texttenloai.setText("");
             this.textsize.setText("");
         }
         
         public void setNulltfsp()
         {
             this.idsanpham.setText("");
             this.idloaisp.setText("");
             this.tensp.setText("");
             this.gia.setText("");
             this.brand.setText("");
             this.SL.setText("");
         }
         
         public void ShowData() throws SQLException {
        ResultSet result = lsp.ShowLoaiSP();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[3];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
    }
         
         public void ShowData1() throws SQLException {
        ResultSet result = sp.ShowSanPham();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[6];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[4] = result.getString(5);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[5] = result.getString(6);

                tableMode2.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
    }
         
         public void ClearData() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableModel.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableModel.removeRow(i);//Remove tung dong
        }
    }
         
         public void ClearDatasp() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode2.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode2.removeRow(i);//Remove tung dong
        }
    }
         
         public void ClearData1() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode3.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode3.removeRow(i);//Remove tung dong
        }
    }
         
         public void ClearData2() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode4.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode4.removeRow(i);//Remove tung dong
        }
    }

    /**
     * Creates new form frmQuanLySP
     */
        private final LoaiSP lsp = new LoaiSP();
        private final Sanpham sp = new Sanpham();
            private boolean cothem=true;
            private final DefaultTableModel tableModel = new DefaultTableModel();
            private final DefaultTableModel tableMode2 = new DefaultTableModel();
            
            private final DefaultTableModel tableMode3 = new DefaultTableModel();
            private final DefaultTableModel tableMode4 = new DefaultTableModel();
            
            
             public void timkiem(String ten) throws SQLException{
             String ten1 = timkiemlsp.getText();
             ResultSet result = lsp.timkiem(ten);
             try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[3];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                tableMode3.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
             }   
             
             public void timkiem1(String ten1) throws SQLException{
             String ten12 = timkiemsp.getText();
             ResultSet result = sp.timkiem1(ten1);
             try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[6];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);  
                rows[5] = result.getString(6);
                tableMode4.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
         }
    public frmQuanLySP() throws SQLException {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String []colsName = {"ID", "Tên loai","Chỗ ngồi"};
        tableModel.setColumnIdentifiers(colsName);
        jTable1.setModel(tableModel);
        ShowData();
        Vohieuhoatf(true);
        Vohieuhoabt(true);
        
        
        String []colsName1 = {"ID Sản Phẩm", "Tên Sản Phẩm","ID Loại","Gía","Brand","Soluong"};
        tableMode2.setColumnIdentifiers(colsName1);
        jTable2.setModel(tableMode2);
        ShowData1();
        Vohieuhoatfsp(true);
        Vohieuhoabtsp(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        texttenloai = new javax.swing.JTextField();
        textsize = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){

            public boolean isCellEditable(int rowIndex , int colIntdex)
            {
                return false;
            }
        };
        btsua = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btthem = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btkluu = new javax.swing.JButton();
        timkiemlsp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idsanpham = new javax.swing.JTextField();
        tensp = new javax.swing.JTextField();
        idloaisp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        gia = new javax.swing.JTextField();
        SL = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        themsp = new javax.swing.JButton();
        xoasp = new javax.swing.JButton();
        suasp = new javax.swing.JButton();
        luusp = new javax.swing.JButton();
        kluusp = new javax.swing.JButton();
        timkiemsp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sản phẩm");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("QUẢN LÝ LOẠI SP VÀ SẢN PHẨM");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/3d-printer.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/3d-printer (1).png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/3d-printer (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel10)
                .addGap(62, 62, 62)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Tên mục", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tên Loại:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Chỗ ngồi:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texttenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textsize, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(texttenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Dữ Liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Tên Loại", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        btsua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsua.setForeground(new java.awt.Color(0, 204, 51));
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/exchange (1).png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btluu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btluu.setForeground(new java.awt.Color(102, 0, 204));
        btluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/save-file-option.png"))); // NOI18N
        btluu.setText("Lưu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxoa.setForeground(new java.awt.Color(255, 255, 0));
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (1).png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthem.setForeground(new java.awt.Color(0, 153, 255));
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/insert.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        btkluu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkluu.setForeground(new java.awt.Color(0, 204, 204));
        btkluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (2).png"))); // NOI18N
        btkluu.setText("K.lưu");
        btkluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkluuActionPerformed(evt);
            }
        });

        timkiemlsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemlspKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tìm kiếm nhanh (theo tên):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btthem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btkluu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timkiemlsp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(btxoa, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(btsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btluu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btkluu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btthem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(timkiemlsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Loại Sản Phẩm", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Tên mục", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID Sản Phẩm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tên SP:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ID Loại:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Brand:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Gía:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Số lượng:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(idloaisp)
                    .addComponent(gia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tensp, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(brand)
                    .addComponent(SL))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Dữ Liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Sản Phẩm", "Tên Sản Phẩm", "ID Loại", "Brand", "Gía"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        themsp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        themsp.setForeground(new java.awt.Color(0, 153, 255));
        themsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/insert.png"))); // NOI18N
        themsp.setText("Thêm");
        themsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themspActionPerformed(evt);
            }
        });

        xoasp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        xoasp.setForeground(new java.awt.Color(255, 255, 0));
        xoasp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (1).png"))); // NOI18N
        xoasp.setText("Xóa");
        xoasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaspActionPerformed(evt);
            }
        });

        suasp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        suasp.setForeground(new java.awt.Color(0, 204, 51));
        suasp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/exchange (1).png"))); // NOI18N
        suasp.setText("Sửa");
        suasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaspActionPerformed(evt);
            }
        });

        luusp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luusp.setForeground(new java.awt.Color(102, 0, 204));
        luusp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/save-file-option.png"))); // NOI18N
        luusp.setText("Lưu");
        luusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuspActionPerformed(evt);
            }
        });

        kluusp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kluusp.setForeground(new java.awt.Color(0, 204, 204));
        kluusp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (2).png"))); // NOI18N
        kluusp.setText("K.lưu");
        kluusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kluuspActionPerformed(evt);
            }
        });

        timkiemsp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timkiemspKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tìm kiếm nhanh (theo tên):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(themsp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xoasp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(suasp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(luusp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kluusp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timkiemsp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xoasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suasp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(luusp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kluusp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(themsp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timkiemsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        jTabbedPane1.addTab("Sản Phẩm", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = this.jTable1.getSelectedRow();
            String ml =(this.jTable1.getModel().getValueAt(row,0)).toString();
            ResultSet rs = lsp.ShowLoaiSP(ml);
            if(rs.next())
            {
                this.textid.setText(rs.getString("IDLoai"));
                this.texttenloai.setText(rs.getString("TenLoai"));
                this.textsize.setText(rs.getString("Chongoi"));
            }
        }
        catch(Exception ex)
        {
            
        }
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        String ml = textid.getText();
        if(ml.length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Xin hãy chọn dữ liệu để sửa");
        }
        else
        {
            Vohieuhoatf(false);//Mo khoa cac TextField
            this.textid.enable(false);
            Vohieuhoabt(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }

    }//GEN-LAST:event_btsuaActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        String id = textid.getText();
        String tenloai = texttenloai.getText();
        String size = textsize.getText();

        if(id.length() == 0 ||tenloai.length()==0||size.length()==0)
        {
            JOptionPane.showMessageDialog(null,"Hãy nhập đầy đủ ID ,Tên loại ,Size");
        }
      

        else {
            try {
                if (cothem == true) //Luu cho tthem moi
                {
                    lsp.InsertData(id, tenloai,size );
                    ClearData();
                    
                } else //Luu cho sua
                {
                    lsp.EditData(id, tenloai,size);
                    ClearData();
                }
                setNulltf(); //goi ham xoa du lieu tron tableModel
                ShowData(); //Do lai du lieu vao Table Model
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cap nhat that bai",
                    "Thong bao", 1);

            }
            Vohieuhoatf(false);
            Vohieuhoabt(true);
        }
    }//GEN-LAST:event_btluuActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        String ml = textid.getText();
        try {
            if (ml.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa " + ml + " này hay không?", "Thông Báo", 2) == 0) {
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
                    setNulltf();//Xoa trang Textfield
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thong bao", 1);
        }
    }//GEN-LAST:event_btxoaActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        setNulltf();
        Vohieuhoabt(false);
        Vohieuhoatf(false);
        cothem = true;
    }//GEN-LAST:event_btthemActionPerformed

    private void btkluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkluuActionPerformed
        setNulltf();
        Vohieuhoabt(true);
        Vohieuhoatf(true);
    }//GEN-LAST:event_btkluuActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            int row = this.jTable2.getSelectedRow();
            String msp =(this.jTable2.getModel().getValueAt(row,0)).toString();
            ResultSet rs = sp.ShowSP(msp);
            if(rs.next())
            {

                this.idsanpham.setText(rs.getString("IDSanPham"));
                this.idloaisp.setText(rs.getString("IDLoai"));
                this.tensp.setText(rs.getString("TenSanPham"));
                this.gia.setText(rs.getString("Gia"));
                this.brand.setText(rs.getString("Brand"));
               this.SL.setText(rs.getString("Soluong"));
            }
        }
        catch(SQLException e)
        {}
    }//GEN-LAST:event_jTable2MouseClicked

    private void themspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themspActionPerformed
        setNulltfsp();
        Vohieuhoabtsp(false);
        Vohieuhoatfsp(false);
        cothem = true;
    }//GEN-LAST:event_themspActionPerformed

    private void xoaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaspActionPerformed
        String msp = idsanpham.getText();
        try {
            if (msp.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa " + msp + " này hay không?", "Thông Báo", 2) == 0) {
                    sp.DeleteDataSP(msp);//goi ham xoa du lieu theo ma loai
                    ClearDatasp();//Xoa du lieu trong tableModel
                    ShowData1();//Do du lieu vao table Model
                    setNulltfsp();//Xoa trang Textfield
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thong bao", 1);
        }
    }//GEN-LAST:event_xoaspActionPerformed

    private void suaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaspActionPerformed
        String msp = idsanpham.getText();
        if(msp.length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Xin hãy chọn dữ liệu để sửa");
        }
        else
        {
            Vohieuhoatfsp(false);//Mo khoa cac TextField
            this.idsanpham.enable(false);
            Vohieuhoabtsp(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_suaspActionPerformed

    private void luuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuspActionPerformed
        String  idsp = idsanpham.getText();
        String tenspham = tensp.getText();
        String idloai = idloaisp.getText();
        String giasp = gia.getText();
        String brandsp = brand.getText();
        String sl = SL.getText();

        if(idsp.length() == 0 ||tenspham.length()==0||idloai.length()==0||giasp.length()==0||brandsp.length()==0||sl.length()==0)
        {
            JOptionPane.showMessageDialog(null,"Hãy nhập đầy đủ thong tin và thử lại");
        }
        //            else if(idsp.length() > 4 || tenspham.length() >50 || idloai.length() >7)
        //            {
            //                JOptionPane.showMessageDialog(null,"ID chỉ có 4 ký tự , Tên loại chỉ có 50 ký tự , ID Loại phải phù hợp ");
            //            }
        

        else {
            try {
                if (cothem == true) //Luu cho tthem moi
                {
                    
                    sp.InsertDataSP(idsp, tenspham,idloai,giasp,brandsp,sl );
                    ClearDatasp();
                    
                } else //Luu cho sua
                {
                    sp.EditDataSP(idsp, tenspham,idloai,giasp,brandsp,sl);
                    ClearDatasp();
                    
                }
                ShowData1();
                setNulltfsp(); //goi ham xoa du lieu tron tableModel
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cap nhat that bai",
                    "Thong bao", 1);

            }
            Vohieuhoatfsp(false);
            Vohieuhoabtsp(true);
        }
    }//GEN-LAST:event_luuspActionPerformed

    private void kluuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kluuspActionPerformed
        setNulltfsp();
        Vohieuhoabtsp(true);
        Vohieuhoatfsp(true);
    }//GEN-LAST:event_kluuspActionPerformed

    private void timkiemlspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemlspKeyReleased
       try {           
               if(timkiemlsp.getText().isEmpty())
               { 
                   ClearData1();
                   jTable1.setModel(tableModel);
                 
               }
               else
               {
                ClearData1();
                String ten = timkiemlsp.getText();
                String []colsName = {"ID","Tên loại","Chỗ ngồi"};
                tableMode3.setColumnIdentifiers(colsName);
                jTable1.setModel(tableMode3);
                timkiem(ten);
               }
    } catch (SQLException ex) {
        Logger.getLogger(frmQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_timkiemlspKeyReleased

    private void timkiemspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timkiemspKeyReleased
         try {
            
               if(timkiemsp.getText().isEmpty())
               { 
                   ClearData2();
                   jTable2.setModel(tableMode2);
                 
               }
               else
               {
                ClearData2();
                String ten1 = timkiemsp.getText();
                String []colsName = {"ID Sản phẩm","Tên Sản phẩm","ID Loại","Gía","Brand","Số lượng"};
                tableMode4.setColumnIdentifiers(colsName);
                jTable2.setModel(tableMode4);
                timkiem1(ten1);
               }
    } catch (SQLException ex) {
        Logger.getLogger(frmQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_timkiemspKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       frmQuanLySP f = new frmQuanLySP();
       f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SL;
    private javax.swing.JTextField brand;
    private javax.swing.JButton btkluu;
    private javax.swing.JButton btluu;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxoa;
    private javax.swing.JTextField gia;
    private javax.swing.JTextField idloaisp;
    private javax.swing.JTextField idsanpham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton kluusp;
    private javax.swing.JButton luusp;
    private javax.swing.JButton suasp;
    private javax.swing.JTextField tensp;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textsize;
    private javax.swing.JTextField texttenloai;
    private javax.swing.JButton themsp;
    private javax.swing.JTextField timkiemlsp;
    private javax.swing.JTextField timkiemsp;
    private javax.swing.JButton xoasp;
    // End of variables declaration//GEN-END:variables
}
