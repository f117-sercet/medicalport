package com.dsc.hosp.service;

import com.dsc.hospital.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 段世超
 * 数据字典service
 */
public interface DictService {
    /**
     * 根据数据id查询子数据列表
     * @param id
     * @return
     */
    List<Dict> findChildData(Long id);

    /**
     * 导出数据字典
     * @param response
     */
    void exportDictData(HttpServletResponse response);

    /**
     * 导入数据字典
     * @param file
     */
    void importDictData(MultipartFile file);

    /**
     * 根据dictcode和value查询
     * @param dictCode
     * @param value
     * @return
     */
    String getDictName(String dictCode, String value);

    /**
     * 根据dictCode获取下级节点
     * @param dictCode
     * @return
     */
    List<Dict> findByDictCode(String dictCode);
}


