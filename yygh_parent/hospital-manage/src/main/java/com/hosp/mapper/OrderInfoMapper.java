package com.hosp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hosp.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author info
 * 订单
 */
@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
}
