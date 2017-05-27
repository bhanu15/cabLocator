package cablocator.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cablocator.api.dao.RoleDAO;

@Service
public class RoleService {

	@Autowired
	RoleDAO roleDao;
	
	public String getDescription(String id){
		int userId = Integer.valueOf(id);
		return roleDao.getDescription(userId);
	}
}
