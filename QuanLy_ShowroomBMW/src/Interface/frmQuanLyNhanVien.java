/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Process.LoaiSP;
import Process.NhanVien;
import Process.Sanpham;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author howl1
 */
public class frmQuanLyNhanVien extends javax.swing.JFrame {
private final NhanVien nv= new NhanVien();
private boolean cothem=true;
private final DefaultTableModel tableModel = new DefaultTableModel();
private final DefaultTableModel tableMode2 = new DefaultTableModel();

private final DefaultTableModel tableMode3 = new DefaultTableModel();
private final DefaultTableModel tableMode4 = new DefaultTableModel();

private final DefaultTableModel tableMode5 = new DefaultTableModel();
private final DefaultTableModel tableMode6 = new DefaultTableModel();


    public void Vohieuhoatf(boolean a)
         {
             this.tk.setEnabled(!a);
             this.mk.setEnabled(!a);
             this.hoten.setEnabled(!a);
            this.gioitinh.setEnabled(!a);
             this.sdt.setEnabled(!a);
             this.email.setEnabled(!a);
             this.chucvu.setEnabled(!a);
             this.luong.setEnabled(!a);
             this.idnv.setEnabled(!a);
         }
 
         public void Vohieuhoabt(boolean a)
         {
             this.btthem.setEnabled(a);
             this.btxoa.setEnabled(a);
             this.btsua.setEnabled(a);
             this.btluu.setEnabled(!a);
             this.btkluu.setEnabled(!a);            
         }

         public void setNulltf()
         {
             this.tk.setText("");
             this.mk.setText("");
             this.hoten.setText("");
             this.gioitinh.setText("");
             this.sdt.setText("");
             this.email.setText("");
             this.chucvu.setText("");
             this.luong.setText("");
             this.idnv.setText("");
             
         } 
         
          public void ShowData() throws SQLException {
        ResultSet result = nv.ShowLoaiSP();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
    }
          
          public void nvqlkho() throws SQLException {
        ResultSet result = nv.dataqlkho();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableMode3.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
    }
          
          public void qlns() throws SQLException {
        ResultSet result = nv.qlns();
        try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableMode5.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
          }
          
          
         public void timkiem(String ten) throws SQLException{
             String ten1 = jTextField1.getText();
             ResultSet result = nv.timkiem(ten);
             try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableMode2.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
         }
         
