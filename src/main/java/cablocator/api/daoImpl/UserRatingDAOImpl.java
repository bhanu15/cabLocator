package cablocator.api.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cablocator.api.dao.UserRatingDAO;
import cablocator.api.model.UserRating;

@Repository
public class UserRatingDAOImpl implements UserRatingDAO {

	@PersistenceContext
	EntityManager entityManager;
	

	public void update(UserRating userRating) {
		entityManager.persist(userRating);
	}

	// this will give avg rating
	public int getUserRating(int userId) {
		List<UserRating> userRatings = (List<UserRating> )entityManager.createQuery("FROM UserRating").getResultList();
		int count=0;
		int sum=0;
		for(UserRating userRating : userRatings){
			if(userRating.getToUser()== userId){
				sum += userRating.getRating();
				count++;
			}
		}
		return sum/count;
	}
	
	public List<UserRating> getUserRatings(){
		List<UserRating> userRatings = (List<UserRating> )entityManager.createQuery("FROM UserRating").getResultList();
		return userRatings;
	}

}
