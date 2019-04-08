package com.firstappdemno.config;

import java.util.Collection;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.firstappdemno.domain.User;
import com.firstappdemno.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 路由器函数配置
 * @author Tao-Three
 *
 */
@Configuration
public class RouterFunctionConfiguration {
	/**
	 * 注入的方式: 字段注入，properties 注入,setter/getter 注入,方法注入，构造器注入
	 * 	 * @param userRepository
	 * @return
	 */
	/**
	 * servlet 请求接口:ServeltRequest 或者HttpServletRequest
	 * 响应接口:ServletResponse  或者HttpServletResponse
	 * 
	 * Spring5.0 重新定义了服务申请请求和响应接口
	 * 请求接口:ServerRequest
	 * 响应接口:ServerResponse
	 * 即可支持servlet规范，也可以自定义  比如Netty(web Servelt)
	 * 已本利：
	 * 定义get请求，并且返回所有的用户对象 URL:/person/find/all
	 * 
	 * Flux 是0 -n个对象集合
	 * Mono是 0-1 个对象集合
	 * Reactive中的flux或者Mono它是一部处理
	 * 集合对象基本上是同步处理（阻塞)
	 * 
	 */
	@Bean
	@Autowired
	public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository){
	
	 return 	RouterFunctions.route(RequestPredicates.GET("/person/find/all"), 
				reqest ->{
					//返回所有的数据来源
					Collection<User> users= userRepository.findAll();
					Mono<ServerResponse> response=null;
					Flux<User> userFlux=Flux.fromIterable(users);
					return	ServerResponse.ok().body(userFlux,User.class);

				});


	}

}
