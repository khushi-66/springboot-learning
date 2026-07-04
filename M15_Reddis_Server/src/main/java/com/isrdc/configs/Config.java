package com.isrdc.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class Config {
	@Value("${spring.data.redis.url}")
	private String url;
	
	@Value("${spring.data.redis.port}")
	private Integer port;
	
	@Value("${spring.data.redis.username}")
	private String userName;
	
	@Value("${spring.data.redis.password}")
	private String password;
	
	@Bean
	public JedisConnectionFactory jedis() {
		RedisStandaloneConfiguration redisConf = new RedisStandaloneConfiguration(url, port);
		
		redisConf.setUsername(userName);
		redisConf.setPassword(password);
		
		JedisClientConfiguration jedisConf = JedisClientConfiguration.builder().build();
		
		return new JedisConnectionFactory(redisConf, jedisConf);
	}
}



