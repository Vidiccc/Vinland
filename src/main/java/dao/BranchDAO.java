package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Branch;

public class BranchDAO implements DAOInterface<Branch>{

    public static BranchDAO getInstance() {
        return new BranchDAO();
    }
    
    @Override
    public int insert(Branch t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "INSERT INTO Branch (bid, manager, phone, address) " +
                            "VALUES (?, ?, ?, ?)";            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getBid());
            st.setString(2, t.getManager());
            st.setString(3, t.getPhone());
            st.setString(4, t.getAddress());
        
            
            System.out.println(st);
            result = st.executeUpdate();
            
            System.out.println("Da thuc thi: " + st);
            System.out.println("Co: " + result + " dong bi thay doi!");
                    
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }

    @Override
    public int update(Branch t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "UPDATE Branch SET "
                            + "bid = ?" 
                            + ", manager = ?"
                            + ", phone = ?"
                            + ", address = ?"
                            + " WHERE bid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getBid());
            st.setString(2, t.getManager());
            st.setString(3, t.getPhone());
            st.setString(4, t.getAddress());
            st.setInt(5, t.getBid());
            
            System.out.println(st);
            result = st.executeUpdate();
            
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co: " + result + " dong bi thay doi!");
                    
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }

    @Override
    public int delete(Branch t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "DELETE FROM Branch"
                            + " WHERE bid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getBid());
        
            
            System.out.println(st);
            result = st.executeUpdate();
            
            System.out.println("Da thuc thi: " + sql);
            System.out.println("Co: " + result + " dong bi thay doi!");
                    
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return 0;
    }

    @Override
    public ArrayList<Branch> selectAll() {
        ArrayList<Branch> result = new ArrayList<Branch>();
        try {
            Connection con = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM Branch";
            PreparedStatement st = con.prepareStatement(sql);        
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int bid = rs.getInt("bid");
                String manager = rs.getString("manager");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                Branch branch = new Branch(bid, manager, phone, address);
                result.add(branch);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public Branch selectById(Branch t) {
        Branch result = null;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Branch WHERE bid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getBid());
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int bid = rs.getInt("bid");
                String manager = rs.getString("manager");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                result = new Branch(bid, manager, phone, address);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public ArrayList<Branch> selectByCondition(String condition) {
        ArrayList<Branch> result = new ArrayList<Branch>();
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Branch WHERE " + condition;
            PreparedStatement st = con.prepareStatement(sql);
                    
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int bid = rs.getInt("bid");
                String manager = rs.getString("manager");
                String phone = rs.getString("phone");
                String address = rs.getString("address");
                
                Branch branch = new Branch(bid, manager, phone, address);
                result.add(branch);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
}
