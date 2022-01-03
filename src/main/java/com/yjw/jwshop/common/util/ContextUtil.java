package com.yjw.jwshop.common.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ContextUtil {

    public static Object getSessionContext(String key){
        ServletRequestAttributes request = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return request.getRequest().getSession().getAttribute(key);
    }

    public static void setSessionContext(String key, Object param){
        ServletRequestAttributes request = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        request.getRequest().getSession().setAttribute(key, param);
    }
}
