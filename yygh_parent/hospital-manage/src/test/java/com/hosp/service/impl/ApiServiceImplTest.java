package com.hosp.service.impl;

import com.hosp.mapper.HospitalSetMapper;
import com.hosp.mapper.ScheduleMapper;
import com.hosp.model.HospitalSet;
import com.hosp.service.ApiService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiServiceImplTest {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

    @Autowired
    private ApiService apiService;

    @Value("classpath:hospital.json")
    private Resource hospitalResource;

    @Test
    void test1() {
        System.out.println("hello,world");
    }

    @Test
    void getSignKey() {
        HospitalSet hospitalSet = hospitalSetMapper.selectById(1);
         String signKey = hospitalSet.getSignKey();
        System.out.println(signKey);
    }

    @Test
    void getHospital() {
    }

    @Test
    void saveHospital() {
    }

    @Test
    void findDepartment() {
    }

    @Test
    void saveDepartment() {
    }

    @Test
    void removeDepartment() {
    }

    @Test
    void findSchedule() {
    }

    @Test
    void saveSchedule() {
    }

    @Test
    void removeSchedule() {
    }

    @Test
    void saveBatchHospital() {
    }
}