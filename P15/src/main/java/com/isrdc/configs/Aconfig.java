package com.isrdc.configs;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.isrdc.beans.Bbean;
import com.isrdc.beans.Cbean;
@Configuration
public class Aconfig {
	@Bean
	public Bbean createBean() {
		return new Bbean("vandana");
	}

		@Bean
	public Cbean createCBean() {
		return new Cbean("khushi");
	}
}
