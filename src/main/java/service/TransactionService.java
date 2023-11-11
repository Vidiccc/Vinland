package service;

import dao.TransactionDAO;
import java.util.ArrayList;
import model.Transaction;

public class TransactionService {
    
    public TransactionService() {
        
    }
    
    public ArrayList<Transaction> selectAll(){
        return TransactionDAO.getInstance().selectAll();         
    }
    
    public void insert(Transaction tran){
        TransactionDAO.getInstance().insert(tran);
    }
    
    public void update(Transaction tran) {
        TransactionDAO.getInstance().update(tran);
    }
    
    public void delete(Transaction tran){
        TransactionDAO.getInstance().delete(tran);
    }
    
    public Transaction selectById(Transaction tran) {
        return TransactionDAO.getInstance().selectById(tran);
    }
}
