package service;

import dao.UserDAO;
import model.User;

public class UserService {
    
    public UserService() {
        
    }
    
    public User selectById(User user) {
        return UserDAO.getInstance().selectById(user);
    }
}
