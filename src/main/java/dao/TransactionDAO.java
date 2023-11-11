package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Transaction;

public class TransactionDAO implements DAOInterface<Transaction>{
    
    public static TransactionDAO getInstance() {
        return new TransactionDAO();
    }

    @Override
    public int insert(Transaction t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "INSERT INTO Transaction (tid, amount, date, cid, rid) " +
                            "VALUES (?, ?, ?, ?, ?)";            
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getTid());
            st.setDouble(2, t.getAmount());
            st.setDate(3, t.getDate());
            st.setInt(4, t.getCid());
            st.setInt(5, t.getRid());
                    
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
    public int update(Transaction t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "UPDATE Transaction SET "
                            + "tid = ?" 
                            + ", amount = ?"
                            + ", date = ?"
                            + ", cid = ?"
                            + ", rid = ?"
                            + " WHERE tid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getTid());
            st.setDouble(2, t.getAmount());
            st.setDate(3, t.getDate());
            st.setInt(4, t.getCid());
            st.setInt(5, t.getRid());
            st.setInt(6, t.getTid());
            
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
    public int delete(Transaction t) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "DELETE FROM Transaction"
                            + " WHERE tid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getTid());
        
            
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
    public ArrayList<Transaction> selectAll() {
        ArrayList<Transaction> result = new ArrayList<Transaction>();
        try {
            Connection con = JDBCUtil.getConnection();
            
            String sql = "SELECT * FROM Transaction";
            PreparedStatement st = con.prepareStatement(sql);        
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int tid = rs.getInt("tid");
                Double amount = rs.getDouble("amount");
                Date date = rs.getDate("date");
                int cid = rs.getInt("cid");
                int rid = rs.getInt("rid");
                
                Transaction transaction = new Transaction(tid, amount, date, cid, rid);
                result.add(transaction);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public Transaction selectById(Transaction t) {
        Transaction result = null;
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Transaction WHERE tid = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, t.getTid());
            
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int tid = rs.getInt("tid");
                Double amount = rs.getDouble("amount");
                Date date = rs.getDate("date");
                int cid = rs.getInt("cid");
                int rid = rs.getInt("rid");
                
                result = new Transaction(tid, amount, date, cid, rid);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public ArrayList<Transaction> selectByCondition(String condition) {
        ArrayList<Transaction> result = new ArrayList<Transaction>();
        try {
            Connection con = JDBCUtil.getConnection();
        
            String sql = "SELECT * FROM Transaction WHERE " + condition;
            PreparedStatement st = con.prepareStatement(sql);
                    
            System.out.println(st);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                int tid = rs.getInt("tid");
                Double amount = rs.getDouble("amount");
                Date date = rs.getDate("date");
                int cid = rs.getInt("cid");
                int rid = rs.getInt("rid");
                
                Transaction transaction = new Transaction(tid, amount, date, cid, rid);
                result.add(transaction);
            }
                   
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
}
