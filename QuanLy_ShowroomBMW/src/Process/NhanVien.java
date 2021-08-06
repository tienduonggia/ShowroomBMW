/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import Database.Connect;
/**
 *
 * @author howl1
 */
public class NhanVien {
    public Connect cn = new Connect();
    //Truy van tat ca du lieu trong Table LoaiSP

    public ResultSet ShowLoaiSP() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM NhanVien";
        return cn.LoadData(sql);
    }
////Truy van cac dong du lieu trong Table LoaiSP theo Maloai

    public ResultSet ShowLoaiSP(String idnv) throws SQLException {
        String sql = "  SELECT * FROM NhanVien where IDNhanVien='" + idnv + "'  ";
        return cn.LoadData(sql);
    }
    
    public ResultSet qlns(String idnv) throws SQLException {
        String sql = "  SELECT * FROM QuanLyNhanSu where IDNhanVien='" + idnv + "'  ";
        return cn.LoadData(sql);
    }
    
//Theo moi 1 dong du lieu vao table LoaiSP

    public void InsertData(String idnv,String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong) throws SQLException {
        String sql = "INSERT INTO NhanVien values('" + idnv + "','" + tk + "',N'" + mk + "',N'" + ten + "', N'" + gioitinh + "','" + sdt + "',N'" + email + "',N'" + chucvu + "','" + luong + "')";  
        cn.UpdateData(sql);
    }
    
    public void InsertDataqlk(String idnv,String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong) throws SQLException {
        String sql = "INSERT INTO QuanLyKho values('" + idnv + "','" + tk + "',N'" + mk + "',N'" + ten + "', N'" + gioitinh + "','" + sdt + "',N'" + email + "',N'" + chucvu + "','" + luong + "')";  
        cn.UpdateData(sql);
    }
    
    public void InsertDataqlns(String idnv,String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong) throws SQLException {
        String sql = "INSERT INTO QuanLyNhanSu values('" + idnv + "','" + tk + "',N'" + mk + "',N'" + ten + "', N'" + gioitinh + "','" + sdt + "',N'" + email + "',N'" + chucvu + "','" + luong + "')";  
        cn.UpdateData(sql);
    }
    
//Dieu chinh 1 dong du lieu vao table LoaiSP

    public void EditData(String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong,String idnv ) throws SQLException {
        String sql = "Update NhanVien set TKNhanVien = '"+ tk +"',MKNhanVien = '"+ mk +"',HoTen = N'"+ ten +"',GioiTinh = N'"+ gioitinh +"',Phone = '"+ sdt +"',Email = '"+ email+"',ChucVu = N'"+chucvu+"',luong = '"+luong
                + "' where IDNhanVien='" + idnv + "'";

        cn.UpdateData(sql);
    }
    
    public void EditDataqlk(String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong,String idnv ) throws SQLException {
        String sql = "Update QuanLyKho set TKNhanVien = '"+ tk +"',MKNhanVien = '"+ mk +"',HoTen = N'"+ ten +"',GioiTinh = N'"+ gioitinh +"',Phone = '"+ sdt +"',Email = '"+ email+"',ChucVu = N'"+chucvu+"',luong = '"+luong
                + "' where IDNhanVien='" + idnv + "'";

        cn.UpdateData(sql);
    }
    
     public void EditDataqlns(String tk, String mk ,String ten ,String gioitinh ,String sdt ,String email ,String chucvu ,String luong,String idnv ) throws SQLException {
        String sql = "Update QuanLyNhanSu set TKNhanVien = '"+ tk +"',MKNhanVien = '"+ mk +"',HoTen = N'"+ ten +"',GioiTinh = N'"+ gioitinh +"',Phone = '"+ sdt +"',Email = '"+ email+"',ChucVu = N'"+chucvu+"',luong = '"+luong
                + "' where IDNhanVien='" + idnv + "'";

        cn.UpdateData(sql);
    }
    
//Xoa 1 dong du lieu vao table LoaiSP

    public void DeleteData(String mnv) throws SQLException {
        String sql = "Delete from NhanVien where IDNhanVien='" + mnv + "'";
        cn.UpdateData(sql);
    }
    
    public void DeleteDataqlk(String mnv) throws SQLException {
        String sql = "Delete from QuanLyKho where IDNhanVien='" + mnv + "'";
        cn.UpdateData(sql);
    }
    
    public void DeleteDataqlns(String mnv) throws SQLException {
        String sql = "Delete from QuanLyNhanSu where IDNhanVien='" + mnv + "'";
        cn.UpdateData(sql);
    }
    
    
    public ResultSet timkiem(String ten) throws SQLException
    {
       
        String sql = "Select * from NhanVien where TKNhanVien like '%"+ten+"%'";
  
        return cn.LoadData(sql);
    }
    
    public ResultSet timkiemqlk(String ten) throws SQLException
    {
       
        String sql = "Select * from QuanLyKho where TKNhanVien like '%"+ten+"%'";
  
        return cn.LoadData(sql);
    }
    
     public ResultSet timkiemqlns(String ten) throws SQLException
    {
       
        String sql = "Select * from QuanLyNhanSu where TKNhanVien like '%"+ten+"%'";
  
        return cn.LoadData(sql);
    }
    
    
    
    public ResultSet dataqlkho() throws SQLException
    {
       
        String sql = "Select * from QuanLyKho";
        return cn.LoadData(sql);
    }
    
    public ResultSet qlns() throws SQLException
    {
       
        String sql = "Select * from QuanLyNhanSu";
        return cn.LoadData(sql);
    }
    
    
     public ResultSet dataqlkho(String idnv) throws SQLException {
        String sql = "  SELECT * FROM QuanLyKho where IDNhanVien='" + idnv + "'  ";
        return cn.LoadData(sql);
    }
}
