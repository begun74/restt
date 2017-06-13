package restt.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import restt.model.*;




@PropertySource("classpath:sql.properties")
@Repository("dao")
public class DaoImpl implements Dao {
	
	
    @Resource
    private Environment env;

	
	@Autowired
    private SessionFactory sessionFactory;
	
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	@Override
	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		User user = null;
		
		user = (User) getSession().createQuery("from User where name = :name").setParameter("name", username).uniqueResult();
		
		
		return user;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> getUsersList() {
		// TODO Auto-generated method stub
		return getSession().createSQLQuery("select * from tt_user order by name").addEntity(User.class).list();
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(user);
	}

	@Override
	public User findUserById(Long id) {
		// TODO Auto-generated method stub
		return (User) getSession().get(User.class, id);
	}


	

}
