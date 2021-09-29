package com.hosp.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSONObject;
import com.hosp.mapper.HospitalSetMapper;
import com.hosp.mapper.ScheduleMapper;
import com.hosp.model.HospitalSet;
import com.hosp.service.ApiService;

import com.hosp.utils.HttpRequestHelper;
import com.hosp.utils.MD5;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.util.Map;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author dsc
 * Ap是实现类
 */
@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

    @Autowired
    private ApiService apiService;

    @Value("classpath:hospital.json")
    private Resource hospitalResource;


    @Override
    public String getHoscode() {

        HospitalSet hospitalSet = hospitalSetMapper.selectById(1);
        String hoscode = hospitalSet.getHoscode();
     System.out.println("查找出的医院码为"+hoscode);
        return hoscode;
    }

    @Override
    public String getSignKey() {

        HospitalSet hospitalSet = hospitalSetMapper.selectById(1);
        return hospitalSet.getSignKey();

    }
    private String getApiUrl() {
        HospitalSet hospitalSet = hospitalSetMapper.selectById(1);
        return hospitalSet.getApiUrl();
    }

    @Override
    public JSONObject getHospital() {

        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("hoscode",this.getHoscode());
        paramMap.put("timestamp", HttpRequestHelper.getTimestamp());
        paramMap.put("sign", MD5.encrypt(this.getSignKey()));
        JSONObject response = HttpRequestHelper.sendRequest(paramMap,this.getApiUrl());
        System.out.println(response.toJSONString());
        if (null !=response &&200 ==response.getIntValue("code")){
            JSONObject jsonObject = response.getJSONObject("data");
            return jsonObject;

        }

        return null;
    }

    @Override
    public boolean saveHospital(String data) {

        JSONObject jsonObject = JSONObject.parseObject(data);
        Map<String,Object> paramMap = new HashMap<>();


        return false;
    }

    @Override
    public Map<String, Object> findDepartment(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean saveDepartment(String data) {
        return false;
    }

    @Override
    public boolean removeDepartment(String depcode) {
        return false;
    }

    @Override
    public Map<String, Object> findSchedule(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean saveSchedule(String data) {
        return false;
    }

    @Override
    public boolean removeSchedule(String hosScheduleId) {
        return false;
    }

    @Override
    public void saveBatchHospital() throws IOException {

    }
}
