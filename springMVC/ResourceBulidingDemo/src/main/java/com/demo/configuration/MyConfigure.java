package com.demo.configuration;

import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class MyConfigure {
	
	@Bean
	public ResourceBundleMessageSource getMsgSource() {

		ResourceBundleMessageSource rms = new ResourceBundleMessageSource();
		rms.setBasename("messages");
		return rms;

	}
}
