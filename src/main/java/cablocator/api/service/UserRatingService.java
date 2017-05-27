package cablocator.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cablocator.api.dao.UserInfoDAO;
import cablocator.api.dao.UserRatingDAO;
import cablocator.api.model.User;
import cablocator.api.model.UserRating;

@Service
public class UserRatingService {

	@Autowired
	UserRatingDAO userRatingDAO;
	
	@Autowired
	UserInfoDAO user;
	
	public int getUserRating(int id){
		User userFromDB = user.getUserInfo(id);
		if(userFromDB == null){
			return -1;
		}
		
		return userRatingDAO.getUserRating(id);
	}
	
	@Transactional
	public int postRating(UserRating userRating){
		int toUserId = userRating.getToUser();
		int fromUserId = userRating.getFromUser();
		if(user.getUserInfo(toUserId) == null ||  user.getUserInfo(toUserId) == null )
			return -1;
		
		userRatingDAO.update(userRating);
		return 0;
	}
	
	public List<UserRating> getUserRatings(){
		
		
		return userRatingDAO.getUserRatings();
	}
}
