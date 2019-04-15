package com.importNew.config;

import javax.annotation.PostConstruct;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.importNew.dto.StatusEnum;

@Configuration
@MapperScan("com.importNew.mapper")//mapper地址
public class MybatisConfig {
	
	
	
	
	/**
	 * 
	 * <p>函数名称：  ConfigurationCustomizer      </p>
	 * <p>功能说明： 自定义相关注册器
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @return
	 *
	 * @date   创建时间：2018年12月2日
	 * @author 作者：oKong
	 */
	@Bean
	public ConfigurationCustomizer configurationCustomizer() {
		ConfigurationCustomizer config = new ConfigurationCustomizer() {
			
			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
//				TypeAliasRegistry typeAliasRegistry = configuration.getTypeAliasRegistry();
				// mapper接口注册器
//				MapperRegistry mapperRegistry = configuration.getMapperRegistry();
				// 类型处理器
				TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
				typeHandlerRegistry.register(StatusEnum.class, EnumOrdinalTypeHandler.class);
			}
		};
		
		return config;
	}
	
	
	
//	@Autowired
//	SqlSessionFactory sqlSessionFactory;
//
//	@PostConstruct
//	public void registerTypeHandler() {
//		TypeHandlerRegistry registry = sqlSessionFactory.getConfiguration().getTypeHandlerRegistry();
//		registry.register(StatusEnum.class, EnumOrdinalTypeHandler.class);
//	}
//	
     
}