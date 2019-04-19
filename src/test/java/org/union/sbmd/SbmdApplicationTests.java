package org.union.sbmd;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.union.sbmd.entity.User;
import org.union.sbmd.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmdApplicationTests {

	
	@Resource
	private UserService userService;
	@Test
	public void contextLoads() {
		System.out.println();
		User user = new User();
		user.setName("令狐冲");
		userService.save(user);
		System.out.println();
	}
	@Test
	public void getByName() {
		List<User>list = userService.getUsers();
		list.stream().map(u->u.getName()).forEach(System.out::println);
		list.stream().map(u->u.getPhoneNumber()).forEach(System.out::println);
	}

}
