package restt.dao;



import java.math.BigInteger;
import java.util.List;

import restt.model.*;


public interface Dao {
	

	public User findUserById(Long id);
	public User findByUserName(String username);
	public List<User> getUsersList();
	public void createUser(User user);
	
	
	
}
