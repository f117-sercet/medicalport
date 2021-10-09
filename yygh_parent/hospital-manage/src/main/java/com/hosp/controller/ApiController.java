package com.hosp.controller;

import com.hosp.mapper.HospitalSetMapper;
import com.hosp.service.ApiService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dsc
 * APIcontroller
 */
@Api(tags = "医院管理接口")
@Controller
@RequestMapping
public class ApiController extends BaseController {

    @Autowired
    private ApiService apiService;

    @Autowired
    private HospitalSetMapper hospitalSetMapper;


}
