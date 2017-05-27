package cablocator.api.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import cablocator.api.dao.UserInfoDAO;
import cablocator.api.model.User;

@Repository
public class UserDAOImpl implements UserInfoDAO{

	@PersistenceContext
	private EntityManager entityManager;

	public String getUserName(int id) {
		User user =(User) entityManager.find(User.class, id);
		return user.getUsername();
	}

	public String getPassword(int id) {
		// TODO Auto-generated method stub
		return "Not implemented";
	}
	
	public User getUserInfo(int id){
		User user = (User)entityManager.find(User.class, id);
		return user;
	}
	
	public List<User> getUsers(){
		String query = "FROM User";
		List<User> users = entityManager.createQuery(query).getResultList();
		return users;
	}
	
	@Transactional
	public void update(User user){
		entityManager.persist(user);
	}
}
