package com.firstappdemno.repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.firstappdemno.domain.User;

/**
 * {@link User}
 * {@link Repository}
 * @author Tao-Three
 *
 */
@Repository
public class UserRepository {
	/**
	 * 
	 * @param user
	 */
	private final ConcurrentMap<Integer , User> repopsitory= new ConcurrentHashMap<>();
	private final static AtomicInteger idGenerator=
			new AtomicInteger();
	public boolean save(User user) {
		Integer id = idGenerator.incrementAndGet();
		user.setId(id);
		return 	repopsitory.put(id, user) == null;
		
	}
	public Collection<User> findAll(){
	    return repopsitory.values();
	}


}
