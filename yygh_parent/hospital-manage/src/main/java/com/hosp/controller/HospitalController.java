package com.hosp.controller;

import com.hosp.service.ApiService;
import com.hosp.service.HospitalService;
import com.hosp.utils.HospitalException;
import com.hosp.utils.HttpRequestHelper;
import com.hosp.utils.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author dc
 * 医院
 */
@Api(tags = "医院管理接口")
@RestController
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private ApiService apiService;

    /**
     * 预约下单
     *
     * @param request
     * @return
     */
    @PostMapping("/order/submitOrder")
    public Result AgreeAccountLendProject(HttpServletRequest request, HttpServletResponse response) {
        try {
            Map<String, Object> paramMap = HttpRequestHelper.switchMap(request.getParameterMap());
//			if(!HttpRequestHelper.isSignEquals(paramMap, apiService.getSignKey())) {
//				throw new YyghException(ResultCodeEnum.SIGN_ERROR);
//			}

            Map<String, Object> resultMap = hospitalService.submitOrder(paramMap);
            return Result.ok(resultMap);
        } catch (HospitalException e) {
            return Result.fail().message(e.getMessage());
        }
    }

}
