package com.dsc.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dsc.demo.entity.User;
import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @Author:estic
 * @Date: 2021/9/16 18:08
 */
@Repository
public interface UserMapper extends BaseMapper<User> {


}
