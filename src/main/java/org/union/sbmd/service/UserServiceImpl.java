package org.union.sbmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.union.sbmd.dao.UserDao;
import org.union.sbmd.entity.User;
/**
 * service 层
 * @author 26110
 *
 */

/**
 * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: 
 * No qualifying bean of type 'org.union.sbmd.service.UserService'
 * @author 26110
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 将dao 注入到service
	 */
	@Autowired
	private UserDao userDao;
	
	/**
	 * 启用事务
	 */
	@Transactional
	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

}
