package com.bridgelabz.userservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.bridgelabz.userservice.model.User;

/**
 * Purpose : Configuration class for Redis.	
 * @author Sameer Saurabh
 * @version  1.0
 * @Since  19/07/2018
 */
@Configuration
@Component
public class RedisConfig {
	/**
	 * @return jedisConFactory
	 */
	@SuppressWarnings("deprecation")
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
		//jedisConFactory.setHostName("localhost");
		//jedisConFactory.setPort(6379);
		return jedisConFactory;
	}

	/**
	 * @return redis template
	 */
	@Bean
	public RedisTemplate<String, User> redisTemplate() {
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<String, User>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
	}
}
