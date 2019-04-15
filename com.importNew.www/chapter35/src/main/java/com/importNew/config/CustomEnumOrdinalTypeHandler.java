package com.importNew.config;

import org.apache.ibatis.type.EnumOrdinalTypeHandler;
import org.apache.ibatis.type.MappedTypes;

import com.importNew.dto.StatusEnum;

/**
 * 
 * @author oKong
 *
 */
//枚举索引处理类
@MappedTypes(value = { StatusEnum.class })
public class CustomEnumOrdinalTypeHandler<E extends Enum<E>> extends EnumOrdinalTypeHandler<E>{

	public CustomEnumOrdinalTypeHandler(Class<E> type) {
		super(type);
	}
}