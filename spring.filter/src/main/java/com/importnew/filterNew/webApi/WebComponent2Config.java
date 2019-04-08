package com.importnew.filterNew.webApi;
//package com.importnew.filterNew.demo;
//
//import javax.servlet.Filter;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.*;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Configuration  
//@Slf4j
//public class WebComponent2Config {
//
//	@Bean
//    public FilterRegistrationBean  filterRegistrationBean() {
//		log.info("FilterRegistrationBean        111111111111");
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
//        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
//        registration.setFilter(customFilter());
//        //过滤器名称
//        registration.setName("customFilter");
//        //拦截路径
//        registration.addUrlPatterns("/*");
//        //设置顺序
//        registration.setOrder(10);
//        return registration;
//    }
// 
//    @Bean
//    public Filter customFilter() {
//        return new CustomFilter();
//    }
//}
