package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.RealEstate;
import model.Transaction;

public class RealEstateDAO implements DAOInterface<RealEstate>{

    public static RealEstateDAO getInstance() {
        return new RealEstateDAO();
    }
    
    @Override
    public int insert(RealEstate t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "INSERT INTO Real_Estate (rid, price, area, status, owner, promotion, bid) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?)";            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getRid());
            st.setDouble(2, t.getPrice());
            st.setDouble(3, t.getArea());
            st.setString(4, t.getStatus());
            st.setString(5, t.getOwner());
            st.setDouble(6, t.getPromotion());
            st.setInt(7, t.getBid());
            
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
    public int update(RealEstate t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "UPDATE Real_Estate SET "
                            + "rid = ?" 
                            + ", price = ?"
                            + ", area = ?"
                            + ", status = ?"
                            + ", owner = ?"
                            + ", promotion = ?"
                            + ", bid = ?"                    
                            + " WHERE rid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getRid());
            st.setDouble(2, t.getPrice());
            st.setDouble(3, t.getArea());
            st.setString(4, t.getStatus());
            st.setString(5, t.getOwner());
            st.setDouble(6, t.getPromotion());
            st.setInt(7, t.getBid());
            st.setInt(8, t.getRid());
            
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
    public int delete(RealEstate t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "DELETE FROM Real_Estate"
                            + " WHERE rid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getRid());
        
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
    public ArrayList<RealEstate> selectAll() {
        ArrayList<RealEstate> result = new ArrayList<RealEstate>();
        try {
            Connection con = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM Real_Estate";
            PreparedStatement st = con.prepareStatement(sql);        
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int rid = rs.getInt("rid");
                long price = rs.getLong("price");
                double area = rs.getDouble("area");
                String status = rs.getString("status");
                String owner = rs.getString("owner");
                double promotion = rs.getDouble("promotion");
                int bid = rs.getInt("bid");
                
                RealEstate realEstate = new RealEstate(rid, price, area, status, owner, promotion, bid);
                result.add(realEstate);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public RealEstate selectById(RealEstate t) {
        RealEstate result = null;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Real_Estate WHERE rid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getRid());
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int rid = rs.getInt("rid");
                long price = rs.getLong("price");
                double area = rs.getDouble("area");
                String status = rs.getString("status");
                String owner = rs.getString("owner");
                double promotion = rs.getDouble("promotion");
                int bid = rs.getInt("bid");
                
                result = new RealEstate(rid, price, area, status, owner, promotion, bid);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<RealEstate> selectByCondition(String condition) {
        ArrayList<RealEstate> result = new ArrayList<RealEstate>();
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Real_Estate WHERE " + condition;
            PreparedStatement st = con.prepareStatement(sql);
                    
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int rid = rs.getInt("rid");
                long price = rs.getLong("price");
                double area = rs.getDouble("area");
                String status = rs.getString("status");
                String owner = rs.getString("owner");
                double promotion = rs.getDouble("promotion");
                int bid = rs.getInt("bid");
                
                RealEstate realEstate = new RealEstate(rid, price, area, status, owner, promotion, bid);
                result.add(realEstate);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
