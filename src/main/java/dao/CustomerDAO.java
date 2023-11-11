package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

public class CustomerDAO implements DAOInterface<Customer>{

    public static CustomerDAO getInstance() {
        return new CustomerDAO();
    }
    
    @Override
    public int insert(Customer t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "INSERT INTO Customer (cid, name, invested, property, phone) " +
                            "VALUES (?, ?, ?, ?, ?)";            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getCid());
            st.setString(2, t.getName());
            st.setDouble(3, t.getInvested());
            st.setInt(4, t.getProperty());
            st.setString(5, t.getPhone());
            
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
    public int update(Customer t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "UPDATE Customer SET "
                            + "cid = ?" 
                            + ", name = ?"
                            + ", invested = ?"
                            + ", property = ?"
                            + ", phone = ?"
                            + " WHERE cid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getCid());
            st.setString(2, t.getName());
            st.setDouble(3, t.getInvested());
            st.setInt(4, t.getProperty());
            st.setString(5, t.getPhone());
            st.setInt(6, t.getCid());
            
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
    public int delete(Customer t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "DELETE FROM Customer"
                            + " WHERE cid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getCid());
        
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
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> result = new ArrayList<Customer>();
        try {
            Connection con = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM Customer";
            PreparedStatement st = con.prepareStatement(sql);        
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                long invested = rs.getLong("invested");
                int property = rs.getInt("property");
                String phone = rs.getString("phone");
                
                Customer customer = new Customer(cid, name, invested, property, phone);
                result.add(customer);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public Customer selectById(Customer t) {
        Customer result = null;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Customer WHERE cid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getCid());
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                long invested = rs.getLong("invested");
                int property = rs.getInt("property");
                String phone = rs.getString("phone");
                
                result = new Customer(cid, name, invested, property, phone);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Customer> selectByCondition(String condition) {
        ArrayList<Customer> result = new ArrayList<Customer>();
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Customer WHERE " + condition;
            PreparedStatement st = con.prepareStatement(sql);
                    
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                long invested = rs.getLong("invested");
                int property = rs.getInt("property");
                String phone = rs.getString("phone");
                
                Customer customer = new Customer(cid, name, invested, property, phone);
                result.add(customer);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
