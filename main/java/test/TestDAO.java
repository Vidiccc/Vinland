package test;

import dao.BranchDAO;
import dao.CustomerDAO;
import dao.RealEstateDAO;
import dao.TransactionDAO;
import dao.UserDAO;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Branch;
import model.Customer;
import model.RealEstate;
import model.Transaction;
import model.User;

public class TestDAO {
    public static void main(String[] args) {
//        double d = 1000000000.1;
//        long l = 1000000000;
//        System.out.println(d);
//        System.out.println(l);
//        //Test Insert
//        Branch br1 = new Branch(11, "Vinh", "0932661926", "abcde");
//        Branch br2 = new Branch(1, "Linh", "12345", "a");
////        Branch br3 = new Branch();
////        
//        BranchDAO.getInstance().insert(br1);
//        
        //Test update
//        BranchDAO.getInstance().update(br1);

        //Test delete
//        BranchDAO.getInstance().delete(br2);
        
        //Test SelectAll
//        ArrayList<Branch> list = BranchDAO.getInstance().selectAll();
//        for (Branch br : list){
//            System.out.println(br);
//        }
//        
//        Branch data = BranchDAO.getInstance().selectById(br1);
//        System.out.println(data);
//
//        ArrayList<Branch> list2 = BranchDAO.getInstance().selectByCondition("bid > 3");
//        for (Branch br : list2){
//            System.out.println(br);
//        }
        
        //Test Customer
//        Customer cus1 = new Customer(1, "Vi", 2000000000, 4, "phone2");
//        Customer cus2 = new Customer(56, "Vi", 1500000000, 4, "phone2");
//        CustomerDAO.getInstance().insert(cus2);
////        CustomerDAO.getInstance().update(cus1);
////        CustomerDAO.getInstance().delete(cus1);
//        
//        ArrayList<Customer> list = CustomerDAO.getInstance().selectAll();
//        for (Customer cus : list){
//            System.out.println(cus);
//        }
////        
//        Customer data = CustomerDAO.getInstance().selectById(cus2);
//        System.out.println(data);
//
//        ArrayList<Customer> list2 = CustomerDAO.getInstance().selectByCondition("invested > 1000000000");
//        for (Customer br : list2){
//            System.out.println(br);
//        }
        
        
        //Test Transaction
//        Date date1 = Date.valueOf("2021-12-27");
//        System.out.println(date1);
//        
//        Date date2 = Date.valueOf("2022-12-15");
//        System.out.println(date2);
//        
//        Transaction tran1 = new Transaction(2, 10000, date1, 1, 1);
//        Transaction tran2 = new Transaction(3, 15000, date2, 1, 1);
////        TransactionDAO.getInstance().insert(tran2);
//        TransactionDAO.getInstance().update(tran1);
//        TransactionDAO.getInstance().delete(tran2);
//        
//        ArrayList<Transaction> list = TransactionDAO.getInstance().selectAll();
//        for (Transaction cus : list){
//            System.out.println(cus);
//        }
//        
//        Transaction data = TransactionDAO.getInstance().selectById(tran1);
//        System.out.println(data);
//
//        ArrayList<Transaction> list2 = TransactionDAO.getInstance().selectByCondition("amount > 15000");
//        for (Transaction br : list2){
//            System.out.println(br);
//        }
        
        //Test RealEstate
//        RealEstate cus1 = new RealEstate(1, 100, 20, "Dang ban", "Chua co", 10, 2);
//        RealEstate cus2 = new RealEstate(2, 200, 30, "Da ban", "Khang Vi", 10, 2);
//        RealEstateDAO.getInstance().insert(cus2);
//        RealEstateDAO.getInstance().update(cus1);
////        RealEstateDAO.getInstance().delete(cus1);
//        
//        ArrayList<RealEstate> list = RealEstateDAO.getInstance().selectAll();
//        for (RealEstate cus : list){
//            System.out.println(cus);
//        }
//        
//        RealEstate data = RealEstateDAO.getInstance().selectById(cus2);
//        System.out.println(data);
//
//        ArrayList<RealEstate> list2 = RealEstateDAO.getInstance().selectByCondition("status = 'Da ban'");
//        for (RealEstate br : list2){
//            System.out.println(br);
//        }
        

        //Test User
//        User u1 = new User("admin", "admin");
//
//        User data = UserDAO.getInstance().selectById(u1);
//        System.out.println(data);
    }
}
