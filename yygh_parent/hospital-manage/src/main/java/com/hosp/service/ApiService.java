package com.hosp.service;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.util.Map;

/**
 * @author info
 *
 */
public interface ApiService {
     /**获取医院码*/
    String getHoscode();

    /**
     * 唯一标识
     * @return
     */
    String getSignKey();

    /**
     * 获取医院
     * @return
     */
    JSONObject getHospital();

    /**
     * 保存医院数据
     * @param data
     * @return
     */
    boolean saveHospital(String data);

    /**
     * 寻找科室
     * @param pageNum
     * @param pageSize
     * @return
     */

    Map<String, Object> findDepartment(int pageNum, int pageSize);

    /**
     * 保存科室信息
     * @param data
     * @return
     */
    boolean saveDepartment(String data);

    /**
     * 删除科室信息
     * @param depcode
     * @return
     */
    boolean removeDepartment(String depcode);

    /**
     * 寻找时刻表
     * @param pageNum
     * @param pageSize
     * @return
     */
    Map<String, Object> findSchedule(int pageNum, int pageSize);


    /**
     * 保存值班表
     * @param data
     * @return
     */
    boolean saveSchedule(String data);

    /**
     * 删除值班表
     * @param hosScheduleId
     * @return
     */
    boolean removeSchedule(String hosScheduleId);

    /**
     * 批量保存医院
     * @throws IOException
     */

    void  saveBatchHospital() throws IOException;
}
