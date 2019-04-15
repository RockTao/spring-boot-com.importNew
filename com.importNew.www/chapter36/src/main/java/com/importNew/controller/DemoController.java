package com.importNew.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.importNew.config.CacheConfig;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {
	
	@RequestMapping("/redis/{key}")
	@Cacheable(value = "redis",key="#key",cacheManager=CacheConfig.CacheManagerName.REDIS_CACHE_MANAGER)
	public String cacheRedisTest(@PathVariable("key") String key) {
		log.info("redis,key={}", key);
		return key;
	}
	
	@RequestMapping("/ehcache/{key}")
	@Cacheable(value = "oKongCache",key="#key",cacheManager=CacheConfig.CacheManagerName.EHCACHE_CACHE_MAANGER)
	public String cacheEhcacheTest(@PathVariable("key") String key) {
		log.info("ehcache,key={}", key);
		return key;
	}
	
	@RequestMapping("/default/{key}")
	@Cacheable(value = "default",key="#key")
	public String cacheDefaultTest(@PathVariable("key") String key) {
		log.info("default,key={}", key);
		return key;
	}
}