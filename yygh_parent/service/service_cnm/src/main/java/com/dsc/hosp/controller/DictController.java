package com.dsc.hosp.controller;

import com.dsc.hosp.result.Result;
import com.dsc.hosp.service.DictService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author dsc
 * 数据字典控制器
 */
@Api(description = "数据字典接口")
@RestController
@RequestMapping("/admin/cmn/dict")
//@CrossOrigin
public class DictController {

    @Autowired
    private DictService dictService;

    //导入数据字典
    @PostMapping("importData")
    public Result importDictDataa(MultipartFile file){
        dictService.importDictData(file);
        return Result.ok();
    }
    //导出数据字典接口
    @GetMapping("exportData")
    public void exportDict(HttpServletResponse response) {
        dictService.exportDictData(response);
    }



}
