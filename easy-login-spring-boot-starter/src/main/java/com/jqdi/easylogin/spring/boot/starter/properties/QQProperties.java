package com.jqdi.easylogin.spring.boot.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@ConfigurationProperties(prefix = "easylogin.qq")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class QQProperties {
	String appid;
	String appkey;
}
