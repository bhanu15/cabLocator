package cablocator.api.dao;

import cablocator.api.model.User;

public interface AuthDAO {

	public User userInfo(int userId);
	public User findUserByUsername(String username);
}
