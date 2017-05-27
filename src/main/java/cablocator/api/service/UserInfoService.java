package cablocator.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cablocator.api.dao.UserInfoDAO;
import cablocator.api.model.User;

@Service
public class UserInfoService {

	@Autowired
	UserInfoDAO userDAO;
	public String getUsername(String id){
		int userId = Integer.parseInt(id);
		return userDAO.getUserName(userId);
	}
	
	public User getUserInfo(String id){
		int userId = Integer.valueOf(id);
		User user = (User) userDAO.getUserInfo(userId);
		return user;
	}
	
	public List<User> getUserList(){
		return userDAO.getUsers();
	}
	
	public void update(User user){
		userDAO.update(user);
	}
}
