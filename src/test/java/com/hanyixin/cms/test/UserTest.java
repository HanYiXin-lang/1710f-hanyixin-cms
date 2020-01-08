package com.hanyixin.cms.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hanyixin.cms.dao.CollectDao;
import com.hanyixin.cms.pojo.Collect;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTest {

	@Autowired
	private CollectDao collectDao;
	
	@Test
	public void test() {
		Collect collect = new Collect();
		List<Collect> userList = collectDao.select(collect);
		System.out.println(userList);
	}
	
	@Test
	public void add() {
		Collect collect = new Collect();
		collect.setText("hhhhhh");
		collectDao.insert(collect);
	}
}
