package com.jqdi.easylogin.spring.boot.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@ConfigurationProperties(prefix = "easylogin.local-mobile")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LocalMobileProperties {
	String accessKeyId;
	String accessKeySecret;
	String endpoint;
}
