package com.dsc.hosp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dsc.hosp.mapper.DictMapper;
import com.dsc.hosp.service.DictService;
import com.dsc.hospital.model.cmn.Dict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author info
 * 数据字典实现
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper,Dict> implements DictService {

    /**
     *根据数据id查询子数据列表
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "dict",keyGenerator = "keyGenerator")
    public List<Dict> findChildData(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",id);
        List<Dict> dictList = baseMapper.selectList(wrapper);
        //向list集合每个dict对象中设置hasChild
        for (Dict dict:dictList) {
            Long dictId=dict.getId();
            boolean isChild= this.isChildren(dict);
            dict.setHasChildren(isChild);

        }
        return dictList;
    }

    /**
     * 判断id下面是否有子节点
     * @param id
     * @return
     */
    private boolean isChildren(Dict id) {

        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id",id);
        Integer count = baseMapper.selectCount(wrapper);
        // 0>0    1>0
        return count>0;
    }

    @Override
    public void exportDictData(HttpServletResponse response) {

    }

    @Override
    public void importDictData(MultipartFile file) {

    }

    @Override
    public String getDictName(String dictCode, String value) {
        return null;
    }

    @Override
    public List<Dict> findByDictCode(String dictCode) {
        return null;
    }
}
