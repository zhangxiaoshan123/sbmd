package org.union.sbmd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.union.sbmd.entity.User;

/**
 * 先不添加@Repository
 * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: 
 * No qualifying bean of type 'org.union.sbmd.dao.UserDao' available: 
 * expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: 
 * {@org.springframework.beans.factory.annotation.Autowired(required=true)}
 * @author 26110
 *
 */
@Repository
public interface UserDao {
	
    /*xml方式*/
    User findByName(String userName);
    
    /*注解方式*/
    @Select("select * from users")
    List<User> findAll();
    
    /**
     * 表名 对象的属性名称
     * @param user
     */
    @Insert("insert into users (name) values (#{name})")
    void save(User user);
    
}
