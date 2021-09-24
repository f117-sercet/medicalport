package com.hosp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hosp.model.HospitalSet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author info
 * 医院设置
 * @
 */
@Mapper
public interface HospitalSetMapper extends BaseMapper<HospitalSet>  {
}
