package com.importNew.config;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "endpoints.oKong")
public class CustomEndPoint extends AbstractEndpoint<Map<String,Object>>{

    public CustomEndPoint() {
        //设置ID 即访问路径 ：/oKong
        super("oKong");    
    }

    /**
     * 返回信息
     */
    @Override
    public Map<String, Object> invoke() {
         Map<String, Object> result = new HashMap<>();
         result.put("author", "oKong");
         result.put("chapter", "chapter27");
         result.put("mp", "lqdevOps");
         return result;
    }

}