package service;

import dao.RealEstateDAO;
import java.util.ArrayList;
import model.RealEstate;

public class RealEstateService {
    
    public RealEstateService() {
        
    }
    
    public ArrayList<RealEstate> selectAll(){
        return RealEstateDAO.getInstance().selectAll();         
    }
    
    public void insert(RealEstate real){
        RealEstateDAO.getInstance().insert(real);
    }
    
    public void update(RealEstate real) {
        RealEstateDAO.getInstance().update(real);
    }
    
    public void delete(RealEstate real){
        RealEstateDAO.getInstance().delete(real);
    }
    
    public RealEstate selectById(RealEstate real) {
        return RealEstateDAO.getInstance().selectById(real);
    }
}
