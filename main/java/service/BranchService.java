package service;

import dao.BranchDAO;
import java.util.ArrayList;
import model.Branch;

public class BranchService {

    public BranchService() {
        
    }
    
    public ArrayList<Branch> selectAll(){
        return BranchDAO.getInstance().selectAll();         
    }
    
    public void insert(Branch br){
        BranchDAO.getInstance().insert(br);
    }
    
    public void update(Branch br) {
        BranchDAO.getInstance().update(br);
    }
    
    public void delete(Branch br){
        BranchDAO.getInstance().delete(br);
    }
    
    public Branch selectById(Branch br) {
        return BranchDAO.getInstance().selectById(br);
    }
    
    
}
