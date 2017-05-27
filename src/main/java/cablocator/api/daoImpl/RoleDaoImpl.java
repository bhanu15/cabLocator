package cablocator.api.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cablocator.api.dao.RoleDAO;
import cablocator.api.model.User;

@Repository
public class RoleDaoImpl implements RoleDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public String getDescription(int id) {
		User role = (User) entityManager.find(User.class, id);
		return role.getUsername();
	}

}
