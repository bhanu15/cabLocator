package cablocator.api.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cablocator.api.dao.AuthDAO;
import cablocator.api.model.User;

@Repository
public class AuthDAOImpl implements AuthDAO{

	@PersistenceContext
	EntityManager entityManager;
	
	public User userInfo(int userId){
		User user = (User)entityManager.find(User.class, userId);
		return user;
	}
	public User findUserById(int userId){
		User user = (User)entityManager.find(User.class, userId);
		return user;
	}

	public User findUserByUsername(String username){
		String query = "FROM User";
		List<User> users = (List<User> )entityManager.createQuery(query).getResultList();
		for(User user: users){
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
}
