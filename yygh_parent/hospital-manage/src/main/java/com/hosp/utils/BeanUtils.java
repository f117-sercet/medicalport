package com.hosp.utils;

import org.springframework.beans.BeansException;
import org.springframework.util.Assert;

/**
 * Bean工具类
 * @author info
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {

    public static void copyBean(Object source, Object target, Class<?> editable, String... ignoreProperties)
            throws BeansException {

        Assert.notNull(source,"Source must not be null");
    }
}
