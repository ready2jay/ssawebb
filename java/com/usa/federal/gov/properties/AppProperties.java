package com.usa.federal.gov.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ssa")
public class AppProperties {
	public Map<String, String> ssaprops = new HashMap<String, String>();

	public Map<String, String> getSsaprops() {
		return ssaprops;
	}

	public void setSsaprops(Map<String, String> ssaprops) {
		this.ssaprops = ssaprops;
	}
   }
