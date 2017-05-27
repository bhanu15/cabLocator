package cablocator.api.dao;

import java.util.List;

import cablocator.api.model.UserRating;

public interface UserRatingDAO {

	public void update(UserRating rating );
	public int getUserRating(int userId);
	public List<UserRating> getUserRatings();
}
