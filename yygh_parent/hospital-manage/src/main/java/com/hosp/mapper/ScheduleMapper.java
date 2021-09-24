package com.hosp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hosp.model.Schedule;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author info
 * 时刻表
 */
@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {

}