package org.union.sbmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
/**
 * 没有添加
 * @EntityScan("org.union.sbmd.entity")  //扫描实体所在的包
 * @MapperScan("org.union.sbmd.dao") //扫描dao
 * Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: 
 * No qualifying bean of type 'org.union.sbmd.dao.UserDao' available: 
 * expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: 
 * {@org.springframework.beans.factory.annotation.Autowired(required=true)}
 * @author 26110
 *
 */
@EntityScan("org.union.sbmd.entity")  //扫描实体所在的包
@MapperScan("org.union.sbmd.dao") //扫描dao
public class SbmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmdApplication.class, args);
	}

}
