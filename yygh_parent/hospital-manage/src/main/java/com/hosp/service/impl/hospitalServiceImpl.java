package com.hosp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hosp.mapper.OrderInfoMapper;
import com.hosp.mapper.ScheduleMapper;
import com.hosp.model.Schedule;
import com.hosp.service.HospitalService;
import com.hosp.utils.HospitalException;
import com.hosp.utils.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author dsc
 * @date
 *
 */
@Service
@Slf4j
public class hospitalServiceImpl implements HospitalService {

    @Autowired
    private ScheduleMapper hospitalMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Map<String, Object> submitOrder(Map<String, Object> paramMap) {

        log.info(JSONObject.toJSONString(paramMap));
        String hoscode = (String) paramMap.get("hoscode");
        String depcode = (String)paramMap.get("depcode");
        String hosScheduleId = (String)paramMap.get("hosScheduleId");
        String reserveDate = (String)paramMap.get("reserveDate");
        String reserveTime = (String)paramMap.get("reserveTime");
        String amount = (String)paramMap.get("amount");

        Schedule schedule = this.getSchedule("1L");
        if (null == schedule){

            throw  new HospitalException(ResultCodeEnum.DATA_ERROR);
        }




        return null;
    }

    @Override
    public void updatePayStatus(Map<String, Object> paramMap) {

    }

    @Override
    public void updateCancelStatus(Map<String, Object> paramMap) {

    }
}
