/**
 * 
 */
package com.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.blog.domain.Authority;
import com.spring.boot.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 * @since 1.0.0 2017年3月30日
 * @author <a href="https://com">Way Lau</a>
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findById(id).get();
	}

}
