package restt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import restt.dao.Dao;
import restt.dao.DaoImpl;
import restt.model.User;




@Service("resttService")
@Transactional()
public class ResttServiceImpl implements Dao {

	
	@Autowired
	private DaoImpl dao;

	
	
	@Override
	public User findByUserName(String username) {
		// findByUserName
		
		return dao.findByUserName(username);
		
	}

	@Override
	public List<User> getUsersList() {
		// getUsersList
		
		return dao.getUsersList();
		
	}

}
