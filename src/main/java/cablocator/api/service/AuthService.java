package cablocator.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cablocator.api.dao.AuthDAO;
import cablocator.api.model.User;

@Service
public class AuthService {

	@Autowired
	AuthDAO authDao;

	private boolean userExists(User user) {
		return null != authDao.findUserByUsername(user.getUsername());
	}
	
	public boolean authenticate(User user){
		if(!userExists(user)){
			return false;
		}
		User userFromDB = authDao.findUserByUsername(user.getUsername());
		return userFromDB.equals(user);
	}
}
