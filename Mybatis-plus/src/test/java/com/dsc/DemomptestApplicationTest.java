package com.dsc;

import com.dsc.demo.entity.User;
import com.dsc.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author:estic
 * @Date: 2021/9/17 15:24
 */
@SpringBootTest
class DemomptestApplicationTest {

    @Autowired
    private UserMapper userMapper;

    // 查询所有
    @Test
    public void findAll() {

        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

     //修改
    @Test
    public void testadd() {

        User user = new User();
        user.setName("zhuli");
        user.setAge(20);
        user.setEmail("1243@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    //多个id批量查询
    @Test
    public void testSelect1() {
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }


}
