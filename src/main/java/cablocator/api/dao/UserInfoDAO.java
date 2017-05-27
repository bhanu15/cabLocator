package cablocator.api.dao;

import java.util.List;

import cablocator.api.model.User;

public interface UserInfoDAO {

	public String getUserName(int id);
	public String getPassword(int id);
	public User getUserInfo(int id);
	public List<User> getUsers();
	public void update(User user);
}