         public void timkiemqlk(String ten) throws SQLException{
             String ten1 = jTextField2.getText();
             ResultSet result = nv.timkiemqlk(ten);
             try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableMode4.addRow(rows); // đưa dòng dữ liệu vào tableModel
                    //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update
            }
        } catch (SQLException e) {
        }
         }
         
         
         public void timkiemqlns(String ten) throws SQLException{
             //String ten1 = jTextField3.getText();
             ResultSet result = nv.timkiemqlns(ten);
             try {
            while (result.next()) { // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
                rows[1] = result.getString(2);
                rows[2] = result.getString(3);// lấy dữ liệu tai cột số 2 ứng với tên hàng
                rows[3] = result.getString(4);
                rows[4] = result.getString(5);
                rows[5] = result.getString(6);
                rows[6] = result.getString(7);
                rows[7] = result.getString(8);
                rows[8] = result.getString(9);  
                tableMode6.addRow(rows); // đưa dòng dữ liệu vào tableModel
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
           public void ClearData1() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode2.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode2.removeRow(i);//Remove tung dong
        }
           }
           
            public void ClearDataqlk() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode3.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode3.removeRow(i);//Remove tung dong
        }
           }
        
            
            public void ClearDatatimkiem() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode4.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode4.removeRow(i);//Remove tung dong
        }
           }
            
            public void ClearDataqlns() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode5.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode5.removeRow(i);//Remove tung dong
        }
           }

         public void ClearDatatimkiemqlns() throws SQLException {
//Lay chi so dong cuoi cung
        int n = tableMode6.getRowCount() - 1;
        for (int i = n; i >= 0; i--) {
            tableMode6.removeRow(i);//Remove tung dong
        }
           }
          
         
         
    public frmQuanLyNhanVien() throws SQLException {
        initComponents();
        setSize(980, 740);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        String []colsName = { "Tài khoản","Mật khẩu","Họ tên","Giới tính","SĐT","Email","Chức vụ","Lương","ID Nhân Viên"};
        tableModel.setColumnIdentifiers(colsName);
        jTable1.setModel(tableModel);
        ShowData();
        
        String []colsName1 = { "Tài khoản","Mật khẩu","Họ tên","Giới tính","SĐT","Email","Chức vụ","Lương","ID Nhân Viên"};
        tableMode3.setColumnIdentifiers(colsName1);
        jTable2.setModel(tableMode3);
        nvqlkho();
        
        String []colsName2 = { "Tài khoản","Mật khẩu","Họ tên","Giới tính","SĐT","Email","Chức vụ","Lương","ID Nhân Viên"};
        tableMode5.setColumnIdentifiers(colsName2);
        //jTable3.setModel(tableMode5);
        qlns();
        
        
        Vohieuhoatf(true);
        Vohieuhoabt(true);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chucvu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mk = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        luong = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        idnv = new javax.swing.JTextField();
        gioitinh = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btthem = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btkluu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ngaynghi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tienthuong = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        luongmacdinh = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("BẢNG QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel2)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 940, 69);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Tên mục", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tài Khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Họ tên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("SĐT:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Chức vụ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mật khẩu:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Giới Tính:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Lương:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("ID Nhân Viên:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(luong, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(email)
                            .addComponent(gioitinh))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13))
                    .addComponent(idnv, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(mk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(320, 100, 516, 270);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2), "Dữ liệu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tìm kiếm (theo tên):");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân viên bán hàng", jPanel7);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Tìm kiếm (theo tên):");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(749, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Nhân viên quản lý kho", jPanel8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 420, 940, 260);

        btthem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btthem.setForeground(new java.awt.Color(0, 153, 255));
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/insert.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });
        getContentPane().add(btthem);
        btthem.setBounds(840, 110, 110, 40);

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btxoa.setForeground(new java.awt.Color(255, 255, 0));
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (1).png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });
        getContentPane().add(btxoa);
        btxoa.setBounds(840, 160, 109, 40);

        btluu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btluu.setForeground(new java.awt.Color(102, 0, 204));
        btluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/save-file-option.png"))); // NOI18N
        btluu.setText("Lưu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });
        getContentPane().add(btluu);
        btluu.setBounds(840, 260, 109, 40);

        btsua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btsua.setForeground(new java.awt.Color(0, 204, 51));
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/exchange (1).png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });
        getContentPane().add(btsua);
        btsua.setBounds(840, 210, 109, 40);

        btkluu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkluu.setForeground(new java.awt.Color(0, 204, 204));
        btkluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/delete (2).png"))); // NOI18N
        btkluu.setText("K.lưu");
        btkluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkluuActionPerformed(evt);
            }
        });
        getContentPane().add(btkluu);
        btkluu.setBounds(840, 310, 109, 40);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 0, 0);

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel11.setText("The Ultimate Driving Machine");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 380, 360, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/bmw (3).png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(680, 380, 30, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/bmw (3).png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(280, 380, 30, 30);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("**BẢNG TÍNH LƯƠNG**");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Ngày nghỉ:");

        ngaynghi.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tiền thưởng thêm:");

        tienthuong.setText("0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Lương mặc định:");

        luongmacdinh.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Tổng lương:");

        jTextField4.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("TÍNH LƯƠNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("1 NGÀY 333.000 VNĐ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(luongmacdinh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ngaynghi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(tienthuong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ngaynghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tienthuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(luongmacdinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 110, 310, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        setNulltf();
        Vohieuhoabt(false);
        Vohieuhoatf(false);
        cothem = true;
    }//GEN-LAST:event_btthemActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
       String ml = idnv.getText();
        try {
            if (ml.length() == 0) {
                JOptionPane.showMessageDialog(null, "Chon 1 loai SP de xoa", "Thong bao", 1);
            } else {
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa " + ml + " này hay không?", "Thông Báo", 2) == 0) {
                    if(jTabbedPane1.getSelectedIndex()==0)
                    {
                         nv.DeleteData(ml);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
                    setNulltf();//Xoa trang Textfield
                    }
                    else if(jTabbedPane1.getSelectedIndex()==1)
                    {
                        nv.DeleteDataqlk(ml);//goi ham xoa du lieu theo ma loai
                    ClearDataqlk();//Xoa du lieu trong tableModel
                        nvqlkho();//Do du lieu vao table Model
                    setNulltf();//Xoa trang Textfield                    
                    }
                    else if(jTabbedPane1.getSelectedIndex()==2)
                    {
                        nv.DeleteDataqlns(ml);//goi ham xoa du lieu theo ma loai
                        ClearDataqlns();//Xoa du lieu trong tableModel
                        qlns();//Do du lieu vao table Model
                        setNulltf();//Xoa trang Textfield
                    }
                   
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thong bao", 1);
        }
    }//GEN-LAST:event_btxoaActionPerformed
    
    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
        String id = idnv.getText();
        String taikhoan = tk.getText();
        String matkhau = mk.getText();
        String ht = hoten.getText();
        String gt = gioitinh.getText();
        
      
        
        String phone = sdt.getText();
        String mail = email.getText();
        String cv = chucvu.getText();
        String lu = luong.getText();
 
        
        if(id.length() == 0 ||taikhoan.length()==0||matkhau.length()==0||ht.length()==0||phone.length()==0||mail.length()==0||cv.length()==0||lu.length()==0) // chưa tạo điều kiện cho việc nếu chưa chọn giới tính th2i sao 
        {
            JOptionPane.showMessageDialog(null,"Hãy nhập đầy đủ thông tin");
                   
        }
        

        
        else {
            try {
 
                if (cothem == true) //Luu cho tthem moi
                {
                  if(jTabbedPane1.getSelectedIndex()==0)
                  {       
                      if(!idnv.getText().trim().matches("NV[0-9]{3}"))
                      {
                          JOptionPane.showMessageDialog(null, "Mã Nhân viên có dạng NVxxx, trong đó xxx là số nguyên.");
                          return;
                      }
                    nv.InsertData(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                    ClearData();
                    ShowData();
                  }
                  else if(jTabbedPane1.getSelectedIndex()==1)
                  {
                      if(!idnv.getText().trim().matches("QLK[0-9]{3}"))
                      {
                          JOptionPane.showMessageDialog(null, "Mã Nhân viên quản lý kho có dạng QLKxxx, trong đó xxx là số nguyên.");
                          return;
                      }
                      nv.InsertDataqlk(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                      ClearDataqlk();
                      nvqlkho();
                  }
                  else if(jTabbedPane1.getSelectedIndex()==2)
                  {
                      if(!idnv.getText().trim().matches("QLNS[0-9]{3}"))
                      {
                          JOptionPane.showMessageDialog(null, "Mã Nhân viên quản lý nhân sự có dạng QLNSxxx, trong đó xxx là số nguyên.");
                          return;
                      }
                      nv.InsertDataqlns(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                      ClearDataqlns();
                      qlns();
                  }
                   
                } else //Luu cho sua
                {
                    if(jTabbedPane1.getSelectedIndex()==0)
                    {
                        nv.EditData(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                        ClearData();
                        ShowData();
                    }
                    else if(jTabbedPane1.getSelectedIndex()==1)
                    {
                        nv.EditDataqlk(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                        ClearDataqlk();
                        nvqlkho();
                    }
                    else if(jTabbedPane1.getSelectedIndex()==2)
                    {
                        nv.EditDataqlns(taikhoan,matkhau,ht,gt,phone,mail,cv,lu,id);
                        ClearDataqlns();
                        qlns();
                    }
                }
                setNulltf(); //goi ham xoa du lieu tron tableModel
               
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cap nhat that bai",
                    "Thong bao", 1);
            }
            Vohieuhoatf(false);
            Vohieuhoabt(true);
        }
    }//GEN-LAST:event_btluuActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        String ml = idnv.getText();
        if (ml.length() == 0) {
            JOptionPane.showMessageDialog(this, "Xin hãy chọn dữ liệu để sửa");
        } else {
            Vohieuhoatf(false);//Mo khoa cac TextField
            this.idnv.enable(false);
            Vohieuhoabt(false); //Khoa cac Button
            cothem = false; //Gan cothem=false de ghi nhan trang thai la sua
        } 
    }//GEN-LAST:event_btsuaActionPerformed

    private void btkluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkluuActionPerformed
                setNulltf();
        Vohieuhoabt(true);
        Vohieuhoatf(true);
    }//GEN-LAST:event_btkluuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        while (true) {
            if (!ngaynghi.getText().trim().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Ngày làm việc phải là số ! ");
                return;
            }
            else if (!tienthuong.getText().trim().matches("[0-9]+"))
            {
                JOptionPane.showMessageDialog(null, "Tiền thưởng phải là số ! ");
                return;
            }
            else if (luongmacdinh.getText().trim().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Xin chọn nhân viên để tính lương ");
                return;
            }
            else {
                break;
            }
        }
        int luongmd = Integer.parseInt(luongmacdinh.getText());
       int dayoff = Integer.parseInt(ngaynghi.getText());
       int tienthuong1 = Integer.parseInt(tienthuong.getText());
       int tiendayoff = dayoff * 330000;
       int tongluong = (luongmd - tiendayoff) + tienthuong1;
       String s = String.valueOf(tongluong);
       jTextField4.setText(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        try {

            if(jTextField2.getText().isEmpty())
            {
                ClearDatatimkiem();
                jTable2.setModel(tableMode3);

            }
            else
            {
                ClearDatatimkiem();
                String ten = jTextField2.getText();
                String []colsName = { "Tài khoản","Mật khẩu","Họ tên","Giới tính","SĐT","Email","Chức vụ","Lương","ID Nhân Viên"};
                tableMode4.setColumnIdentifiers(colsName);
                jTable2.setModel(tableMode4);
                timkiemqlk(ten);
            }
        } catch (SQLException ex) {
        }

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try{
            int row = this.jTable2.getSelectedRow();
            String ml =(this.jTable2.getModel().getValueAt(row,8)).toString();
            ResultSet rs = nv.dataqlkho(ml);
            if(rs.next())
            {
                this.tk.setText(rs.getString("TKNhanVien"));
                this.mk.setText(rs.getString("MKNhanVien"));
                this.hoten.setText(rs.getString("HoTen"));
                this.gioitinh.setText(rs.getString("GioiTinh"));

                this.sdt.setText(rs.getString("Phone"));
                this.email.setText(rs.getString("Email"));
                this.chucvu.setText(rs.getString("Chucvu"));
                this.luong.setText(rs.getString("luong"));
                this.luongmacdinh.setText(rs.getString("luong"));
                this.idnv.setText(rs.getString("IDNhanVien"));
            }
        }
        catch(Exception ex)
        {

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {

            if(jTextField1.getText().isEmpty())
            {
                ClearData1();
                jTable1.setModel(tableModel);

            }
            else
            {
                ClearData1();
                String ten = jTextField1.getText();
                String []colsName = { "Tài khoản","Mật khẩu","Họ tên","Giới tính","SĐT","Email","Chức vụ","Lương","ID Nhân Viên"};
                tableMode2.setColumnIdentifiers(colsName);
                jTable1.setModel(tableMode2);
                timkiem(ten);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row = this.jTable1.getSelectedRow();
            String ml =(this.jTable1.getModel().getValueAt(row,8)).toString();
            ResultSet rs = nv.ShowLoaiSP(ml);
            if(rs.next())
            {
                this.tk.setText(rs.getString("TKNhanVien"));
                this.mk.setText(rs.getString("MKNhanVien"));
                this.hoten.setText(rs.getString("HoTen"));
                this.gioitinh.setText(rs.getString("GioiTinh"));

                this.sdt.setText(rs.getString("Phone"));
                this.email.setText(rs.getString("Email"));
                this.chucvu.setText(rs.getString("Chucvu"));
                this.luong.setText(rs.getString("luong"));
                this.luongmacdinh.setText(rs.getString("luong"));
                this.idnv.setText(rs.getString("IDNhanVien"));
            }
        }
        catch(Exception ex)
        {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       frmQuanLyNhanVien f = new frmQuanLyNhanVien();
       f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btkluu;
    private javax.swing.JButton btluu;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chucvu;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gioitinh;
    private javax.swing.JTextField hoten;
    private javax.swing.JTextField idnv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField luong;
    private javax.swing.JTextField luongmacdinh;
    private javax.swing.JTextField mk;
    private javax.swing.JTextField ngaynghi;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField tienthuong;
    private javax.swing.JTextField tk;
    // End of variables declaration//GEN-END:variables
}
