package com.spring.boot.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.blog.domain.Catalog;
import com.spring.boot.blog.domain.User;
import com.spring.boot.blog.repository.CatalogRepository;

/**
 * Catalog 服务.
 * 
 * @since 1.0.0 2017年4月10日
 * @author <a href="https://com">Way Lau</a>
 */
@Service
public class CatalogServiceImpl implements CatalogService{

	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {
		// 判断重复
		List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
		if(list !=null && list.size() > 0) {
			throw new IllegalArgumentException("该分类已经存在了");
		}
		return catalogRepository.save(catalog);
	}

	@Override
	public void removeCatalog(Long id) {
		catalogRepository.deleteById(id);
	}

	@Override
	public Catalog getCatalogById(Long id) {
		return catalogRepository.findById(id).get();
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

}
