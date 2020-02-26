package com.waylau.spring.boot.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.waylau.spring.boot.blog.repository")
@EnableElasticsearchRepositories(basePackages = "com.waylau.spring.boot.blog.repository.es")
public class ElasticSearchConfiguration {
	
}
