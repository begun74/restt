package restt.dao;



import java.util.List;

import restt.model.*;


public interface Dao {
	

	
	public User findByUserName(String username);
	public List<User> getUsersList();
	
	
	
	
}
