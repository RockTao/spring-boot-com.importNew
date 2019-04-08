package com.importnew.filterNew.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CommonExceptionHandler {
 
    /**
     *  拦截Exception类的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "9999");
        result.put("respMsg", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result; 
    }
    
    /**
     * 拦截 CommonException 的异常
     * @param ex   自定义异常
     * @return
     */
//    @ExceptionHandler(CommonException.class)
//    @ResponseBody
//    public Map<String,Object> exceptionHandler(CommonException ex){
//        log.info("CommonException：{}({})",ex.getMsg(), ex.getCode());
//        Map<String,Object> result = new HashMap<String,Object>();
//        result.put("respCode", ex.getCode());
//        result.put("respMsg", ex.getMsg());
//        return result; 
//    }
}