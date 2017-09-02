package com.frankstyle;

import com.frankstyle.bean.User;
import com.frankstyle.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWithMybatisApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {
		assertThat(null != userMapper);
		User user =userMapper.selectByUsername("frank");
		assertThat(null != user);
		assertThat("520123".equals(user.getPassword()));
		System.out.println(user.getUsername());

	}

}
